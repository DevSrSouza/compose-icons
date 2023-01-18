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

public val FilledGroup.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) {
            return _lightbulbFilament!!
        }
        _lightbulbFilament = Builder(name = "LightbulbFilament", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.538f, 18.999f)
                lineTo(15.2473f, 20.2575f)
                curveTo(15.0241f, 21.2208f, 14.2013f, 21.9184f, 13.2285f, 21.993f)
                lineTo(13.0554f, 21.9996f)
                horizontalLineTo(10.9437f)
                curveTo(9.9543f, 21.9996f, 9.0885f, 21.3547f, 8.7968f, 20.4232f)
                lineTo(8.7514f, 20.2559f)
                lineTo(8.461f, 18.999f)
                horizontalLineTo(15.538f)
                close()
                moveTo(12.0f, 2.001f)
                curveTo(16.0041f, 2.001f, 19.25f, 5.2469f, 19.25f, 9.251f)
                curveTo(19.25f, 11.3875f, 18.3144f, 13.3443f, 16.4846f, 15.0917f)
                curveTo(16.4493f, 15.1254f, 16.4247f, 15.1687f, 16.4137f, 15.2162f)
                lineTo(15.886f, 17.499f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.7503f)
                curveTo(12.75f, 10.3361f, 12.4142f, 10.0003f, 12.0f, 10.0003f)
                curveTo(11.5858f, 10.0003f, 11.25f, 10.3361f, 11.25f, 10.7503f)
                verticalLineTo(17.499f)
                horizontalLineTo(8.114f)
                lineTo(7.588f, 15.2164f)
                curveTo(7.577f, 15.1688f, 7.5523f, 15.1255f, 7.517f, 15.0917f)
                curveTo(5.6862f, 13.3443f, 4.75f, 11.3875f, 4.75f, 9.251f)
                curveTo(4.75f, 5.2469f, 7.9959f, 2.001f, 12.0f, 2.001f)
                close()
                moveTo(11.25f, 6.7507f)
                verticalLineTo(8.2508f)
                curveTo(11.25f, 8.665f, 11.5858f, 9.0008f, 12.0f, 9.0008f)
                curveTo(12.4142f, 9.0008f, 12.75f, 8.665f, 12.75f, 8.2508f)
                verticalLineTo(6.7507f)
                curveTo(12.75f, 6.3365f, 12.4142f, 6.0007f, 12.0f, 6.0007f)
                curveTo(11.5858f, 6.0007f, 11.25f, 6.3365f, 11.25f, 6.7507f)
                close()
                moveTo(16.2803f, 8.2161f)
                curveTo(15.9874f, 7.9232f, 15.5126f, 7.9232f, 15.2197f, 8.2161f)
                lineTo(14.159f, 9.2767f)
                curveTo(13.8661f, 9.5696f, 13.8661f, 10.0445f, 14.159f, 10.3374f)
                curveTo(14.4519f, 10.6303f, 14.9268f, 10.6303f, 15.2197f, 10.3374f)
                lineTo(16.2803f, 9.2767f)
                curveTo(16.5732f, 8.9838f, 16.5732f, 8.509f, 16.2803f, 8.2161f)
                close()
                moveTo(8.7803f, 8.2161f)
                curveTo(8.4874f, 7.9232f, 8.0126f, 7.9232f, 7.7197f, 8.2161f)
                curveTo(7.4268f, 8.509f, 7.4268f, 8.9838f, 7.7197f, 9.2767f)
                lineTo(8.7803f, 10.3374f)
                curveTo(9.0732f, 10.6303f, 9.5481f, 10.6303f, 9.841f, 10.3374f)
                curveTo(10.1339f, 10.0445f, 10.1339f, 9.5696f, 9.841f, 9.2767f)
                lineTo(8.7803f, 8.2161f)
                close()
            }
        }
        .build()
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null
