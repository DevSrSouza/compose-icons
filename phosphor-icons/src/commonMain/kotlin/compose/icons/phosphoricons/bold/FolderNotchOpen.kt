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

public val BoldGroup.FolderNotchOpen: ImageVector
    get() {
        if (_folderNotchOpen != null) {
            return _folderNotchOpen!!
        }
        _folderNotchOpen = Builder(name = "FolderNotchOpen", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.0f, 112.4f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -16.3f, -8.4f)
                horizontalLineTo(220.0f)
                verticalLineTo(88.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(132.0f)
                lineTo(105.3f, 48.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -12.0f, -4.0f)
                horizontalLineTo(40.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 64.0f)
                verticalLineTo(208.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 2.0f, 6.6f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 32.0f, 220.0f)
                horizontalLineTo(208.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 11.3f, -8.1f)
                lineToRelative(28.3f, -81.3f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 245.0f, 112.4f)
                close()
                moveTo(92.0f, 68.0f)
                lineToRelative(26.7f, 20.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 12.0f, 4.0f)
                horizontalLineTo(196.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(146.4f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -11.1f, 3.4f)
                lineTo(116.4f, 120.0f)
                horizontalLineTo(69.3f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -18.4f, 12.2f)
                lineTo(44.0f, 148.6f)
                verticalLineTo(68.0f)
                close()
                moveTo(199.5f, 196.0f)
                horizontalLineTo(50.1f)
                lineTo(72.0f, 144.0f)
                horizontalLineToRelative(45.6f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 11.1f, -3.4f)
                lineTo(147.6f, 128.0f)
                horizontalLineToRelative(75.5f)
                close()
            }
        }
        .build()
        return _folderNotchOpen!!
    }

private var _folderNotchOpen: ImageVector? = null
