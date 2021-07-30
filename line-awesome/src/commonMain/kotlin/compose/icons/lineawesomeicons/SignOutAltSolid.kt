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

public val LineAwesomeIcons.SignOutAltSolid: ImageVector
    get() {
        if (_signOutAltSolid != null) {
            return _signOutAltSolid!!
        }
        _signOutAltSolid = Builder(name = "SignOutAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(20.0508f, 28.0f, 23.6406f, 25.9883f, 25.8125f, 22.9063f)
                lineTo(24.1875f, 21.75f)
                curveTo(22.3789f, 24.3203f, 19.3906f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4648f, 26.0f, 6.0f, 21.5352f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4648f, 10.4648f, 6.0f, 16.0f, 6.0f)
                curveTo(19.3906f, 6.0f, 22.375f, 7.6797f, 24.1875f, 10.25f)
                lineTo(25.8125f, 9.0938f)
                curveTo(23.6406f, 6.0117f, 20.0508f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(23.3438f, 11.2813f)
                lineTo(21.9063f, 12.7188f)
                lineTo(24.1875f, 15.0f)
                lineTo(12.0f, 15.0f)
                lineTo(12.0f, 17.0f)
                lineTo(24.1875f, 17.0f)
                lineTo(21.9063f, 19.2813f)
                lineTo(23.3438f, 20.7188f)
                lineTo(27.3438f, 16.7188f)
                lineTo(28.0313f, 16.0f)
                lineTo(27.3438f, 15.2813f)
                close()
            }
        }
        .build()
        return _signOutAltSolid!!
    }

private var _signOutAltSolid: ImageVector? = null
