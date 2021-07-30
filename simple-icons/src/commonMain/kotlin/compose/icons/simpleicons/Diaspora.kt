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

public val SimpleIcons.Diaspora: ImageVector
    get() {
        if (_diaspora != null) {
            return _diaspora!!
        }
        _diaspora = Builder(name = "Diaspora", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.257f, 21.928f)
                lineToRelative(-2.33f, -3.255f)
                curveToRelative(-0.622f, -0.87f, -1.128f, -1.549f, -1.155f, -1.55f)
                curveToRelative(-0.027f, 0.0f, -1.007f, 1.317f, -2.317f, 3.115f)
                curveToRelative(-1.248f, 1.713f, -2.28f, 3.115f, -2.292f, 3.115f)
                curveToRelative(-0.035f, 0.0f, -4.5f, -3.145f, -4.51f, -3.178f)
                curveToRelative(-0.006f, -0.016f, 1.003f, -1.497f, 2.242f, -3.292f)
                curveToRelative(1.239f, -1.794f, 2.252f, -3.29f, 2.252f, -3.325f)
                curveToRelative(0.0f, -0.056f, -0.401f, -0.197f, -3.55f, -1.247f)
                arcToRelative(1604.93f, 1604.93f, 0.0f, false, true, -3.593f, -1.2f)
                curveToRelative(-0.033f, -0.013f, 0.153f, -0.635f, 0.79f, -2.648f)
                curveToRelative(0.46f, -1.446f, 0.845f, -2.642f, 0.857f, -2.656f)
                curveToRelative(0.013f, -0.015f, 1.71f, 0.528f, 3.772f, 1.207f)
                curveToRelative(2.062f, 0.678f, 3.766f, 1.233f, 3.787f, 1.233f)
                curveToRelative(0.021f, 0.0f, 0.045f, -0.032f, 0.053f, -0.07f)
                curveToRelative(0.008f, -0.039f, 0.026f, -1.794f, 0.04f, -3.902f)
                curveToRelative(0.013f, -2.107f, 0.036f, -3.848f, 0.05f, -3.87f)
                curveToRelative(0.02f, -0.03f, 0.599f, -0.038f, 2.725f, -0.038f)
                curveToRelative(1.485f, 0.0f, 2.716f, 0.01f, 2.735f, 0.023f)
                curveToRelative(0.023f, 0.016f, 0.064f, 1.175f, 0.132f, 3.776f)
                curveToRelative(0.112f, 4.273f, 0.115f, 4.33f, 0.183f, 4.33f)
                curveToRelative(0.026f, 0.0f, 1.66f, -0.547f, 3.631f, -1.216f)
                curveToRelative(1.97f, -0.668f, 3.593f, -1.204f, 3.605f, -1.191f)
                curveToRelative(0.04f, 0.045f, 1.656f, 5.307f, 1.636f, 5.327f)
                curveToRelative(-0.011f, 0.01f, -1.656f, 0.574f, -3.655f, 1.252f)
                curveToRelative(-2.75f, 0.932f, -3.638f, 1.244f, -3.645f, 1.284f)
                curveToRelative(-0.006f, 0.029f, 0.94f, 1.442f, 2.143f, 3.202f)
                curveToRelative(1.184f, 1.733f, 2.148f, 3.164f, 2.143f, 3.18f)
                curveToRelative(-0.012f, 0.036f, -4.442f, 3.299f, -4.48f, 3.299f)
                curveToRelative(-0.015f, 0.0f, -0.577f, -0.767f, -1.249f, -1.705f)
                close()
            }
        }
        .build()
        return _diaspora!!
    }

private var _diaspora: ImageVector? = null
