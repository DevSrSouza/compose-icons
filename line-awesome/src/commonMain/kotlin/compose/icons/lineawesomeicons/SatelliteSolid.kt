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

public val LineAwesomeIcons.SatelliteSolid: ImageVector
    get() {
        if (_satelliteSolid != null) {
            return _satelliteSolid!!
        }
        _satelliteSolid = Builder(name = "SatelliteSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.875f, 3.5938f)
                lineTo(8.1563f, 4.2813f)
                lineTo(4.3125f, 8.1563f)
                lineTo(3.5938f, 8.875f)
                lineTo(4.3125f, 9.5625f)
                lineTo(10.0625f, 15.3438f)
                lineTo(9.4063f, 16.0f)
                lineTo(16.0f, 22.5938f)
                lineTo(16.6563f, 21.9375f)
                lineTo(22.4063f, 27.7188f)
                lineTo(23.125f, 28.4063f)
                lineTo(23.8438f, 27.7188f)
                lineTo(27.7188f, 23.8125f)
                lineTo(28.4375f, 23.125f)
                lineTo(21.6563f, 16.3438f)
                curveTo(22.2734f, 14.6836f, 21.9219f, 12.7344f, 20.5938f, 11.4063f)
                curveTo(19.6875f, 10.5f, 18.4766f, 10.0625f, 17.2813f, 10.0625f)
                curveTo(16.7266f, 10.0625f, 16.1797f, 10.1836f, 15.6563f, 10.375f)
                lineTo(9.5938f, 4.2813f)
                close()
                moveTo(8.875f, 6.4063f)
                lineTo(13.9375f, 11.4688f)
                lineTo(11.4688f, 13.9375f)
                lineTo(6.4063f, 8.875f)
                close()
                moveTo(17.2813f, 12.0313f)
                curveTo(17.9609f, 12.0313f, 18.6641f, 12.2891f, 19.1875f, 12.8125f)
                curveTo(20.2344f, 13.8594f, 20.2344f, 15.5469f, 19.1875f, 16.5938f)
                lineTo(16.2813f, 19.4688f)
                lineTo(16.0f, 19.75f)
                lineTo(12.25f, 16.0f)
                lineTo(15.2813f, 12.9688f)
                lineTo(15.4063f, 12.8125f)
                curveTo(15.4766f, 12.7422f, 15.5508f, 12.6875f, 15.625f, 12.625f)
                lineTo(15.8125f, 12.4688f)
                curveTo(16.2539f, 12.1758f, 16.7734f, 12.0313f, 17.2813f, 12.0313f)
                close()
                moveTo(8.4375f, 17.0f)
                lineTo(7.0f, 18.4063f)
                lineTo(13.5938f, 25.0f)
                lineTo(15.0f, 23.5625f)
                close()
                moveTo(20.5313f, 18.0625f)
                lineTo(25.5938f, 23.125f)
                lineTo(23.125f, 25.5938f)
                lineTo(18.0625f, 20.5313f)
                close()
            }
        }
        .build()
        return _satelliteSolid!!
    }

private var _satelliteSolid: ImageVector? = null
