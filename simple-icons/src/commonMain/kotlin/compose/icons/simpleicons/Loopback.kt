package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Loopback: ImageVector
    get() {
        if (_loopback != null) {
            return _loopback!!
        }
        _loopback = Builder(name = "Loopback", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.333f, 18.413f)
                lineToRelative(2.512f, -1.615f)
                lineToRelative(3.179f, 1.814f)
                lineToRelative(3.209f, -1.876f)
                lineToRelative(2.656f, 1.515f)
                lineToRelative(-5.849f, 3.418f)
                lineToRelative(-5.707f, -3.256f)
                close()
                moveTo(5.273f, 6.239f)
                lineToRelative(6.687f, -3.907f)
                lineToRelative(6.73f, 3.839f)
                lineToRelative(0.022f, 6.755f)
                lineToRelative(-2.654f, -1.513f)
                lineToRelative(-0.011f, -3.701f)
                lineToRelative(-4.071f, -2.322f)
                lineToRelative(-4.05f, 2.367f)
                lineToRelative(0.011f, 3.698f)
                lineToRelative(-0.903f, 0.526f)
                lineToRelative(-1.739f, 1.118f)
                lineToRelative(-0.022f, -6.86f)
                close()
                moveTo(8.881f, 8.702f)
                lineTo(10.794f, 9.791f)
                lineTo(8.888f, 10.901f)
                lineTo(8.881f, 8.702f)
                close()
                moveTo(13.218f, 14.216f)
                lineTo(15.852f, 12.672f)
                lineTo(19.123f, 14.534f)
                lineTo(21.344f, 13.238f)
                lineTo(21.331f, 10.667f)
                lineTo(19.654f, 9.71f)
                lineTo(19.644f, 6.656f)
                lineTo(23.999f, 9.141f)
                lineTo(24.0f, 14.752f)
                lineTo(19.141f, 17.593f)
                lineTo(13.218f, 14.216f)
                close()
                moveTo(0.029f, 14.877f)
                lineTo(0.0f, 9.249f)
                lineToRelative(4.322f, -2.525f)
                lineToRelative(0.009f, 3.061f)
                lineToRelative(-1.675f, 0.979f)
                lineToRelative(0.013f, 2.57f)
                lineToRelative(2.234f, 1.274f)
                lineTo(15.098f, 8.66f)
                lineToRelative(0.009f, 3.062f)
                lineToRelative(-10.189f, 5.944f)
                lineToRelative(-4.889f, -2.789f)
                close()
            }
        }
        .build()
        return _loopback!!
    }

private var _loopback: ImageVector? = null
