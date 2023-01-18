package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.7f, 178.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineTo(212.7f, 192.0f)
                lineTo(200.9f, 192.0f)
                arcToRelative(72.2f, 72.2f, 0.0f, false, true, -58.6f, -30.2f)
                lineToRelative(-41.7f, -58.3f)
                arcTo(56.1f, 56.1f, 0.0f, false, false, 55.1f, 80.0f)
                lineTo(32.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(55.1f, 64.0f)
                arcToRelative(72.2f, 72.2f, 0.0f, false, true, 58.6f, 30.2f)
                lineToRelative(41.7f, 58.3f)
                arcTo(56.1f, 56.1f, 0.0f, false, false, 200.9f, 176.0f)
                horizontalLineToRelative(11.8f)
                lineToRelative(-10.4f, -10.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                close()
                moveTo(143.0f, 107.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.2f, -1.9f)
                lineToRelative(1.2f, -1.6f)
                arcTo(56.1f, 56.1f, 0.0f, false, true, 200.9f, 80.0f)
                horizontalLineToRelative(11.8f)
                lineTo(202.3f, 90.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 11.4f)
                lineTo(212.7f, 64.0f)
                lineTo(200.9f, 64.0f)
                arcToRelative(72.2f, 72.2f, 0.0f, false, false, -58.6f, 30.2f)
                lineToRelative(-1.1f, 1.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 143.0f, 107.0f)
                close()
                moveTo(113.0f, 149.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.2f, 1.9f)
                lineToRelative(-1.2f, 1.6f)
                arcTo(56.1f, 56.1f, 0.0f, false, true, 55.1f, 176.0f)
                lineTo(32.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(55.1f, 192.0f)
                arcToRelative(72.2f, 72.2f, 0.0f, false, false, 58.6f, -30.2f)
                lineToRelative(1.1f, -1.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 113.0f, 149.0f)
                close()
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
