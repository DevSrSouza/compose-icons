package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) {
            return _eyeClosed!!
        }
        _eyeClosed = Builder(name = "EyeClosed", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.9f, 162.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.9f, 10.9f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -4.0f, 1.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.0f, -4.0f)
                lineTo(198.6f, 139.0f)
                arcToRelative(122.9f, 122.9f, 0.0f, false, true, -35.2f, 16.3f)
                lineToRelative(5.8f, 32.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -6.5f, 9.3f)
                horizontalLineToRelative(-1.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.9f, -6.6f)
                lineToRelative(-5.7f, -32.4f)
                arcTo(137.3f, 137.3f, 0.0f, false, true, 128.0f, 160.0f)
                arcToRelative(139.8f, 139.8f, 0.0f, false, true, -19.8f, -1.4f)
                lineTo(102.5f, 191.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.9f, 6.6f)
                horizontalLineTo(93.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -6.5f, -9.3f)
                lineToRelative(5.9f, -33.0f)
                arcToRelative(122.1f, 122.1f, 0.0f, false, true, -35.3f, -16.3f)
                lineTo(38.8f, 171.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -6.9f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 25.0f, 163.0f)
                lineToRelative(19.5f, -33.8f)
                arcToRelative(145.8f, 145.8f, 0.0f, false, true, -18.7f, -19.3f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 27.0f, 98.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 11.2f, 1.1f)
                arcToRelative(128.7f, 128.7f, 0.0f, false, false, 21.3f, 21.0f)
                horizontalLineToRelative(0.1f)
                arcTo(109.7f, 109.7f, 0.0f, false, false, 128.0f, 144.0f)
                curveToRelative(29.3f, 0.0f, 51.8f, -10.3f, 68.3f, -23.1f)
                horizontalLineToRelative(0.2f)
                arcToRelative(128.7f, 128.7f, 0.0f, false, false, 21.3f, -21.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 229.0f, 98.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 1.2f, 11.2f)
                arcToRelative(145.8f, 145.8f, 0.0f, false, true, -18.7f, 19.3f)
                close()
            }
        }
        .build()
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
