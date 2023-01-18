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

public val BoldGroup.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) {
            return _cameraSlash!!
        }
        _cameraSlash = Builder(name = "CameraSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.3f, 15.9f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.6f, 32.1f)
                lineTo(43.1f, 52.4f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 20.0f, 80.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(195.4f, 220.0f)
                lineToRelative(18.3f, 20.1f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 8.8f, 3.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.9f, -20.1f)
                close()
                moveTo(106.2f, 121.9f)
                lineTo(136.0f, 154.6f)
                arcToRelative(23.6f, 23.6f, 0.0f, false, true, -8.0f, 1.4f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, -24.0f, -24.0f)
                arcTo(24.4f, 24.4f, 0.0f, false, true, 106.2f, 121.9f)
                close()
                moveTo(48.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(64.5f, 76.0f)
                lineToRelative(24.9f, 27.4f)
                arcTo(48.1f, 48.1f, 0.0f, false, false, 128.0f, 180.0f)
                arcToRelative(49.0f, 49.0f, 0.0f, false, false, 24.8f, -6.9f)
                lineTo(173.6f, 196.0f)
                close()
                moveTo(236.0f, 80.0f)
                verticalLineToRelative(94.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -24.0f, 0.0f)
                lineTo(212.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(176.0f, 76.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -10.0f, -5.4f)
                lineTo(153.6f, 52.0f)
                lineTo(102.1f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(160.0f, 28.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 10.0f, 5.3f)
                lineTo(182.4f, 52.0f)
                lineTo(208.0f, 52.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 236.0f, 80.0f)
                close()
            }
        }
        .build()
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
