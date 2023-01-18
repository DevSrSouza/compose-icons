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

public val RegularGroup.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) {
            return _folderSimpleUser!!
        }
        _folderSimpleUser = Builder(name = "FolderSimpleUser", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.4f, 194.8f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -44.8f, 0.0f)
                arcTo(40.2f, 40.2f, 0.0f, false, false, 149.3f, 218.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.7f, 9.7f)
                lineToRelative(2.0f, 0.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.8f, -6.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 46.4f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.8f, 5.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.7f, -9.7f)
                arcTo(40.2f, 40.2f, 0.0f, false, false, 210.4f, 194.8f)
                close()
                moveTo(172.0f, 172.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 172.0f, 172.0f)
                close()
                moveTo(232.0f, 88.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 88.0f)
                lineTo(130.7f, 88.0f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, -9.6f, -3.2f)
                lineTo(93.3f, 64.0f)
                lineTo(40.0f, 64.0f)
                lineTo(40.0f, 200.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 48.0f)
                lineTo(93.3f, 48.0f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, 9.6f, 3.2f)
                lineTo(130.7f, 72.0f)
                lineTo(216.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 88.0f)
                close()
            }
        }
        .build()
        return _folderSimpleUser!!
    }

private var _folderSimpleUser: ImageVector? = null
