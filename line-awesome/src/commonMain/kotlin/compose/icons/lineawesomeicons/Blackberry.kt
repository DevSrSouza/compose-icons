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

public val LineAwesomeIcons.Blackberry: ImageVector
    get() {
        if (_blackberry != null) {
            return _blackberry!!
        }
        _blackberry = Builder(name = "Blackberry", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.0859f, 5.0f, 27.0f, 9.9141f, 27.0f, 16.0f)
                curveTo(27.0f, 22.0859f, 22.0859f, 27.0f, 16.0f, 27.0f)
                curveTo(9.9141f, 27.0f, 5.0f, 22.0859f, 5.0f, 16.0f)
                curveTo(5.0f, 9.9141f, 9.9141f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(9.7188f, 11.0f)
                lineTo(9.125f, 13.6875f)
                lineTo(11.2813f, 13.6875f)
                curveTo(12.9531f, 13.6875f, 13.4375f, 12.9219f, 13.4375f, 12.1875f)
                curveTo(13.4375f, 11.668f, 13.1172f, 11.0f, 11.7813f, 11.0f)
                close()
                moveTo(15.25f, 11.0f)
                lineTo(14.6563f, 13.6875f)
                lineTo(16.8125f, 13.6875f)
                curveTo(18.4844f, 13.6875f, 18.9688f, 12.9219f, 18.9688f, 12.1875f)
                curveTo(18.9688f, 11.668f, 18.6445f, 11.0f, 17.3125f, 11.0f)
                close()
                moveTo(20.3125f, 13.4063f)
                lineTo(19.7188f, 16.125f)
                lineTo(21.8438f, 16.125f)
                curveTo(23.5156f, 16.125f, 24.0f, 15.332f, 24.0f, 14.5938f)
                curveTo(24.0f, 14.0742f, 23.6758f, 13.4063f, 22.3438f, 13.4063f)
                close()
                moveTo(8.9688f, 15.0625f)
                lineTo(8.4063f, 17.7813f)
                lineTo(10.5313f, 17.7813f)
                curveTo(12.2031f, 17.7813f, 12.6875f, 16.9844f, 12.6875f, 16.25f)
                curveTo(12.6875f, 15.7305f, 12.3672f, 15.0625f, 11.0313f, 15.0625f)
                close()
                moveTo(14.5f, 15.0625f)
                lineTo(13.9375f, 17.7813f)
                lineTo(16.0625f, 17.7813f)
                curveTo(17.7344f, 17.7813f, 18.2188f, 16.9844f, 18.2188f, 16.25f)
                curveTo(18.2188f, 15.7305f, 17.8945f, 15.0625f, 16.5625f, 15.0625f)
                close()
                moveTo(19.5f, 17.6563f)
                lineTo(18.9063f, 20.3438f)
                lineTo(21.0625f, 20.3438f)
                curveTo(22.7344f, 20.3438f, 23.1875f, 19.5469f, 23.1875f, 18.8125f)
                curveTo(23.1875f, 18.293f, 22.8945f, 17.6563f, 21.5625f, 17.6563f)
                close()
                moveTo(13.7188f, 19.3125f)
                lineTo(13.125f, 22.0f)
                lineTo(15.2813f, 22.0f)
                curveTo(16.9531f, 22.0f, 17.4063f, 21.2031f, 17.4063f, 20.4688f)
                curveTo(17.4063f, 19.9492f, 17.1133f, 19.3125f, 15.7813f, 19.3125f)
                close()
            }
        }
        .build()
        return _blackberry!!
    }

private var _blackberry: ImageVector? = null
