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

public val DuotoneGroup.FolderUser: ImageVector
    get() {
        if (_folderUser != null) {
            return _folderUser!!
        }
        _folderUser = Builder(name = "FolderUser", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(212.0f, 172.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 212.0f, 172.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.4f, 194.8f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -44.8f, 0.0f)
                arcTo(40.2f, 40.2f, 0.0f, false, false, 149.3f, 218.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.7f, 9.7f)
                lineToRelative(2.0f, 0.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.8f, -6.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 46.4f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.8f, 5.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.7f, -9.7f)
                arcTo(40.2f, 40.2f, 0.0f, false, false, 210.4f, 194.8f)
                close()
                moveTo(172.0f, 172.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 172.0f, 172.0f)
                close()
                moveTo(216.0f, 72.0f)
                horizontalLineTo(131.3f)
                lineTo(104.0f, 44.7f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 92.7f, 40.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                verticalLineTo(200.6f)
                arcTo(15.4f, 15.4f, 0.0f, false, false, 39.4f, 216.0f)
                horizontalLineToRelative(81.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(88.0f)
                horizontalLineTo(216.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 72.0f)
                close()
                moveTo(92.7f, 56.0f)
                lineToRelative(16.0f, 16.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(56.0f)
                close()
            }
        }
        .build()
        return _folderUser!!
    }

private var _folderUser: ImageVector? = null
