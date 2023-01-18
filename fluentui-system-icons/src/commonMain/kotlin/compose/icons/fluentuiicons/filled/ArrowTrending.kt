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

public val FilledGroup.ArrowTrending: ImageVector
    get() {
        if (_arrowTrending != null) {
            return _arrowTrending!!
        }
        _arrowTrending = Builder(name = "ArrowTrending", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.003f, 5.5f)
                horizontalLineTo(20.9998f)
                curveTo(21.5126f, 5.5f, 21.9353f, 5.886f, 21.993f, 6.3834f)
                lineTo(21.9998f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(21.9998f, 14.0523f, 21.552f, 14.5f, 20.9998f, 14.5f)
                curveTo(20.4869f, 14.5f, 20.0643f, 14.114f, 20.0065f, 13.6166f)
                lineTo(19.9998f, 13.5f)
                lineTo(19.999f, 8.914f)
                lineTo(12.7069f, 16.2071f)
                curveTo(12.3466f, 16.5674f, 11.7798f, 16.5953f, 11.3875f, 16.2908f)
                lineTo(11.2933f, 16.2077f)
                lineTo(8.9973f, 13.9157f)
                lineTo(3.7092f, 19.2055f)
                curveTo(3.3187f, 19.5961f, 2.6855f, 19.5962f, 2.295f, 19.2057f)
                curveTo(1.9344f, 18.8453f, 1.9066f, 18.2781f, 2.2116f, 17.8857f)
                lineTo(2.2947f, 17.7915f)
                lineTo(8.2893f, 11.795f)
                curveTo(8.6496f, 11.4346f, 9.2164f, 11.4066f, 9.6088f, 11.7112f)
                lineTo(9.703f, 11.7943f)
                lineTo(11.9991f, 14.0864f)
                lineTo(18.584f, 7.5f)
                horizontalLineTo(14.003f)
                curveTo(13.4902f, 7.5f, 13.0675f, 7.114f, 13.0098f, 6.6166f)
                lineTo(13.003f, 6.5f)
                curveTo(13.003f, 5.9872f, 13.3891f, 5.5645f, 13.8864f, 5.5067f)
                lineTo(14.003f, 5.5f)
                horizontalLineTo(20.9998f)
                horizontalLineTo(14.003f)
                close()
            }
        }
        .build()
        return _arrowTrending!!
    }

private var _arrowTrending: ImageVector? = null
