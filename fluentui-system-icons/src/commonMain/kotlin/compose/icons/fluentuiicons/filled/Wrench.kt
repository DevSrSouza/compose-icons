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

public val FilledGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7498f, 2.001f)
                curveTo(13.8503f, 2.001f, 11.4998f, 4.3515f, 11.4998f, 7.251f)
                curveTo(11.4998f, 7.8038f, 11.5855f, 8.3378f, 11.7446f, 8.8396f)
                lineTo(2.6772f, 18.2197f)
                curveTo(1.7174f, 19.2126f, 1.8198f, 20.8161f, 2.8982f, 21.6788f)
                curveTo(3.8426f, 22.4343f, 5.2069f, 22.3472f, 6.0475f, 21.4776f)
                lineTo(15.0103f, 12.2057f)
                curveTo(15.5553f, 12.3971f, 16.141f, 12.501f, 16.7498f, 12.501f)
                curveTo(19.6493f, 12.501f, 21.9998f, 10.1505f, 21.9998f, 7.251f)
                curveTo(21.9998f, 6.7483f, 21.9289f, 6.2609f, 21.7962f, 5.7989f)
                curveTo(21.7229f, 5.5437f, 21.52f, 5.3463f, 21.2629f, 5.2798f)
                curveTo(21.0058f, 5.2134f, 20.7328f, 5.2879f, 20.545f, 5.4757f)
                lineTo(17.361f, 8.6597f)
                lineTo(15.3003f, 6.5991f)
                lineTo(18.4614f, 3.438f)
                curveTo(18.6506f, 3.2488f, 18.7247f, 2.9732f, 18.6558f, 2.7146f)
                curveTo(18.587f, 2.4561f, 18.3857f, 2.2538f, 18.1275f, 2.1838f)
                curveTo(17.6876f, 2.0644f, 17.2255f, 2.001f, 16.7498f, 2.001f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
