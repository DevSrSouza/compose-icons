package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.FolderSimple: ImageVector
    get() {
        if (_folderSimple != null) {
            return _folderSimple!!
        }
        _folderSimple = Builder(name = "FolderSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 88.0f)
                verticalLineTo(200.9f)
                arcToRelative(7.1f, 7.1f, 0.0f, false, true, -7.1f, 7.1f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(93.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 4.8f, 1.6f)
                lineToRelative(27.8f, 20.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 4.8f, 1.6f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 72.0f)
                lineTo(130.7f, 72.0f)
                lineTo(102.9f, 51.2f)
                arcTo(15.6f, 15.6f, 0.0f, false, false, 93.3f, 48.0f)
                lineTo(40.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.9f, 216.0f)
                arcTo(15.2f, 15.2f, 0.0f, false, false, 232.0f, 200.9f)
                lineTo(232.0f, 88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 72.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 64.0f)
                lineTo(93.3f, 64.0f)
                lineToRelative(27.8f, 20.8f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, 9.6f, 3.2f)
                lineTo(216.0f, 88.0f)
                close()
            }
        }
        .build()
        return _folderSimple!!
    }

private var _folderSimple: ImageVector? = null
