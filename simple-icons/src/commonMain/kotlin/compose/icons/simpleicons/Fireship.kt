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

public val SimpleIcons.Fireship: ImageVector
    get() {
        if (_fireship != null) {
            return _fireship!!
        }
        _fireship = Builder(name = "Fireship", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.245f, 0.05f)
                curveToRelative(-0.042f, -0.035f, -0.14f, -0.035f, -0.22f, -0.05f)
                curveToRelative(-0.041f, 0.06f, -0.098f, 0.113f, -0.113f, 0.166f)
                arcToRelative(3.114f, 3.114f, 0.0f, false, false, -0.064f, 0.416f)
                arcToRelative(15.42f, 15.42f, 0.0f, false, true, -3.742f, 8.693f)
                curveToRelative(-1.258f, 1.474f, -2.51f, 2.982f, -3.44f, 4.585f)
                curveToRelative(-2.293f, 3.972f, -0.249f, 8.031f, 4.763f, 9.804f)
                curveToRelative(0.163f, 0.06f, 0.348f, 0.087f, 0.76f, 0.181f)
                curveToRelative(-1.701f, -1.534f, -2.57f, -3.1f, -2.28f, -4.944f)
                curveToRelative(0.284f, -1.765f, 1.172f, -3.337f, 2.525f, -4.77f)
                arcToRelative(1.043f, 1.043f, 0.0f, false, true, 0.099f, 0.549f)
                curveToRelative(-0.068f, 1.572f, 0.453f, 2.96f, 2.063f, 4.055f)
                curveToRelative(0.741f, 0.507f, 1.41f, 1.081f, 2.079f, 1.644f)
                curveToRelative(0.684f, 0.57f, 0.884f, 1.263f, 0.688f, 2.015f)
                curveToRelative(-0.09f, 0.366f, -0.227f, 0.725f, -0.378f, 1.171f)
                curveToRelative(1.145f, -0.11f, 2.203f, -0.264f, 2.914f, -0.9f)
                curveToRelative(0.68f, -0.604f, 1.183f, -1.322f, 1.909f, -2.154f)
                curveToRelative(0.049f, 0.707f, 0.15f, 1.255f, 0.113f, 1.8f)
                curveToRelative(-0.045f, 0.566f, -0.22f, 1.126f, -0.336f, 1.689f)
                curveToRelative(3.477f, -0.525f, 6.546f, -3.934f, 6.682f, -7.427f)
                curveToRelative(0.098f, -2.543f, -2.071f, -6.274f, -3.893f, -6.637f)
                lineToRelative(0.302f, 0.688f)
                curveToRelative(0.631f, 1.391f, 0.817f, 2.8f, 0.416f, 4.256f)
                curveToRelative(-0.4f, 1.448f, -2.426f, 3.073f, -4.214f, 3.277f)
                curveToRelative(0.06f, -0.144f, 0.087f, -0.28f, 0.17f, -0.39f)
                curveToRelative(1.927f, -2.596f, 1.946f, -5.31f, 0.854f, -8.084f)
                curveTo(15.44f, 5.98f, 12.632f, 2.88f, 9.245f, 0.053f)
                close()
            }
        }
        .build()
        return _fireship!!
    }

private var _fireship: ImageVector? = null
