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

public val FilledGroup.PersonAlert: ImageVector
    get() {
        if (_personAlert != null) {
            return _personAlert!!
        }
        _personAlert = Builder(name = "PersonAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7542f, 13.9992f)
                curveTo(18.9962f, 13.9992f, 20.0031f, 15.0061f, 20.0031f, 16.2481f)
                verticalLineTo(17.1665f)
                curveTo(20.0031f, 17.7399f, 19.8238f, 18.2989f, 19.4905f, 18.7654f)
                curveTo(17.9446f, 20.9287f, 15.4203f, 22.0004f, 12.0f, 22.0004f)
                curveTo(11.8374f, 22.0004f, 11.6769f, 21.9979f, 11.5184f, 21.9931f)
                lineTo(11.5261f, 21.9927f)
                curveTo(11.6421f, 21.9866f, 11.8943f, 21.9723f, 12.1385f, 21.8576f)
                curveTo(12.8836f, 21.5074f, 13.2072f, 20.6221f, 12.8636f, 19.8739f)
                curveTo(12.751f, 19.6287f, 12.5675f, 19.4551f, 12.4827f, 19.3757f)
                curveTo(12.3805f, 19.2798f, 12.2478f, 19.1679f, 12.1091f, 19.0508f)
                lineTo(11.4985f, 18.5354f)
                verticalLineTo(16.0f)
                curveTo(11.4985f, 15.2886f, 11.3499f, 14.6119f, 11.0821f, 13.9992f)
                horizontalLineTo(17.7542f)
                close()
                moveTo(12.0f, 2.0039f)
                curveTo(14.7614f, 2.0039f, 17.0f, 4.2425f, 17.0f, 7.0039f)
                curveTo(17.0f, 9.7653f, 14.7614f, 12.0039f, 12.0f, 12.0039f)
                curveTo(9.2386f, 12.0039f, 7.0f, 9.7653f, 7.0f, 7.0039f)
                curveTo(7.0f, 4.2425f, 9.2386f, 2.0039f, 12.0f, 2.0039f)
                close()
                moveTo(6.5025f, 12.0f)
                curveTo(4.2934f, 12.0f, 2.5025f, 13.7909f, 2.5025f, 16.0f)
                lineTo(2.5023f, 19.0f)
                lineTo(1.5539f, 19.8004f)
                curveTo(1.2462f, 20.06f, 1.0923f, 20.1899f, 1.0457f, 20.2913f)
                curveTo(0.9312f, 20.5407f, 1.0391f, 20.8358f, 1.2875f, 20.9525f)
                curveTo(1.3885f, 21.0f, 1.5898f, 21.0f, 1.9925f, 21.0f)
                horizontalLineTo(11.0121f)
                curveTo(11.4148f, 21.0f, 11.6162f, 21.0f, 11.7172f, 20.9525f)
                curveTo(11.9656f, 20.8358f, 12.0735f, 20.5407f, 11.9589f, 20.2913f)
                curveTo(11.9123f, 20.1899f, 11.7584f, 20.06f, 11.4507f, 19.8003f)
                lineTo(10.5025f, 19.0f)
                verticalLineTo(16.0f)
                curveTo(10.5025f, 13.7909f, 8.7116f, 12.0f, 6.5025f, 12.0f)
                close()
                moveTo(8.0025f, 22.0f)
                curveTo(7.7842f, 22.5826f, 7.195f, 23.0f, 6.5025f, 23.0f)
                curveTo(5.81f, 23.0f, 5.2208f, 22.5826f, 5.0025f, 22.0f)
                horizontalLineTo(8.0025f)
                close()
            }
        }
        .build()
        return _personAlert!!
    }

private var _personAlert: ImageVector? = null
