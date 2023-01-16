package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.Steering: ImageVector
    get() {
        if (_steering != null) {
            return _steering!!
        }
        _steering = Builder(name = "Steering", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.92f)
                curveTo(14.8f, 19.7f, 16.35f, 18.95f, 17.65f, 17.65f)
                curveTo(18.95f, 16.35f, 19.7f, 14.8f, 19.92f, 13.0f)
                horizontalLineTo(16.92f)
                curveTo(16.7f, 14.0f, 16.24f, 14.84f, 15.54f, 15.54f)
                curveTo(14.84f, 16.24f, 14.0f, 16.7f, 13.0f, 16.92f)
                verticalLineTo(19.92f)
                moveTo(10.0f, 8.0f)
                horizontalLineTo(14.0f)
                lineTo(17.0f, 11.0f)
                horizontalLineTo(19.92f)
                curveTo(19.67f, 9.05f, 18.79f, 7.38f, 17.27f, 6.0f)
                curveTo(15.76f, 4.66f, 14.0f, 4.0f, 12.0f, 4.0f)
                curveTo(10.0f, 4.0f, 8.24f, 4.66f, 6.73f, 6.0f)
                curveTo(5.21f, 7.38f, 4.33f, 9.05f, 4.08f, 11.0f)
                horizontalLineTo(7.0f)
                lineTo(10.0f, 8.0f)
                moveTo(11.0f, 19.92f)
                verticalLineTo(16.92f)
                curveTo(10.0f, 16.7f, 9.16f, 16.24f, 8.46f, 15.54f)
                curveTo(7.76f, 14.84f, 7.3f, 14.0f, 7.08f, 13.0f)
                horizontalLineTo(4.08f)
                curveTo(4.3f, 14.77f, 5.05f, 16.3f, 6.35f, 17.6f)
                curveTo(7.65f, 18.9f, 9.2f, 19.67f, 11.0f, 19.92f)
                moveTo(12.0f, 2.0f)
                curveTo(14.75f, 2.0f, 17.1f, 3.0f, 19.05f, 4.95f)
                curveTo(21.0f, 6.9f, 22.0f, 9.25f, 22.0f, 12.0f)
                curveTo(22.0f, 14.75f, 21.0f, 17.1f, 19.05f, 19.05f)
                curveTo(17.1f, 21.0f, 14.75f, 22.0f, 12.0f, 22.0f)
                curveTo(9.25f, 22.0f, 6.9f, 21.0f, 4.95f, 19.05f)
                curveTo(3.0f, 17.1f, 2.0f, 14.75f, 2.0f, 12.0f)
                curveTo(2.0f, 9.25f, 3.0f, 6.9f, 4.95f, 4.95f)
                curveTo(6.9f, 3.0f, 9.25f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _steering!!
    }

private var _steering: ImageVector? = null
