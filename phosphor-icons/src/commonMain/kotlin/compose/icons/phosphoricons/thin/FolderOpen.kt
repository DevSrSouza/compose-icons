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

public val ThinGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.6f, 113.0f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -9.7f, -5.0f)
                lineTo(212.0f, 108.0f)
                lineTo(212.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(130.7f, 76.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.4f, -0.8f)
                lineTo(100.5f, 54.4f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 93.3f, 52.0f)
                lineTo(40.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 64.0f)
                lineTo(28.0f, 208.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.8f, 2.3f)
                arcTo(3.7f, 3.7f, 0.0f, false, false, 32.0f, 212.0f)
                lineTo(208.0f, 212.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.8f, -2.7f)
                lineToRelative(28.5f, -85.5f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 238.6f, 113.0f)
                close()
                moveTo(40.0f, 60.0f)
                lineTo(93.3f, 60.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 2.4f, 0.8f)
                lineToRelative(27.8f, 20.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 7.2f, 2.4f)
                lineTo(200.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                lineTo(69.8f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.4f, 8.2f)
                lineTo(36.0f, 183.4f)
                lineTo(36.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 60.0f)
                close()
                moveTo(232.7f, 121.3f)
                lineTo(205.1f, 204.0f)
                lineTo(37.5f, 204.0f)
                lineTo(66.0f, 118.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.8f, -2.7f)
                lineTo(228.9f, 116.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 3.2f, 1.7f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 232.7f, 121.3f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
