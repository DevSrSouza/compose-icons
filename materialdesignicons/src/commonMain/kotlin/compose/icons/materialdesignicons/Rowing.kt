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

public val MaterialDesignIcons.Rowing: ImageVector
    get() {
        if (_rowing != null) {
            return _rowing!!
        }
        _rowing = Builder(name = "Rowing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 14.5f)
                lineTo(4.0f, 19.0f)
                lineTo(5.5f, 20.5f)
                lineTo(9.0f, 17.0f)
                horizontalLineTo(11.0f)
                lineTo(8.5f, 14.5f)
                moveTo(15.0f, 1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 1.0f)
                moveTo(21.0f, 21.0f)
                lineTo(18.0f, 24.0f)
                lineTo(15.0f, 21.0f)
                verticalLineTo(19.5f)
                lineTo(7.91f, 12.41f)
                curveTo(7.6f, 12.46f, 7.3f, 12.5f, 7.0f, 12.5f)
                verticalLineTo(10.32f)
                curveTo(8.66f, 10.35f, 10.61f, 9.45f, 11.67f, 8.28f)
                lineTo(13.07f, 6.73f)
                curveTo(13.26f, 6.5f, 13.5f, 6.35f, 13.76f, 6.23f)
                curveTo(14.05f, 6.09f, 14.38f, 6.0f, 14.72f, 6.0f)
                horizontalLineTo(14.75f)
                curveTo(16.0f, 6.0f, 17.0f, 7.0f, 17.0f, 8.26f)
                verticalLineTo(14.0f)
                curveTo(17.0f, 14.85f, 16.65f, 15.62f, 16.08f, 16.17f)
                lineTo(12.5f, 12.59f)
                verticalLineTo(10.32f)
                curveTo(11.87f, 10.84f, 11.07f, 11.34f, 10.21f, 11.71f)
                lineTo(16.5f, 18.0f)
                horizontalLineTo(18.0f)
                lineTo(21.0f, 21.0f)
                close()
            }
        }
        .build()
        return _rowing!!
    }

private var _rowing: ImageVector? = null
