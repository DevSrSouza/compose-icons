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

public val LineAwesomeIcons.WheelchairSolid: ImageVector
    get() {
        if (_wheelchairSolid != null) {
            return _wheelchairSolid!!
        }
        _wheelchairSolid = Builder(name = "WheelchairSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                curveTo(18.3555f, 3.0f, 17.0f, 4.3555f, 17.0f, 6.0f)
                curveTo(17.0f, 7.6445f, 18.3555f, 9.0f, 20.0f, 9.0f)
                curveTo(21.6445f, 9.0f, 23.0f, 7.6445f, 23.0f, 6.0f)
                curveTo(23.0f, 4.3555f, 21.6445f, 3.0f, 20.0f, 3.0f)
                close()
                moveTo(20.0f, 5.0f)
                curveTo(20.5625f, 5.0f, 21.0f, 5.4375f, 21.0f, 6.0f)
                curveTo(21.0f, 6.5625f, 20.5625f, 7.0f, 20.0f, 7.0f)
                curveTo(19.4375f, 7.0f, 19.0f, 6.5625f, 19.0f, 6.0f)
                curveTo(19.0f, 5.4375f, 19.4375f, 5.0f, 20.0f, 5.0f)
                close()
                moveTo(14.5313f, 7.7813f)
                lineTo(10.9375f, 8.1875f)
                curveTo(10.3438f, 8.2539f, 9.8242f, 8.5898f, 9.5f, 9.0938f)
                lineTo(7.0f, 12.9688f)
                lineTo(8.6875f, 14.0313f)
                lineTo(11.1875f, 10.1875f)
                lineTo(13.4688f, 9.9375f)
                lineTo(12.0f, 14.0938f)
                curveTo(8.6172f, 14.582f, 6.0f, 17.4844f, 6.0f, 21.0f)
                curveTo(6.0f, 24.8555f, 9.1445f, 28.0f, 13.0f, 28.0f)
                curveTo(16.8555f, 28.0f, 20.0f, 24.8555f, 20.0f, 21.0f)
                curveTo(20.0f, 20.6602f, 19.9531f, 20.3281f, 19.9063f, 20.0f)
                lineTo(21.1875f, 20.0f)
                lineTo(22.5313f, 26.0938f)
                lineTo(24.4688f, 25.6563f)
                lineTo(23.1563f, 19.5625f)
                curveTo(22.957f, 18.6484f, 22.1211f, 18.0f, 21.1875f, 18.0f)
                lineTo(19.3125f, 18.0f)
                curveTo(18.9141f, 17.1602f, 18.3398f, 16.4297f, 17.6563f, 15.8125f)
                lineTo(18.8125f, 12.5938f)
                curveTo(19.3164f, 11.1992f, 18.7109f, 9.6367f, 17.4063f, 8.9375f)
                lineTo(15.7188f, 8.0f)
                lineTo(15.7188f, 8.0313f)
                curveTo(15.3594f, 7.8398f, 14.9336f, 7.7344f, 14.5313f, 7.7813f)
                close()
                moveTo(15.5313f, 10.1875f)
                lineTo(16.4688f, 10.6875f)
                curveTo(16.9141f, 10.9258f, 17.1094f, 11.4336f, 16.9375f, 11.9063f)
                lineTo(15.9375f, 14.6563f)
                curveTo(15.3594f, 14.3867f, 14.7422f, 14.1953f, 14.0938f, 14.0938f)
                close()
                moveTo(13.0f, 16.0f)
                curveTo(15.7734f, 16.0f, 18.0f, 18.2266f, 18.0f, 21.0f)
                curveTo(18.0f, 23.7734f, 15.7734f, 26.0f, 13.0f, 26.0f)
                curveTo(10.2266f, 26.0f, 8.0f, 23.7734f, 8.0f, 21.0f)
                curveTo(8.0f, 18.2266f, 10.2266f, 16.0f, 13.0f, 16.0f)
                close()
            }
        }
        .build()
        return _wheelchairSolid!!
    }

private var _wheelchairSolid: ImageVector? = null
