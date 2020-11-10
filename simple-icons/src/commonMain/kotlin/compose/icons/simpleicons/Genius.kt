package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Genius: VectorAsset
    get() {
        if (_genius != null) {
            return _genius!!
        }
        _genius = VectorAssetBuilder(name = "Genius", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.897f, 1.235f)
                curveToRelative(-0.36f, 0.001f, -0.722f, 0.013f, -1.08f, 0.017f)
                curveToRelative(-0.218f, -0.028f, -0.371f, 0.225f, -0.352f, 0.416f)
                curveToRelative(-0.035f, 1.012f, 0.023f, 2.025f, -0.016f, 3.036f)
                curveToRelative(-0.037f, 0.841f, -0.555f, 1.596f, -1.224f, 2.08f)
                curveToRelative(-0.5f, 0.345f, -1.118f, 0.435f, -1.671f, 0.663f)
                curveToRelative(0.121f, 0.78f, 0.434f, 1.556f, 1.057f, 2.07f)
                curveToRelative(1.189f, 1.053f, 3.224f, 0.86f, 4.17f, -0.426f)
                curveToRelative(0.945f, -1.071f, 0.453f, -2.573f, 0.603f, -3.854f)
                curveToRelative(0.286f, -0.48f, 0.937f, -0.132f, 1.317f, -0.49f)
                curveToRelative(-0.34f, -1.249f, -0.81f, -2.529f, -1.725f, -3.472f)
                arcToRelative(11.125f, 11.125f, 0.0f, false, false, -1.08f, -0.04f)
                close()
                moveTo(2.477f, 1.241f)
                curveTo(0.53f, 2.992f, -0.386f, 5.797f, 0.154f, 8.361f)
                curveToRelative(0.384f, 2.052f, 1.682f, 3.893f, 3.45f, 4.997f)
                curveToRelative(0.134f, -0.23f, 0.23f, -0.476f, 0.09f, -0.73f)
                curveToRelative(-0.95f, -2.814f, -0.138f, -6.119f, 1.986f, -8.19f)
                curveToRelative(0.014f, -0.986f, 0.043f, -1.976f, -0.003f, -2.961f)
                lineToRelative(-0.188f, -0.214f)
                curveToRelative(-1.003f, -0.051f, -2.008f, 0.0f, -3.01f, -0.022f)
                close()
                moveTo(20.357f, 1.296f)
                lineToRelative(-0.205f, 0.356f)
                curveToRelative(0.265f, 0.938f, 0.6f, 1.862f, 0.72f, 2.834f)
                curveToRelative(0.58f, 3.546f, -0.402f, 7.313f, -2.614f, 10.14f)
                curveToRelative(-1.816f, 2.353f, -4.441f, 4.074f, -7.334f, 4.773f)
                curveToRelative(-2.66f, 0.66f, -5.514f, 0.45f, -8.064f, -0.543f)
                curveToRelative(-0.068f, 0.079f, -0.207f, 0.237f, -0.275f, 0.318f)
                curveToRelative(2.664f, 2.629f, 6.543f, 3.969f, 10.259f, 3.498f)
                curveToRelative(3.075f, -0.327f, 5.995f, -1.865f, 8.023f, -4.195f)
                curveToRelative(1.935f, -2.187f, 3.083f, -5.07f, 3.125f, -7.992f)
                curveToRelative(0.122f, -3.384f, -1.207f, -6.819f, -3.636f, -9.19f)
                close()
            }
        }
        .build()
        return _genius!!
    }

private var _genius: VectorAsset? = null
