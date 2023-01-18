package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) {
            return _windowsLogo!!
        }
        _windowsLogo = Builder(name = "WindowsLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 144.0f)
                verticalLineToRelative(51.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -2.9f, 6.2f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -5.1f, 1.8f)
                horizontalLineToRelative(-1.4f)
                lineToRelative(-64.0f, -11.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 184.0f)
                lineTo(32.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 144.0f)
                close()
                moveTo(109.1f, 54.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.5f, -1.7f)
                lineToRelative(-64.0f, 11.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 72.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(112.0f, 60.4f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 109.1f, 54.2f)
                close()
                moveTo(221.1f, 33.9f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, -6.5f, -1.8f)
                lineToRelative(-80.0f, 14.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.6f, 7.8f)
                lineTo(128.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 40.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 221.1f, 33.9f)
                close()
                moveTo(216.0f, 136.0f)
                lineTo(136.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(57.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.6f, 7.8f)
                lineToRelative(80.0f, 14.6f)
                lineTo(216.0f, 223.9f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, false, 5.1f, -1.9f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 224.0f, 216.0f)
                lineTo(224.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 136.0f)
                close()
            }
        }
        .build()
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
