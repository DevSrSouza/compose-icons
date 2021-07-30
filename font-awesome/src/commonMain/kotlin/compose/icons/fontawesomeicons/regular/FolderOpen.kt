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
                moveTo(527.9f, 224.0f)
                lineTo(480.0f, 224.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(272.0f, 128.0f)
                lineToRelative(-64.0f, -64.0f)
                lineTo(48.0f, 64.0f)
                curveTo(21.5f, 64.0f, 0.0f, 85.5f, 0.0f, 112.0f)
                verticalLineToRelative(288.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(400.0f)
                curveToRelative(16.5f, 0.0f, 31.9f, -8.5f, 40.7f, -22.6f)
                lineToRelative(79.9f, -128.0f)
                curveToRelative(20.0f, -31.9f, -3.0f, -73.4f, -40.7f, -73.4f)
                close()
                moveTo(48.0f, 118.0f)
                curveToRelative(0.0f, -3.3f, 2.7f, -6.0f, 6.0f, -6.0f)
                horizontalLineToRelative(134.1f)
                lineToRelative(64.0f, 64.0f)
                lineTo(426.0f, 176.0f)
                curveToRelative(3.3f, 0.0f, 6.0f, 2.7f, 6.0f, 6.0f)
                verticalLineToRelative(42.0f)
                lineTo(152.0f, 224.0f)
                curveToRelative(-16.8f, 0.0f, -32.4f, 8.8f, -41.1f, 23.2f)
                lineTo(48.0f, 351.4f)
                close()
                moveTo(448.0f, 400.0f)
                lineTo(72.0f, 400.0f)
                lineToRelative(77.2f, -128.0f)
                lineTo(528.0f, 272.0f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
