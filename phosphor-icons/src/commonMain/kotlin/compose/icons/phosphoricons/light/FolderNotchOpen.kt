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

public val LightGroup.FolderNotchOpen: ImageVector
    get() {
        if (_folderNotchOpen != null) {
            return _folderNotchOpen!!
        }
        _folderNotchOpen = Builder(name = "FolderNotchOpen", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.3f, 111.8f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, -11.4f, -5.8f)
                lineTo(214.0f, 106.0f)
                lineTo(214.0f, 88.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(130.7f, 74.0f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -1.2f, -0.4f)
                lineTo(101.7f, 52.8f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 93.3f, 50.0f)
                lineTo(40.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 64.0f)
                lineTo(26.0f, 208.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 1.0f, 3.4f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.0f, 2.6f)
                lineTo(208.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.7f, -4.1f)
                lineToRelative(28.5f, -85.5f)
                arcTo(14.2f, 14.2f, 0.0f, false, false, 240.3f, 111.8f)
                close()
                moveTo(40.0f, 62.0f)
                lineTo(93.3f, 62.0f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.2f, 0.4f)
                lineToRelative(27.8f, 20.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 8.4f, 2.8f)
                lineTo(200.0f, 86.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                lineTo(146.4f, 106.0f)
                arcToRelative(13.2f, 13.2f, 0.0f, false, false, -7.7f, 2.4f)
                lineToRelative(-20.0f, 13.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.1f, 0.3f)
                lineTo(69.4f, 122.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -13.0f, 8.8f)
                lineTo(38.0f, 176.8f)
                lineTo(38.0f, 64.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 62.0f)
                close()
                moveTo(230.8f, 120.6f)
                lineTo(203.7f, 202.0f)
                lineTo(40.9f, 202.0f)
                lineToRelative(26.7f, -66.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.8f, -1.3f)
                horizontalLineToRelative(48.2f)
                arcToRelative(13.2f, 13.2f, 0.0f, false, false, 7.7f, -2.4f)
                lineToRelative(20.0f, -13.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.1f, -0.3f)
                horizontalLineToRelative(82.5f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.6f, 0.8f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 230.8f, 120.6f)
                close()
            }
        }
        .build()
        return _folderNotchOpen!!
    }

private var _folderNotchOpen: ImageVector? = null
