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

public val BoldGroup.FolderUser: ImageVector
    get() {
        if (_folderUser != null) {
            return _folderUser!!
        }
        _folderUser = Builder(name = "FolderUser", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(216.0f, 68.0f)
                horizontalLineTo(133.4f)
                lineToRelative(-26.0f, -29.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -15.0f, -6.7f)
                horizontalLineTo(40.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 52.0f)
                verticalLineTo(200.6f)
                arcTo(19.4f, 19.4f, 0.0f, false, false, 39.4f, 220.0f)
                horizontalLineToRelative(73.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, -24.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(92.0f)
                horizontalLineTo(212.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(88.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 68.0f)
                close()
                moveTo(44.0f, 68.0f)
                verticalLineTo(56.0f)
                horizontalLineTo(90.6f)
                lineToRelative(10.7f, 12.0f)
                close()
            }
        }
        .build()
        return _folderUser!!
    }

private var _folderUser: ImageVector? = null
