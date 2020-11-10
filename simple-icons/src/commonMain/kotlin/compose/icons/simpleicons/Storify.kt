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

public val SimpleIcons.Storify: VectorAsset
    get() {
        if (_storify != null) {
            return _storify!!
        }
        _storify = VectorAssetBuilder(name = "Storify", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.98f, 8.566f)
                curveToRelative(0.32f, 0.607f, 0.563f, 1.275f, 0.732f, 2.005f)
                curveToRelative(0.17f, 0.73f, 0.264f, 1.495f, 0.285f, 2.292f)
                curveToRelative(0.02f, 0.795f, -0.061f, 1.605f, -0.24f, 2.416f)
                curveToRelative(-0.18f, 0.815f, -0.447f, 1.611f, -0.797f, 2.388f)
                reflectiveCurveToRelative(-0.83f, 1.515f, -1.441f, 2.22f)
                curveToRelative(-0.613f, 0.706f, -1.313f, 1.339f, -2.107f, 1.901f)
                curveToRelative(-0.781f, 0.554f, -1.74f, 1.034f, -2.85f, 1.409f)
                curveToRelative(-1.111f, 0.39f, -2.326f, 0.645f, -3.646f, 0.795f)
                lineToRelative(-0.299f, -0.721f)
                curveToRelative(0.074f, -0.015f, 0.164f, -0.045f, 0.299f, -0.089f)
                curveToRelative(0.137f, -0.046f, 0.375f, -0.135f, 0.721f, -0.301f)
                curveToRelative(0.359f, -0.15f, 0.689f, -0.329f, 1.02f, -0.54f)
                curveToRelative(0.33f, -0.21f, 0.689f, -0.495f, 1.08f, -0.87f)
                curveToRelative(0.404f, -0.375f, 0.734f, -0.779f, 1.02f, -1.215f)
                curveToRelative(0.285f, -0.449f, 0.525f, -0.99f, 0.721f, -1.649f)
                curveToRelative(0.195f, -0.66f, 0.301f, -1.365f, 0.301f, -2.115f)
                curveToRelative(0.0f, -0.721f, -0.09f, -1.381f, -0.285f, -2.01f)
                curveToRelative(-0.195f, -0.631f, -0.451f, -1.155f, -0.766f, -1.621f)
                curveToRelative(-0.314f, -0.449f, -0.674f, -0.885f, -1.049f, -1.289f)
                curveToRelative(-0.375f, -0.405f, -0.766f, -0.795f, -1.141f, -1.155f)
                curveToRelative(-0.391f, -0.36f, -0.734f, -0.735f, -1.066f, -1.095f)
                curveToRelative(-0.314f, -0.361f, -0.584f, -0.766f, -0.779f, -1.215f)
                curveToRelative(-0.195f, -0.45f, -0.3f, -0.916f, -0.3f, -1.41f)
                curveToRelative(0.0f, -0.885f, 0.361f, -1.65f, 1.05f, -2.28f)
                curveToRelative(0.705f, -0.646f, 1.664f, -0.96f, 2.895f, -0.96f)
                curveToRelative(0.361f, 0.0f, 0.721f, 0.029f, 1.096f, 0.105f)
                curveToRelative(0.375f, 0.074f, 0.824f, 0.209f, 1.334f, 0.435f)
                curveToRelative(0.512f, 0.226f, 0.992f, 0.51f, 1.455f, 0.854f)
                curveToRelative(0.467f, 0.346f, 0.961f, 0.84f, 1.471f, 1.455f)
                curveToRelative(0.51f, 0.619f, 0.977f, 1.335f, 1.395f, 2.145f)
                lineToRelative(-0.109f, 0.115f)
                close()
                moveTo(1.02f, 15.451f)
                curveToRelative(-0.319f, -0.607f, -0.563f, -1.275f, -0.731f, -2.006f)
                curveToRelative(-0.169f, -0.731f, -0.265f, -1.494f, -0.285f, -2.291f)
                curveToRelative(-0.021f, -0.796f, 0.061f, -1.605f, 0.24f, -2.416f)
                curveToRelative(0.181f, -0.816f, 0.445f, -1.612f, 0.795f, -2.388f)
                curveToRelative(0.352f, -0.777f, 0.832f, -1.516f, 1.44f, -2.22f)
                curveToRelative(0.615f, -0.705f, 1.315f, -1.34f, 2.109f, -1.9f)
                curveToRelative(0.78f, -0.556f, 1.739f, -1.035f, 2.851f, -1.41f)
                curveTo(8.55f, 0.427f, 9.765f, 0.158f, 11.085f, 0.007f)
                lineToRelative(0.299f, 0.711f)
                curveToRelative(-0.063f, 0.014f, -0.158f, 0.044f, -0.285f, 0.08f)
                curveToRelative(-0.124f, 0.039f, -0.359f, 0.135f, -0.712f, 0.293f)
                curveToRelative(-0.35f, 0.156f, -0.687f, 0.334f, -1.013f, 0.537f)
                curveToRelative(-0.322f, 0.202f, -0.68f, 0.489f, -1.072f, 0.861f)
                reflectiveCurveToRelative(-0.73f, 0.777f, -1.012f, 1.215f)
                curveToRelative(-0.284f, 0.439f, -0.521f, 0.985f, -0.716f, 1.64f)
                curveToRelative(-0.196f, 0.654f, -0.291f, 1.355f, -0.291f, 2.107f)
                curveToRelative(0.0f, 0.71f, 0.09f, 1.375f, 0.301f, 2.0f)
                curveToRelative(0.195f, 0.625f, 0.449f, 1.162f, 0.765f, 1.613f)
                curveToRelative(0.315f, 0.466f, 0.675f, 0.885f, 1.05f, 1.307f)
                curveToRelative(0.375f, 0.419f, 0.766f, 0.794f, 1.141f, 1.154f)
                curveToRelative(0.375f, 0.359f, 0.734f, 0.734f, 1.05f, 1.096f)
                curveToRelative(0.329f, 0.375f, 0.585f, 0.779f, 0.78f, 1.214f)
                curveToRelative(0.195f, 0.45f, 0.299f, 0.915f, 0.299f, 1.41f)
                curveToRelative(0.0f, 0.899f, -0.359f, 1.666f, -1.049f, 2.296f)
                curveToRelative(-0.706f, 0.645f, -1.667f, 0.959f, -2.897f, 0.959f)
                curveToRelative(-0.359f, 0.0f, -0.72f, -0.03f, -1.095f, -0.105f)
                curveToRelative(-0.375f, -0.074f, -0.825f, -0.209f, -1.32f, -0.435f)
                curveToRelative(-0.51f, -0.226f, -0.99f, -0.51f, -1.47f, -0.855f)
                curveToRelative(-0.466f, -0.345f, -0.96f, -0.84f, -1.47f, -1.455f)
                curveToRelative(-0.51f, -0.614f, -0.975f, -1.334f, -1.396f, -2.144f)
                lineToRelative(0.048f, -0.055f)
                close()
            }
        }
        .build()
        return _storify!!
    }

private var _storify: VectorAsset? = null
