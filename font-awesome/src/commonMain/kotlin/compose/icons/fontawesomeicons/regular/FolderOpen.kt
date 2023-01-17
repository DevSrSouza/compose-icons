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
                moveTo(572.6f, 270.3f)
                lineToRelative(-96.0f, 192.0f)
                curveTo(471.2f, 473.2f, 460.1f, 480.0f, 447.1f, 480.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, -28.66f, -64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -35.34f, 28.65f, -64.0f, 64.0f, -64.0f)
                horizontalLineToRelative(117.5f)
                curveToRelative(16.97f, 0.0f, 33.25f, 6.742f, 45.26f, 18.75f)
                lineTo(275.9f, 96.0f)
                horizontalLineTo(416.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, 28.66f, 64.0f, 64.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineTo(160.0f)
                curveToRelative(0.0f, -8.824f, -7.178f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(256.0f)
                lineTo(192.8f, 84.69f)
                curveTo(189.8f, 81.66f, 185.8f, 80.0f, 181.5f, 80.0f)
                horizontalLineTo(64.0f)
                curveTo(55.18f, 80.0f, 48.0f, 87.18f, 48.0f, 96.0f)
                verticalLineToRelative(288.0f)
                lineToRelative(71.16f, -142.3f)
                curveTo(124.6f, 230.8f, 135.7f, 224.0f, 147.8f, 224.0f)
                horizontalLineToRelative(396.2f)
                curveTo(567.7f, 224.0f, 583.2f, 249.0f, 572.6f, 270.3f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
