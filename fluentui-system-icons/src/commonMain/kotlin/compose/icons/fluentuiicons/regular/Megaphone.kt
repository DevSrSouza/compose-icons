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

public val RegularGroup.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9068f, 5.6224f)
                curveTo(21.9686f, 5.8304f, 22.0f, 6.0463f, 22.0f, 6.2633f)
                verticalLineTo(17.7387f)
                curveTo(22.0f, 18.9813f, 20.9926f, 19.9887f, 19.75f, 19.9887f)
                curveTo(19.5329f, 19.9887f, 19.317f, 19.9573f, 19.1089f, 19.8954f)
                lineTo(13.595f, 18.2558f)
                curveTo(12.9378f, 19.6008f, 11.5584f, 20.4994f, 10.0f, 20.4994f)
                curveTo(7.8578f, 20.4994f, 6.1089f, 18.8155f, 6.0049f, 16.6991f)
                lineTo(6.0f, 16.4994f)
                lineTo(5.999f, 15.9987f)
                lineTo(3.6089f, 15.288f)
                curveTo(2.6545f, 15.0043f, 2.0f, 14.127f, 2.0f, 13.1313f)
                verticalLineTo(10.8693f)
                curveTo(2.0f, 9.8736f, 2.6546f, 8.9962f, 3.6091f, 8.7126f)
                lineTo(19.1091f, 4.1065f)
                curveTo(20.3002f, 3.7525f, 21.5528f, 4.4312f, 21.9068f, 5.6224f)
                close()
                moveTo(7.499f, 16.4447f)
                lineTo(7.5f, 16.4994f)
                curveTo(7.5f, 17.8801f, 8.6193f, 18.9994f, 10.0f, 18.9994f)
                curveTo(10.8852f, 18.9994f, 11.6783f, 18.5352f, 12.1238f, 17.82f)
                lineTo(7.499f, 16.4447f)
                close()
                moveTo(19.5364f, 5.5444f)
                lineTo(4.0364f, 10.1504f)
                curveTo(3.7182f, 10.245f, 3.5f, 10.5374f, 3.5f, 10.8693f)
                verticalLineTo(13.1313f)
                curveTo(3.5f, 13.4632f, 3.7181f, 13.7556f, 4.0363f, 13.8502f)
                lineTo(19.5363f, 18.4576f)
                curveTo(19.6057f, 18.4782f, 19.6776f, 18.4887f, 19.75f, 18.4887f)
                curveTo(20.1642f, 18.4887f, 20.5f, 18.1529f, 20.5f, 17.7387f)
                verticalLineTo(6.2633f)
                curveTo(20.5f, 6.1909f, 20.4895f, 6.119f, 20.4689f, 6.0496f)
                curveTo(20.3509f, 5.6526f, 19.9334f, 5.4264f, 19.5364f, 5.5444f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
