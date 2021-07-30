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

public val LineAwesomeIcons.SignInAltSolid: ImageVector
    get() {
        if (_signInAltSolid != null) {
            return _signInAltSolid!!
        }
        _signInAltSolid = Builder(name = "SignInAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(10.4219f, 4.0f, 5.7422f, 7.832f, 4.4063f, 13.0f)
                lineTo(6.4688f, 13.0f)
                curveTo(7.7461f, 8.9453f, 11.5313f, 6.0f, 16.0f, 6.0f)
                curveTo(21.5156f, 6.0f, 26.0f, 10.4844f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5156f, 21.5156f, 26.0f, 16.0f, 26.0f)
                curveTo(11.5313f, 26.0f, 7.7461f, 23.0547f, 6.4688f, 19.0f)
                lineTo(4.4063f, 19.0f)
                curveTo(5.7422f, 24.168f, 10.4219f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(15.3438f, 11.2813f)
                lineTo(13.9063f, 12.7188f)
                lineTo(16.1875f, 15.0f)
                lineTo(4.0f, 15.0f)
                lineTo(4.0f, 17.0f)
                lineTo(16.1875f, 17.0f)
                lineTo(13.9063f, 19.2813f)
                lineTo(15.3438f, 20.7188f)
                lineTo(19.3438f, 16.7188f)
                lineTo(20.0313f, 16.0f)
                lineTo(19.3438f, 15.2813f)
                close()
            }
        }
        .build()
        return _signInAltSolid!!
    }

private var _signInAltSolid: ImageVector? = null
