package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Spiral: ImageVector
    get() {
        if (_spiral != null) {
            return _spiral!!
        }
        _spiral = Builder(name = "Spiral", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.0f, 138.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(94.1f, 94.1f, 0.0f, false, false, -94.0f, -94.0f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, false, -84.0f, 84.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, false, 74.0f, 74.0f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, false, 64.0f, -64.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -54.0f, -54.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -44.0f, 44.0f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, false, 34.0f, 34.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, -24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -2.8f, 1.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 124.0f, 148.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 28.0f, -28.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 38.0f, 38.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, 48.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, -58.0f, -58.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, true, 68.0f, -68.0f)
                arcToRelative(78.1f, 78.1f, 0.0f, false, true, 78.0f, 78.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, -88.0f, 88.0f)
                arcToRelative(98.2f, 98.2f, 0.0f, false, true, -98.0f, -98.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, true, 132.0f, 20.0f)
                arcTo(118.1f, 118.1f, 0.0f, false, true, 250.0f, 138.0f)
                close()
            }
        }
        .build()
        return _spiral!!
    }

private var _spiral: ImageVector? = null
