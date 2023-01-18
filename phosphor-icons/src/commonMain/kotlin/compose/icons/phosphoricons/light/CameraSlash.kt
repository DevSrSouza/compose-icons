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

public val LightGroup.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) {
            return _cameraSlash!!
        }
        _cameraSlash = Builder(name = "CameraSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(37.9f, 20.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.5f, -0.4f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 29.0f, 28.0f)
                lineTo(56.3f, 58.0f)
                lineTo(48.0f, 58.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 26.0f, 80.0f)
                lineTo(26.0f, 192.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, 22.0f)
                lineTo(198.1f, 214.0f)
                lineToRelative(20.0f, 22.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.4f, 2.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.1f, -1.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.4f, -8.4f)
                close()
                moveTo(105.5f, 112.2f)
                lineTo(145.6f, 156.3f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -40.1f, -44.1f)
                close()
                moveTo(48.0f, 202.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(38.0f, 80.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 48.0f, 70.0f)
                lineTo(67.2f, 70.0f)
                lineToRelative(30.2f, 33.2f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 128.0f, 174.0f)
                arcToRelative(41.4f, 41.4f, 0.0f, false, false, 25.7f, -8.8f)
                lineTo(187.2f, 202.0f)
                close()
                moveTo(230.0f, 80.0f)
                lineTo(230.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(218.0f, 80.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                lineTo(176.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, -2.7f)
                lineTo(156.8f, 46.0f)
                lineTo(99.2f, 46.0f)
                lineToRelative(-0.2f, 0.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.0f, -6.6f)
                lineToRelative(2.0f, -3.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 96.0f, 34.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.0f, 2.7f)
                lineTo(179.2f, 58.0f)
                lineTo(208.0f, 58.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 230.0f, 80.0f)
                close()
            }
        }
        .build()
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
