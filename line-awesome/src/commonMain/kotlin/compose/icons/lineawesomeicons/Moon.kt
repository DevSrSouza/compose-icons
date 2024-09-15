package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                lineTo(7.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                lineTo(7.0f, 5.0f)
                close()
                moveTo(20.281f, 7.938f)
                lineTo(18.625f, 8.0f)
                curveTo(13.281f, 8.191f, 9.0f, 12.578f, 9.0f, 17.969f)
                curveTo(9.0f, 23.48f, 13.488f, 27.969f, 19.0f, 27.969f)
                curveTo(24.391f, 27.969f, 28.777f, 23.688f, 28.969f, 18.344f)
                lineTo(29.031f, 16.719f)
                lineTo(27.563f, 17.406f)
                curveTo(26.781f, 17.777f, 25.914f, 17.969f, 25.0f, 17.969f)
                curveTo(21.676f, 17.969f, 19.0f, 15.293f, 19.0f, 11.969f)
                curveTo(19.0f, 11.055f, 19.223f, 10.219f, 19.594f, 9.438f)
                close()
                moveTo(17.375f, 10.313f)
                curveTo(17.25f, 10.867f, 17.0f, 11.375f, 17.0f, 11.969f)
                curveTo(17.0f, 16.375f, 20.594f, 19.969f, 25.0f, 19.969f)
                curveTo(25.605f, 19.969f, 26.121f, 19.723f, 26.688f, 19.594f)
                curveTo(25.926f, 23.219f, 22.859f, 25.969f, 19.0f, 25.969f)
                curveTo(14.57f, 25.969f, 11.0f, 22.398f, 11.0f, 17.969f)
                curveTo(11.0f, 14.117f, 13.758f, 11.082f, 17.375f, 10.313f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
