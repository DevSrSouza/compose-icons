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

public val BoldGroup.EyedropperSample: ImageVector
    get() {
        if (_eyedropperSample != null) {
            return _eyedropperSample!!
        }
        _eyedropperSample = Builder(name = "EyedropperSample", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 67.4f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, -12.5f, -28.5f)
                curveToRelative(-15.6f, -14.7f, -40.8f, -14.2f, -56.2f, 1.2f)
                lineTo(139.9f, 59.6f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, -35.7f, 3.2f)
                lineToRelative(-7.0f, 7.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -0.8f, 27.4f)
                lineTo(48.9f, 144.9f)
                arcTo(44.2f, 44.2f, 0.0f, false, false, 36.6f, 183.0f)
                lineToRelative(-9.3f, 21.3f)
                arcTo(17.5f, 17.5f, 0.0f, false, false, 31.0f, 223.9f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, false, 14.1f, 5.9f)
                arcToRelative(18.9f, 18.9f, 0.0f, false, false, 8.0f, -1.7f)
                lineTo(73.0f, 219.4f)
                arcToRelative(44.2f, 44.2f, 0.0f, false, false, 38.1f, -12.3f)
                lineToRelative(47.6f, -47.5f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 27.4f, -0.8f)
                lineToRelative(7.1f, -7.0f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, 3.2f, -35.7f)
                lineToRelative(19.9f, -19.8f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 228.0f, 67.4f)
                close()
                moveTo(136.3f, 148.0f)
                horizontalLineTo(79.7f)
                lineToRelative(33.7f, -33.7f)
                lineToRelative(28.3f, 28.3f)
                close()
                moveTo(94.1f, 190.1f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, true, -19.3f, 5.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -7.9f, 0.6f)
                lineToRelative(-12.1f, 5.3f)
                lineToRelative(5.3f, -12.1f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 0.6f, -7.9f)
                arcToRelative(20.5f, 20.5f, 0.0f, false, true, -0.3f, -9.2f)
                horizontalLineToRelative(51.9f)
                close()
                moveTo(199.3f, 79.3f)
                lineToRelative(-28.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(4.9f, 4.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineTo(172.0f, 139.0f)
                lineTo(117.0f, 84.0f)
                lineToRelative(4.2f, -4.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                lineToRelative(4.9f, 4.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(27.6f, -27.6f)
                curveToRelative(6.3f, -6.3f, 16.5f, -6.6f, 22.7f, -0.7f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 0.3f, 22.9f)
                close()
            }
        }
        .build()
        return _eyedropperSample!!
    }

private var _eyedropperSample: ImageVector? = null
