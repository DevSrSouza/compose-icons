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

public val SimpleIcons.OpenSourceInitiative: VectorAsset
    get() {
        if (_openSourceInitiative != null) {
            return _openSourceInitiative!!
        }
        _openSourceInitiative = VectorAssetBuilder(name = "OpenSourceInitiative", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(-0.102f, 12.53f)
                curveTo(0.01f, 5.956f, 4.613f, 1.277f, 10.248f, 0.52f)
                curveToRelative(6.718f, -0.9f, 12.371f, 3.67f, 13.456f, 9.735f)
                curveToRelative(1.03f, 5.75f, -2.13f, 11.133f, -7.339f, 13.263f)
                curveToRelative(-0.45f, 0.184f, -0.697f, 0.082f, -0.87f, -0.373f)
                lineToRelative(-2.587f, -6.728f)
                curveToRelative(-0.15f, -0.392f, -0.048f, -0.64f, 0.34f, -0.814f)
                curveToRelative(1.17f, -0.532f, 1.901f, -1.423f, 2.095f, -2.7f)
                arcToRelative(3.46f, 3.46f, 0.0f, false, false, -3.122f, -3.98f)
                arcToRelative(3.463f, 3.463f, 0.0f, false, false, -3.75f, 2.89f)
                curveToRelative(-0.253f, 1.598f, 0.536f, 3.084f, 2.027f, 3.76f)
                curveToRelative(0.464f, 0.214f, 0.556f, 0.418f, 0.377f, 0.892f)
                lineToRelative(-2.6f, 6.772f)
                curveToRelative(-0.125f, 0.334f, -0.4f, 0.45f, -0.75f, 0.315f)
                arcToRelative(11.98f, 11.98f, 0.0f, false, true, -6.33f, -5.76f)
                curveToRelative(-1.206f, -2.383f, -1.22f, -4.247f, -1.297f, -5.263f)
                close()
                moveTo(0.91f, 12.438f)
                curveToRelative(0.02f, 0.32f, 0.03f, 0.692f, 0.063f, 1.07f)
                curveToRelative(0.305f, 3.48f, 2.4f, 6.946f, 6.34f, 8.862f)
                curveToRelative(0.156f, 0.073f, 0.214f, 0.04f, 0.272f, -0.11f)
                quadToRelative(1.082f, -2.84f, 2.178f, -5.68f)
                curveToRelative(0.063f, -0.16f, 0.03f, -0.231f, -0.116f, -0.323f)
                curveToRelative(-1.53f, -0.963f, -2.29f, -2.348f, -2.207f, -4.163f)
                curveToRelative(0.048f, -1.045f, 0.45f, -1.96f, 1.152f, -2.725f)
                curveToRelative(1.452f, -1.583f, 3.727f, -1.927f, 5.59f, -0.852f)
                arcToRelative(4.436f, 4.436f, 0.0f, false, true, 2.188f, 4.376f)
                curveToRelative(-0.174f, 1.48f, -0.934f, 2.609f, -2.212f, 3.378f)
                curveToRelative(-0.13f, 0.078f, -0.17f, 0.14f, -0.11f, 0.29f)
                quadToRelative(1.102f, 2.847f, 2.187f, 5.698f)
                curveToRelative(0.058f, 0.15f, 0.116f, 0.184f, 0.27f, 0.11f)
                curveToRelative(1.72f, -0.802f, 3.157f, -1.95f, 4.265f, -3.484f)
                curveToRelative(1.685f, -2.333f, 2.377f, -4.932f, 2.048f, -7.793f)
                curveToRelative(-0.663f, -5.687f, -5.78f, -10.397f, -12.368f, -9.584f)
                curveToRelative(-5.135f, 0.63f, -9.453f, 4.96f, -9.54f, 10.93f)
                close()
            }
        }
        .build()
        return _openSourceInitiative!!
    }

private var _openSourceInitiative: VectorAsset? = null
