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

public val SolidGroup.FolderTree: ImageVector
    get() {
        if (_folderTree != null) {
            return _folderTree!!
        }
        _folderTree = Builder(name = "FolderTree", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(64.0f, 14.3f, 49.7f, 0.0f, 32.0f, 0.0f)
                reflectiveCurveTo(0.0f, 14.3f, 0.0f, 32.0f)
                verticalLineToRelative(96.0f)
                lineTo(0.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(256.0f, 448.0f)
                lineTo(256.0f, 384.0f)
                lineTo(64.0f, 384.0f)
                lineTo(64.0f, 160.0f)
                lineTo(256.0f, 160.0f)
                lineTo(256.0f, 96.0f)
                lineTo(64.0f, 96.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(288.0f, 192.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(544.0f, 224.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(576.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(445.3f, 32.0f)
                curveToRelative(-8.5f, 0.0f, -16.6f, -3.4f, -22.6f, -9.4f)
                lineTo(409.4f, 9.4f)
                curveToRelative(-6.0f, -6.0f, -14.1f, -9.4f, -22.6f, -9.4f)
                lineTo(320.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(288.0f, 192.0f)
                close()
                moveTo(288.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(544.0f, 512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(576.0f, 352.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(445.3f, 320.0f)
                curveToRelative(-8.5f, 0.0f, -16.6f, -3.4f, -22.6f, -9.4f)
                lineToRelative(-13.3f, -13.3f)
                curveToRelative(-6.0f, -6.0f, -14.1f, -9.4f, -22.6f, -9.4f)
                lineTo(320.0f, 287.9f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(288.0f, 480.0f)
                close()
            }
        }
        .build()
        return _folderTree!!
    }

private var _folderTree: ImageVector? = null
