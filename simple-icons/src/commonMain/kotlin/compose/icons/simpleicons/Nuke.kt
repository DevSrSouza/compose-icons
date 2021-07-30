package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Nuke: ImageVector
    get() {
        if (_nuke != null) {
            return _nuke!!
        }
        _nuke = Builder(name = "Nuke", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.293f, 0.004f)
                curveToRelative(6.625f, 0.162f, 11.865f, 5.664f, 11.703f, 12.29f)
                curveToRelative(-0.162f, 6.625f, -5.664f, 11.865f, -12.29f, 11.703f)
                curveTo(5.081f, 23.835f, -0.159f, 18.333f, 0.003f, 11.707f)
                lineToRelative(0.001f, -0.025f)
                curveTo(0.18f, 5.066f, 5.678f, -0.158f, 12.293f, 0.004f)
                close()
                moveTo(12.293f, 1.242f)
                curveToRelative(-5.941f, -0.164f, -10.89f, 4.52f, -11.054f, 10.461f)
                reflectiveCurveToRelative(4.52f, 10.89f, 10.461f, 11.054f)
                curveToRelative(5.941f, 0.164f, 10.89f, -4.52f, 11.054f, -10.461f)
                lineToRelative(0.001f, -0.025f)
                curveToRelative(0.15f, -5.932f, -4.53f, -10.866f, -10.462f, -11.029f)
                close()
                moveTo(18.135f, 9.544f)
                horizontalLineToRelative(2.4f)
                curveToRelative(0.976f, 0.0f, 0.682f, -0.873f, 0.682f, -0.873f)
                arcToRelative(9.587f, 9.587f, 0.0f, false, false, -2.111f, -3.431f)
                lineToRelative(-0.005f, 0.011f)
                arcToRelative(10.052f, 10.052f, 0.0f, false, false, -3.355f, -2.329f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, false, -0.894f, 0.622f)
                curveToRelative(-0.044f, 0.802f, -0.142f, 2.395f, -0.142f, 2.395f)
                reflectiveCurveToRelative(0.016f, 0.769f, -0.627f, 0.769f)
                curveToRelative(-0.813f, 0.011f, -1.489f, -0.044f, -1.489f, -0.044f)
                arcToRelative(2.314f, 2.314f, 0.0f, false, true, -1.255f, -0.545f)
                lineTo(8.868f, 3.511f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, -1.407f, -0.196f)
                arcToRelative(9.758f, 9.758f, 0.0f, false, false, -4.713f, 5.384f)
                curveToRelative(-0.256f, 0.714f, 0.333f, 0.806f, 0.731f, 0.806f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.086f, 2.086f, 0.0f, false, true, 1.68f, 0.627f)
                curveToRelative(0.785f, 0.824f, 1.331f, 1.369f, 1.331f, 1.369f)
                reflectiveCurveToRelative(0.48f, 0.54f, 1.26f, 1.358f)
                curveToRelative(0.431f, 0.459f, 0.632f, 1.089f, 0.545f, 1.713f)
                curveToRelative(0.0f, 0.0f, -0.295f, 5.744f, -0.295f, 6.0f)
                curveToRelative(-0.027f, 0.398f, 0.038f, 0.993f, 0.769f, 0.775f)
                arcToRelative(9.756f, 9.756f, 0.0f, false, false, 5.618f, -4.424f)
                arcToRelative(1.091f, 1.091f, 0.0f, false, false, -0.12f, -1.418f)
                lineToRelative(-2.471f, -2.607f)
                arcToRelative(2.303f, 2.303f, 0.0f, false, true, -0.496f, -1.282f)
                reflectiveCurveToRelative(-0.022f, -0.682f, 0.033f, -1.489f)
                curveToRelative(0.044f, -0.643f, 0.802f, -0.583f, 0.802f, -0.583f)
                close()
                moveTo(15.773f, 10.918f)
                curveToRelative(-0.475f, 0.469f, -1.484f, 0.229f, -2.22f, -0.545f)
                curveToRelative(-0.736f, -0.775f, -0.924f, -1.801f, -0.45f, -2.254f)
                curveToRelative(0.475f, -0.453f, 1.502f, -0.239f, 2.239f, 0.536f)
                curveToRelative(0.737f, 0.774f, 0.906f, 1.794f, 0.431f, 2.263f)
                close()
            }
        }
        .build()
        return _nuke!!
    }

private var _nuke: ImageVector? = null
