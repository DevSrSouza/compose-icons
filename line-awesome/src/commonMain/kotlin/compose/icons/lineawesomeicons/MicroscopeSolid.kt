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

public val LineAwesomeIcons.MicroscopeSolid: ImageVector
    get() {
        if (_microscopeSolid != null) {
            return _microscopeSolid!!
        }
        _microscopeSolid = Builder(name = "MicroscopeSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                lineTo(17.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                lineTo(21.0f, 4.0f)
                close()
                moveTo(16.0f, 7.0f)
                lineTo(16.0f, 9.0f)
                lineTo(14.0f, 9.0f)
                curveTo(11.2539f, 9.0f, 9.0f, 11.2539f, 9.0f, 14.0f)
                lineTo(9.0f, 18.1875f)
                curveTo(7.8438f, 18.6055f, 7.0f, 19.707f, 7.0f, 21.0f)
                curveTo(7.0f, 22.293f, 7.8438f, 23.3945f, 9.0f, 23.8125f)
                lineTo(9.0f, 26.0f)
                lineTo(7.0f, 26.0f)
                lineTo(7.0f, 28.0f)
                lineTo(24.0f, 28.0f)
                lineTo(24.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                lineTo(11.0f, 23.8125f)
                curveTo(11.8438f, 23.5078f, 12.5078f, 22.8438f, 12.8125f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 20.0f)
                lineTo(12.8125f, 20.0f)
                curveTo(12.5078f, 19.1602f, 11.8398f, 18.4922f, 11.0f, 18.1875f)
                lineTo(11.0f, 14.0f)
                curveTo(11.0f, 12.3438f, 12.3438f, 11.0f, 14.0f, 11.0f)
                lineTo(16.0f, 11.0f)
                lineTo(16.0f, 17.0f)
                lineTo(22.0f, 17.0f)
                lineTo(22.0f, 7.0f)
                close()
                moveTo(18.0f, 9.0f)
                lineTo(20.0f, 9.0f)
                lineTo(20.0f, 15.0f)
                lineTo(18.0f, 15.0f)
                close()
                moveTo(10.0f, 20.0f)
                curveTo(10.5625f, 20.0f, 11.0f, 20.4375f, 11.0f, 21.0f)
                curveTo(11.0f, 21.5625f, 10.5625f, 22.0f, 10.0f, 22.0f)
                curveTo(9.4375f, 22.0f, 9.0f, 21.5625f, 9.0f, 21.0f)
                curveTo(9.0f, 20.4375f, 9.4375f, 20.0f, 10.0f, 20.0f)
                close()
            }
        }
        .build()
        return _microscopeSolid!!
    }

private var _microscopeSolid: ImageVector? = null
