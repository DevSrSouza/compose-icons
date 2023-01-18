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

public val ThinGroup.FolderDotted: ImageVector
    get() {
        if (_folderDotted != null) {
            return _folderDotted!!
        }
        _folderDotted = Builder(name = "FolderDotted", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(39.4f, 212.0f)
                arcTo(11.4f, 11.4f, 0.0f, false, true, 28.0f, 200.6f)
                lineTo(28.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(8.6f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 3.4f, 3.4f)
                lineTo(88.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.0f, 208.0f)
                close()
                moveTo(160.0f, 204.0f)
                lineTo(128.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(224.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(48.9f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, -3.1f, 3.1f)
                lineTo(200.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(16.9f)
                arcTo(11.1f, 11.1f, 0.0f, false, false, 228.0f, 200.9f)
                lineTo(228.0f, 152.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 148.0f)
                close()
                moveTo(216.0f, 76.0f)
                lineTo(168.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(228.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 76.0f)
                close()
                moveTo(28.0f, 80.0f)
                lineTo(28.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 44.0f)
                lineTo(92.7f, 44.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 8.5f, 3.5f)
                lineToRelative(29.6f, 29.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.9f, 4.3f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 128.0f, 84.0f)
                lineTo(32.0f, 84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 80.0f)
                close()
                moveTo(36.0f, 76.0f)
                horizontalLineToRelative(82.3f)
                lineTo(95.5f, 53.2f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 92.7f, 52.0f)
                lineTo(40.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                close()
                moveTo(32.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(36.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 156.0f)
                close()
            }
        }
        .build()
        return _folderDotted!!
    }

private var _folderDotted: ImageVector? = null
