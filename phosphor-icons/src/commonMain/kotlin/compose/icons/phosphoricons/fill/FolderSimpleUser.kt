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

public val FillGroup.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) {
            return _folderSimpleUser!!
        }
        _folderSimpleUser = Builder(name = "FolderSimpleUser", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.7f, 218.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.7f, 10.0f)
                horizontalLineTo(157.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.7f, -10.0f)
                arcToRelative(40.2f, 40.2f, 0.0f, false, true, 16.3f, -23.2f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 44.8f, 0.0f)
                arcTo(40.2f, 40.2f, 0.0f, false, true, 226.7f, 218.0f)
                close()
                moveTo(216.0f, 72.0f)
                horizontalLineTo(130.7f)
                lineTo(102.9f, 51.2f)
                arcTo(15.6f, 15.6f, 0.0f, false, false, 93.3f, 48.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(93.3f)
                lineToRelative(27.8f, 20.8f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, 9.6f, 3.2f)
                horizontalLineTo(216.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 72.0f)
                close()
            }
        }
        .build()
        return _folderSimpleUser!!
    }

private var _folderSimpleUser: ImageVector? = null
