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

public val SimpleIcons.Sfml: ImageVector
    get() {
        if (_sfml != null) {
            return _sfml!!
        }
        _sfml = Builder(name = "Sfml", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.187f, 0.334f)
                curveTo(11.114f, 0.312f, 9.878f, 0.863f, 7.959f, 2.241f)
                lineTo(3.162f, 5.726f)
                curveTo(0.252f, 7.84f, -0.839f, 8.527f, 0.692f, 13.329f)
                lineToRelative(1.832f, 5.639f)
                curveToRelative(1.112f, 3.421f, 1.428f, 4.671f, 6.468f, 4.699f)
                lineTo(14.92f, 23.667f)
                curveToRelative(3.597f, 0.0f, 4.884f, 0.085f, 6.468f, -4.699f)
                lineToRelative(1.832f, -5.639f)
                curveToRelative(1.112f, -3.421f, 1.59f, -4.618f, -2.47f, -7.603f)
                lineTo(15.953f, 2.241f)
                horizontalLineToRelative(-0.0f)
                curveTo(14.407f, 1.118f, 13.403f, 0.358f, 12.187f, 0.334f)
                close()
                moveTo(12.025f, 2.217f)
                curveToRelative(0.065f, 0.002f, 0.13f, 0.005f, 0.195f, 0.01f)
                curveToRelative(1.078f, 0.083f, 1.679f, 0.638f, 2.34f, 1.119f)
                lineToRelative(0.019f, 0.019f)
                lineToRelative(-2.128f, 8.168f)
                horizontalLineToRelative(-0.926f)
                lineTo(9.404f, 3.365f)
                curveToRelative(0.007f, -0.006f, 0.012f, -0.014f, 0.019f, -0.019f)
                curveToRelative(0.774f, -0.594f, 1.525f, -1.071f, 2.411f, -1.125f)
                lineToRelative(0.191f, -0.004f)
                close()
                moveTo(16.128f, 4.489f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.09f, 0.064f)
                lineToRelative(3.877f, 2.816f)
                curveToRelative(0.921f, 0.632f, 1.678f, 1.278f, 1.928f, 2.314f)
                curveToRelative(0.254f, 1.051f, -0.095f, 1.795f, -0.347f, 2.572f)
                lineToRelative(-2.108f, 6.506f)
                curveToRelative(-0.317f, 1.071f, -0.699f, 1.987f, -1.607f, 2.546f)
                curveToRelative(-0.921f, 0.567f, -1.735f, 0.469f, -2.552f, 0.469f)
                lineTo(8.568f, 21.776f)
                curveToRelative(-1.117f, 0.03f, -2.106f, -0.041f, -2.919f, -0.733f)
                curveToRelative(-0.824f, -0.701f, -0.982f, -1.505f, -1.234f, -2.282f)
                lineToRelative(-2.115f, -6.506f)
                curveToRelative(-0.375f, -1.054f, -0.607f, -2.021f, -0.199f, -3.009f)
                curveToRelative(0.412f, -1.0f, 1.126f, -1.397f, 1.787f, -1.877f)
                lineToRelative(3.877f, -2.816f)
                lineToRelative(0.083f, -0.058f)
                lineToRelative(0.836f, 3.208f)
                lineToRelative(-0.212f, 0.154f)
                lineToRelative(-2.771f, 2.006f)
                curveToRelative(-0.563f, 0.409f, -0.667f, 0.509f, -0.714f, 0.547f)
                curveToRelative(0.012f, 0.06f, 0.036f, 0.285f, 0.238f, 0.849f)
                lineToRelative(2.128f, 6.545f)
                curveToRelative(0.199f, 0.672f, 0.275f, 0.803f, 0.296f, 0.855f)
                curveToRelative(0.065f, 0.008f, 0.286f, 0.049f, 0.874f, 0.032f)
                horizontalLineToRelative(6.885f)
                curveToRelative(0.629f, 0.0f, 0.826f, -0.017f, 0.9f, -0.019f)
                curveToRelative(0.026f, -0.057f, 0.141f, -0.252f, 0.309f, -0.823f)
                lineToRelative(2.128f, -6.551f)
                curveToRelative(0.194f, -0.597f, 0.24f, -0.804f, 0.257f, -0.862f)
                curveToRelative(-0.048f, -0.045f, -0.202f, -0.215f, -0.688f, -0.546f)
                lineToRelative(-2.803f, -2.032f)
                lineToRelative(-0.219f, -0.161f)
                lineToRelative(0.836f, -3.208f)
                horizontalLineToRelative(-0.0f)
                close()
            }
        }
        .build()
        return _sfml!!
    }

private var _sfml: ImageVector? = null
