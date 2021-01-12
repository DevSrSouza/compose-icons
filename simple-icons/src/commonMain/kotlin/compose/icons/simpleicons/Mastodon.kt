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

public val SimpleIcons.Mastodon: VectorAsset
    get() {
        if (_mastodon != null) {
            return _mastodon!!
        }
        _mastodon = VectorAssetBuilder(name = "Mastodon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.193f, 7.88f)
                curveToRelative(0.0f, -5.207f, -3.411f, -6.733f, -3.411f, -6.733f)
                curveTo(18.062f, 0.357f, 15.108f, 0.025f, 12.041f, 0.0f)
                horizontalLineToRelative(-0.076f)
                curveToRelative(-3.069f, 0.025f, -6.02f, 0.357f, -7.74f, 1.147f)
                curveToRelative(0.0f, 0.0f, -3.412f, 1.526f, -3.412f, 6.732f)
                curveToRelative(0.0f, 1.193f, -0.023f, 2.619f, 0.015f, 4.13f)
                curveToRelative(0.124f, 5.092f, 0.934f, 10.11f, 5.641f, 11.355f)
                curveToRelative(2.17f, 0.574f, 4.034f, 0.695f, 5.536f, 0.612f)
                curveToRelative(2.722f, -0.15f, 4.25f, -0.972f, 4.25f, -0.972f)
                lineToRelative(-0.09f, -1.975f)
                reflectiveCurveToRelative(-1.945f, 0.613f, -4.13f, 0.54f)
                curveToRelative(-2.165f, -0.075f, -4.449f, -0.234f, -4.799f, -2.892f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.048f, -0.745f)
                reflectiveCurveToRelative(2.125f, 0.52f, 4.818f, 0.643f)
                curveToRelative(1.646f, 0.075f, 3.19f, -0.097f, 4.758f, -0.283f)
                curveToRelative(3.007f, -0.359f, 5.625f, -2.212f, 5.954f, -3.905f)
                curveToRelative(0.517f, -2.665f, 0.475f, -6.508f, 0.475f, -6.508f)
                close()
                moveTo(19.169f, 14.589f)
                horizontalLineToRelative(-2.497f)
                verticalLineToRelative(-6.12f)
                curveToRelative(0.0f, -1.29f, -0.543f, -1.944f, -1.628f, -1.944f)
                curveToRelative(-1.2f, 0.0f, -1.802f, 0.776f, -1.802f, 2.313f)
                verticalLineToRelative(3.349f)
                horizontalLineToRelative(-2.484f)
                verticalLineToRelative(-3.35f)
                curveToRelative(0.0f, -1.537f, -0.602f, -2.313f, -1.802f, -2.313f)
                curveToRelative(-1.085f, 0.0f, -1.628f, 0.655f, -1.628f, 1.945f)
                verticalLineToRelative(6.119f)
                lineTo(4.831f, 14.588f)
                lineTo(4.831f, 8.285f)
                curveToRelative(0.0f, -1.29f, 0.328f, -2.314f, 0.987f, -3.07f)
                curveToRelative(0.68f, -0.759f, 1.57f, -1.147f, 2.674f, -1.147f)
                curveToRelative(1.278f, 0.0f, 2.246f, 0.491f, 2.886f, 1.474f)
                lineTo(12.0f, 6.585f)
                lineToRelative(0.622f, -1.043f)
                curveToRelative(0.64f, -0.983f, 1.608f, -1.474f, 2.886f, -1.474f)
                curveToRelative(1.104f, 0.0f, 1.994f, 0.388f, 2.674f, 1.146f)
                curveToRelative(0.658f, 0.757f, 0.986f, 1.781f, 0.986f, 3.07f)
                verticalLineToRelative(6.305f)
                close()
            }
        }
        .build()
        return _mastodon!!
    }

private var _mastodon: VectorAsset? = null
