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

public val LineAwesomeIcons.UserAltSolid: ImageVector
    get() {
        if (_userAltSolid != null) {
            return _userAltSolid!!
        }
        _userAltSolid = Builder(name = "UserAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(12.1445f, 5.0f, 9.0f, 8.1445f, 9.0f, 12.0f)
                curveTo(9.0f, 14.4102f, 10.2305f, 16.5508f, 12.0938f, 17.8125f)
                curveTo(8.5273f, 19.3438f, 6.0f, 22.8828f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 24.1094f, 9.5273f, 21.5938f, 11.8125f, 20.1875f)
                curveTo(12.4844f, 21.8359f, 14.1211f, 23.0f, 16.0f, 23.0f)
                curveTo(17.8789f, 23.0f, 19.5156f, 21.8359f, 20.1875f, 20.1875f)
                curveTo(22.4727f, 21.5938f, 24.0f, 24.1094f, 24.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                curveTo(26.0f, 22.8828f, 23.4727f, 19.3438f, 19.9063f, 17.8125f)
                curveTo(21.7695f, 16.5508f, 23.0f, 14.4102f, 23.0f, 12.0f)
                curveTo(23.0f, 8.1445f, 19.8555f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.7734f, 7.0f, 21.0f, 9.2266f, 21.0f, 12.0f)
                curveTo(21.0f, 14.7734f, 18.7734f, 17.0f, 16.0f, 17.0f)
                curveTo(13.2266f, 17.0f, 11.0f, 14.7734f, 11.0f, 12.0f)
                curveTo(11.0f, 9.2266f, 13.2266f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(16.0f, 19.0f)
                curveTo(16.8203f, 19.0f, 17.6016f, 19.1172f, 18.3438f, 19.3438f)
                curveTo(17.9961f, 20.3086f, 17.0898f, 21.0f, 16.0f, 21.0f)
                curveTo(14.9102f, 21.0f, 14.0039f, 20.3086f, 13.6563f, 19.3438f)
                curveTo(14.3984f, 19.1172f, 15.1797f, 19.0f, 16.0f, 19.0f)
                close()
            }
        }
        .build()
        return _userAltSolid!!
    }

private var _userAltSolid: ImageVector? = null
