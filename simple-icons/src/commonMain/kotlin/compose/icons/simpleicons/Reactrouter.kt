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

public val SimpleIcons.Reactrouter: ImageVector
    get() {
        if (_reactrouter != null) {
            return _reactrouter!!
        }
        _reactrouter = Builder(name = "Reactrouter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.118f, 5.466f)
                arcToRelative(2.306f, 2.306f, 0.0f, false, false, -0.623f, 0.08f)
                curveToRelative(-0.278f, 0.067f, -0.702f, 0.332f, -0.953f, 0.583f)
                curveToRelative(-0.41f, 0.423f, -0.49f, 0.609f, -0.662f, 1.469f)
                curveToRelative(-0.08f, 0.423f, 0.41f, 1.43f, 0.847f, 1.734f)
                curveToRelative(0.45f, 0.317f, 1.085f, 0.502f, 2.065f, 0.608f)
                curveToRelative(1.429f, 0.16f, 1.84f, 0.636f, 1.84f, 2.197f)
                curveToRelative(0.0f, 1.377f, -0.385f, 1.747f, -1.96f, 1.906f)
                curveToRelative(-1.707f, 0.172f, -2.58f, 0.834f, -2.765f, 2.117f)
                curveToRelative(-0.106f, 0.781f, 0.41f, 1.76f, 1.125f, 2.091f)
                curveToRelative(1.627f, 0.768f, 3.15f, -0.198f, 3.467f, -2.196f)
                curveToRelative(0.211f, -1.284f, 0.622f, -1.642f, 1.998f, -1.747f)
                curveToRelative(1.588f, -0.133f, 2.409f, -0.675f, 2.713f, -1.787f)
                curveToRelative(0.278f, -1.02f, -0.304f, -2.157f, -1.297f, -2.554f)
                curveToRelative(-0.264f, -0.106f, -0.873f, -0.238f, -1.35f, -0.291f)
                curveToRelative(-1.495f, -0.16f, -1.879f, -0.424f, -2.038f, -1.39f)
                curveToRelative(-0.225f, -1.337f, -0.317f, -1.562f, -0.794f, -2.09f)
                arcToRelative(2.174f, 2.174f, 0.0f, false, false, -1.613f, -0.73f)
                close()
                moveTo(7.333f, 9.826f)
                arcToRelative(2.145f, 2.145f, 0.0f, false, false, -0.497f, 0.048f)
                curveToRelative(-1.469f, 0.318f, -2.17f, 2.051f, -1.35f, 3.295f)
                curveToRelative(1.178f, 1.774f, 3.944f, 0.953f, 3.97f, -1.177f)
                curveToRelative(0.012f, -1.193f, -0.98f, -2.143f, -2.123f, -2.166f)
                close()
                moveTo(2.089f, 14.19f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, false, -0.427f, 0.052f)
                curveToRelative(-2.158f, 0.476f, -2.237f, 3.626f, -0.106f, 4.182f)
                curveToRelative(0.53f, 0.145f, 0.582f, 0.145f, 1.111f, 0.013f)
                curveToRelative(1.191f, -0.318f, 1.866f, -1.456f, 1.549f, -2.607f)
                curveToRelative(-0.278f, -1.02f, -1.144f, -1.664f, -2.127f, -1.64f)
                close()
                moveTo(21.913f, 14.198f)
                curveToRelative(-0.233f, 0.002f, -0.477f, 0.058f, -0.784f, 0.162f)
                curveToRelative(-1.39f, 0.477f, -1.866f, 2.092f, -0.98f, 3.336f)
                curveToRelative(0.557f, 0.794f, 1.96f, 1.058f, 2.82f, 0.516f)
                curveToRelative(1.416f, -0.874f, 1.363f, -3.057f, -0.093f, -3.746f)
                curveToRelative(-0.38f, -0.186f, -0.663f, -0.271f, -0.963f, -0.268f)
                close()
            }
        }
        .build()
        return _reactrouter!!
    }

private var _reactrouter: ImageVector? = null
