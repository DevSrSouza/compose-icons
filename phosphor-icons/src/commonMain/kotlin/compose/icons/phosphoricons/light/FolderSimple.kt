package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.FolderSimple: ImageVector
    get() {
        if (_folderSimple != null) {
            return _folderSimple!!
        }
        _folderSimple = Builder(name = "FolderSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.9f, 214.0f)
                horizontalLineTo(40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                verticalLineTo(64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 50.0f)
                horizontalLineTo(93.3f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 8.4f, 2.8f)
                lineToRelative(27.8f, 20.8f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 1.2f, 0.4f)
                horizontalLineTo(216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineTo(200.9f)
                arcTo(13.1f, 13.1f, 0.0f, false, true, 216.9f, 214.0f)
                close()
                moveTo(40.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineTo(200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineTo(216.9f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 1.1f, -1.1f)
                verticalLineTo(88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(130.7f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, -8.4f, -2.8f)
                lineTo(94.5f, 62.4f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -1.2f, -0.4f)
                close()
            }
        }
        .build()
        return _folderSimple!!
    }

private var _folderSimple: ImageVector? = null
