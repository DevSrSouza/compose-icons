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

public val SimpleIcons.Battledotnet: ImageVector
    get() {
        if (_battledotnet != null) {
            return _battledotnet!!
        }
        _battledotnet = Builder(name = "Battledotnet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.001f, 3.106f)
                curveToRelative(0.0f, -0.059f, 0.0f, -0.187f, 0.063f, -0.187f)
                curveToRelative(0.09f, 0.0f, 0.167f, 0.19f, 0.196f, 0.27f)
                curveToRelative(0.486f, 1.548f, 0.35f, 3.449f, -0.345f, 5.588f)
                curveToRelative(2.756f, 1.473f, 4.338f, 3.382f, 4.052f, 5.168f)
                curveToRelative(-0.38f, 2.347f, -3.824f, 3.727f, -8.462f, 3.565f)
                arcToRelative(27.12f, 27.12f, 0.0f, false, false, 1.55f, -1.825f)
                curveToRelative(1.786f, -0.347f, 3.066f, -1.053f, 3.4f, -2.184f)
                curveToRelative(0.246f, -0.823f, -0.32f, -1.736f, -1.396f, -2.594f)
                curveToRelative(-1.768f, 3.723f, -4.722f, 7.058f, -7.451f, 8.985f)
                curveToRelative(1.323f, 1.687f, 2.556f, 2.858f, 3.964f, 3.516f)
                curveToRelative(0.052f, 0.025f, 0.164f, 0.09f, 0.126f, 0.148f)
                curveToRelative(-0.044f, 0.078f, -0.252f, 0.05f, -0.33f, 0.034f)
                curveToRelative(-1.585f, -0.352f, -3.158f, -1.42f, -4.673f, -3.093f)
                curveToRelative(-2.652f, 1.65f, -5.099f, 2.066f, -6.502f, 0.925f)
                curveToRelative(-1.842f, -1.5f, -1.316f, -5.178f, 1.137f, -9.106f)
                curveToRelative(0.193f, 0.631f, 0.505f, 1.526f, 0.806f, 2.253f)
                curveToRelative(-0.594f, 1.721f, -0.622f, 3.183f, 0.19f, 4.041f)
                curveToRelative(0.59f, 0.623f, 1.664f, 0.59f, 2.945f, 0.088f)
                curveToRelative(-2.325f, -3.395f, -3.738f, -7.62f, -4.04f, -10.954f)
                curveToRelative(-2.124f, 0.303f, -3.754f, 0.785f, -5.027f, 1.675f)
                curveToRelative(-0.048f, 0.033f, -0.16f, 0.098f, -0.195f, 0.04f)
                curveToRelative(-0.044f, -0.078f, 0.082f, -0.24f, 0.137f, -0.304f)
                curveToRelative(1.098f, -1.196f, 2.812f, -2.028f, 5.012f, -2.496f)
                curveToRelative(-0.102f, -3.124f, 0.758f, -5.45f, 2.45f, -6.093f)
                curveToRelative(2.22f, -0.846f, 5.14f, 1.448f, 7.316f, 5.542f)
                arcToRelative(26.617f, 26.617f, 0.0f, false, false, -2.354f, -0.429f)
                curveToRelative(-1.193f, -1.372f, -2.446f, -2.13f, -3.594f, -1.854f)
                curveToRelative(-0.834f, 0.2f, -1.341f, 1.146f, -1.547f, 2.502f)
                curveToRelative(4.108f, -0.332f, 8.473f, 0.56f, 11.51f, 1.964f)
                curveToRelative(0.8f, -1.984f, 1.197f, -3.637f, 1.062f, -5.185f)
                close()
                moveTo(10.403f, 18.163f)
                curveToRelative(3.252f, -1.859f, 5.889f, -4.696f, 7.638f, -7.965f)
                curveToRelative(-3.24f, -1.88f, -7.013f, -2.75f, -10.716f, -2.627f)
                curveToRelative(-0.008f, 3.745f, 1.124f, 7.451f, 3.082f, 10.594f)
                close()
            }
        }
        .build()
        return _battledotnet!!
    }

private var _battledotnet: ImageVector? = null
