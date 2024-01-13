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
                moveTo(88.7f, 223.8f)
                lineTo(0.0f, 375.8f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineTo(181.5f, 32.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineToRelative(26.5f, 26.5f)
                curveToRelative(12.0f, 12.0f, 28.3f, 18.7f, 45.3f, 18.7f)
                lineTo(416.0f, 95.9f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineToRelative(32.0f)
                lineTo(144.0f, 191.9f)
                curveToRelative(-22.8f, 0.0f, -43.8f, 12.1f, -55.3f, 31.8f)
                close()
                moveTo(116.3f, 239.9f)
                curveTo(122.1f, 230.0f, 132.6f, 224.0f, 144.0f, 224.0f)
                lineTo(544.0f, 224.0f)
                curveToRelative(11.5f, 0.0f, 22.0f, 6.1f, 27.7f, 16.1f)
                reflectiveCurveToRelative(5.7f, 22.2f, -0.1f, 32.1f)
                lineToRelative(-112.0f, 192.0f)
                curveTo(453.9f, 474.0f, 443.4f, 480.0f, 432.0f, 480.0f)
                lineTo(32.0f, 480.0f)
                curveToRelative(-11.5f, 0.0f, -22.0f, -6.1f, -27.7f, -16.1f)
                reflectiveCurveToRelative(-5.7f, -22.2f, 0.1f, -32.1f)
                lineToRelative(112.0f, -192.0f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
