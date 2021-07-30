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

public val SimpleIcons.Thespritersresource: ImageVector
    get() {
        if (_thespritersresource != null) {
            return _thespritersresource!!
        }
        _thespritersresource = Builder(name = "Thespritersresource", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.25f, 0.0f)
                curveTo(0.557f, 0.0f, 0.0f, 0.557f, 0.0f, 1.25f)
                verticalLineToRelative(6.674f)
                curveTo(4.756f, 2.364f, 9.47f, 0.04f, 12.879f, 0.066f)
                curveToRelative(1.472f, 0.011f, 3.551f, 0.87f, 3.46f, 2.747f)
                curveToRelative(-0.074f, 1.558f, -3.202f, 3.763f, -4.71f, 4.197f)
                lineTo(10.5f, 6.893f)
                curveToRelative(0.075f, -0.687f, 2.257f, -2.77f, 2.246f, -3.79f)
                curveToRelative(-0.006f, -0.633f, -0.976f, -1.38f, -1.853f, -1.318f)
                curveToRelative(-2.047f, 0.145f, -8.146f, 5.276f, -8.059f, 6.944f)
                curveToRelative(0.07f, 1.356f, 3.274f, 1.823f, 6.46f, 1.775f)
                curveToRelative(3.276f, -0.05f, 3.634f, -0.116f, 6.352f, 0.01f)
                curveToRelative(2.129f, 0.098f, 8.24f, 2.02f, 8.293f, 5.39f)
                curveToRelative(0.039f, 2.465f, -2.673f, 4.325f, -6.326f, 5.776f)
                curveToRelative(-3.402f, 1.351f, -8.208f, 2.291f, -9.789f, 2.265f)
                curveToRelative(-2.62f, -0.043f, -7.763f, -0.901f, -7.758f, -3.543f)
                curveToRelative(0.004f, -2.015f, 1.494f, -4.58f, 3.907f, -4.732f)
                curveToRelative(0.399f, -0.025f, 0.74f, 0.028f, 1.047f, 0.588f)
                curveToRelative(-0.934f, 0.925f, -1.683f, 1.592f, -1.627f, 2.888f)
                curveToRelative(0.08f, 1.855f, 3.02f, 2.501f, 4.492f, 2.829f)
                curveToRelative(0.435f, 0.096f, 3.397f, 0.582f, 6.767f, -0.489f)
                curveToRelative(4.035f, -1.28f, 5.742f, -2.996f, 5.71f, -5.134f)
                curveToRelative(-0.014f, -0.85f, -0.923f, -2.285f, -3.563f, -3.149f)
                curveToRelative(-2.374f, -0.776f, -3.476f, -1.012f, -6.64f, -0.965f)
                curveToRelative(-2.98f, 0.045f, -5.872f, 0.109f, -8.263f, -0.43f)
                curveToRelative(-1.134f, -0.255f, -1.875f, -0.804f, -1.875f, -0.804f)
                lineTo(0.0f, 10.982f)
                verticalLineTo(22.75f)
                curveTo(0.0f, 23.442f, 0.557f, 24.0f, 1.25f, 24.0f)
                horizontalLineToRelative(21.5f)
                curveToRelative(0.692f, 0.0f, 1.25f, -0.558f, 1.25f, -1.25f)
                verticalLineTo(1.25f)
                curveTo(24.0f, 0.557f, 23.442f, 0.0f, 22.75f, 0.0f)
                horizontalLineTo(1.25f)
                close()
            }
        }
        .build()
        return _thespritersresource!!
    }

private var _thespritersresource: ImageVector? = null
