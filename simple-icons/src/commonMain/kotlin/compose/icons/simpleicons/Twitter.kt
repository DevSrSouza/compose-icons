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

public val SimpleIcons.Twitter: VectorAsset
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = VectorAssetBuilder(name = "Twitter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.954f, 4.569f)
                curveToRelative(-0.885f, 0.389f, -1.83f, 0.654f, -2.825f, 0.775f)
                curveToRelative(1.014f, -0.611f, 1.794f, -1.574f, 2.163f, -2.723f)
                curveToRelative(-0.951f, 0.555f, -2.005f, 0.959f, -3.127f, 1.184f)
                curveToRelative(-0.896f, -0.959f, -2.173f, -1.559f, -3.591f, -1.559f)
                curveToRelative(-2.717f, 0.0f, -4.92f, 2.203f, -4.92f, 4.917f)
                curveToRelative(0.0f, 0.39f, 0.045f, 0.765f, 0.127f, 1.124f)
                curveTo(7.691f, 8.094f, 4.066f, 6.13f, 1.64f, 3.161f)
                curveToRelative(-0.427f, 0.722f, -0.666f, 1.561f, -0.666f, 2.475f)
                curveToRelative(0.0f, 1.71f, 0.87f, 3.213f, 2.188f, 4.096f)
                curveToRelative(-0.807f, -0.026f, -1.566f, -0.248f, -2.228f, -0.616f)
                verticalLineToRelative(0.061f)
                curveToRelative(0.0f, 2.385f, 1.693f, 4.374f, 3.946f, 4.827f)
                curveToRelative(-0.413f, 0.111f, -0.849f, 0.171f, -1.296f, 0.171f)
                curveToRelative(-0.314f, 0.0f, -0.615f, -0.03f, -0.916f, -0.086f)
                curveToRelative(0.631f, 1.953f, 2.445f, 3.377f, 4.604f, 3.417f)
                curveToRelative(-1.68f, 1.319f, -3.809f, 2.105f, -6.102f, 2.105f)
                curveToRelative(-0.39f, 0.0f, -0.779f, -0.023f, -1.17f, -0.067f)
                curveToRelative(2.189f, 1.394f, 4.768f, 2.209f, 7.557f, 2.209f)
                curveToRelative(9.054f, 0.0f, 13.999f, -7.496f, 13.999f, -13.986f)
                curveToRelative(0.0f, -0.209f, 0.0f, -0.42f, -0.015f, -0.63f)
                curveToRelative(0.961f, -0.689f, 1.8f, -1.56f, 2.46f, -2.548f)
                lineToRelative(-0.047f, -0.02f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: VectorAsset? = null
