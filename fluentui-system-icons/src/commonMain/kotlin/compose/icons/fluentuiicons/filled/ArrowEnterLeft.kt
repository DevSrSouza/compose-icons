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

public val FilledGroup.ArrowEnterLeft: ImageVector
    get() {
        if (_arrowEnterLeft != null) {
            return _arrowEnterLeft!!
        }
        _arrowEnterLeft = Builder(name = "ArrowEnterLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                curveTo(21.5128f, 4.0f, 21.9355f, 4.386f, 21.9933f, 4.8834f)
                lineTo(22.0f, 5.0f)
                verticalLineTo(11.5f)
                curveTo(22.0f, 13.3686f, 20.5357f, 14.8951f, 18.692f, 14.9948f)
                lineTo(18.5f, 15.0f)
                horizontalLineTo(5.415f)
                lineTo(8.7071f, 18.2929f)
                curveTo(9.0676f, 18.6534f, 9.0953f, 19.2206f, 8.7903f, 19.6129f)
                lineTo(8.7071f, 19.7071f)
                curveTo(8.3466f, 20.0676f, 7.7794f, 20.0953f, 7.3871f, 19.7903f)
                lineTo(7.2929f, 19.7071f)
                lineTo(2.2929f, 14.7071f)
                curveTo(2.2575f, 14.6717f, 2.2253f, 14.6343f, 2.1963f, 14.5953f)
                lineTo(2.1247f, 14.4841f)
                lineTo(2.0712f, 14.3713f)
                lineTo(2.0359f, 14.266f)
                lineTo(2.011f, 14.1485f)
                lineTo(2.004f, 14.0898f)
                lineTo(2.0f, 14.0f)
                lineTo(2.0028f, 13.9248f)
                lineTo(2.0202f, 13.7993f)
                lineTo(2.0497f, 13.6879f)
                lineTo(2.0937f, 13.5768f)
                lineTo(2.146f, 13.4793f)
                lineTo(2.2097f, 13.3871f)
                lineTo(2.2929f, 13.2929f)
                lineTo(7.2929f, 8.2929f)
                curveTo(7.6834f, 7.9024f, 8.3166f, 7.9024f, 8.7071f, 8.2929f)
                curveTo(9.0676f, 8.6534f, 9.0953f, 9.2206f, 8.7903f, 9.6129f)
                lineTo(8.7071f, 9.7071f)
                lineTo(5.415f, 13.0f)
                horizontalLineTo(18.5f)
                curveTo(19.2797f, 13.0f, 19.9204f, 12.4051f, 19.9931f, 11.6445f)
                lineTo(20.0f, 11.5f)
                verticalLineTo(5.0f)
                curveTo(20.0f, 4.4477f, 20.4477f, 4.0f, 21.0f, 4.0f)
                close()
            }
        }
        .build()
        return _arrowEnterLeft!!
    }

private var _arrowEnterLeft: ImageVector? = null
