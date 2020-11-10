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

public val SimpleIcons.Swarm: VectorAsset
    get() {
        if (_swarm != null) {
            return _swarm!!
        }
        _swarm = VectorAssetBuilder(name = "Swarm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.367f, 8.755f)
                lineToRelative(0.004f, -0.005f)
                curveToRelative(-0.03f, -0.058f, -0.138f, -0.3f, -0.16f, -0.364f)
                verticalLineToRelative(-0.002f)
                curveTo(8.828f, 1.474f, 1.314f, 1.72f, 0.128f, 4.81f)
                curveToRelative(-0.91f, 2.373f, 3.072f, 8.026f, 12.24f, 3.945f)
                close()
                moveTo(9.9f, 19.232f)
                curveToRelative(-0.596f, -1.344f, -0.922f, -2.8f, -0.957f, -4.26f)
                curveToRelative(-0.964f, 1.49f, -1.69f, 2.987f, -2.176f, 4.104f)
                curveToRelative(-0.023f, 0.045f, -0.38f, 0.93f, -0.482f, 1.2f)
                curveToRelative(-0.13f, 0.33f, 0.045f, 0.734f, 0.383f, 0.854f)
                curveToRelative(0.273f, 0.104f, 1.165f, 0.42f, 1.22f, 0.45f)
                curveToRelative(1.14f, 0.374f, 2.716f, 0.84f, 4.456f, 1.126f)
                curveToRelative(-1.035f, -0.992f, -1.86f, -2.176f, -2.445f, -3.496f)
                verticalLineToRelative(0.022f)
                close()
                moveTo(13.89f, 8.117f)
                curveToRelative(5.18f, -2.306f, 4.456f, -6.31f, 3.116f, -6.825f)
                curveToRelative(-1.804f, -0.693f, -5.08f, 1.974f, -3.205f, 6.62f)
                curveToRelative(0.016f, 0.033f, 0.09f, 0.17f, 0.09f, 0.205f)
                close()
                moveTo(23.413f, 13.186f)
                verticalLineToRelative(-0.008f)
                curveToRelative(-0.786f, -1.764f, -2.226f, -3.024f, -3.897f, -3.624f)
                curveToRelative(-0.168f, -0.063f, -0.34f, -0.09f, -0.51f, -0.09f)
                curveToRelative(-0.87f, 0.0f, -1.707f, 0.723f, -1.785f, 1.626f)
                curveToRelative(-0.134f, 1.506f, 0.165f, 3.04f, 0.825f, 4.516f)
                curveToRelative(0.646f, 1.46f, 1.566f, 2.69f, 2.75f, 3.596f)
                curveToRelative(0.31f, 0.24f, 0.684f, 0.36f, 1.063f, 0.36f)
                curveToRelative(0.677f, 0.0f, 1.354f, -0.36f, 1.623f, -1.005f)
                curveToRelative(0.688f, -1.65f, 0.722f, -3.586f, -0.067f, -5.37f)
                close()
                moveTo(19.482f, 20.918f)
                horizontalLineToRelative(-0.004f)
                curveToRelative(-1.445f, -1.11f, -2.594f, -2.6f, -3.41f, -4.43f)
                curveToRelative(-0.826f, -1.86f, -1.164f, -3.738f, -1.004f, -5.586f)
                curveToRelative(0.045f, -0.516f, 0.194f, -1.012f, 0.438f, -1.465f)
                lineToRelative(-0.137f, 0.035f)
                curveToRelative(-0.764f, 0.19f, -1.5f, 0.52f, -2.156f, 0.953f)
                curveToRelative(-0.95f, 0.625f, -1.788f, 1.55f, -2.15f, 2.646f)
                curveToRelative(-0.097f, 0.298f, -0.17f, 0.62f, -0.193f, 0.93f)
                curveToRelative(-0.116f, 1.48f, 0.126f, 3.01f, 0.77f, 4.462f)
                curveToRelative(0.626f, 1.404f, 1.562f, 2.574f, 2.687f, 3.465f)
                curveToRelative(0.684f, 0.547f, 1.92f, 0.89f, 2.93f, 0.89f)
                curveToRelative(0.95f, 0.0f, 1.887f, -0.27f, 2.73f, -0.704f)
                curveToRelative(0.263f, -0.137f, 0.84f, -0.493f, 0.878f, -0.524f)
                curveToRelative(-0.5f, -0.122f, -0.973f, -0.345f, -1.38f, -0.66f)
                verticalLineToRelative(-0.012f)
                close()
            }
        }
        .build()
        return _swarm!!
    }

private var _swarm: VectorAsset? = null
