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

public val LightGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 1.1f, 3.5f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 32.0f, 214.0f)
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
                lineTo(69.8f, 106.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -13.3f, 9.6f)
                lineTo(38.0f, 171.0f)
                lineTo(38.0f, 64.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 62.0f)
                close()
                moveTo(230.8f, 120.6f)
                lineTo(203.7f, 202.0f)
                lineTo(40.3f, 202.0f)
                lineToRelative(27.6f, -82.6f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.9f, -1.4f)
                lineTo(228.9f, 118.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.6f, 0.8f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 230.8f, 120.6f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
