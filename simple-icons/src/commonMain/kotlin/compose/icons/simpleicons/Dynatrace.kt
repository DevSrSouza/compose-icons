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

public val SimpleIcons.Dynatrace: ImageVector
    get() {
        if (_dynatrace != null) {
            return _dynatrace!!
        }
        _dynatrace = Builder(name = "Dynatrace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.372f, 0.0f)
                curveToRelative(-0.31f, 0.006f, -0.93f, 0.09f, -1.521f, 0.654f)
                curveToRelative(-0.872f, 0.824f, -5.225f, 4.957f, -6.973f, 6.617f)
                curveToRelative(-0.79f, 0.754f, -0.72f, 1.595f, -0.72f, 1.664f)
                verticalLineToRelative(0.377f)
                curveToRelative(0.067f, -0.292f, 0.187f, -0.5f, 0.427f, -0.825f)
                curveToRelative(0.496f, -0.616f, 1.3f, -0.788f, 1.627f, -0.822f)
                arcToRelative(64.238f, 64.238f, 0.0f, false, true, 0.002f, 0.0f)
                arcToRelative(64.238f, 64.238f, 0.0f, false, true, 6.528f, -0.55f)
                curveToRelative(4.335f, -0.136f, 7.197f, 0.226f, 7.197f, 0.226f)
                lineToRelative(6.085f, -5.794f)
                reflectiveCurveToRelative(-3.188f, -0.6f, -6.82f, -1.027f)
                arcToRelative(93.4f, 93.4f, 0.0f, false, false, -5.64f, -0.514f)
                curveToRelative(-0.02f, 0.0f, -0.09f, -0.008f, -0.192f, -0.006f)
                close()
                moveTo(22.932f, 2.508f)
                lineToRelative(-6.066f, 5.79f)
                reflectiveCurveToRelative(0.222f, 2.881f, -0.137f, 7.2f)
                curveToRelative(-0.189f, 2.45f, -0.584f, 4.866f, -0.875f, 6.494f)
                curveToRelative(-0.052f, 0.326f, -0.256f, 1.114f, -0.925f, 1.594f)
                curveToRelative(-0.29f, 0.198f, -0.49f, 0.295f, -0.748f, 0.363f)
                curveToRelative(1.546f, -0.51f, 1.091f, -7.047f, 1.091f, -7.047f)
                curveToRelative(-4.335f, 0.137f, -7.214f, -0.223f, -7.214f, -0.223f)
                lineToRelative(-6.085f, 5.793f)
                reflectiveCurveToRelative(3.223f, 0.634f, 6.856f, 1.045f)
                curveToRelative(2.056f, 0.24f, 4.833f, 0.429f, 5.227f, 0.463f)
                curveToRelative(0.023f, 0.0f, 0.045f, -0.007f, 0.068f, -0.012f)
                curveToRelative(-0.013f, 0.003f, -0.022f, 0.009f, -0.035f, 0.012f)
                curveToRelative(0.138f, 0.0f, 0.26f, 0.015f, 0.38f, 0.015f)
                curveToRelative(0.084f, 0.0f, 0.924f, 0.105f, 1.712f, -0.648f)
                curveToRelative(1.748f, -1.663f, 6.084f, -5.81f, 6.94f, -6.634f)
                curveToRelative(0.789f, -0.754f, 0.72f, -1.594f, 0.72f, -1.68f)
                arcToRelative(81.846f, 81.846f, 0.0f, false, false, -0.206f, -5.654f)
                arcToRelative(101.75f, 101.75f, 0.0f, false, false, -0.701f, -6.872f)
                close()
                moveTo(3.855f, 8.306f)
                curveToRelative(-1.73f, 0.002f, -3.508f, 0.208f, -3.696f, 1.021f)
                curveToRelative(0.017f, 1.216f, 0.05f, 3.137f, 0.205f, 5.28f)
                curveToRelative(0.24f, 3.65f, 0.703f, 6.887f, 0.703f, 6.887f)
                lineToRelative(6.083f, -5.79f)
                curveToRelative(-0.017f, 0.016f, -0.24f, -2.88f, 0.12f, -7.2f)
                curveToRelative(0.0f, 0.0f, -1.684f, -0.201f, -3.416f, -0.2f)
                close()
            }
        }
        .build()
        return _dynatrace!!
    }

private var _dynatrace: ImageVector? = null
