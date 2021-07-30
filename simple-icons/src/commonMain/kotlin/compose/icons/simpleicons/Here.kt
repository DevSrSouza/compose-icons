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

public val SimpleIcons.Here: ImageVector
    get() {
        if (_here != null) {
            return _here!!
        }
        _here = Builder(name = "Here", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.29f, 1.007f)
                curveToRelative(-0.697f, 0.036f, -1.367f, 0.384f, -2.008f, 1.036f)
                curveToRelative(-0.97f, 0.987f, -1.104f, 2.206f, -0.679f, 3.316f)
                lineToRelative(-1.091f, -1.312f)
                curveToRelative(-0.106f, 0.041f, -0.306f, 0.203f, -0.506f, 0.406f)
                curveToRelative(-0.572f, 0.596f, -0.705f, 1.516f, -0.558f, 2.125f)
                lineToRelative(-0.734f, -0.635f)
                lineToRelative(-1.45f, 1.475f)
                lineToRelative(1.996f, 2.03f)
                curveToRelative(-1.583f, -1.326f, -3.007f, -1.259f, -4.323f, 0.082f)
                curveToRelative(-1.331f, 1.353f, -1.252f, 3.006f, -0.147f, 4.385f)
                lineToRelative(-0.186f, -0.189f)
                curveToRelative(-1.184f, -1.205f, -2.328f, -1.463f, -3.46f, -0.298f)
                curveToRelative(-0.666f, 0.663f, -0.772f, 1.314f, -0.706f, 1.897f)
                lineToRelative(-2.794f, -2.83f)
                lineToRelative(-1.625f, 1.651f)
                lineToRelative(5.372f, 5.48f)
                lineTo(0.0f, 19.626f)
                lineToRelative(3.312f, 3.37f)
                lineToRelative(3.282f, -3.34f)
                horizontalLineToRelative(3.128f)
                lineToRelative(-2.275f, -2.314f)
                curveToRelative(-0.798f, -0.8f, -1.039f, -1.354f, -0.547f, -1.855f)
                curveToRelative(0.36f, -0.379f, 0.773f, -0.367f, 1.278f, 0.148f)
                lineToRelative(2.741f, 2.803f)
                lineToRelative(1.65f, -1.679f)
                lineToRelative(-2.049f, -2.084f)
                curveToRelative(1.623f, 1.368f, 3.393f, 1.03f, 4.738f, -0.351f)
                curveToRelative(0.706f, -0.704f, 1.09f, -1.355f, 1.278f, -1.801f)
                lineToRelative(-1.452f, -0.825f)
                arcToRelative(6.544f, 6.544f, 0.0f, false, true, -0.878f, 1.218f)
                curveToRelative(-0.799f, 0.812f, -1.543f, 0.812f, -2.048f, 0.392f)
                lineToRelative(2.94f, -2.992f)
                lineTo(17.0f, 12.25f)
                lineToRelative(1.65f, -1.678f)
                lineToRelative(-1.782f, -1.815f)
                curveToRelative(-1.45f, -1.476f, -1.025f, -2.26f, -0.691f, -2.599f)
                curveToRelative(0.212f, -0.217f, 0.425f, -0.378f, 0.572f, -0.46f)
                arcToRelative(4.183f, 4.183f, 0.0f, false, false, 0.797f, 1.096f)
                curveToRelative(1.728f, 1.774f, 3.62f, 1.53f, 5.07f, 0.042f)
                curveToRelative(0.865f, -0.88f, 1.279f, -1.692f, 1.384f, -2.099f)
                lineToRelative(-1.424f, -0.799f)
                arcToRelative(5.902f, 5.902f, 0.0f, false, true, -1.023f, 1.489f)
                curveToRelative(-0.786f, 0.812f, -1.532f, 0.813f, -2.037f, 0.394f)
                lineToRelative(2.97f, -3.007f)
                lineToRelative(-0.374f, -0.379f)
                curveTo(21.13f, 1.43f, 20.188f, 0.961f, 19.291f, 1.007f)
                close()
                moveTo(19.235f, 2.925f)
                curveToRelative(0.273f, -0.002f, 0.558f, 0.113f, 0.838f, 0.35f)
                lineToRelative(-1.596f, 1.623f)
                curveToRelative(-0.452f, -0.527f, -0.465f, -1.136f, 0.0f, -1.623f)
                curveToRelative(0.226f, -0.23f, 0.485f, -0.349f, 0.758f, -0.35f)
                close()
                moveTo(11.878f, 10.411f)
                curveToRelative(0.275f, -0.002f, 0.564f, 0.113f, 0.85f, 0.35f)
                lineToRelative(-1.61f, 1.626f)
                curveToRelative(-0.452f, -0.528f, -0.466f, -1.151f, 0.0f, -1.626f)
                curveToRelative(0.227f, -0.23f, 0.486f, -0.349f, 0.76f, -0.35f)
                close()
            }
        }
        .build()
        return _here!!
    }

private var _here: ImageVector? = null
