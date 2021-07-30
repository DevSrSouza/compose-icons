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

public val SolidGroup.FileExport: ImageVector
    get() {
        if (_fileExport != null) {
            return _fileExport!!
        }
        _fileExport = Builder(name = "FileExport", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 121.9f)
                curveToRelative(0.0f, -6.3f, -2.5f, -12.4f, -7.0f, -16.9f)
                lineTo(279.1f, 7.0f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7.0f, -17.0f, -7.0f)
                lineTo(256.0f, 0.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                close()
                moveTo(571.0f, 308.0f)
                lineToRelative(-95.7f, -96.4f)
                curveToRelative(-10.1f, -10.1f, -27.4f, -3.0f, -27.4f, 11.3f)
                lineTo(447.9f, 288.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(65.2f)
                curveToRelative(0.0f, 14.3f, 17.3f, 21.4f, 27.4f, 11.3f)
                lineTo(571.0f, 332.0f)
                curveToRelative(6.6f, -6.6f, 6.6f, -17.4f, 0.0f, -24.0f)
                close()
                moveTo(192.0f, 336.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(176.0f)
                lineTo(384.0f, 160.0f)
                lineTo(248.0f, 160.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                lineTo(224.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                curveTo(10.7f, 0.0f, 0.0f, 10.7f, 0.0f, 24.0f)
                verticalLineToRelative(464.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(384.0f, 352.0f)
                lineTo(208.0f, 352.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _fileExport!!
    }

private var _fileExport: ImageVector? = null
