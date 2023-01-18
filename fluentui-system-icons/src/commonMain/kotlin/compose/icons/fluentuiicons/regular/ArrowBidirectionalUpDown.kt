package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowBidirectionalUpDown: ImageVector
    get() {
        if (_arrowBidirectionalUpDown != null) {
            return _arrowBidirectionalUpDown!!
        }
        _arrowBidirectionalUpDown = Builder(name = "ArrowBidirectionalUpDown", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 5.6284f)
                verticalLineTo(18.3716f)
                lineTo(7.7937f, 14.7334f)
                curveTo(7.5085f, 14.4331f, 7.0337f, 14.421f, 6.7334f, 14.7063f)
                curveTo(6.4331f, 14.9915f, 6.421f, 15.4663f, 6.7063f, 15.7666f)
                lineTo(11.4563f, 20.7666f)
                curveTo(11.5978f, 20.9156f, 11.7944f, 21.0f, 12.0f, 21.0f)
                curveTo(12.2056f, 21.0f, 12.4022f, 20.9156f, 12.5438f, 20.7666f)
                lineTo(17.2938f, 15.7666f)
                curveTo(17.579f, 15.4663f, 17.5669f, 14.9915f, 17.2666f, 14.7063f)
                curveTo(16.9663f, 14.421f, 16.4915f, 14.4331f, 16.2063f, 14.7334f)
                lineTo(12.75f, 18.3716f)
                verticalLineTo(5.6284f)
                lineTo(16.2063f, 9.2666f)
                curveTo(16.4915f, 9.5669f, 16.9663f, 9.579f, 17.2666f, 9.2937f)
                curveTo(17.5669f, 9.0085f, 17.579f, 8.5337f, 17.2938f, 8.2334f)
                lineTo(12.5449f, 3.2346f)
                curveTo(12.4082f, 3.0901f, 12.2146f, 3.0f, 12.0f, 3.0f)
                curveTo(11.7854f, 3.0f, 11.5918f, 3.0901f, 11.4551f, 3.2346f)
                lineTo(6.7063f, 8.2334f)
                curveTo(6.421f, 8.5337f, 6.4331f, 9.0085f, 6.7334f, 9.2937f)
                curveTo(7.0337f, 9.579f, 7.5085f, 9.5669f, 7.7937f, 9.2666f)
                lineTo(11.25f, 5.6284f)
                close()
            }
        }
        .build()
        return _arrowBidirectionalUpDown!!
    }

private var _arrowBidirectionalUpDown: ImageVector? = null
