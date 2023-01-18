package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.FolderStar: ImageVector
    get() {
        if (_folderStar != null) {
            return _folderStar!!
        }
        _folderStar = Builder(name = "FolderStar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.6f, 200.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(88.0f)
                horizontalLineTo(216.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(131.3f)
                lineTo(104.0f, 44.7f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 92.7f, 40.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                verticalLineTo(200.6f)
                arcTo(15.4f, 15.4f, 0.0f, false, false, 39.4f, 216.0f)
                horizontalLineToRelative(81.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                close()
                moveTo(40.0f, 56.0f)
                horizontalLineTo(92.7f)
                lineToRelative(16.0f, 16.0f)
                horizontalLineTo(40.0f)
                close()
                moveTo(241.1f, 167.8f)
                lineToRelative(-22.5f, 18.6f)
                lineToRelative(6.8f, 27.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.0f, 8.3f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, true, -4.7f, 1.6f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, -4.1f, -1.1f)
                lineTo(188.0f, 207.8f)
                lineToRelative(-25.6f, 15.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.8f, -0.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.0f, -8.3f)
                lineToRelative(6.8f, -27.7f)
                lineToRelative(-22.5f, -18.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 4.5f, -14.2f)
                lineToRelative(29.8f, -2.3f)
                lineToRelative(11.5f, -26.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.6f, 0.0f)
                lineToRelative(11.5f, 26.5f)
                lineToRelative(29.8f, 2.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 4.5f, 14.2f)
                close()
            }
        }
        .build()
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
