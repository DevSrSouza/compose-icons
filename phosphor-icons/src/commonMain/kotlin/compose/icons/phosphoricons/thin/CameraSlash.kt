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

public val ThinGroup.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) {
            return _cameraSlash!!
        }
        _cameraSlash = Builder(name = "CameraSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.4f, 21.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.9f, 5.4f)
                lineTo(60.8f, 60.0f)
                horizontalLineTo(48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 80.0f)
                verticalLineTo(192.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(199.0f)
                lineToRelative(20.6f, 22.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.9f, 1.3f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.7f, -1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.3f, -5.7f)
                close()
                moveTo(148.5f, 156.5f)
                arcTo(31.2f, 31.2f, 0.0f, false, true, 128.0f, 164.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, -32.0f)
                arcToRelative(31.7f, 31.7f, 0.0f, false, true, 9.5f, -22.8f)
                close()
                moveTo(48.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 68.0f)
                horizontalLineTo(68.0f)
                lineToRelative(32.1f, 35.3f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 53.8f, 59.2f)
                lineTo(191.7f, 204.0f)
                close()
                moveTo(228.0f, 80.0f)
                verticalLineTo(186.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.3f, -1.8f)
                lineTo(157.9f, 44.0f)
                horizontalLineTo(98.1f)
                lineToRelative(-0.8f, 1.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.6f, -4.4f)
                lineToRelative(2.0f, -3.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 96.0f, 36.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.3f, 1.8f)
                lineTo(178.1f, 60.0f)
                horizontalLineTo(208.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 228.0f, 80.0f)
                close()
            }
        }
        .build()
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
