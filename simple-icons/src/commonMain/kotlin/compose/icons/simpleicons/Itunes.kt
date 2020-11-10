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

public val SimpleIcons.Itunes: VectorAsset
    get() {
        if (_itunes != null) {
            return _itunes!!
        }
        _itunes = VectorAssetBuilder(name = "Itunes", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.979f, 24.0f)
                curveToRelative(-2.483f, 0.0f, -4.898f, -0.777f, -6.954f, -2.262f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-2.59f, -1.872f, -4.3f, -4.644f, -4.814f, -7.807f)
                curveToRelative(-0.514f, -3.162f, 0.228f, -6.336f, 2.091f, -8.937f)
                curveToRelative(1.864f, -2.604f, 4.627f, -4.321f, 7.78f, -4.835f)
                curveToRelative(3.148f, -0.514f, 6.307f, 0.233f, 8.896f, 2.104f)
                curveToRelative(2.59f, 1.872f, 4.3f, 4.644f, 4.815f, 7.807f)
                curveToRelative(0.514f, 3.162f, -0.228f, 6.336f, -2.091f, 8.938f)
                curveToRelative(-1.865f, 2.604f, -4.628f, 4.321f, -7.78f, 4.835f)
                curveTo(13.273f, 23.948f, 12.623f, 24.0f, 11.979f, 24.0f)
                close()
                moveTo(5.505f, 21.074f)
                curveToRelative(2.411f, 1.742f, 5.353f, 2.438f, 8.284f, 1.96f)
                curveToRelative(2.936f, -0.479f, 5.509f, -2.079f, 7.246f, -4.504f)
                curveToRelative(3.583f, -5.004f, 2.445f, -12.004f, -2.538f, -15.604f)
                curveToRelative(-2.411f, -1.742f, -5.353f, -2.438f, -8.284f, -1.96f)
                curveTo(7.278f, 1.446f, 4.704f, 3.045f, 2.968f, 5.47f)
                curveTo(-0.616f, 10.474f, 0.523f, 17.474f, 5.505f, 21.074f)
                lineTo(5.505f, 21.074f)
                close()
                moveTo(16.111f, 17.522f)
                curveToRelative(0.731f, -0.214f, 1.246f, -0.734f, 1.458f, -1.468f)
                lineToRelative(0.062f, -0.216f)
                lineToRelative(0.008f, -5.787f)
                curveToRelative(0.006f, -4.334f, 0.0f, -5.814f, -0.024f, -5.895f)
                curveToRelative(-0.025f, -0.086f, -0.066f, -0.157f, -0.118f, -0.214f)
                curveToRelative(-0.077f, -0.048f, -0.17f, -0.073f, -0.276f, -0.073f)
                curveToRelative(-0.073f, 0.0f, -0.325f, 0.035f, -0.56f, 0.078f)
                curveToRelative(-1.041f, 0.19f, -7.176f, 1.411f, -7.281f, 1.45f)
                curveTo(9.218f, 5.458f, 9.057f, 5.6f, 8.981f, 5.751f)
                lineTo(8.916f, 5.879f)
                curveToRelative(0.0f, 0.0f, -0.031f, 9.071f, -0.078f, 9.173f)
                curveToRelative(-0.071f, 0.155f, -0.23f, 0.303f, -0.376f, 0.35f)
                curveToRelative(-0.069f, 0.022f, -0.343f, 0.084f, -0.609f, 0.137f)
                curveToRelative(-1.231f, 0.245f, -1.688f, 0.421f, -2.075f, 0.801f)
                curveToRelative(-0.22f, 0.216f, -0.382f, 0.51f, -0.453f, 0.819f)
                curveToRelative(-0.067f, 0.295f, -0.045f, 0.737f, 0.051f, 1.006f)
                curveToRelative(0.1f, 0.281f, 0.262f, 0.521f, 0.473f, 0.71f)
                curveToRelative(0.192f, 0.148f, 0.419f, 0.258f, 0.674f, 0.324f)
                curveToRelative(0.563f, 0.144f, 1.618f, -0.016f, 2.158f, -0.328f)
                curveToRelative(0.226f, -0.131f, 0.516f, -0.404f, 0.667f, -0.629f)
                curveToRelative(0.06f, -0.089f, 0.15f, -0.268f, 0.2f, -0.399f)
                curveToRelative(0.176f, -0.456f, 0.181f, -8.582f, 0.204f, -8.684f)
                curveToRelative(0.038f, -0.174f, 0.157f, -0.301f, 0.32f, -0.344f)
                curveToRelative(0.147f, -0.039f, 6.055f, -1.207f, 6.222f, -1.23f)
                curveToRelative(0.146f, -0.02f, 0.284f, 0.027f, 0.36f, 0.12f)
                curveToRelative(0.045f, 0.024f, 0.083f, 0.056f, 0.109f, 0.096f)
                curveToRelative(0.048f, 0.071f, 0.051f, 0.213f, 0.058f, 2.785f)
                curveToRelative(0.008f, 2.961f, 0.012f, 2.892f, -0.149f, 3.079f)
                curveToRelative(-0.117f, 0.136f, -0.263f, 0.189f, -0.864f, 0.311f)
                curveToRelative(-0.914f, 0.187f, -1.226f, 0.275f, -1.576f, 0.446f)
                curveToRelative(-0.437f, 0.213f, -0.679f, 0.447f, -0.867f, 0.836f)
                curveToRelative(-0.133f, 0.275f, -0.182f, 0.481f, -0.182f, 0.754f)
                curveToRelative(0.001f, 0.489f, 0.169f, 0.871f, 0.55f, 1.245f)
                curveToRelative(0.035f, 0.034f, 0.069f, 0.066f, 0.104f, 0.097f)
                curveToRelative(0.192f, 0.148f, 0.387f, 0.238f, 0.633f, 0.294f)
                curveTo(14.84f, 17.73f, 15.594f, 17.673f, 16.111f, 17.522f)
                close()
            }
        }
        .build()
        return _itunes!!
    }

private var _itunes: VectorAsset? = null
