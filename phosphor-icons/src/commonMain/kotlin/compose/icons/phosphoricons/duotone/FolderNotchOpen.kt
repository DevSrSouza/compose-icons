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

public val DuotoneGroup.FolderNotchOpen: ImageVector
    get() {
        if (_folderNotchOpen != null) {
            return _folderNotchOpen!!
        }
        _folderNotchOpen = Builder(name = "FolderNotchOpen", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 88.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(146.4f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -4.4f, 1.3f)
                lineToRelative(-20.0f, 13.4f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -4.4f, 1.3f)
                horizontalLineTo(69.4f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -7.4f, 5.0f)
                lineTo(32.0f, 208.0f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(93.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 4.8f, 1.6f)
                lineToRelative(27.8f, 20.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 4.8f, 1.6f)
                horizontalLineTo(200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 88.0f)
                close()
            }
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
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 1.4f, 4.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 32.0f, 216.0f)
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
                horizontalLineTo(146.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -8.9f, 2.7f)
                lineTo(117.6f, 120.0f)
                horizontalLineTo(69.4f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, -14.8f, 10.1f)
                lineTo(40.0f, 166.5f)
                verticalLineTo(64.0f)
                close()
                moveTo(202.2f, 200.0f)
                horizontalLineTo(43.8f)
                lineToRelative(25.6f, -64.0f)
                horizontalLineToRelative(48.2f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.9f, -2.7f)
                lineTo(146.4f, 120.0f)
                horizontalLineToRelative(82.5f)
                close()
            }
        }
        .build()
        return _folderNotchOpen!!
    }

private var _folderNotchOpen: ImageVector? = null
