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

public val ThinGroup.FolderUser: ImageVector
    get() {
        if (_folderUser != null) {
            return _folderUser!!
        }
        _folderUser = Builder(name = "FolderUser", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(203.3f, 195.4f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -30.6f, 0.0f)
                arcTo(36.4f, 36.4f, 0.0f, false, false, 153.1f, 219.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.9f, 4.9f)
                horizontalLineToRelative(1.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.9f, -3.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 54.2f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.8f, -2.0f)
                arcTo(36.4f, 36.4f, 0.0f, false, false, 203.3f, 195.4f)
                close()
                moveTo(168.0f, 172.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 168.0f, 172.0f)
                close()
                moveTo(216.0f, 76.0f)
                lineTo(129.7f, 76.0f)
                lineTo(101.2f, 47.5f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 92.7f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 200.6f)
                arcTo(11.4f, 11.4f, 0.0f, false, false, 39.4f, 212.0f)
                horizontalLineToRelative(81.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                lineTo(39.4f, 204.0f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, -3.4f, -3.4f)
                lineTo(36.0f, 84.0f)
                lineTo(216.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(228.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 76.0f)
                close()
                moveTo(40.0f, 52.0f)
                lineTo(92.7f, 52.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 2.8f, 1.2f)
                lineTo(118.3f, 76.0f)
                lineTo(36.0f, 76.0f)
                lineTo(36.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 52.0f)
                close()
            }
        }
        .build()
        return _folderUser!!
    }

private var _folderUser: ImageVector? = null
