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

public val LineAwesomeIcons.Audible: ImageVector
    get() {
        if (_audible != null) {
            return _audible!!
        }
        _audible = Builder(name = "Audible", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                curveTo(10.9219f, 8.0f, 6.5352f, 10.918f, 4.3984f, 15.1602f)
                curveTo(6.668f, 12.0391f, 10.3438f, 10.0f, 14.5f, 10.0f)
                curveTo(19.0391f, 10.0f, 23.0039f, 12.4297f, 25.1914f, 16.0508f)
                lineTo(27.4805f, 14.9063f)
                curveTo(25.2969f, 10.8008f, 20.9766f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(12.2891f, 12.0f, 9.1094f, 14.2461f, 7.7305f, 17.4492f)
                curveTo(9.2734f, 15.3594f, 11.7422f, 14.0f, 14.5313f, 14.0f)
                curveTo(17.4922f, 14.0f, 20.0938f, 15.5313f, 21.6094f, 17.8438f)
                lineTo(23.9063f, 16.6914f)
                curveTo(22.3789f, 13.8945f, 19.4102f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(1.0f, 15.3789f)
                lineTo(1.0f, 17.6172f)
                curveTo(6.2227f, 20.2266f, 15.5508f, 24.8945f, 15.5508f, 24.8945f)
                lineTo(16.0f, 25.1172f)
                lineTo(31.0f, 17.6172f)
                lineTo(31.0f, 15.3828f)
                lineTo(16.0f, 22.8828f)
                curveTo(7.6914f, 18.7266f, 3.3125f, 16.5391f, 1.0f, 15.3789f)
                close()
                moveTo(15.9688f, 16.0f)
                curveTo(13.7734f, 16.0f, 11.9336f, 17.4336f, 11.2695f, 19.4141f)
                curveTo(12.0859f, 18.5469f, 13.2344f, 18.0f, 14.5156f, 18.0f)
                curveTo(15.9141f, 18.0f, 17.1484f, 18.6523f, 17.9688f, 19.6602f)
                lineTo(20.2656f, 18.5117f)
                curveTo(19.4063f, 17.0195f, 17.8164f, 16.0f, 15.9688f, 16.0f)
                close()
            }
        }
        .build()
        return _audible!!
    }

private var _audible: ImageVector? = null
