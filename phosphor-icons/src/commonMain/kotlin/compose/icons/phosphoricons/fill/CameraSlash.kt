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

public val FillGroup.CameraSlash: ImageVector
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
                horizontalLineTo(48.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 24.0f, 80.0f)
                verticalLineTo(192.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineTo(197.2f)
                lineToRelative(19.4f, 21.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.9f, 2.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 5.4f, -2.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.6f, -11.3f)
                close()
                moveTo(128.0f, 168.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                arcToRelative(36.4f, 36.4f, 0.0f, false, true, 8.1f, -22.8f)
                lineTo(148.0f, 161.9f)
                arcTo(35.3f, 35.3f, 0.0f, false, true, 128.0f, 168.0f)
                close()
                moveTo(232.0f, 80.0f)
                verticalLineTo(186.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.1f, 7.5f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, true, -2.9f, 0.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.9f, -2.6f)
                lineToRelative(-130.0f, -143.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.8f, -9.8f)
                lineToRelative(2.0f, -3.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 96.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, 6.6f, 3.6f)
                lineTo(180.3f, 56.0f)
                horizontalLineTo(208.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 232.0f, 80.0f)
                close()
            }
        }
        .build()
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
