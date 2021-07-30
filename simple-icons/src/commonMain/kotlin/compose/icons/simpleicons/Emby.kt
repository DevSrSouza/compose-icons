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

public val SimpleIcons.Emby: ImageVector
    get() {
        if (_emby != null) {
            return _emby!!
        }
        _emby = Builder(name = "Emby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.041f, 0.0f)
                curveToRelative(-0.007f, 0.0f, -1.456f, 1.43f, -3.219f, 3.176f)
                lineTo(4.615f, 6.352f)
                lineToRelative(0.512f, 0.513f)
                lineToRelative(0.512f, 0.512f)
                lineToRelative(-2.819f, 2.791f)
                lineTo(0.0f, 12.961f)
                lineToRelative(1.83f, 1.848f)
                curveToRelative(1.006f, 1.016f, 2.438f, 2.46f, 3.182f, 3.209f)
                lineToRelative(1.351f, 1.359f)
                lineToRelative(0.508f, -0.496f)
                curveToRelative(0.28f, -0.273f, 0.515f, -0.498f, 0.524f, -0.498f)
                curveToRelative(0.008f, 0.0f, 1.266f, 1.264f, 2.794f, 2.808f)
                lineTo(12.97f, 24.0f)
                lineToRelative(0.187f, -0.182f)
                curveToRelative(0.23f, -0.225f, 5.007f, -4.95f, 5.717f, -5.656f)
                lineToRelative(0.52f, -0.516f)
                lineToRelative(-0.502f, -0.513f)
                curveToRelative(-0.276f, -0.282f, -0.5f, -0.52f, -0.496f, -0.53f)
                curveToRelative(0.003f, -0.009f, 1.264f, -1.26f, 2.802f, -2.783f)
                curveToRelative(1.538f, -1.522f, 2.8f, -2.776f, 2.803f, -2.785f)
                curveToRelative(0.005f, -0.012f, -3.617f, -3.684f, -6.107f, -6.193f)
                lineTo(17.65f, 4.6f)
                lineToRelative(-0.505f, 0.505f)
                curveToRelative(-0.279f, 0.278f, -0.517f, 0.501f, -0.53f, 0.497f)
                curveToRelative(-0.013f, -0.005f, -1.27f, -1.267f, -2.793f, -2.805f)
                arcTo(449.655f, 449.655f, 0.0f, false, false, 11.041f, 0.0f)
                close()
                moveTo(9.223f, 7.367f)
                curveToRelative(0.091f, 0.038f, 7.951f, 4.608f, 7.957f, 4.627f)
                curveToRelative(0.003f, 0.013f, -1.781f, 1.056f, -3.965f, 2.32f)
                arcToRelative(999.898f, 999.898f, 0.0f, false, true, -3.996f, 2.307f)
                curveToRelative(-0.019f, 0.006f, -0.026f, -1.266f, -0.026f, -4.629f)
                curveToRelative(0.0f, -3.7f, 0.007f, -4.634f, 0.03f, -4.625f)
                close()
            }
        }
        .build()
        return _emby!!
    }

private var _emby: ImageVector? = null
