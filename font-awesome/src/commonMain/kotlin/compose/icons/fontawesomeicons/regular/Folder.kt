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

public val RegularGroup.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(447.1f, 96.0f)
                horizontalLineToRelative(-172.1f)
                lineTo(226.7f, 50.75f)
                curveTo(214.7f, 38.74f, 198.5f, 32.0f, 181.5f, 32.0f)
                horizontalLineTo(63.1f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.66f, -64.0f, 64.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 35.34f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.66f, 64.0f, -64.0f)
                verticalLineTo(160.0f)
                curveTo(511.1f, 124.7f, 483.3f, 96.0f, 447.1f, 96.0f)
                close()
                moveTo(463.1f, 416.0f)
                curveToRelative(0.0f, 8.824f, -7.178f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-384.0f)
                curveToRelative(-8.822f, 0.0f, -16.0f, -7.176f, -16.0f, -16.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -8.824f, 7.178f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(117.5f)
                curveToRelative(4.273f, 0.0f, 8.293f, 1.664f, 11.31f, 4.688f)
                lineTo(255.1f, 144.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(8.822f, 0.0f, 16.0f, 7.176f, 16.0f, 16.0f)
                verticalLineTo(416.0f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
