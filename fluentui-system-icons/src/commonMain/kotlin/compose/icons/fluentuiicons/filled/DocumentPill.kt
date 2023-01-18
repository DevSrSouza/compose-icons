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

public val FilledGroup.DocumentPill: ImageVector
    get() {
        if (_documentPill != null) {
            return _documentPill!!
        }
        _documentPill = Builder(name = "DocumentPill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.5f)
                curveTo(4.6716f, 2.0f, 4.0f, 2.6716f, 4.0f, 3.5f)
                verticalLineTo(20.5f)
                curveTo(4.0f, 21.3284f, 4.6716f, 22.0f, 5.5f, 22.0f)
                horizontalLineTo(11.4674f)
                curveTo(11.5373f, 22.0f, 11.6068f, 21.9951f, 11.6754f, 21.9855f)
                curveTo(10.786f, 20.4986f, 10.9817f, 18.5436f, 12.2625f, 17.2628f)
                lineTo(17.2625f, 12.2628f)
                curveTo(18.0185f, 11.5069f, 19.0092f, 11.1289f, 20.0f, 11.1289f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                curveTo(12.8954f, 10.0f, 12.0f, 9.1046f, 12.0f, 8.0f)
                close()
                moveTo(13.5f, 8.0f)
                verticalLineTo(2.5f)
                lineTo(19.5f, 8.5f)
                horizontalLineTo(14.0f)
                curveTo(13.7239f, 8.5f, 13.5f, 8.2761f, 13.5f, 8.0f)
                close()
                moveTo(22.0303f, 12.9699f)
                curveTo(20.909f, 11.8486f, 19.091f, 11.8486f, 17.9697f, 12.9699f)
                lineTo(12.9697f, 17.9699f)
                curveTo(11.8483f, 19.0912f, 11.8483f, 20.9092f, 12.9697f, 22.0306f)
                curveTo(14.091f, 23.1519f, 15.909f, 23.1519f, 17.0303f, 22.0306f)
                lineTo(22.0303f, 17.0306f)
                curveTo(23.1516f, 15.9092f, 23.1516f, 14.0912f, 22.0303f, 12.9699f)
                close()
                moveTo(19.0303f, 14.0306f)
                curveTo(19.5658f, 13.495f, 20.4341f, 13.495f, 20.9697f, 14.0306f)
                curveTo(21.5052f, 14.5661f, 21.5052f, 15.4344f, 20.9697f, 15.9699f)
                lineTo(19.0f, 17.9396f)
                lineTo(17.0606f, 16.0002f)
                lineTo(19.0303f, 14.0306f)
                close()
                moveTo(17.0303f, 18.9697f)
                curveTo(17.3232f, 19.2626f, 17.3232f, 19.7374f, 17.0303f, 20.0303f)
                lineTo(16.0303f, 21.0303f)
                curveTo(15.7374f, 21.3232f, 15.2626f, 21.3232f, 14.9697f, 21.0303f)
                curveTo(14.6768f, 20.7374f, 14.6768f, 20.2626f, 14.9697f, 19.9697f)
                lineTo(15.9697f, 18.9697f)
                curveTo(16.2626f, 18.6768f, 16.7374f, 18.6768f, 17.0303f, 18.9697f)
                close()
            }
        }
        .build()
        return _documentPill!!
    }

private var _documentPill: ImageVector? = null
