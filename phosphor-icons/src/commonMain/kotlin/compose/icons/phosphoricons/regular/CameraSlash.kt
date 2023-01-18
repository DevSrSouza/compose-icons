package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) {
            return _cameraSlash!!
        }
        _cameraSlash = Builder(name = "CameraSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.4f, 18.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -11.3f, -0.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.6f, 11.3f)
                lineTo(51.7f, 56.0f)
                lineTo(48.0f, 56.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 24.0f, 80.0f)
                lineTo(24.0f, 192.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(197.2f, 216.0f)
                lineToRelative(19.4f, 21.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.9f, 2.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 5.4f, -2.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.6f, -11.3f)
                close()
                moveTo(105.6f, 115.2f)
                lineTo(142.6f, 155.9f)
                arcTo(27.8f, 27.8f, 0.0f, false, true, 128.0f, 160.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -22.4f, -44.8f)
                close()
                moveTo(48.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(40.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(66.3f, 72.0f)
                lineToRelative(28.4f, 31.2f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 58.7f, 64.7f)
                lineTo(182.6f, 200.0f)
                close()
                moveTo(232.0f, 80.0f)
                lineTo(232.0f, 186.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(176.0f, 72.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.7f, -3.6f)
                lineTo(155.7f, 48.0f)
                lineTo(100.2f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.7f, 1.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -2.2f, -11.1f)
                lineToRelative(2.0f, -3.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 96.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, 6.6f, 3.6f)
                lineTo(180.3f, 56.0f)
                lineTo(208.0f, 56.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 232.0f, 80.0f)
                close()
            }
        }
        .build()
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
