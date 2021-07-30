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

public val RegularGroup.FileExcel: ImageVector
    get() {
        if (_fileExcel != null) {
            return _fileExcel!!
        }
        _fileExcel = Builder(name = "FileExcel", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(332.1f, 128.0f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 51.9f)
                lineToRelative(76.1f, 76.1f)
                close()
                moveTo(48.0f, 464.0f)
                lineTo(48.0f, 48.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(104.0f)
                verticalLineToRelative(288.0f)
                lineTo(48.0f, 464.0f)
                close()
                moveTo(260.0f, 224.0f)
                horizontalLineToRelative(-28.8f)
                curveToRelative(-4.4f, 0.0f, -8.4f, 2.4f, -10.5f, 6.3f)
                curveToRelative(-18.0f, 33.1f, -22.2f, 42.4f, -28.6f, 57.7f)
                curveToRelative(-13.9f, -29.1f, -6.9f, -17.3f, -28.6f, -57.7f)
                curveToRelative(-2.1f, -3.9f, -6.2f, -6.3f, -10.6f, -6.3f)
                lineTo(124.0f, 224.0f)
                curveToRelative(-9.3f, 0.0f, -15.0f, 10.0f, -10.4f, 18.0f)
                lineToRelative(46.3f, 78.0f)
                lineToRelative(-46.3f, 78.0f)
                curveToRelative(-4.7f, 8.0f, 1.1f, 18.0f, 10.4f, 18.0f)
                horizontalLineToRelative(28.9f)
                curveToRelative(4.4f, 0.0f, 8.4f, -2.4f, 10.5f, -6.3f)
                curveToRelative(21.7f, -40.0f, 23.0f, -45.0f, 28.6f, -57.7f)
                curveToRelative(14.9f, 30.2f, 5.9f, 15.9f, 28.6f, 57.7f)
                curveToRelative(2.1f, 3.9f, 6.2f, 6.3f, 10.6f, 6.3f)
                lineTo(260.0f, 416.0f)
                curveToRelative(9.3f, 0.0f, 15.0f, -10.0f, 10.4f, -18.0f)
                lineTo(224.0f, 320.0f)
                curveToRelative(0.7f, -1.1f, 30.3f, -50.5f, 46.3f, -78.0f)
                curveToRelative(4.7f, -8.0f, -1.1f, -18.0f, -10.3f, -18.0f)
                close()
            }
        }
        .build()
        return _fileExcel!!
    }

private var _fileExcel: ImageVector? = null
