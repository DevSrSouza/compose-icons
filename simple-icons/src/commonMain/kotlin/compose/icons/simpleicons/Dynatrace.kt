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

public val SimpleIcons.Dynatrace: VectorAsset
    get() {
        if (_dynatrace != null) {
            return _dynatrace!!
        }
        _dynatrace = VectorAssetBuilder(name = "Dynatrace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.373f, 0.0f)
                curveToRelative(-0.31f, 0.006f, -0.93f, 0.09f, -1.521f, 0.654f)
                curveTo(6.98f, 1.478f, 2.628f, 5.61f, 0.88f, 7.27f)
                curveTo(0.09f, 8.024f, 0.16f, 8.865f, 0.16f, 8.934f)
                verticalLineToRelative(0.377f)
                curveToRelative(0.067f, -0.292f, 0.187f, -0.499f, 0.427f, -0.825f)
                curveToRelative(0.496f, -0.616f, 1.3f, -0.788f, 1.627f, -0.822f)
                arcToRelative(64.233f, 64.233f, 0.0f, false, true, 0.002f, 0.0f)
                arcToRelative(64.233f, 64.233f, 0.0f, false, true, 6.527f, -0.549f)
                curveToRelative(4.335f, -0.137f, 7.197f, 0.225f, 7.197f, 0.225f)
                lineToRelative(6.084f, -5.793f)
                reflectiveCurveToRelative(-3.188f, -0.6f, -6.82f, -1.027f)
                arcTo(93.394f, 93.394f, 0.0f, false, false, 9.566f, 0.006f)
                curveToRelative(-0.021f, 0.0f, -0.09f, -0.008f, -0.193f, -0.006f)
                close()
                moveTo(22.933f, 2.508f)
                lineToRelative(-6.066f, 5.79f)
                reflectiveCurveToRelative(0.222f, 2.88f, -0.137f, 7.198f)
                curveToRelative(-0.189f, 2.45f, -0.584f, 4.866f, -0.875f, 6.494f)
                curveToRelative(-0.052f, 0.326f, -0.256f, 1.114f, -0.925f, 1.594f)
                curveToRelative(-0.29f, 0.198f, -0.491f, 0.295f, -0.748f, 0.363f)
                curveToRelative(1.546f, -0.51f, 1.091f, -7.047f, 1.091f, -7.047f)
                curveToRelative(-4.335f, 0.137f, -7.214f, -0.222f, -7.214f, -0.222f)
                lineTo(1.975f, 22.47f)
                reflectiveCurveToRelative(3.222f, 0.634f, 6.855f, 1.045f)
                curveToRelative(2.056f, 0.24f, 4.833f, 0.429f, 5.227f, 0.463f)
                curveToRelative(0.023f, 0.0f, 0.045f, -0.007f, 0.068f, -0.012f)
                curveToRelative(-0.013f, 0.003f, -0.022f, 0.009f, -0.035f, 0.012f)
                curveToRelative(0.138f, 0.0f, 0.259f, 0.015f, 0.379f, 0.015f)
                curveToRelative(0.085f, 0.0f, 0.925f, 0.105f, 1.713f, -0.648f)
                curveToRelative(1.748f, -1.663f, 6.083f, -5.81f, 6.94f, -6.633f)
                curveToRelative(0.788f, -0.754f, 0.72f, -1.594f, 0.72f, -1.68f)
                arcToRelative(81.84f, 81.84f, 0.0f, false, false, -0.207f, -5.654f)
                curveToRelative(-0.24f, -3.65f, -0.701f, -6.871f, -0.701f, -6.871f)
                close()
                moveTo(3.856f, 8.305f)
                curveTo(2.125f, 8.307f, 0.348f, 8.513f, 0.16f, 9.326f)
                curveToRelative(0.017f, 1.216f, 0.05f, 3.137f, 0.205f, 5.28f)
                curveToRelative(0.24f, 3.65f, 0.703f, 6.886f, 0.703f, 6.886f)
                lineToRelative(6.082f, -5.79f)
                curveToRelative(-0.017f, 0.017f, -0.239f, -2.88f, 0.121f, -7.198f)
                lineTo(7.27f, 8.504f)
                reflectiveCurveToRelative(-1.684f, -0.202f, -3.415f, -0.2f)
                close()
            }
        }
        .build()
        return _dynatrace!!
    }

private var _dynatrace: VectorAsset? = null
