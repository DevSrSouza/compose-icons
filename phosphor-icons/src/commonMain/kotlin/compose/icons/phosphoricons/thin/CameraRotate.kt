package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) {
            return _cameraRotate!!
        }
        _cameraRotate = Builder(name = "CameraRotate", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 60.0f)
                lineTo(178.1f, 60.0f)
                lineTo(163.3f, 37.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 36.0f)
                lineTo(96.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.3f, 1.8f)
                lineTo(77.9f, 60.0f)
                lineTo(48.0f, 60.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 80.0f)
                lineTo(28.0f, 192.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 212.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 80.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 60.0f)
                close()
                moveTo(220.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(48.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(36.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 68.0f)
                lineTo(80.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.3f, -1.8f)
                lineTo(98.1f, 44.0f)
                horizontalLineToRelative(59.8f)
                lineToRelative(14.8f, 22.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 176.0f, 68.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(159.1f, 157.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, true, -62.2f, 0.0f)
                lineTo(86.6f, 152.5f)
                lineToRelative(-2.7f, 16.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 80.0f, 172.0f)
                horizontalLineToRelative(-0.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.2f, -4.6f)
                lineToRelative(4.0f, -24.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 3.2f, -3.2f)
                lineToRelative(24.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.4f, 7.8f)
                lineToRelative(-16.5f, 2.8f)
                lineToRelative(10.4f, 10.8f)
                arcTo(35.4f, 35.4f, 0.0f, false, false, 128.0f, 168.0f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, 25.5f, -10.5f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 159.1f, 157.5f)
                close()
                moveTo(179.9f, 96.7f)
                lineTo(175.9f, 120.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -3.2f, 3.2f)
                lineToRelative(-24.0f, 4.0f)
                lineTo(148.0f, 127.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, -3.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.2f, -4.6f)
                lineToRelative(16.5f, -2.8f)
                lineToRelative(-10.4f, -10.8f)
                arcTo(35.4f, 35.4f, 0.0f, false, false, 128.0f, 96.0f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, -25.5f, 10.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, -5.6f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, true, 62.2f, 0.0f)
                lineToRelative(10.3f, 10.6f)
                lineToRelative(2.7f, -16.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.8f, 1.4f)
                close()
            }
        }
        .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
