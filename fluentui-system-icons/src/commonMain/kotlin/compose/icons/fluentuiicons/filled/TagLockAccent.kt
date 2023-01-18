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

public val FilledGroup.TagLockAccent: ImageVector
    get() {
        if (_tagLockAccent != null) {
            return _tagLockAccent!!
        }
        _tagLockAccent = Builder(name = "TagLockAccent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7504f, 2.5f)
                curveTo(20.2144f, 2.5005f, 20.6592f, 2.6851f, 20.9873f, 3.0131f)
                curveTo(21.3154f, 3.3412f, 21.4999f, 3.786f, 21.5004f, 4.25f)
                verticalLineTo(9.712f)
                curveTo(21.5021f, 10.0728f, 21.4322f, 10.4304f, 21.2949f, 10.764f)
                curveTo(21.1576f, 11.0977f, 20.9555f, 11.4008f, 20.7004f, 11.656f)
                lineTo(20.366f, 11.9905f)
                curveTo(19.7328f, 11.0891f, 18.6852f, 10.5f, 17.5f, 10.5f)
                curveTo(15.567f, 10.5f, 14.0f, 12.067f, 14.0f, 14.0f)
                verticalLineTo(14.05f)
                curveTo(12.8589f, 14.2817f, 12.0f, 15.2905f, 12.0f, 16.5f)
                verticalLineTo(20.3374f)
                curveTo(11.5101f, 20.7387f, 10.8942f, 20.9607f, 10.2554f, 20.9607f)
                curveTo(9.5261f, 20.9607f, 8.8266f, 20.6713f, 8.3104f, 20.156f)
                lineTo(3.8424f, 15.705f)
                curveTo(3.5871f, 15.4497f, 3.3846f, 15.1467f, 3.2464f, 14.8131f)
                curveTo(3.1082f, 14.4795f, 3.0371f, 14.122f, 3.0371f, 13.761f)
                curveTo(3.0371f, 13.4f, 3.1082f, 13.0425f, 3.2464f, 12.7089f)
                curveTo(3.3846f, 12.3753f, 3.5871f, 12.0723f, 3.8424f, 11.817f)
                lineTo(12.3424f, 3.307f)
                curveTo(12.5967f, 3.0505f, 12.8994f, 2.8471f, 13.233f, 2.7086f)
                curveTo(13.5665f, 2.57f, 13.9243f, 2.4991f, 14.2854f, 2.5f)
                horizontalLineTo(19.7504f)
                close()
            }
        }
        .build()
        return _tagLockAccent!!
    }

private var _tagLockAccent: ImageVector? = null
