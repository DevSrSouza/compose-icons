package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.226f, 2.003f)
                curveTo(9.592f, 1.943f, 6.939f, 2.919f, 4.929f, 4.929f)
                curveTo(1.024f, 8.834f, 1.024f, 15.166f, 4.929f, 19.071f)
                curveTo(8.834f, 22.976f, 15.166f, 22.976f, 19.071f, 19.071f)
                curveTo(21.081f, 17.061f, 22.056f, 14.408f, 21.997f, 11.774f)
                curveTo(21.98f, 10.977f, 21.867f, 10.182f, 21.66f, 9.406f)
                curveTo(21.093f, 9.949f, 20.508f, 10.428f, 19.916f, 10.842f)
                curveTo(18.565f, 11.791f, 17.183f, 12.405f, 15.93f, 12.684f)
                curveTo(14.024f, 13.107f, 12.716f, 12.716f, 12.0f, 12.0f)
                curveTo(11.284f, 11.284f, 10.893f, 9.976f, 11.316f, 8.07f)
                curveTo(11.595f, 6.817f, 12.209f, 5.435f, 13.158f, 4.084f)
                curveTo(13.572f, 3.492f, 14.051f, 2.907f, 14.594f, 2.34f)
                curveTo(13.818f, 2.133f, 13.023f, 2.02f, 12.226f, 2.003f)
                close()
                moveTo(17.657f, 17.657f)
                curveTo(18.908f, 16.406f, 19.658f, 14.843f, 19.907f, 13.219f)
                curveTo(16.361f, 15.264f, 12.638f, 15.466f, 10.586f, 13.414f)
                curveTo(8.534f, 11.362f, 8.736f, 7.639f, 10.781f, 4.093f)
                curveTo(9.157f, 4.342f, 7.594f, 5.092f, 6.343f, 6.343f)
                curveTo(3.219f, 9.467f, 3.219f, 14.533f, 6.343f, 17.657f)
                curveTo(9.467f, 20.781f, 14.533f, 20.781f, 17.657f, 17.657f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
