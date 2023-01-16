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

public val MaterialDesignIcons.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = Builder(name = "At", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(12.81f, 15.0f, 13.5f, 14.7f, 14.11f, 14.11f)
                curveTo(14.7f, 13.5f, 15.0f, 12.81f, 15.0f, 12.0f)
                curveTo(15.0f, 11.19f, 14.7f, 10.5f, 14.11f, 9.89f)
                curveTo(13.5f, 9.3f, 12.81f, 9.0f, 12.0f, 9.0f)
                curveTo(11.19f, 9.0f, 10.5f, 9.3f, 9.89f, 9.89f)
                curveTo(9.3f, 10.5f, 9.0f, 11.19f, 9.0f, 12.0f)
                curveTo(9.0f, 12.81f, 9.3f, 13.5f, 9.89f, 14.11f)
                curveTo(10.5f, 14.7f, 11.19f, 15.0f, 12.0f, 15.0f)
                moveTo(12.0f, 2.0f)
                curveTo(14.75f, 2.0f, 17.1f, 3.0f, 19.05f, 4.95f)
                curveTo(21.0f, 6.9f, 22.0f, 9.25f, 22.0f, 12.0f)
                verticalLineTo(13.45f)
                curveTo(22.0f, 14.45f, 21.65f, 15.3f, 21.0f, 16.0f)
                curveTo(20.3f, 16.67f, 19.5f, 17.0f, 18.5f, 17.0f)
                curveTo(17.3f, 17.0f, 16.31f, 16.5f, 15.56f, 15.5f)
                curveTo(14.56f, 16.5f, 13.38f, 17.0f, 12.0f, 17.0f)
                curveTo(10.63f, 17.0f, 9.45f, 16.5f, 8.46f, 15.54f)
                curveTo(7.5f, 14.55f, 7.0f, 13.38f, 7.0f, 12.0f)
                curveTo(7.0f, 10.63f, 7.5f, 9.45f, 8.46f, 8.46f)
                curveTo(9.45f, 7.5f, 10.63f, 7.0f, 12.0f, 7.0f)
                curveTo(13.38f, 7.0f, 14.55f, 7.5f, 15.54f, 8.46f)
                curveTo(16.5f, 9.45f, 17.0f, 10.63f, 17.0f, 12.0f)
                verticalLineTo(13.45f)
                curveTo(17.0f, 13.86f, 17.16f, 14.22f, 17.46f, 14.53f)
                curveTo(17.76f, 14.84f, 18.11f, 15.0f, 18.5f, 15.0f)
                curveTo(18.92f, 15.0f, 19.27f, 14.84f, 19.57f, 14.53f)
                curveTo(19.87f, 14.22f, 20.0f, 13.86f, 20.0f, 13.45f)
                verticalLineTo(12.0f)
                curveTo(20.0f, 9.81f, 19.23f, 7.93f, 17.65f, 6.35f)
                curveTo(16.07f, 4.77f, 14.19f, 4.0f, 12.0f, 4.0f)
                curveTo(9.81f, 4.0f, 7.93f, 4.77f, 6.35f, 6.35f)
                curveTo(4.77f, 7.93f, 4.0f, 9.81f, 4.0f, 12.0f)
                curveTo(4.0f, 14.19f, 4.77f, 16.07f, 6.35f, 17.65f)
                curveTo(7.93f, 19.23f, 9.81f, 20.0f, 12.0f, 20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                curveTo(9.25f, 22.0f, 6.9f, 21.0f, 4.95f, 19.05f)
                curveTo(3.0f, 17.1f, 2.0f, 14.75f, 2.0f, 12.0f)
                curveTo(2.0f, 9.25f, 3.0f, 6.9f, 4.95f, 4.95f)
                curveTo(6.9f, 3.0f, 9.25f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
