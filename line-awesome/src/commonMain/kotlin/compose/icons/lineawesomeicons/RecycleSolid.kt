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

public val LineAwesomeIcons.RecycleSolid: ImageVector
    get() {
        if (_recycleSolid != null) {
            return _recycleSolid!!
        }
        _recycleSolid = Builder(name = "RecycleSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.9688f)
                curveTo(14.9453f, 3.9688f, 13.8828f, 4.4844f, 13.25f, 5.4688f)
                lineTo(10.4375f, 10.0938f)
                lineTo(12.1563f, 11.125f)
                lineTo(14.9688f, 6.5313f)
                curveTo(15.5078f, 5.7266f, 16.5313f, 5.707f, 17.0625f, 6.5313f)
                lineTo(20.1875f, 11.5313f)
                lineTo(18.6875f, 12.4063f)
                lineTo(23.3125f, 15.0f)
                lineTo(23.3125f, 9.6875f)
                lineTo(21.875f, 10.5313f)
                lineTo(18.75f, 5.4688f)
                curveTo(18.1172f, 4.4844f, 17.0547f, 3.9688f, 16.0f, 3.9688f)
                close()
                moveTo(10.4063f, 12.0938f)
                lineTo(5.9063f, 14.6875f)
                lineTo(7.1563f, 15.4375f)
                lineTo(4.5938f, 19.6563f)
                lineTo(4.5625f, 19.625f)
                curveTo(4.5508f, 19.6445f, 4.5742f, 19.668f, 4.5625f, 19.6875f)
                curveTo(3.0898f, 21.918f, 4.7891f, 25.0f, 7.5f, 25.0f)
                lineTo(13.0f, 25.0f)
                lineTo(13.0f, 23.0f)
                lineTo(7.5f, 23.0f)
                curveTo(6.2344f, 23.0f, 5.5547f, 21.75f, 6.2188f, 20.7813f)
                lineTo(6.25f, 20.75f)
                lineTo(6.25f, 20.7188f)
                lineTo(8.875f, 16.4688f)
                lineTo(10.4063f, 17.4063f)
                close()
                moveTo(25.0625f, 15.6563f)
                lineTo(23.3438f, 16.7188f)
                lineTo(25.8438f, 20.7188f)
                curveTo(26.4844f, 21.8086f, 25.7578f, 23.0f, 24.5938f, 23.0f)
                lineTo(19.0f, 23.0f)
                lineTo(19.0f, 21.0f)
                lineTo(14.0938f, 24.0f)
                lineTo(19.0f, 27.0f)
                lineTo(19.0f, 25.0f)
                lineTo(24.5938f, 25.0f)
                curveTo(27.2305f, 25.0f, 28.9219f, 22.0f, 27.5625f, 19.6875f)
                lineTo(27.5625f, 19.6563f)
                close()
            }
        }
        .build()
        return _recycleSolid!!
    }

private var _recycleSolid: ImageVector? = null
