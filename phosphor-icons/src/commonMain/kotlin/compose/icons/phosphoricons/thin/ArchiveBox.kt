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

public val ThinGroup.ArchiveBox: ImageVector
    get() {
        if (_archiveBox != null) {
            return _archiveBox!!
        }
        _archiveBox = Builder(name = "ArchiveBox", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.6f, 70.2f)
                lineToRelative(-16.0f, -32.0f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 200.0f, 36.0f)
                lineTo(56.0f, 36.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -3.6f, 2.2f)
                lineToRelative(-16.0f, 32.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 36.0f, 72.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 72.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 219.6f, 70.2f)
                close()
                moveTo(58.5f, 44.0f)
                horizontalLineToRelative(139.0f)
                lineToRelative(12.0f, 24.0f)
                lineTo(46.5f, 68.0f)
                close()
                moveTo(208.0f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 76.0f)
                lineTo(212.0f, 76.0f)
                lineTo(212.0f, 208.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 212.0f)
                close()
                moveTo(164.8f, 147.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.0f, 5.7f)
                lineToRelative(-34.0f, 33.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineToRelative(-34.0f, -33.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.7f, -5.7f)
                lineTo(124.0f, 174.3f)
                lineTo(124.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(70.3f)
                lineToRelative(27.1f, -27.1f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 164.8f, 147.2f)
                close()
            }
        }
        .build()
        return _archiveBox!!
    }

private var _archiveBox: ImageVector? = null
