package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) {
            return _windowsLogo!!
        }
        _windowsLogo = Builder(name = "WindowsLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 138.0f)
                lineTo(136.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(57.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 4.9f, 5.9f)
                lineToRelative(80.0f, 14.5f)
                lineTo(216.0f, 221.9f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 3.8f, -1.4f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 222.0f, 216.0f)
                lineTo(222.0f, 144.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 138.0f)
                close()
                moveTo(210.0f, 208.8f)
                lineTo(142.0f, 196.4f)
                lineTo(142.0f, 150.0f)
                horizontalLineToRelative(68.0f)
                close()
                moveTo(104.0f, 138.0f)
                lineTo(40.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.9f, 5.9f)
                lineToRelative(64.0f, 11.6f)
                lineTo(104.0f, 201.5f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, 3.8f, -1.4f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 2.2f, -4.6f)
                lineTo(110.0f, 144.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 138.0f)
                close()
                moveTo(98.0f, 188.4f)
                lineTo(46.0f, 179.0f)
                lineTo(46.0f, 150.0f)
                lineTo(98.0f, 150.0f)
                close()
                moveTo(219.8f, 35.4f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -4.9f, -1.3f)
                lineToRelative(-80.0f, 14.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -4.9f, 5.9f)
                lineTo(130.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(222.0f, 40.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 219.8f, 35.4f)
                close()
                moveTo(210.0f, 106.0f)
                lineTo(142.0f, 106.0f)
                lineTo(142.0f, 59.6f)
                lineToRelative(68.0f, -12.4f)
                close()
                moveTo(107.8f, 55.8f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -4.9f, -1.3f)
                lineToRelative(-64.0f, 11.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 34.0f, 72.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(110.0f, 60.4f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 107.8f, 55.8f)
                close()
                moveTo(98.0f, 106.0f)
                lineTo(46.0f, 106.0f)
                lineTo(46.0f, 77.0f)
                lineToRelative(52.0f, -9.4f)
                close()
            }
        }
        .build()
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
