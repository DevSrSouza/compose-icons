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

public val SimpleIcons.Postwoman: VectorAsset
    get() {
        if (_postwoman != null) {
            return _postwoman!!
        }
        _postwoman = VectorAssetBuilder(name = "Postwoman", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.534f, 9.287f)
                curveTo(2.534f, 15.46f, 7.56f, 24.0f, 12.0f, 24.0f)
                curveToRelative(4.18f, 0.0f, 9.466f, -8.539f, 9.466f, -14.713f)
                curveTo(21.467f, 3.113f, 17.228f, 0.0f, 12.0f, 0.0f)
                curveTo(6.772f, 0.0f, 2.534f, 3.113f, 2.534f, 9.287f)
                close()
                moveTo(14.46f, 13.852f)
                arcToRelative(4.649f, 4.649f, 0.0f, false, true, 4.257f, -1.261f)
                arcToRelative(4.649f, 4.649f, 0.0f, false, true, -1.262f, 4.256f)
                arcToRelative(4.649f, 4.649f, 0.0f, false, true, -4.257f, 1.262f)
                arcToRelative(4.649f, 4.649f, 0.0f, false, true, 1.262f, -4.257f)
                close()
                moveTo(5.283f, 12.591f)
                arcToRelative(4.649f, 4.649f, 0.0f, false, true, 4.258f, 1.261f)
                arcToRelative(4.649f, 4.649f, 0.0f, false, true, 1.261f, 4.257f)
                arcToRelative(4.649f, 4.649f, 0.0f, false, true, -4.257f, -1.262f)
                arcToRelative(4.649f, 4.649f, 0.0f, false, true, -1.262f, -4.256f)
                close()
            }
        }
        .build()
        return _postwoman!!
    }

private var _postwoman: VectorAsset? = null
