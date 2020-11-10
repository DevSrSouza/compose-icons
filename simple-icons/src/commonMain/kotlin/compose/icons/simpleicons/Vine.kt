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
                moveTo(22.521f, 11.922f)
                curveToRelative(-0.618f, 0.143f, -1.217f, 0.206f, -1.758f, 0.206f)
                curveToRelative(-3.028f, 0.0f, -5.361f, -2.116f, -5.361f, -5.794f)
                curveToRelative(0.0f, -1.801f, 0.706f, -2.731f, 1.696f, -2.731f)
                curveToRelative(0.946f, 0.0f, 1.562f, 0.841f, 1.562f, 2.552f)
                curveToRelative(0.0f, 0.975f, -0.256f, 2.041f, -0.45f, 2.672f)
                curveToRelative(0.0f, 0.0f, 0.93f, 1.636f, 3.481f, 1.125f)
                curveToRelative(0.54f, -1.201f, 0.842f, -2.762f, 0.842f, -4.127f)
                curveTo(22.533f, 2.146f, 20.657f, 0.0f, 17.219f, 0.0f)
                curveToRelative(-3.543f, -0.017f, -5.615f, 2.7f, -5.615f, 6.288f)
                curveToRelative(0.0f, 3.55f, 1.659f, 6.597f, 4.395f, 7.985f)
                curveToRelative(-1.15f, 2.301f, -2.614f, 4.328f, -4.142f, 5.856f)
                curveToRelative(-2.769f, -3.351f, -5.273f, -7.82f, -6.302f, -16.541f)
                horizontalLineTo(1.467f)
                curveToRelative(1.889f, 14.526f, 7.517f, 19.149f, 9.004f, 20.035f)
                curveToRelative(0.84f, 0.504f, 1.566f, 0.48f, 2.336f, 0.049f)
                curveToRelative(1.215f, -0.688f, 4.848f, -4.315f, 6.859f, -8.563f)
                curveToRelative(0.84f, -0.003f, 1.861f, -0.1f, 2.867f, -0.328f)
                verticalLineToRelative(-2.865f)
                lineToRelative(-0.012f, 0.006f)
                close()
            }
        }
        .build()
        return _vine!!
    }

private var _vine: VectorAsset? = null
