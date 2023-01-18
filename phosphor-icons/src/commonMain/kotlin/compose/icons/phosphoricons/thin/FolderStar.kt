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

public val ThinGroup.FolderStar: ImageVector
    get() {
        if (_folderStar != null) {
            return _folderStar!!
        }
        _folderStar = Builder(name = "FolderStar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.6f, 204.0f)
                lineTo(39.4f, 204.0f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, -3.4f, -3.4f)
                lineTo(36.0f, 84.0f)
                lineTo(216.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(228.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(129.7f, 76.0f)
                lineTo(101.2f, 47.5f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 92.7f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 200.6f)
                arcTo(11.4f, 11.4f, 0.0f, false, false, 39.4f, 212.0f)
                horizontalLineToRelative(81.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                close()
                moveTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(92.7f, 52.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 2.8f, 1.2f)
                lineTo(118.3f, 76.0f)
                lineTo(36.0f, 76.0f)
                close()
                moveTo(239.8f, 160.4f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -3.5f, -2.8f)
                lineToRelative(-32.2f, -2.5f)
                lineToRelative(-12.4f, -28.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -7.4f, 0.0f)
                lineToRelative(-12.4f, 28.7f)
                lineToRelative(-32.2f, 2.5f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -3.5f, 2.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.3f, 4.3f)
                lineToRelative(24.4f, 20.2f)
                lineTo(154.5f, 215.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.4f, 4.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 4.5f, 0.2f)
                lineTo(188.0f, 203.2f)
                lineToRelative(27.6f, 16.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.1f, 0.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.4f, -0.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.4f, -4.2f)
                lineToRelative(-7.4f, -30.1f)
                lineToRelative(24.4f, -20.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 239.8f, 160.4f)
                close()
                moveTo(207.1f, 180.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.4f, 4.1f)
                lineToRelative(5.8f, 23.3f)
                lineTo(190.0f, 195.1f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -4.0f, 0.0f)
                lineToRelative(-21.5f, 12.6f)
                lineToRelative(5.8f, -23.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.4f, -4.1f)
                lineToRelative(-18.7f, -15.5f)
                lineToRelative(24.8f, -1.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.3f, -2.4f)
                lineToRelative(9.7f, -22.4f)
                lineToRelative(9.7f, 22.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.3f, 2.4f)
                lineToRelative(24.8f, 1.9f)
                close()
            }
        }
        .build()
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
