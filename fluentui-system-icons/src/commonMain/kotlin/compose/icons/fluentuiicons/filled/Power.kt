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

public val FilledGroup.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2051f, 4.8431f)
                curveTo(8.7059f, 4.6101f, 9.3007f, 4.8271f, 9.5337f, 5.3278f)
                curveTo(9.7668f, 5.8285f, 9.5498f, 6.4233f, 9.0491f, 6.6564f)
                curveTo(6.5995f, 7.7964f, 5.0f, 10.2547f, 5.0f, 13.003f)
                curveTo(5.0f, 16.8671f, 8.1339f, 19.9997f, 12.0f, 19.9997f)
                curveTo(15.8661f, 19.9997f, 19.0f, 16.8671f, 19.0f, 13.003f)
                curveTo(19.0f, 10.2604f, 17.4072f, 7.8063f, 14.9653f, 6.663f)
                curveTo(14.4651f, 6.4289f, 14.2495f, 5.8335f, 14.4836f, 5.3334f)
                curveTo(14.7178f, 4.8332f, 15.3131f, 4.6176f, 15.8133f, 4.8517f)
                curveTo(18.9517f, 6.3211f, 21.0f, 9.4769f, 21.0f, 13.003f)
                curveTo(21.0f, 17.9719f, 16.9705f, 21.9997f, 12.0f, 21.9997f)
                curveTo(7.0295f, 21.9997f, 3.0f, 17.9719f, 3.0f, 13.003f)
                curveTo(3.0f, 9.4696f, 5.0568f, 6.3084f, 8.2051f, 4.8431f)
                close()
                moveTo(12.0f, 1.999f)
                curveTo(12.5128f, 1.999f, 12.9355f, 2.3851f, 12.9933f, 2.8824f)
                lineTo(13.0f, 2.999f)
                verticalLineTo(10.0004f)
                curveTo(13.0f, 10.5527f, 12.5523f, 11.0004f, 12.0f, 11.0004f)
                curveTo(11.4872f, 11.0004f, 11.0645f, 10.6144f, 11.0067f, 10.1171f)
                lineTo(11.0f, 10.0004f)
                verticalLineTo(2.999f)
                curveTo(11.0f, 2.4467f, 11.4477f, 1.999f, 12.0f, 1.999f)
                close()
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
