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

public val BoldGroup.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) {
            return _folderSimpleUser!!
        }
        _folderSimpleUser = Builder(name = "FolderSimpleUser", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.3f, 194.3f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -56.6f, 0.0f)
                arcTo(43.7f, 43.7f, 0.0f, false, false, 145.4f, 217.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.6f, 14.6f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, false, 3.0f, 0.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.6f, -9.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 38.8f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 23.2f, -6.0f)
                arcTo(43.7f, 43.7f, 0.0f, false, false, 216.3f, 194.3f)
                close()
                moveTo(176.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 172.0f)
                close()
                moveTo(236.0f, 88.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(212.0f, 92.0f)
                lineTo(130.7f, 92.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -12.0f, -4.0f)
                lineTo(92.0f, 68.0f)
                lineTo(44.0f, 68.0f)
                lineTo(44.0f, 196.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(40.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 40.0f, 44.0f)
                lineTo(93.3f, 44.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 12.0f, 4.0f)
                lineTo(132.0f, 68.0f)
                horizontalLineToRelative(84.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 236.0f, 88.0f)
                close()
            }
        }
        .build()
        return _folderSimpleUser!!
    }

private var _folderSimpleUser: ImageVector? = null
