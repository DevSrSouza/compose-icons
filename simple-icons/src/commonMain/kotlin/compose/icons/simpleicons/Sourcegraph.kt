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

public val SimpleIcons.Sourcegraph: VectorAsset
    get() {
        if (_sourcegraph != null) {
            return _sourcegraph!!
        }
        _sourcegraph = VectorAssetBuilder(name = "Sourcegraph", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.341f, 0.002f)
                arcToRelative(2.56f, 2.56f, 0.0f, false, false, -0.484f, 0.069f)
                curveTo(7.501f, 0.379f, 6.7f, 1.735f, 7.007f, 3.092f)
                lineTo(8.412f, 8.14f)
                lineTo(3.368f, 6.485f)
                curveTo(2.073f, 6.053f, 0.655f, 6.793f, 0.223f, 8.088f)
                curveToRelative(-0.431f, 1.295f, 0.31f, 2.714f, 1.603f, 3.146f)
                lineToRelative(5.853f, 1.919f)
                lineToRelative(-4.063f, 4.556f)
                arcToRelative(2.635f, 2.635f, 0.0f, false, false, -0.618f, 1.666f)
                arcToRelative(2.474f, 2.474f, 0.0f, false, false, 2.467f, 2.466f)
                curveToRelative(0.678f, 0.0f, 1.357f, -0.308f, 1.85f, -0.863f)
                lineToRelative(3.563f, -3.979f)
                lineToRelative(1.433f, 5.151f)
                arcTo(2.498f, 2.498f, 0.0f, false, false, 14.716f, 24.0f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.185f, 0.0f, 0.431f, -0.061f, 0.617f, -0.123f)
                arcToRelative(2.514f, 2.514f, 0.0f, false, false, 1.726f, -3.084f)
                lineToRelative(-1.38f, -5.017f)
                lineToRelative(4.957f, 1.625f)
                curveToRelative(0.309f, 0.062f, 0.556f, 0.123f, 0.802f, 0.123f)
                curveToRelative(1.111f, 0.0f, 2.036f, -0.678f, 2.343f, -1.726f)
                curveToRelative(0.433f, -1.296f, -0.308f, -2.714f, -1.603f, -3.146f)
                lineToRelative(-5.728f, -1.878f)
                lineToRelative(4.063f, -4.537f)
                curveToRelative(0.925f, -1.048f, 0.863f, -2.59f, -0.185f, -3.514f)
                curveToRelative(-1.049f, -0.926f, -2.59f, -0.864f, -3.516f, 0.184f)
                lineToRelative(-3.571f, 4.006f)
                lineToRelative(-1.424f, -5.178f)
                curveTo(11.494f, 0.655f, 10.462f, -0.046f, 9.34f, 0.002f)
                close()
            }
        }
        .build()
        return _sourcegraph!!
    }

private var _sourcegraph: VectorAsset? = null
