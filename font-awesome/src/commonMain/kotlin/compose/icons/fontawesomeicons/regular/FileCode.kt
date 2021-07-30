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

public val RegularGroup.FileCode: ImageVector
    get() {
        if (_fileCode != null) {
            return _fileCode!!
        }
        _fileCode = Builder(name = "FileCode", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.9f, 349.1f)
                lineToRelative(-0.2f, -0.2f)
                lineToRelative(-32.8f, -28.9f)
                lineToRelative(32.8f, -28.9f)
                curveToRelative(3.6f, -3.2f, 4.0f, -8.8f, 0.8f, -12.4f)
                lineToRelative(-0.2f, -0.2f)
                lineToRelative(-17.4f, -18.6f)
                curveToRelative(-3.4f, -3.6f, -9.0f, -3.7f, -12.4f, -0.4f)
                lineToRelative(-57.7f, 54.1f)
                curveToRelative(-3.7f, 3.5f, -3.7f, 9.4f, 0.0f, 12.8f)
                lineToRelative(57.7f, 54.1f)
                curveToRelative(1.6f, 1.5f, 3.8f, 2.4f, 6.0f, 2.4f)
                curveToRelative(2.4f, 0.0f, 4.8f, -1.0f, 6.4f, -2.8f)
                lineToRelative(17.4f, -18.6f)
                curveToRelative(3.3f, -3.5f, 3.1f, -9.1f, -0.4f, -12.4f)
                close()
                moveTo(369.9f, 97.9f)
                lineTo(286.0f, 14.0f)
                curveTo(277.0f, 5.0f, 264.8f, -0.1f, 252.1f, -0.1f)
                lineTo(48.0f, -0.1f)
                curveTo(21.5f, 0.0f, 0.0f, 21.5f, 0.0f, 48.0f)
                verticalLineToRelative(416.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(384.0f, 131.9f)
                curveToRelative(0.0f, -12.7f, -5.1f, -25.0f, -14.1f, -34.0f)
                close()
                moveTo(256.0f, 51.9f)
                lineToRelative(76.1f, 76.1f)
                lineTo(256.0f, 128.0f)
                close()
                moveTo(336.0f, 464.0f)
                lineTo(48.0f, 464.0f)
                lineTo(48.0f, 48.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(104.0f)
                close()
                moveTo(209.6f, 214.0f)
                curveToRelative(-4.7f, -1.4f, -9.5f, 1.3f, -10.9f, 6.0f)
                lineTo(144.0f, 408.1f)
                curveToRelative(-1.4f, 4.7f, 1.3f, 9.6f, 6.0f, 10.9f)
                lineToRelative(24.4f, 7.1f)
                curveToRelative(4.7f, 1.4f, 9.6f, -1.4f, 10.9f, -6.0f)
                lineTo(240.0f, 231.9f)
                curveToRelative(1.4f, -4.7f, -1.3f, -9.6f, -6.0f, -10.9f)
                close()
                moveTo(234.1f, 290.9f)
                lineToRelative(0.2f, 0.2f)
                lineToRelative(32.8f, 28.9f)
                lineToRelative(-32.8f, 28.9f)
                curveToRelative(-3.6f, 3.2f, -4.0f, 8.8f, -0.8f, 12.4f)
                lineToRelative(0.2f, 0.2f)
                lineToRelative(17.4f, 18.6f)
                curveToRelative(3.3f, 3.5f, 8.9f, 3.7f, 12.4f, 0.4f)
                lineToRelative(57.7f, -54.1f)
                curveToRelative(3.7f, -3.5f, 3.7f, -9.4f, 0.0f, -12.8f)
                lineToRelative(-57.7f, -54.1f)
                curveToRelative(-3.5f, -3.3f, -9.1f, -3.2f, -12.4f, 0.4f)
                lineToRelative(-17.4f, 18.6f)
                curveToRelative(-3.3f, 3.5f, -3.1f, 9.1f, 0.4f, 12.4f)
                close()
            }
        }
        .build()
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
