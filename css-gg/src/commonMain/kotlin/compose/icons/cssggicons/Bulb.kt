package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Bulb: ImageVector
    get() {
        if (_bulb != null) {
            return _bulb!!
        }
        _bulb = Builder(name = "Bulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 9.0f)
                curveTo(4.0f, 11.9611f, 5.6088f, 14.5465f, 8.0f, 15.9297f)
                verticalLineTo(15.9999f)
                curveTo(8.0f, 18.2091f, 9.7909f, 19.9999f, 12.0f, 19.9999f)
                curveTo(14.2091f, 19.9999f, 16.0f, 18.2091f, 16.0f, 15.9999f)
                verticalLineTo(15.9297f)
                curveTo(18.3912f, 14.5465f, 20.0f, 11.9611f, 20.0f, 9.0f)
                curveTo(20.0f, 4.5817f, 16.4183f, 1.0f, 12.0f, 1.0f)
                curveTo(7.5817f, 1.0f, 4.0f, 4.5817f, 4.0f, 9.0f)
                close()
                moveTo(16.0f, 13.4722f)
                curveTo(17.2275f, 12.3736f, 18.0f, 10.777f, 18.0f, 9.0f)
                curveTo(18.0f, 5.6863f, 15.3137f, 3.0f, 12.0f, 3.0f)
                curveTo(8.6863f, 3.0f, 6.0f, 5.6863f, 6.0f, 9.0f)
                curveTo(6.0f, 10.777f, 6.7725f, 12.3736f, 8.0f, 13.4722f)
                lineTo(10.0f, 13.4713f)
                verticalLineTo(16.0f)
                curveTo(10.0f, 17.1045f, 10.8954f, 17.9999f, 12.0f, 17.9999f)
                curveTo(13.1045f, 17.9999f, 14.0f, 17.1045f, 14.0f, 15.9999f)
                verticalLineTo(13.4713f)
                lineTo(16.0f, 13.4722f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 21.0064f)
                verticalLineTo(21.0f)
                curveTo(10.5883f, 21.3403f, 11.2714f, 21.5351f, 12.0f, 21.5351f)
                curveTo(12.7286f, 21.5351f, 13.4117f, 21.3403f, 14.0f, 21.0f)
                verticalLineTo(21.0064f)
                curveTo(14.0f, 22.111f, 13.1046f, 23.0064f, 12.0f, 23.0064f)
                curveTo(10.8954f, 23.0064f, 10.0f, 22.111f, 10.0f, 21.0064f)
                close()
            }
        }
        .build()
        return _bulb!!
    }

private var _bulb: ImageVector? = null
