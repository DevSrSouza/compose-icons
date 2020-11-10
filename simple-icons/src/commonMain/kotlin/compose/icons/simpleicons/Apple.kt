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

public val SimpleIcons.Apple: VectorAsset
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = VectorAssetBuilder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.078f, 23.55f)
                curveToRelative(-0.473f, -0.316f, -0.893f, -0.703f, -1.244f, -1.15f)
                curveToRelative(-0.383f, -0.463f, -0.738f, -0.95f, -1.064f, -1.454f)
                curveToRelative(-0.766f, -1.12f, -1.365f, -2.345f, -1.78f, -3.636f)
                curveToRelative(-0.5f, -1.502f, -0.743f, -2.94f, -0.743f, -4.347f)
                curveToRelative(0.0f, -1.57f, 0.34f, -2.94f, 1.002f, -4.09f)
                curveToRelative(0.49f, -0.9f, 1.22f, -1.653f, 2.1f, -2.182f)
                curveToRelative(0.85f, -0.53f, 1.84f, -0.82f, 2.84f, -0.84f)
                curveToRelative(0.35f, 0.0f, 0.73f, 0.05f, 1.13f, 0.15f)
                curveToRelative(0.29f, 0.08f, 0.64f, 0.21f, 1.07f, 0.37f)
                curveToRelative(0.55f, 0.21f, 0.85f, 0.34f, 0.95f, 0.37f)
                curveToRelative(0.32f, 0.12f, 0.59f, 0.17f, 0.8f, 0.17f)
                curveToRelative(0.16f, 0.0f, 0.39f, -0.05f, 0.645f, -0.13f)
                curveToRelative(0.145f, -0.05f, 0.42f, -0.14f, 0.81f, -0.31f)
                curveToRelative(0.386f, -0.14f, 0.692f, -0.26f, 0.935f, -0.35f)
                curveToRelative(0.37f, -0.11f, 0.728f, -0.21f, 1.05f, -0.26f)
                curveToRelative(0.39f, -0.06f, 0.777f, -0.08f, 1.148f, -0.05f)
                curveToRelative(0.71f, 0.05f, 1.36f, 0.2f, 1.94f, 0.42f)
                curveToRelative(1.02f, 0.41f, 1.843f, 1.05f, 2.457f, 1.96f)
                curveToRelative(-0.26f, 0.16f, -0.5f, 0.346f, -0.725f, 0.55f)
                curveToRelative(-0.487f, 0.43f, -0.9f, 0.94f, -1.23f, 1.505f)
                curveToRelative(-0.43f, 0.77f, -0.65f, 1.64f, -0.644f, 2.52f)
                curveToRelative(0.015f, 1.083f, 0.29f, 2.035f, 0.84f, 2.86f)
                curveToRelative(0.387f, 0.6f, 0.904f, 1.114f, 1.534f, 1.536f)
                curveToRelative(0.31f, 0.21f, 0.582f, 0.355f, 0.84f, 0.45f)
                curveToRelative(-0.12f, 0.375f, -0.252f, 0.74f, -0.405f, 1.1f)
                curveToRelative(-0.347f, 0.807f, -0.76f, 1.58f, -1.25f, 2.31f)
                curveToRelative(-0.432f, 0.63f, -0.772f, 1.1f, -1.03f, 1.41f)
                curveToRelative(-0.402f, 0.48f, -0.79f, 0.84f, -1.18f, 1.097f)
                curveToRelative(-0.43f, 0.285f, -0.935f, 0.436f, -1.452f, 0.436f)
                curveToRelative(-0.35f, 0.015f, -0.7f, -0.03f, -1.034f, -0.127f)
                curveToRelative(-0.29f, -0.095f, -0.576f, -0.202f, -0.856f, -0.323f)
                curveToRelative(-0.293f, -0.134f, -0.596f, -0.248f, -0.905f, -0.34f)
                curveToRelative(-0.38f, -0.1f, -0.77f, -0.148f, -1.164f, -0.147f)
                curveToRelative(-0.4f, 0.0f, -0.79f, 0.05f, -1.16f, 0.145f)
                curveToRelative(-0.31f, 0.088f, -0.61f, 0.196f, -0.907f, 0.325f)
                curveToRelative(-0.42f, 0.175f, -0.695f, 0.29f, -0.855f, 0.34f)
                curveToRelative(-0.324f, 0.096f, -0.656f, 0.154f, -0.99f, 0.175f)
                curveToRelative(-0.52f, 0.0f, -1.004f, -0.15f, -1.486f, -0.45f)
                close()
                moveTo(13.932f, 5.09f)
                curveToRelative(-0.68f, 0.34f, -1.326f, 0.484f, -1.973f, 0.436f)
                curveToRelative(-0.1f, -0.646f, 0.0f, -1.31f, 0.27f, -2.037f)
                curveToRelative(0.24f, -0.62f, 0.56f, -1.18f, 1.0f, -1.68f)
                curveToRelative(0.46f, -0.52f, 1.01f, -0.95f, 1.63f, -1.26f)
                curveToRelative(0.66f, -0.34f, 1.29f, -0.52f, 1.89f, -0.55f)
                curveToRelative(0.08f, 0.68f, 0.0f, 1.35f, -0.25f, 2.07f)
                curveToRelative(-0.228f, 0.64f, -0.568f, 1.23f, -1.0f, 1.76f)
                curveToRelative(-0.435f, 0.52f, -0.975f, 0.95f, -1.586f, 1.26f)
                close()
            }
        }
        .build()
        return _apple!!
    }

private var _apple: VectorAsset? = null
