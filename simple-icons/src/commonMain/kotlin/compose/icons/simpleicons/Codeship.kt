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

public val SimpleIcons.Codeship: VectorAsset
    get() {
        if (_codeship != null) {
            return _codeship!!
        }
        _codeship = VectorAssetBuilder(name = "Codeship", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.053f, 0.0f)
                curveToRelative(-0.972f, 0.0f, -2.398f, 0.405f, -2.398f, 0.762f)
                verticalLineToRelative(2.117f)
                arcToRelative(13.032f, 13.032f, 0.0f, false, true, 2.42f, -0.272f)
                arcToRelative(14.387f, 14.387f, 0.0f, false, true, 2.423f, 0.26f)
                lineTo(14.498f, 0.773f)
                curveToRelative(0.0f, -0.367f, -1.475f, -0.774f, -2.445f, -0.774f)
                close()
                moveTo(12.075f, 3.787f)
                curveToRelative(-2.042f, 0.0f, -5.068f, 0.837f, -5.068f, 1.193f)
                verticalLineToRelative(2.595f)
                arcToRelative(18.793f, 18.793f, 0.0f, false, true, 5.02f, -2.473f)
                curveToRelative(0.012f, -0.013f, 2.803f, 0.749f, 5.212f, 2.495f)
                lineToRelative(0.003f, 0.003f)
                lineTo(17.242f, 4.98f)
                curveToRelative(0.0f, -0.37f, -3.126f, -1.193f, -5.167f, -1.193f)
                close()
                moveTo(12.1f, 6.37f)
                curveToRelative(-0.763f, 0.197f, -1.514f, 0.555f, -2.214f, 0.887f)
                arcToRelative(17.585f, 17.585f, 0.0f, false, false, -4.19f, 2.767f)
                curveToRelative(1.352f, 1.378f, 2.161f, 3.11f, 2.654f, 4.72f)
                lineToRelative(0.037f, 0.113f)
                lineToRelative(0.04f, 0.037f)
                lineToRelative(-0.052f, -0.037f)
                curveToRelative(-0.013f, -0.013f, -1.623f, -1.661f, -3.972f, -1.661f)
                curveToRelative(-1.242f, 0.0f, -2.68f, 0.456f, -4.193f, 1.833f)
                curveToRelative(0.147f, 0.516f, 0.32f, 1.006f, 0.528f, 1.498f)
                verticalLineToRelative(0.016f)
                lineToRelative(0.025f, 0.047f)
                curveToRelative(2.004f, 4.575f, 6.7f, 7.553f, 11.693f, 7.406f)
                curveToRelative(4.895f, -0.147f, 9.348f, -3.311f, 11.13f, -7.859f)
                curveToRelative(0.098f, -0.246f, 0.184f, -0.506f, 0.272f, -0.752f)
                curveToRelative(-1.686f, -1.254f, -4.332f, -2.814f, -5.351f, -2.617f)
                verticalLineToRelative(-0.003f)
                curveToRelative(-0.776f, 0.149f, -1.686f, 1.266f, -2.854f, 2.385f)
                curveToRelative(0.468f, -1.66f, 1.307f, -3.515f, 2.832f, -5.114f)
                arcToRelative(15.58f, 15.58f, 0.0f, false, false, -1.243f, -1.021f)
                verticalLineToRelative(-0.012f)
                curveTo(15.717f, 7.87f, 13.944f, 6.899f, 12.1f, 6.369f)
                close()
                moveTo(12.09f, 7.267f)
                lineToRelative(0.612f, 3.05f)
                lineToRelative(-0.147f, 2.67f)
                lineToRelative(-0.443f, 3.959f)
                verticalLineToRelative(0.018f)
                lineToRelative(-0.05f, -0.006f)
                curveToRelative(-0.006f, -0.001f, -0.015f, -0.008f, -0.022f, -0.01f)
                verticalLineToRelative(-0.027f)
                lineToRelative(-0.493f, -3.947f)
                lineToRelative(-0.122f, -2.654f)
                close()
                moveTo(12.99f, 17.092f)
                lineToRelative(0.021f, 0.004f)
                arcToRelative(7.135f, 7.135f, 0.0f, false, true, -0.143f, 0.056f)
                curveToRelative(0.04f, -0.023f, 0.08f, -0.036f, 0.121f, -0.06f)
                close()
            }
        }
        .build()
        return _codeship!!
    }

private var _codeship: VectorAsset? = null
