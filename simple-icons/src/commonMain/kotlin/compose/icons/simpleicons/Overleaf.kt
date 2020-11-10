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

public val SimpleIcons.Overleaf: VectorAsset
    get() {
        if (_overleaf != null) {
            return _overleaf!!
        }
        _overleaf = VectorAssetBuilder(name = "Overleaf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.362f, 6.029f)
                arcToRelative(11.685f, 11.685f, 0.0f, false, false, -5.694f, 9.606f)
                arcToRelative(8.368f, 8.368f, 0.0f, true, false, 11.355f, -7.823f)
                arcToRelative(7.724f, 7.724f, 0.0f, false, false, -2.97f, -0.562f)
                arcToRelative(12.346f, 12.346f, 0.0f, false, false, -4.21f, 4.87f)
                arcToRelative(5.496f, 5.496f, 0.0f, true, true, 4.193f, 9.027f)
                arcToRelative(5.496f, 5.496f, 0.0f, false, true, -4.192f, -1.93f)
                arcToRelative(6.602f, 6.602f, 0.0f, false, true, -1.585f, -5.563f)
                curveToRelative(1.073f, -6.42f, 8.764f, -10.117f, 14.458f, -11.553f)
                arcToRelative(59.17f, 59.17f, 0.0f, false, false, -7.592f, 4.374f)
                curveToRelative(6.883f, 2.657f, 7.989f, -3.136f, 11.207f, -5.728f)
                curveTo(19.13f, -0.507f, 7.379f, -0.969f, 7.362f, 6.03f)
                close()
            }
        }
        .build()
        return _overleaf!!
    }

private var _overleaf: VectorAsset? = null
