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

public val RegularGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 480.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(11.4f, 0.0f, 21.9f, -6.0f, 27.6f, -15.9f)
                lineToRelative(112.0f, -192.0f)
                curveToRelative(5.8f, -9.9f, 5.8f, -22.1f, 0.1f, -32.1f)
                reflectiveCurveTo(555.5f, 224.0f, 544.0f, 224.0f)
                horizontalLineTo(144.0f)
                curveToRelative(-11.4f, 0.0f, -21.9f, 6.0f, -27.6f, 15.9f)
                lineTo(48.0f, 357.1f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineTo(181.5f)
                curveToRelative(4.2f, 0.0f, 8.3f, 1.7f, 11.3f, 4.7f)
                lineToRelative(26.5f, 26.5f)
                curveToRelative(21.0f, 21.0f, 49.5f, 32.8f, 79.2f, 32.8f)
                horizontalLineTo(416.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(160.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(298.5f)
                curveToRelative(-17.0f, 0.0f, -33.3f, -6.7f, -45.3f, -18.7f)
                lineTo(226.7f, 50.7f)
                curveToRelative(-12.0f, -12.0f, -28.3f, -18.7f, -45.3f, -18.7f)
                horizontalLineTo(64.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(87.7f)
                horizontalLineTo(384.0f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
