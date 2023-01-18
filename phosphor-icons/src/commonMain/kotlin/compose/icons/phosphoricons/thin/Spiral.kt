package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Spiral: ImageVector
    get() {
        if (_spiral != null) {
            return _spiral!!
        }
        _spiral = Builder(name = "Spiral", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 136.0f, 44.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, -92.0f, 92.0f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, false, 84.0f, 84.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, false, 76.0f, -76.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, -68.0f, -68.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -60.0f, 60.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 52.0f, 52.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, -44.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, 28.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, -28.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 44.0f, 44.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, 52.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -60.0f, -60.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, true, 68.0f, -68.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, true, 76.0f, 76.0f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, true, -84.0f, 84.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, true, -92.0f, -92.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, true, 136.0f, 36.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, true, 244.0f, 144.0f)
                close()
            }
        }
        .build()
        return _spiral!!
    }

private var _spiral: ImageVector? = null
