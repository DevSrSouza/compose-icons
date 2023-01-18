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

public val FilledGroup.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = Builder(name = "Pulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.471f, 7.2369f)
                lineTo(11.5265f, 20.2289f)
                curveTo(11.7601f, 21.222f, 13.1561f, 21.2689f, 13.4558f, 20.2938f)
                lineTo(16.4005f, 10.7135f)
                lineTo(16.7855f, 12.2411f)
                curveTo(16.8975f, 12.6853f, 17.2971f, 12.9966f, 17.7552f, 12.9966f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 12.9966f, 22.0f, 12.5489f, 22.0f, 11.9966f)
                curveTo(22.0f, 11.4444f, 21.5523f, 10.9966f, 21.0f, 10.9966f)
                horizontalLineTo(18.5344f)
                lineTo(17.4655f, 6.7556f)
                curveTo(17.2182f, 5.7745f, 15.8372f, 5.7391f, 15.5399f, 6.7062f)
                lineTo(12.6284f, 16.1784f)
                lineTo(9.4752f, 2.7711f)
                curveTo(9.2352f, 1.7506f, 7.7866f, 1.7401f, 7.5318f, 2.7569f)
                lineTo(5.467f, 10.9966f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 10.9966f, 2.0f, 11.4444f, 2.0f, 11.9966f)
                curveTo(2.0f, 12.5489f, 2.4477f, 12.9966f, 3.0f, 12.9966f)
                horizontalLineTo(6.2473f)
                curveTo(6.7059f, 12.9966f, 7.1058f, 12.6846f, 7.2173f, 12.2397f)
                lineTo(8.471f, 7.2369f)
                close()
            }
        }
        .build()
        return _pulse!!
    }

private var _pulse: ImageVector? = null
