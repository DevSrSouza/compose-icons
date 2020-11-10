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

public val SimpleIcons.Boost: VectorAsset
    get() {
        if (_boost != null) {
            return _boost!!
        }
        _boost = VectorAssetBuilder(name = "Boost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.818f, 18.157f)
                curveToRelative(0.058f, -0.045f, 0.112f, -0.099f, 0.163f, -0.15f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, 0.0f, -3.169f)
                lineToRelative(-7.802f, -8.0f)
                curveToRelative(-0.054f, 0.05f, -0.109f, 0.099f, -0.16f, 0.152f)
                arcToRelative(2.278f, 2.278f, 0.0f, false, false, 0.0f, 3.17f)
                lineToRelative(7.799f, 7.997f)
                close()
                moveTo(21.545f, 6.758f)
                arcToRelative(2.957f, 2.957f, 0.0f, false, true, 1.573f, 0.873f)
                curveToRelative(1.176f, 1.24f, 1.176f, 3.25f, 0.0f, 4.49f)
                lineToRelative(-5.557f, 5.847f)
                arcToRelative(2.145f, 2.145f, 0.0f, false, true, -1.298f, 0.637f)
                lineTo(19.567f, 22.0f)
                lineToRelative(-17.11f, -3.758f)
                arcToRelative(2.998f, 2.998f, 0.0f, false, true, -1.572f, -0.878f)
                curveToRelative(-1.18f, -1.237f, -1.18f, -3.248f, 0.0f, -4.494f)
                lineToRelative(5.552f, -5.838f)
                arcToRelative(2.129f, 2.129f, 0.0f, false, true, 1.303f, -0.643f)
                lineTo(4.434f, 3.0f)
                lineToRelative(17.11f, 3.758f)
                close()
            }
        }
        .build()
        return _boost!!
    }

private var _boost: VectorAsset? = null
