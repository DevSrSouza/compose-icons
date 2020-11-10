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

public val SimpleIcons.Here: VectorAsset
    get() {
        if (_here != null) {
            return _here!!
        }
        _here = VectorAssetBuilder(name = "Here", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.656f, 19.63f)
                lineToRelative(-3.304f, 3.295f)
                lineTo(0.044f, 19.63f)
                close()
                moveTo(11.49f, 12.108f)
                curveToRelative(-0.69f, -0.821f, -0.656f, -1.264f, -0.229f, -1.69f)
                curveToRelative(0.519f, -0.52f, 1.047f, -0.306f, 1.639f, 0.274f)
                close()
                moveTo(18.57f, 3.115f)
                curveToRelative(0.518f, -0.519f, 1.046f, -0.305f, 1.638f, 0.275f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-0.692f, -0.818f, -0.659f, -1.258f, -0.229f, -1.685f)
                close()
                moveTo(22.841f, 4.555f)
                curveToRelative(-0.643f, 0.962f, -1.742f, 2.52f, -2.929f, 1.343f)
                lineToRelative(2.97f, -2.97f)
                curveToRelative(-0.266f, -0.283f, -0.47f, -0.524f, -0.611f, -0.676f)
                curveToRelative(-1.614f, -1.6f, -3.418f, -1.62f, -4.834f, -0.214f)
                curveToRelative(-0.943f, 0.943f, -1.19f, 2.02f, -0.915f, 3.051f)
                lineToRelative(-0.916f, -1.065f)
                arcToRelative(1.935f, 1.935f, 0.0f, false, false, -0.555f, 2.67f)
                lineToRelative(-1.065f, -0.884f)
                lineToRelative(-1.431f, 1.406f)
                lineToRelative(1.907f, 1.907f)
                curveToRelative(-1.474f, -1.168f, -3.051f, -1.055f, -4.34f, 0.217f)
                curveToRelative(-1.363f, 1.361f, -1.269f, 3.012f, -0.246f, 4.37f)
                lineToRelative(-0.208f, -0.205f)
                curveToRelative(-1.349f, -1.348f, -2.813f, -0.872f, -3.54f, -0.146f)
                curveToRelative(-0.561f, 0.561f, -0.915f, 1.33f, -0.762f, 1.867f)
                lineToRelative(-2.918f, -2.92f)
                lineToRelative(-1.556f, 1.556f)
                lineToRelative(5.764f, 5.768f)
                horizontalLineToRelative(3.095f)
                lineToRelative(-2.078f, -2.09f)
                curveToRelative(-1.093f, -1.111f, -1.111f, -1.697f, -0.58f, -2.225f)
                curveToRelative(0.53f, -0.528f, 1.104f, -0.192f, 2.151f, 0.851f)
                lineToRelative(2.054f, 2.05f)
                lineToRelative(1.562f, -1.543f)
                lineToRelative(-1.95f, -1.947f)
                curveToRelative(1.404f, 1.062f, 3.088f, 1.12f, 4.577f, -0.378f)
                lineToRelative(0.028f, -0.028f)
                arcToRelative(4.43f, 4.43f, 0.0f, false, false, 1.19f, -1.678f)
                lineToRelative(-1.169f, -0.784f)
                curveToRelative(-0.647f, 0.96f, -1.76f, 2.523f, -2.93f, 1.364f)
                lineToRelative(2.976f, -2.976f)
                lineToRelative(1.855f, 1.84f)
                lineToRelative(1.618f, -1.617f)
                lineToRelative(-2.32f, -2.319f)
                curveToRelative(-1.083f, -1.083f, -0.442f, -2.1f, 0.0f, -2.484f)
                arcToRelative(4.577f, 4.577f, 0.0f, false, false, 0.916f, 1.27f)
                curveToRelative(1.501f, 1.504f, 3.439f, 1.806f, 5.145f, 0.106f)
                lineToRelative(0.027f, -0.027f)
                arcToRelative(4.434f, 4.434f, 0.0f, false, false, 1.19f, -1.678f)
                close()
            }
        }
        .build()
        return _here!!
    }

private var _here: VectorAsset? = null
