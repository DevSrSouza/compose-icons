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

public val SimpleIcons.Vine: VectorAsset
    get() {
        if (_vine != null) {
            return _vine!!
        }
        _vine = VectorAssetBuilder(name = "Vine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.522f, 11.923f)
                arcToRelative(7.862f, 7.862f, 0.0f, false, true, -1.758f, 0.206f)
                curveToRelative(-3.028f, 0.0f, -5.362f, -2.116f, -5.362f, -5.794f)
                curveToRelative(0.0f, -1.802f, 0.706f, -2.732f, 1.697f, -2.732f)
                curveToRelative(0.946f, 0.0f, 1.562f, 0.841f, 1.562f, 2.553f)
                curveToRelative(0.0f, 0.975f, -0.256f, 2.04f, -0.45f, 2.672f)
                curveToRelative(0.0f, 0.0f, 0.93f, 1.636f, 3.481f, 1.125f)
                curveToRelative(0.54f, -1.201f, 0.842f, -2.762f, 0.842f, -4.127f)
                curveTo(22.534f, 2.146f, 20.658f, 0.0f, 17.22f, 0.0f)
                curveToRelative(-3.544f, -0.017f, -5.616f, 2.7f, -5.616f, 6.289f)
                curveToRelative(0.0f, 3.55f, 1.66f, 6.597f, 4.395f, 7.985f)
                curveToRelative(-1.15f, 2.301f, -2.614f, 4.328f, -4.142f, 5.857f)
                curveToRelative(-2.77f, -3.352f, -5.274f, -7.821f, -6.303f, -16.543f)
                horizontalLineTo(1.466f)
                curveToRelative(1.889f, 14.527f, 7.518f, 19.15f, 9.005f, 20.037f)
                curveToRelative(0.84f, 0.504f, 1.566f, 0.48f, 2.336f, 0.049f)
                curveToRelative(1.215f, -0.688f, 4.849f, -4.316f, 6.86f, -8.564f)
                curveToRelative(0.84f, -0.003f, 1.861f, -0.1f, 2.867f, -0.328f)
                verticalLineToRelative(-2.865f)
                close()
            }
        }
        .build()
        return _vine!!
    }

private var _vine: VectorAsset? = null
