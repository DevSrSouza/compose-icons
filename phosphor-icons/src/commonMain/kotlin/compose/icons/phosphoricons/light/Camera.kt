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

public val LightGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 58.0f)
                lineTo(179.2f, 58.0f)
                lineTo(165.0f, 36.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, -2.7f)
                lineTo(96.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 2.7f)
                lineTo(76.8f, 58.0f)
                lineTo(48.0f, 58.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 26.0f, 80.0f)
                lineTo(26.0f, 192.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, 22.0f)
                lineTo(208.0f, 214.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(230.0f, 80.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 208.0f, 58.0f)
                close()
                moveTo(218.0f, 192.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                lineTo(48.0f, 202.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(38.0f, 80.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 48.0f, 70.0f)
                lineTo(80.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, -2.7f)
                lineTo(99.2f, 46.0f)
                horizontalLineToRelative(57.6f)
                lineTo(171.0f, 67.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, 2.7f)
                horizontalLineToRelative(32.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                close()
                moveTo(128.0f, 90.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 128.0f, 90.0f)
                close()
                moveTo(128.0f, 162.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, 30.0f, -30.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 128.0f, 162.0f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
