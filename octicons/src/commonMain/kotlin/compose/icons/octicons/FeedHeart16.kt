package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.FeedHeart16: ImageVector
    get() {
        if (_feedHeart16 != null) {
            return _feedHeart16!!
        }
        _feedHeart16 = Builder(name = "FeedHeart16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(10.33f, 4.5f)
                curveToRelative(-1.22f, 0.0f, -1.83f, 0.5f, -2.323f, 1.136f)
                curveTo(7.513f, 5.0f, 6.903f, 4.5f, 5.682f, 4.5f)
                curveToRelative(-1.028f, 0.0f, -2.169f, 0.784f, -2.169f, 2.5f)
                curveToRelative(0.0f, 1.499f, 1.493f, 3.433f, 3.246f, 4.517f)
                curveToRelative(0.52f, 0.321f, 0.89f, 0.479f, 1.248f, 0.484f)
                curveToRelative(0.357f, -0.005f, 0.728f, -0.163f, 1.247f, -0.484f)
                curveTo(11.007f, 10.433f, 12.5f, 8.5f, 12.5f, 7.0f)
                curveToRelative(0.0f, -1.716f, -1.14f, -2.5f, -2.17f, -2.5f)
                close()
            }
        }
        .build()
        return _feedHeart16!!
    }

private var _feedHeart16: ImageVector? = null
