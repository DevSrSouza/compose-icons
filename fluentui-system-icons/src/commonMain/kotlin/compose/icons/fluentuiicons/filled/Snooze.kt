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

public val FilledGroup.Snooze: ImageVector
    get() {
        if (_snooze != null) {
            return _snooze!!
        }
        _snooze = Builder(name = "Snooze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9999f, 12.5042f)
                curveTo(9.8004f, 12.5042f, 10.2615f, 13.3882f, 9.846f, 14.038f)
                lineTo(9.7806f, 14.1291f)
                lineTo(5.0809f, 19.999f)
                lineTo(8.9999f, 20.0f)
                curveTo(9.5128f, 20.0f, 9.9354f, 20.386f, 9.9932f, 20.8834f)
                lineTo(9.9999f, 21.0f)
                curveTo(9.9999f, 21.5128f, 9.6139f, 21.9355f, 9.1166f, 21.9933f)
                lineTo(8.9999f, 22.0f)
                horizontalLineTo(2.9999f)
                curveTo(2.1994f, 22.0f, 1.7383f, 21.116f, 2.1538f, 20.4662f)
                lineTo(2.2192f, 20.3751f)
                lineTo(6.9179f, 14.504f)
                lineTo(3.001f, 14.5042f)
                curveTo(2.4881f, 14.5042f, 2.0655f, 14.1181f, 2.0077f, 13.6208f)
                lineTo(2.001f, 13.5042f)
                curveTo(2.001f, 12.9913f, 2.387f, 12.5687f, 2.8843f, 12.5109f)
                lineTo(3.001f, 12.5042f)
                horizontalLineTo(8.9999f)
                close()
                moveTo(20.9999f, 2.0f)
                curveTo(21.8052f, 2.0f, 22.2651f, 2.8932f, 21.8406f, 3.5423f)
                lineTo(21.7739f, 3.6332f)
                lineTo(14.1089f, 13.0f)
                horizontalLineTo(20.9999f)
                curveTo(21.5128f, 13.0f, 21.9354f, 13.386f, 21.9932f, 13.8834f)
                lineTo(21.9999f, 14.0f)
                curveTo(21.9999f, 14.5128f, 21.6139f, 14.9355f, 21.1165f, 14.9933f)
                lineTo(20.9999f, 15.0f)
                horizontalLineTo(11.9999f)
                curveTo(11.1946f, 15.0f, 10.7348f, 14.1068f, 11.1593f, 13.4577f)
                lineTo(11.226f, 13.3668f)
                lineTo(18.8889f, 4.0f)
                horizontalLineTo(11.9999f)
                curveTo(11.4871f, 4.0f, 11.0644f, 3.614f, 11.0067f, 3.1166f)
                lineTo(10.9999f, 3.0f)
                curveTo(10.9999f, 2.4872f, 11.386f, 2.0645f, 11.8833f, 2.0067f)
                lineTo(11.9999f, 2.0f)
                horizontalLineTo(20.9999f)
                close()
            }
        }
        .build()
        return _snooze!!
    }

private var _snooze: ImageVector? = null
