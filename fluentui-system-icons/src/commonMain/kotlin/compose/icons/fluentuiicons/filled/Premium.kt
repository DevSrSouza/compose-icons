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

public val FilledGroup.Premium: ImageVector
    get() {
        if (_premium != null) {
            return _premium!!
        }
        _premium = Builder(name = "Premium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                curveTo(18.3367f, 3.0f, 18.6477f, 3.1691f, 18.8316f, 3.4446f)
                lineTo(18.8944f, 3.5528f)
                lineTo(21.8944f, 9.5528f)
                curveTo(22.0579f, 9.8797f, 22.0287f, 10.2659f, 21.827f, 10.5623f)
                lineTo(21.7433f, 10.669f)
                lineTo(12.7699f, 20.6418f)
                curveTo(12.5903f, 20.861f, 12.3336f, 20.9796f, 12.0707f, 20.9976f)
                curveTo(12.0081f, 21.0019f, 11.9456f, 21.0005f, 11.8835f, 20.9932f)
                lineTo(11.7711f, 20.9743f)
                curveTo(11.5698f, 20.9284f, 11.381f, 20.821f, 11.2387f, 20.6521f)
                lineTo(2.2567f, 10.669f)
                curveTo(2.0122f, 10.3973f, 1.9377f, 10.0172f, 2.0533f, 9.6779f)
                lineTo(2.1056f, 9.5528f)
                lineTo(5.1056f, 3.5528f)
                curveTo(5.2562f, 3.2516f, 5.5465f, 3.0491f, 5.8752f, 3.0078f)
                lineTo(6.0f, 3.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(14.576f, 11.0f)
                horizontalLineTo(9.423f)
                lineTo(12.0f, 17.342f)
                lineTo(14.576f, 11.0f)
                close()
                moveTo(18.753f, 11.0f)
                horizontalLineTo(16.735f)
                lineTo(15.074f, 15.088f)
                lineTo(18.753f, 11.0f)
                close()
                moveTo(7.264f, 11.0f)
                horizontalLineTo(5.246f)
                lineTo(8.924f, 15.087f)
                lineTo(7.264f, 11.0f)
                close()
                moveTo(8.622f, 5.0f)
                horizontalLineTo(6.618f)
                lineTo(4.618f, 9.0f)
                horizontalLineTo(7.322f)
                lineTo(8.622f, 5.0f)
                close()
                moveTo(13.273f, 5.0f)
                horizontalLineTo(10.726f)
                lineTo(9.427f, 9.0f)
                horizontalLineTo(14.572f)
                lineTo(13.273f, 5.0f)
                close()
                moveTo(17.381f, 5.0f)
                horizontalLineTo(15.377f)
                lineTo(16.677f, 9.0f)
                horizontalLineTo(19.381f)
                lineTo(17.381f, 5.0f)
                close()
            }
        }
        .build()
        return _premium!!
    }

private var _premium: ImageVector? = null
