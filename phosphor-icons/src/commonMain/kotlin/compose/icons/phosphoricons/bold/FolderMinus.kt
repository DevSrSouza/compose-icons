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

public val BoldGroup.FolderMinus: ImageVector
    get() {
        if (_folderMinus != null) {
            return _folderMinus!!
        }
        _folderMinus = Builder(name = "FolderMinus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 68.0f)
                horizontalLineTo(133.4f)
                lineToRelative(-26.0f, -29.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -15.0f, -6.7f)
                horizontalLineTo(40.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 52.0f)
                verticalLineTo(200.6f)
                arcTo(19.4f, 19.4f, 0.0f, false, false, 39.4f, 220.0f)
                horizontalLineTo(216.9f)
                arcTo(19.2f, 19.2f, 0.0f, false, false, 236.0f, 200.9f)
                verticalLineTo(88.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 68.0f)
                close()
                moveTo(90.6f, 56.0f)
                lineToRelative(10.7f, 12.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(56.0f)
                close()
                moveTo(212.0f, 196.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(92.0f)
                horizontalLineTo(212.0f)
                close()
                moveTo(104.0f, 132.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _folderMinus!!
    }

private var _folderMinus: ImageVector? = null
