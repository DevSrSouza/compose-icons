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

public val FillGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.9f, 110.6f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -13.0f, -6.6f)
                horizontalLineTo(216.0f)
                verticalLineTo(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(130.7f)
                lineTo(102.9f, 51.2f)
                arcTo(15.6f, 15.6f, 0.0f, false, false, 93.3f, 48.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineTo(208.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.6f, -5.5f)
                lineToRelative(28.5f, -85.4f)
                arcTo(16.3f, 16.3f, 0.0f, false, false, 241.9f, 110.6f)
                close()
                moveTo(93.3f, 64.0f)
                lineToRelative(27.8f, 20.8f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, 9.6f, 3.2f)
                horizontalLineTo(200.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(69.8f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.2f, 10.9f)
                lineTo(40.0f, 158.7f)
                verticalLineTo(64.0f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
