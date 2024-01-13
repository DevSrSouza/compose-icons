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

public val SimpleIcons.Logseq: ImageVector
    get() {
        if (_logseq != null) {
            return _logseq!!
        }
        _logseq = Builder(name = "Logseq", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.3f, 9.838f)
                curveToRelative(-2.677f, -1.366f, -5.467f, -1.56f, -8.316f, -0.607f)
                curveToRelative(-1.738f, 0.58f, -3.197f, 1.58f, -4.267f, 3.088f)
                curveToRelative(-1.031f, 1.452f, -1.45f, 3.071f, -1.184f, 4.837f)
                curveToRelative(0.268f, 1.781f, 1.164f, 3.228f, 2.505f, 4.4f)
                curveTo(9.96f, 23.231f, 12.24f, 23.942f, 15.092f, 24.0f)
                curveToRelative(0.41f, -0.053f, 1.157f, -0.103f, 1.883f, -0.255f)
                curveToRelative(2.004f, -0.418f, 3.754f, -1.325f, 5.08f, -2.915f)
                curveToRelative(1.621f, -1.942f, 2.108f, -4.148f, 1.272f, -6.562f)
                curveToRelative(-0.704f, -2.034f, -2.138f, -3.467f, -4.027f, -4.43f)
                close()
                moveTo(7.515f, 6.295f)
                curveToRelative(0.507f, -2.162f, -0.88f, -4.664f, -2.988f, -5.37f)
                curveToRelative(-1.106f, -0.37f, -2.156f, -0.267f, -3.075f, 0.492f)
                curveTo(0.61f, 2.114f, 0.294f, 3.064f, 0.271f, 4.146f)
                curveToRelative(0.009f, 0.135f, 0.016f, 0.285f, 0.029f, 0.435f)
                curveToRelative(0.01f, 0.102f, 0.021f, 0.205f, 0.042f, 0.305f)
                curveToRelative(0.351f, 1.703f, 1.262f, 2.98f, 2.9f, 3.636f)
                curveToRelative(1.912f, 0.766f, 3.808f, -0.244f, 4.273f, -2.227f)
                close()
                moveTo(11.579f, 5.149f)
                curveToRelative(1.075f, 0.377f, 2.152f, 0.31f, 3.22f, -0.033f)
                curveToRelative(0.94f, -0.3f, 1.755f, -0.793f, 2.341f, -1.609f)
                curveToRelative(0.803f, -1.117f, 0.5f, -2.387f, -0.717f, -3.027f)
                curveToRelative(-0.6f, -0.317f, -1.246f, -0.438f, -1.927f, -0.48f)
                curveToRelative(-0.47f, 0.076f, -0.95f, 0.117f, -1.41f, 0.234f)
                curveToRelative(-1.068f, 0.27f, -2.002f, 0.781f, -2.653f, 1.7f)
                curveToRelative(-0.495f, 0.697f, -0.64f, 1.45f, -0.174f, 2.227f)
                curveToRelative(0.303f, 0.504f, 0.779f, 0.799f, 1.32f, 0.988f)
                close()
            }
        }
        .build()
        return _logseq!!
    }

private var _logseq: ImageVector? = null
