package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) {
            return _windowsLogo!!
        }
        _windowsLogo = Builder(name = "WindowsLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(107.7f, 51.9f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -9.8f, -2.6f)
                lineToRelative(-60.0f, 10.9f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 28.0f, 72.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(112.0f, 61.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 107.7f, 51.9f)
                close()
                moveTo(88.0f, 96.0f)
                lineTo(52.0f, 96.0f)
                lineTo(52.0f, 82.0f)
                lineToRelative(36.0f, -6.5f)
                close()
                moveTo(223.7f, 30.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.8f, -2.6f)
                lineTo(137.9f, 42.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 128.0f, 53.8f)
                lineTo(128.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 223.7f, 30.8f)
                close()
                moveTo(204.0f, 96.0f)
                lineTo(152.0f, 96.0f)
                lineTo(152.0f, 63.8f)
                lineToRelative(52.0f, -9.4f)
                close()
                moveTo(100.0f, 136.0f)
                lineTo(40.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 9.9f, 11.8f)
                lineToRelative(60.0f, 10.9f)
                lineToRelative(2.1f, 0.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(112.0f, 148.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 136.0f)
                close()
                moveTo(88.0f, 180.5f)
                lineTo(52.0f, 174.0f)
                lineTo(52.0f, 160.0f)
                lineTo(88.0f, 160.0f)
                close()
                moveTo(216.0f, 136.0f)
                lineTo(140.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(54.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 9.9f, 11.8f)
                lineToRelative(76.0f, 13.8f)
                lineToRelative(2.1f, 0.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 148.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 136.0f)
                close()
                moveTo(204.0f, 201.6f)
                lineTo(152.0f, 192.2f)
                lineTo(152.0f, 160.0f)
                horizontalLineToRelative(52.0f)
                close()
            }
        }
        .build()
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
