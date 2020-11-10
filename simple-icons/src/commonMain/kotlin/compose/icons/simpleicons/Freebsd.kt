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

public val SimpleIcons.Freebsd: VectorAsset
    get() {
        if (_freebsd != null) {
            return _freebsd!!
        }
        _freebsd = VectorAssetBuilder(name = "Freebsd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.725f, 0.588f)
                curveToRelative(1.273f, 1.272f, -2.254f, 6.862f, -2.85f, 7.458f)
                curveToRelative(-0.597f, 0.596f, -2.111f, 0.048f, -3.383f, -1.224f)
                curveToRelative(-1.272f, -1.272f, -1.82f, -2.787f, -1.224f, -3.383f)
                curveToRelative(0.596f, -0.596f, 6.186f, -4.123f, 7.457f, -2.85f)
                close()
                moveTo(5.885f, 1.934f)
                curveTo(3.943f, 0.832f, 1.18f, -0.394f, 0.3f, 0.485f)
                curveToRelative(-0.89f, 0.89f, 0.38f, 3.717f, 1.494f, 5.663f)
                curveToRelative(0.99f, -1.723f, 2.4f, -3.174f, 4.091f, -4.214f)
                close()
                moveTo(21.785f, 7.608f)
                curveToRelative(0.179f, 0.606f, 0.147f, 1.107f, -0.143f, 1.397f)
                curveToRelative(-0.678f, 0.678f, -2.508f, -0.044f, -4.157f, -1.614f)
                arcToRelative(8.323f, 8.323f, 0.0f, false, true, -0.342f, -0.323f)
                curveToRelative(-0.597f, -0.597f, -1.06f, -1.232f, -1.358f, -1.817f)
                curveToRelative(-0.578f, -1.036f, -0.722f, -1.952f, -0.285f, -2.388f)
                curveToRelative(0.238f, -0.238f, 0.618f, -0.303f, 1.083f, -0.22f)
                curveToRelative(0.303f, -0.191f, 0.66f, -0.405f, 1.052f, -0.623f)
                arcToRelative(11.492f, 11.492f, 0.0f, false, false, -5.33f, -1.301f)
                curveTo(5.927f, 0.719f, 0.757f, 5.889f, 0.757f, 12.267f)
                curveToRelative(0.0f, 6.377f, 5.17f, 11.548f, 11.548f, 11.548f)
                reflectiveCurveToRelative(11.549f, -5.17f, 11.549f, -11.548f)
                curveToRelative(0.0f, -2.06f, -0.54f, -3.991f, -1.485f, -5.666f)
                arcToRelative(22.27f, 22.27f, 0.0f, false, true, -0.584f, 1.007f)
                close()
            }
        }
        .build()
        return _freebsd!!
    }

private var _freebsd: VectorAsset? = null
