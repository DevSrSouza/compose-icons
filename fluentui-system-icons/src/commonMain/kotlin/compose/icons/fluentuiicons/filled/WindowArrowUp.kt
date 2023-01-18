package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.WindowArrowUp: ImageVector
    get() {
        if (_windowArrowUp != null) {
            return _windowArrowUp!!
        }
        _windowArrowUp = Builder(name = "WindowArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(17.5112f, 14.0001f)
                lineTo(17.427f, 14.005f)
                lineTo(17.3719f, 14.0166f)
                lineTo(17.2886f, 14.0467f)
                lineTo(17.2153f, 14.0888f)
                lineTo(17.1589f, 14.1344f)
                lineTo(14.6464f, 16.6464f)
                lineTo(14.5886f, 16.7157f)
                curveTo(14.4705f, 16.8862f, 14.4705f, 17.1138f, 14.5886f, 17.2843f)
                lineTo(14.6464f, 17.3536f)
                lineTo(14.7157f, 17.4114f)
                curveTo(14.8862f, 17.5295f, 15.1138f, 17.5295f, 15.2843f, 17.4114f)
                lineTo(15.3536f, 17.3536f)
                lineTo(16.999f, 15.708f)
                lineTo(17.0f, 21.0f)
                lineTo(17.0081f, 21.0899f)
                curveTo(17.0451f, 21.294f, 17.206f, 21.4549f, 17.4101f, 21.4919f)
                lineTo(17.5f, 21.5f)
                lineTo(17.5899f, 21.4919f)
                curveTo(17.794f, 21.4549f, 17.9549f, 21.294f, 17.9919f, 21.0899f)
                lineTo(18.0f, 21.0f)
                lineTo(17.999f, 15.706f)
                lineTo(19.6464f, 17.3536f)
                lineTo(19.7157f, 17.4114f)
                curveTo(19.9106f, 17.5464f, 20.18f, 17.5271f, 20.3536f, 17.3536f)
                curveTo(20.5271f, 17.18f, 20.5464f, 16.9106f, 20.4114f, 16.7157f)
                lineTo(20.3536f, 16.6464f)
                lineTo(17.806f, 14.104f)
                lineTo(17.7585f, 14.0719f)
                lineTo(17.691f, 14.0378f)
                lineTo(17.6281f, 14.0166f)
                lineTo(17.5739f, 14.0055f)
                curveTo(17.5529f, 14.0023f, 17.5317f, 14.0006f, 17.5112f, 14.0001f)
                close()
                moveTo(6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.483f, 3.0f, 20.8992f, 4.3565f, 20.9949f, 6.0656f)
                lineTo(21.0f, 6.25f)
                lineTo(21.0012f, 12.0226f)
                curveTo(20.3956f, 11.6347f, 19.7214f, 11.3444f, 19.0008f, 11.1741f)
                lineTo(19.0f, 8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.75f)
                curveTo(5.0f, 18.3972f, 5.4919f, 18.9295f, 6.1222f, 18.9935f)
                lineTo(6.25f, 19.0f)
                lineTo(11.1741f, 19.0008f)
                curveTo(11.3444f, 19.7214f, 11.6347f, 20.3956f, 12.0226f, 21.0012f)
                lineTo(6.25f, 21.0f)
                curveTo(4.517f, 21.0f, 3.1007f, 19.6435f, 3.0051f, 17.9344f)
                lineTo(3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.517f, 4.3565f, 3.1007f, 6.0656f, 3.0051f)
                lineTo(6.25f, 3.0f)
                close()
            }
        }
        .build()
        return _windowArrowUp!!
    }

private var _windowArrowUp: ImageVector? = null
