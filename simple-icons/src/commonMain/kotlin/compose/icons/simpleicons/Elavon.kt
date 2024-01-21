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

public val SimpleIcons.Elavon: ImageVector
    get() {
        if (_elavon != null) {
            return _elavon!!
        }
        _elavon = Builder(name = "Elavon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.028f, 12.248f)
                curveToRelative(-0.38f, 0.9f, -0.752f, 1.867f, -1.123f, 2.908f)
                arcToRelative(62.992f, 62.992f, 0.0f, false, false, -1.016f, 3.13f)
                horizontalLineToRelative(0.355f)
                arcToRelative(48.858f, 48.858f, 0.0f, false, true, 1.76f, -4.79f)
                curveToRelative(0.222f, -0.513f, 0.446f, -0.992f, 0.669f, -1.463f)
                curveToRelative(-0.215f, 0.066f, -0.43f, 0.132f, -0.645f, 0.215f)
                close()
                moveTo(19.348f, 6.531f)
                curveToRelative(-0.389f, -1.148f, -0.959f, -1.735f, -1.694f, -1.735f)
                horizontalLineToRelative(-0.008f)
                curveToRelative(-1.347f, 0.0f, -3.024f, 1.983f, -4.693f, 5.403f)
                curveToRelative(0.29f, -0.107f, 0.579f, -0.206f, 0.86f, -0.306f)
                curveToRelative(1.164f, -1.957f, 2.271f, -3.114f, 3.073f, -3.114f)
                horizontalLineToRelative(0.074f)
                curveToRelative(0.446f, 0.041f, 0.777f, 0.47f, 0.967f, 1.28f)
                curveToRelative(0.495f, 2.082f, -0.05f, 6.163f, -1.264f, 10.467f)
                curveToRelative(0.933f, 0.058f, 1.751f, 0.29f, 2.437f, 0.678f)
                curveToRelative(0.933f, -5.362f, 1.098f, -10.17f, 0.248f, -12.673f)
                close()
                moveTo(18.1f, 10.422f)
                curveToRelative(0.0f, -0.429f, 0.85f, 0.132f, -0.033f, -1.47f)
                curveToRelative(-4.378f, 0.371f, -10.525f, 3.18f, -16.217f, 7.765f)
                curveToRelative(-0.644f, 0.52f, -1.263f, 1.041f, -1.85f, 1.57f)
                horizontalLineToRelative(0.363f)
                curveToRelative(0.108f, -0.083f, 0.207f, -0.174f, 0.314f, -0.265f)
                curveToRelative(5.99f, -4.816f, 12.533f, -7.616f, 16.977f, -7.616f)
                curveToRelative(0.149f, 0.0f, 0.297f, 0.008f, 0.446f, 0.016f)
                close()
                moveTo(20.355f, 9.025f)
                curveToRelative(0.072f, 0.629f, 0.11f, 1.26f, 0.116f, 1.893f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, 1.33f, 0.893f)
                curveToRelative(0.81f, 0.826f, 1.174f, 1.956f, 1.092f, 3.369f)
                curveToRelative(-0.058f, 0.958f, -0.324f, 2.008f, -0.77f, 3.115f)
                horizontalLineToRelative(0.24f)
                curveToRelative(0.967f, -1.76f, 1.536f, -3.412f, 1.627f, -4.85f)
                curveToRelative(0.075f, -1.355f, -0.28f, -2.436f, -1.049f, -3.22f)
                curveToRelative(-0.627f, -0.645f, -1.52f, -1.026f, -2.586f, -1.2f)
                close()
            }
        }
        .build()
        return _elavon!!
    }

private var _elavon: ImageVector? = null
