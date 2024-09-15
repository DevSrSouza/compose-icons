package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(572.69f, 292.09f)
                lineTo(500.27f, 416.25f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 444.99f, 448.0f)
                horizontalLineTo(45.03f)
                curveToRelative(-18.52f, 0.0f, -30.06f, -20.09f, -20.73f, -36.09f)
                lineToRelative(72.42f, -124.15f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 152.0f, 256.0f)
                horizontalLineToRelative(399.96f)
                curveToRelative(18.52f, 0.0f, 30.06f, 20.09f, 20.73f, 36.09f)
                close()
                moveTo(152.0f, 224.0f)
                horizontalLineToRelative(328.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                horizontalLineTo(272.0f)
                lineToRelative(-64.0f, -64.0f)
                horizontalLineTo(48.0f)
                curveTo(21.49f, 64.0f, 0.0f, 85.49f, 0.0f, 112.0f)
                verticalLineToRelative(278.05f)
                lineToRelative(69.08f, -118.42f)
                curveTo(86.21f, 242.25f, 117.99f, 224.0f, 152.0f, 224.0f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
