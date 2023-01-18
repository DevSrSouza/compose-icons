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

public val ThinGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(143.3f, 137.6f)
                lineTo(205.0f, 115.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.1f, -22.6f)
                lineTo(49.9f, 34.4f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 34.4f, 49.9f)
                lineTo(92.7f, 205.1f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 11.2f, 7.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.3f, -7.9f)
                lineToRelative(22.4f, -61.7f)
                lineToRelative(67.6f, 67.5f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 208.0f, 212.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                close()
                moveTo(107.6f, 202.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -3.7f, 2.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.8f, -2.6f)
                lineTo(41.9f, 47.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.9f, -4.3f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 2.8f, -1.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 1.5f, 0.2f)
                lineToRelative(155.2f, 58.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.6f, 3.8f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.6f, 3.7f)
                lineTo(138.1f, 131.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -7.1f, 7.1f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
