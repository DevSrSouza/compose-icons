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

public val ThinGroup.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) {
            return _linkBreak!!
        }
        _linkBreak = Builder(name = "LinkBreak", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 72.0f)
                lineTo(92.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(100.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(160.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(164.0f, 184.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 180.0f)
                close()
                moveTo(48.0f, 100.0f)
                lineTo(72.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(48.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(208.0f, 156.0f)
                lineTo(184.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(124.8f, 182.1f)
                lineTo(113.5f, 193.5f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, true, -51.0f, -51.0f)
                lineToRelative(11.4f, -11.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.7f, 0.0f)
                lineTo(56.9f, 136.9f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 62.2f, 62.2f)
                lineToRelative(11.3f, -11.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 124.8f, 182.1f)
                close()
                moveTo(193.5f, 113.5f)
                lineTo(182.1f, 124.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.9f, 1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, -1.2f)
                lineToRelative(11.3f, -11.3f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -62.2f, -62.2f)
                lineTo(125.6f, 68.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.6f, 0.0f)
                lineToRelative(11.3f, -11.4f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, true, 51.0f, 51.0f)
                close()
            }
        }
        .build()
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
