package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.QuestionCircle: ImageVector
    get() {
        if (_questionCircle != null) {
            return _questionCircle!!
        }
        _questionCircle = Builder(name = "QuestionCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.043f, 8.0f, 8.0f, 119.083f, 8.0f, 256.0f)
                curveToRelative(0.0f, 136.997f, 111.043f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.003f, 248.0f, -248.0f)
                curveTo(504.0f, 119.083f, 392.957f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(256.0f, 456.0f)
                curveToRelative(-110.532f, 0.0f, -200.0f, -89.431f, -200.0f, -200.0f)
                curveToRelative(0.0f, -110.495f, 89.472f, -200.0f, 200.0f, -200.0f)
                curveToRelative(110.491f, 0.0f, 200.0f, 89.471f, 200.0f, 200.0f)
                curveToRelative(0.0f, 110.53f, -89.431f, 200.0f, -200.0f, 200.0f)
                close()
                moveTo(363.244f, 200.8f)
                curveToRelative(0.0f, 67.052f, -72.421f, 68.084f, -72.421f, 92.863f)
                lineTo(290.823f, 300.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                horizontalLineToRelative(-45.647f)
                curveToRelative(-6.627f, 0.0f, -12.0f, -5.373f, -12.0f, -12.0f)
                verticalLineToRelative(-8.659f)
                curveToRelative(0.0f, -35.745f, 27.1f, -50.034f, 47.579f, -61.516f)
                curveToRelative(17.561f, -9.845f, 28.324f, -16.541f, 28.324f, -29.579f)
                curveToRelative(0.0f, -17.246f, -21.999f, -28.693f, -39.784f, -28.693f)
                curveToRelative(-23.189f, 0.0f, -33.894f, 10.977f, -48.942f, 29.969f)
                curveToRelative(-4.057f, 5.12f, -11.46f, 6.071f, -16.666f, 2.124f)
                lineToRelative(-27.824f, -21.098f)
                curveToRelative(-5.107f, -3.872f, -6.251f, -11.066f, -2.644f, -16.363f)
                curveTo(184.846f, 131.491f, 214.94f, 112.0f, 261.794f, 112.0f)
                curveToRelative(49.071f, 0.0f, 101.45f, 38.304f, 101.45f, 88.8f)
                close()
                moveTo(298.0f, 368.0f)
                curveToRelative(0.0f, 23.159f, -18.841f, 42.0f, -42.0f, 42.0f)
                reflectiveCurveToRelative(-42.0f, -18.841f, -42.0f, -42.0f)
                reflectiveCurveToRelative(18.841f, -42.0f, 42.0f, -42.0f)
                reflectiveCurveToRelative(42.0f, 18.841f, 42.0f, 42.0f)
                close()
            }
        }
        .build()
        return _questionCircle!!
    }

private var _questionCircle: ImageVector? = null
