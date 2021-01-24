package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.FileAlt: ImageVector
    get() {
        if (_fileAlt != null) {
            return _fileAlt!!
        }
        _fileAlt = Builder(name = "FileAlt", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 248.0f)
                verticalLineToRelative(28.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                lineTo(108.0f, 288.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineToRelative(-28.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(168.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                close()
                moveTo(276.0f, 320.0f)
                lineTo(108.0f, 320.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                verticalLineToRelative(28.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(168.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-28.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(384.0f, 131.9f)
                lineTo(384.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 512.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 48.0f)
                curveTo(0.0f, 21.5f, 21.5f, 0.0f, 48.0f, 0.0f)
                horizontalLineToRelative(204.1f)
                curveTo(264.8f, 0.0f, 277.0f, 5.1f, 286.0f, 14.1f)
                lineTo(369.9f, 98.0f)
                curveToRelative(9.0f, 8.9f, 14.1f, 21.2f, 14.1f, 33.9f)
                close()
                moveTo(256.0f, 51.9f)
                lineTo(256.0f, 128.0f)
                horizontalLineToRelative(76.1f)
                lineTo(256.0f, 51.9f)
                close()
                moveTo(336.0f, 464.0f)
                lineTo(336.0f, 176.0f)
                lineTo(232.0f, 176.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(208.0f, 48.0f)
                lineTo(48.0f, 48.0f)
                verticalLineToRelative(416.0f)
                horizontalLineToRelative(288.0f)
                close()
            }
        }
        .build()
        return _fileAlt!!
    }

private var _fileAlt: ImageVector? = null
