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

public val SimpleIcons.Fortran: ImageVector
    get() {
        if (_fortran != null) {
            return _fortran!!
        }
        _fortran = Builder(name = "Fortran", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.536f, 0.0f)
                lineTo(4.464f, 0.0f)
                arcTo(4.463f, 4.463f, 0.0f, false, false, 0.0f, 4.464f)
                verticalLineToRelative(15.073f)
                arcTo(4.463f, 4.463f, 0.0f, false, false, 4.464f, 24.0f)
                horizontalLineToRelative(15.073f)
                arcTo(4.463f, 4.463f, 0.0f, false, false, 24.0f, 19.536f)
                lineTo(24.0f, 4.464f)
                arcTo(4.463f, 4.463f, 0.0f, false, false, 19.536f, 0.0f)
                close()
                moveTo(20.729f, 6.493f)
                verticalLineToRelative(3.871f)
                lineToRelative(-0.922f, -0.005f)
                curveToRelative(-0.507f, -0.003f, -0.981f, -0.021f, -1.052f, -0.041f)
                curveToRelative(-0.128f, -0.036f, -0.131f, -0.05f, -0.192f, -0.839f)
                curveToRelative(-0.079f, -1.013f, -0.143f, -1.462f, -0.306f, -2.136f)
                curveToRelative(-0.352f, -1.457f, -1.096f, -2.25f, -2.309f, -2.463f)
                curveToRelative(-0.509f, -0.089f, -2.731f, -0.176f, -4.558f, -0.177f)
                lineTo(10.13f, 4.7f)
                verticalLineToRelative(5.82f)
                lineToRelative(0.662f, -0.033f)
                curveToRelative(0.757f, -0.038f, 1.353f, -0.129f, 1.64f, -0.252f)
                curveToRelative(0.306f, -0.131f, 0.629f, -0.462f, 0.781f, -0.799f)
                curveToRelative(0.158f, -0.352f, 0.262f, -0.815f, 0.345f, -1.542f)
                curveToRelative(0.033f, -0.286f, 0.07f, -0.572f, 0.083f, -0.636f)
                curveToRelative(0.024f, -0.116f, 0.028f, -0.117f, 1.036f, -0.117f)
                horizontalLineToRelative(1.012f)
                verticalLineToRelative(9.3f)
                horizontalLineToRelative(-2.062f)
                lineToRelative(-0.035f, -0.536f)
                curveToRelative(-0.063f, -0.971f, -0.252f, -1.891f, -0.479f, -2.331f)
                curveToRelative(-0.311f, -0.601f, -0.922f, -0.871f, -2.151f, -0.95f)
                arcToRelative(11.422f, 11.422f, 0.0f, false, true, -0.666f, -0.059f)
                lineToRelative(-0.172f, -0.027f)
                lineToRelative(0.02f, 2.926f)
                curveToRelative(0.021f, 3.086f, 0.03f, 3.206f, 0.265f, 3.465f)
                curveToRelative(0.241f, 0.266f, 0.381f, 0.284f, 2.827f, 0.368f)
                curveToRelative(0.05f, 0.002f, 0.065f, 0.246f, 0.065f, 1.041f)
                verticalLineToRelative(1.039f)
                lineTo(3.271f, 21.377f)
                verticalLineToRelative(-1.039f)
                curveToRelative(0.0f, -0.954f, 0.007f, -1.039f, 0.091f, -1.041f)
                curveToRelative(0.05f, -0.001f, 0.543f, -0.023f, 1.097f, -0.049f)
                curveToRelative(0.891f, -0.042f, 1.033f, -0.061f, 1.244f, -0.167f)
                arcToRelative(0.712f, 0.712f, 0.0f, false, false, 0.345f, -0.328f)
                curveToRelative(0.106f, -0.206f, 0.107f, -0.254f, 0.107f, -6.78f)
                curveToRelative(0.0f, -6.133f, -0.006f, -6.584f, -0.09f, -6.737f)
                arcToRelative(0.938f, 0.938f, 0.0f, false, false, -0.553f, -0.436f)
                curveToRelative(-0.104f, -0.032f, -0.65f, -0.07f, -1.215f, -0.086f)
                lineToRelative(-1.026f, -0.027f)
                lineTo(3.271f, 2.622f)
                horizontalLineToRelative(17.458f)
                verticalLineToRelative(3.871f)
                close()
            }
        }
        .build()
        return _fortran!!
    }

private var _fortran: ImageVector? = null
