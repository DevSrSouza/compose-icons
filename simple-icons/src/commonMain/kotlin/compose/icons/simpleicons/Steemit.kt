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

public val SimpleIcons.Steemit: VectorAsset
    get() {
        if (_steemit != null) {
            return _steemit!!
        }
        _steemit = VectorAssetBuilder(name = "Steemit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.982f, 7.246f)
                arcToRelative(9.659f, 9.659f, 0.0f, false, false, -3.4f, -2.202f)
                curveToRelative(0.721f, -2.12f, 3.277f, -2.892f, 3.277f, -2.892f)
                arcTo(21.632f, 21.632f, 0.0f, false, false, 8.31f, 0.29f)
                arcToRelative(10.14f, 10.14f, 0.0f, false, false, -5.842f, 3.478f)
                arcToRelative(9.152f, 9.152f, 0.0f, false, false, 0.991f, 12.984f)
                curveToRelative(0.598f, 0.512f, 1.934f, 1.308f, 1.958f, 1.349f)
                curveToRelative(-0.876f, 2.226f, -3.678f, 2.835f, -3.678f, 2.835f)
                arcToRelative(23.335f, 23.335f, 0.0f, false, false, 8.676f, 2.917f)
                arcToRelative(18.256f, 18.256f, 0.0f, false, false, 4.17f, 0.05f)
                arcToRelative(10.598f, 10.598f, 0.0f, false, false, 6.34f, -3.12f)
                arcToRelative(9.525f, 9.525f, 0.0f, false, false, 0.058f, -13.538f)
                close()
                moveTo(19.278f, 19.304f)
                arcToRelative(8.886f, 8.886f, 0.0f, false, true, -5.137f, 2.381f)
                arcToRelative(16.265f, 16.265f, 0.0f, false, true, -3.555f, -0.016f)
                arcToRelative(16.9f, 16.9f, 0.0f, false, true, -4.22f, -1.154f)
                arcToRelative(6.277f, 6.277f, 0.0f, false, false, 1.5f, -2.145f)
                arcToRelative(1.652f, 1.652f, 0.0f, false, false, -0.05f, -1.308f)
                arcToRelative(6.995f, 6.995f, 0.0f, false, true, 1.426f, -8.077f)
                arcToRelative(7.26f, 7.26f, 0.0f, false, true, 10.159f, 0.057f)
                arcToRelative(7.324f, 7.324f, 0.0f, false, true, -0.123f, 10.262f)
                close()
            }
        }
        .build()
        return _steemit!!
    }

private var _steemit: VectorAsset? = null
