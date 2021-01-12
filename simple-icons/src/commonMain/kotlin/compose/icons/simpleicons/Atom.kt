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

public val SimpleIcons.Atom: VectorAsset
    get() {
        if (_atom != null) {
            return _atom!!
        }
        _atom = VectorAssetBuilder(name = "Atom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.489f, 9.025f)
                curveToRelative(-2.183f, -0.93f, -5.116f, -1.53f, -8.25f, -1.695f)
                curveToRelative(-0.5f, -0.03f, -0.987f, -0.04f, -1.45f, -0.04f)
                curveToRelative(2.318f, -2.83f, 4.802f, -4.73f, 6.437f, -4.79f)
                curveToRelative(0.322f, -0.013f, 0.595f, 0.055f, 0.813f, 0.196f)
                curveToRelative(0.706f, 0.458f, 0.905f, 1.768f, 0.545f, 3.59f)
                curveToRelative(-0.04f, 0.25f, 0.12f, 0.493f, 0.36f, 0.54f)
                curveToRelative(0.25f, 0.05f, 0.49f, -0.11f, 0.54f, -0.36f)
                curveToRelative(0.45f, -2.28f, 0.12f, -3.846f, -0.94f, -4.538f)
                curveToRelative(-0.38f, -0.248f, -0.84f, -0.365f, -1.35f, -0.346f)
                curveToRelative(-2.05f, 0.077f, -4.94f, 2.3f, -7.59f, 5.72f)
                curveToRelative(-1.154f, 0.035f, -2.24f, 0.13f, -3.232f, 0.287f)
                curveToRelative(-0.646f, -2.897f, -0.39f, -4.977f, 0.594f, -5.477f)
                curveToRelative(0.138f, -0.073f, 0.285f, -0.11f, 0.457f, -0.124f)
                curveToRelative(0.697f, -0.054f, 1.66f, 0.395f, 2.71f, 1.27f)
                curveToRelative(0.194f, 0.16f, 0.486f, 0.14f, 0.646f, -0.06f)
                arcToRelative(0.458f, 0.458f, 0.0f, false, false, -0.06f, -0.645f)
                curveTo(9.459f, 1.51f, 8.297f, 1.0f, 7.347f, 1.07f)
                arcToRelative(2.244f, 2.244f, 0.0f, false, false, -0.803f, 0.22f)
                curveToRelative(-1.19f, 0.607f, -1.67f, 2.327f, -1.37f, 4.838f)
                curveToRelative(0.07f, 0.52f, 0.16f, 1.062f, 0.29f, 1.62f)
                curveToRelative(-3.281f, 0.656f, -5.371f, 1.97f, -5.461f, 3.624f)
                curveToRelative(-0.06f, 1.17f, 0.865f, 2.284f, 2.68f, 3.222f)
                arcToRelative(0.46f, 0.46f, 0.0f, true, false, 0.42f, -0.816f)
                curveTo(1.653f, 13.031f, 0.873f, 12.19f, 0.92f, 11.42f)
                curveToRelative(0.05f, -1.08f, 1.772f, -2.19f, 4.76f, -2.78f)
                curveToRelative(0.27f, 0.994f, 0.62f, 2.032f, 1.05f, 3.09f)
                curveToRelative(-1.018f, 1.888f, -1.756f, 3.747f, -2.137f, 5.4f)
                curveToRelative(-0.56f, 2.465f, -0.26f, 4.22f, 0.86f, 4.948f)
                curveToRelative(0.36f, 0.234f, 0.78f, 0.35f, 1.247f, 0.35f)
                curveToRelative(0.935f, 0.0f, 2.067f, -0.46f, 3.347f, -1.372f)
                arcToRelative(0.458f, 0.458f, 0.0f, true, false, -0.53f, -0.746f)
                curveToRelative(-1.544f, 1.103f, -2.844f, 1.472f, -3.562f, 1.003f)
                curveToRelative(-0.76f, -0.495f, -0.926f, -1.943f, -0.46f, -3.976f)
                curveToRelative(0.32f, -1.386f, 0.907f, -2.93f, 1.708f, -4.52f)
                curveToRelative(0.2f, 0.438f, 0.41f, 0.876f, 0.63f, 1.313f)
                curveToRelative(1.425f, 2.796f, 3.17f, 5.227f, 4.91f, 6.845f)
                curveToRelative(1.386f, 1.29f, 2.674f, 1.963f, 3.735f, 1.963f)
                curveToRelative(0.35f, 0.0f, 0.68f, -0.075f, 0.976f, -0.223f)
                curveToRelative(1.145f, -0.585f, 1.64f, -2.21f, 1.398f, -4.575f)
                curveToRelative(-0.224f, -2.213f, -1.06f, -4.91f, -2.354f, -7.6f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, -0.83f, 0.396f)
                curveToRelative(2.69f, 5.602f, 2.88f, 10.19f, 1.37f, 10.96f)
                curveToRelative(-1.59f, 0.813f, -5.424f, -2.355f, -8.39f, -8.18f)
                curveToRelative(-0.34f, -0.655f, -0.637f, -1.3f, -0.9f, -1.93f)
                curveToRelative(0.34f, -0.608f, 0.7f, -1.22f, 1.095f, -1.83f)
                curveToRelative(0.395f, -0.604f, 0.806f, -1.188f, 1.224f, -1.745f)
                horizontalLineToRelative(0.394f)
                curveToRelative(0.54f, 0.0f, 1.126f, 0.01f, 1.734f, 0.048f)
                curveToRelative(6.53f, 0.343f, 10.975f, 2.56f, 10.884f, 4.334f)
                curveToRelative(-0.04f, 0.765f, -0.924f, 1.538f, -2.425f, 2.12f)
                arcToRelative(0.464f, 0.464f, 0.0f, false, false, -0.26f, 0.596f)
                arcToRelative(0.455f, 0.455f, 0.0f, false, false, 0.593f, 0.262f)
                curveToRelative(1.905f, -0.74f, 2.95f, -1.756f, 3.01f, -2.93f)
                curveToRelative(0.07f, -1.33f, -1.17f, -2.61f, -3.5f, -3.6f)
                verticalLineToRelative(-0.01f)
                close()
                moveTo(8.073f, 9.45f)
                curveToRelative(-0.27f, 0.415f, -0.52f, 0.827f, -0.764f, 1.244f)
                arcToRelative(23.66f, 23.66f, 0.0f, false, true, -0.723f, -2.215f)
                curveToRelative(0.713f, -0.11f, 1.485f, -0.19f, 2.31f, -0.24f)
                curveToRelative(-0.28f, 0.39f, -0.554f, 0.794f, -0.82f, 1.21f)
                verticalLineToRelative(-0.01f)
                close()
                moveTo(11.998f, 10.625f)
                arcToRelative(1.375f, 1.375f, 0.0f, true, false, 0.0f, 2.75f)
                arcToRelative(1.375f, 1.375f, 0.0f, true, false, 0.0f, -2.75f)
                close()
            }
        }
        .build()
        return _atom!!
    }

private var _atom: VectorAsset? = null
