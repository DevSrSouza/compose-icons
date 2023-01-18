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

public val FilledGroup.ArrowSync: ImageVector
    get() {
        if (_arrowSync != null) {
            return _arrowSync!!
        }
        _arrowSync = Builder(name = "ArrowSync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0518f, 5.0285f)
                curveTo(15.7169f, 5.4676f, 15.8014f, 6.0951f, 16.2405f, 6.4301f)
                curveTo(17.9675f, 7.7471f, 19.0f, 9.787f, 19.0f, 12.0f)
                curveTo(19.0f, 15.4973f, 16.4352f, 18.3956f, 13.084f, 18.9166f)
                lineTo(13.7929f, 18.2071f)
                curveTo(14.1834f, 17.8166f, 14.1834f, 17.1834f, 13.7929f, 16.7929f)
                curveTo(13.4024f, 16.4024f, 12.7692f, 16.4024f, 12.3787f, 16.7929f)
                lineTo(9.8787f, 19.2929f)
                curveTo(9.4882f, 19.6834f, 9.4882f, 20.3166f, 9.8787f, 20.7071f)
                lineTo(12.3787f, 23.2071f)
                curveTo(12.7692f, 23.5976f, 13.4024f, 23.5976f, 13.7929f, 23.2071f)
                curveTo(14.1834f, 22.8166f, 14.1834f, 22.1834f, 13.7929f, 21.7929f)
                lineTo(12.9497f, 20.9505f)
                curveTo(17.4739f, 20.476f, 21.0f, 16.6498f, 21.0f, 12.0f)
                curveTo(21.0f, 9.1564f, 19.6712f, 6.5312f, 17.4533f, 4.8398f)
                curveTo(17.0142f, 4.5049f, 16.3867f, 4.5894f, 16.0518f, 5.0285f)
                close()
                moveTo(14.1213f, 3.2929f)
                lineTo(11.6213f, 0.7929f)
                curveTo(11.2308f, 0.4024f, 10.5976f, 0.4024f, 10.2071f, 0.7929f)
                curveTo(9.8466f, 1.1534f, 9.8189f, 1.7206f, 10.1239f, 2.1129f)
                lineTo(10.2071f, 2.2071f)
                lineTo(11.0503f, 3.0495f)
                curveTo(6.5262f, 3.524f, 3.0f, 7.3502f, 3.0f, 12.0f)
                curveTo(3.0f, 14.7198f, 4.2151f, 17.2432f, 6.2716f, 18.9419f)
                curveTo(6.6974f, 19.2936f, 7.3277f, 19.2335f, 7.6794f, 18.8077f)
                curveTo(8.0312f, 18.3819f, 7.9711f, 17.7516f, 7.5453f, 17.3999f)
                curveTo(5.944f, 16.0772f, 5.0f, 14.1168f, 5.0f, 12.0f)
                curveTo(5.0f, 8.5027f, 7.5648f, 5.6044f, 10.916f, 5.0834f)
                lineTo(10.2071f, 5.7929f)
                curveTo(9.8166f, 6.1834f, 9.8166f, 6.8166f, 10.2071f, 7.2071f)
                curveTo(10.5676f, 7.5676f, 11.1348f, 7.5953f, 11.5271f, 7.2903f)
                lineTo(11.6213f, 7.2071f)
                lineTo(14.1213f, 4.7071f)
                curveTo(14.4818f, 4.3466f, 14.5095f, 3.7794f, 14.2045f, 3.3871f)
                lineTo(14.1213f, 3.2929f)
                close()
            }
        }
        .build()
        return _arrowSync!!
    }

private var _arrowSync: ImageVector? = null
