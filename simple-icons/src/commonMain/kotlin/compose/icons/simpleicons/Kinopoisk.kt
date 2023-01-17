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

public val SimpleIcons.Kinopoisk: ImageVector
    get() {
        if (_kinopoisk != null) {
            return _kinopoisk!!
        }
        _kinopoisk = Builder(name = "Kinopoisk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.2732f, 16.1031f)
                curveToRelative(-2.266f, 6.226f, -9.1503f, 9.4362f, -15.3763f, 7.1701f)
                curveTo(1.6709f, 21.0072f, -1.5393f, 14.123f, 0.7268f, 7.897f)
                curveTo(2.9928f, 1.6709f, 9.877f, -1.5393f, 16.103f, 0.7268f)
                curveToRelative(6.226f, 2.266f, 9.4362f, 9.1503f, 7.1701f, 15.3763f)
                close()
                moveTo(13.4092f, 12.5129f)
                curveToRelative(0.2832f, -0.7783f, -0.118f, -1.6388f, -0.8963f, -1.922f)
                curveToRelative(-0.7783f, -0.2833f, -1.6388f, 0.118f, -1.922f, 0.8962f)
                curveToRelative(-0.2833f, 0.7783f, 0.118f, 1.6388f, 0.8962f, 1.922f)
                curveToRelative(0.7783f, 0.2833f, 1.6388f, -0.118f, 1.922f, -0.8962f)
                close()
                moveTo(9.0522f, 15.7146f)
                curveToRelative(0.5665f, -1.5565f, -0.236f, -3.2776f, -1.7926f, -3.8441f)
                curveToRelative(-1.5565f, -0.5665f, -3.2775f, 0.236f, -3.844f, 1.7925f)
                curveToRelative(-0.5666f, 1.5565f, 0.236f, 3.2776f, 1.7925f, 3.8441f)
                reflectiveCurveToRelative(3.2775f, -0.236f, 3.844f, -1.7925f)
                close()
                moveTo(12.1295f, 7.2596f)
                curveToRelative(0.5665f, -1.5565f, -0.236f, -3.2775f, -1.7925f, -3.844f)
                curveToRelative(-1.5565f, -0.5666f, -3.2776f, 0.236f, -3.8441f, 1.7925f)
                reflectiveCurveToRelative(0.236f, 3.2775f, 1.7925f, 3.844f)
                curveToRelative(1.5565f, 0.5666f, 3.2776f, -0.236f, 3.8441f, -1.7925f)
                close()
                moveTo(20.5845f, 10.337f)
                curveToRelative(0.5665f, -1.5565f, -0.236f, -3.2776f, -1.7926f, -3.8441f)
                curveToRelative(-1.5565f, -0.5665f, -3.2775f, 0.236f, -3.844f, 1.7925f)
                curveToRelative(-0.5666f, 1.5565f, 0.236f, 3.2776f, 1.7925f, 3.8441f)
                reflectiveCurveToRelative(3.2775f, -0.236f, 3.844f, -1.7925f)
                close()
                moveTo(17.5071f, 18.792f)
                curveToRelative(0.5665f, -1.5566f, -0.236f, -3.2777f, -1.7925f, -3.8442f)
                reflectiveCurveToRelative(-3.2776f, 0.236f, -3.8441f, 1.7926f)
                curveToRelative(-0.5665f, 1.5565f, 0.236f, 3.2775f, 1.7925f, 3.844f)
                curveToRelative(1.5565f, 0.5666f, 3.2776f, -0.236f, 3.8441f, -1.7925f)
                close()
            }
        }
        .build()
        return _kinopoisk!!
    }

private var _kinopoisk: ImageVector? = null
