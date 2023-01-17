package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.FolderClosed: ImageVector
    get() {
        if (_folderClosed != null) {
            return _folderClosed!!
        }
        _folderClosed = Builder(name = "FolderClosed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 96.0f)
                horizontalLineToRelative(-172.1f)
                lineTo(226.7f, 50.75f)
                curveTo(214.7f, 38.74f, 198.5f, 32.0f, 181.5f, 32.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 32.0f, 0.0f, 60.66f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 35.34f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.66f, 64.0f, -64.0f)
                verticalLineTo(160.0f)
                curveTo(512.0f, 124.7f, 483.3f, 96.0f, 448.0f, 96.0f)
                close()
                moveTo(64.0f, 80.0f)
                horizontalLineToRelative(117.5f)
                curveToRelative(4.273f, 0.0f, 8.293f, 1.664f, 11.31f, 4.688f)
                lineTo(256.0f, 144.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(8.822f, 0.0f, 16.0f, 7.176f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-416.0f)
                verticalLineTo(96.0f)
                curveTo(48.0f, 87.18f, 55.18f, 80.0f, 64.0f, 80.0f)
                close()
                moveTo(448.0f, 432.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-8.822f, 0.0f, -16.0f, -7.176f, -16.0f, -16.0f)
                verticalLineTo(240.0f)
                horizontalLineToRelative(416.0f)
                verticalLineTo(416.0f)
                curveTo(464.0f, 424.8f, 456.8f, 432.0f, 448.0f, 432.0f)
                close()
            }
        }
        .build()
        return _folderClosed!!
    }

private var _folderClosed: ImageVector? = null
