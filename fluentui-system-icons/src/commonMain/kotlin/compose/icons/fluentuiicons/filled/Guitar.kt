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

public val FilledGroup.Guitar: ImageVector
    get() {
        if (_guitar != null) {
            return _guitar!!
        }
        _guitar = Builder(name = "Guitar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4918f, 3.4307f)
                lineTo(19.6765f, 2.246f)
                curveTo(20.067f, 1.8555f, 20.7002f, 1.8555f, 21.0907f, 2.246f)
                lineTo(21.7978f, 2.9531f)
                curveTo(22.1883f, 3.3437f, 22.1883f, 3.9768f, 21.7978f, 4.3673f)
                lineTo(20.6131f, 5.5521f)
                lineTo(18.4918f, 3.4307f)
                close()
                moveTo(17.4311f, 4.4914f)
                lineTo(13.6106f, 8.3119f)
                lineTo(13.4513f, 8.1526f)
                curveTo(12.1241f, 6.8254f, 9.8866f, 7.1885f, 9.0471f, 8.8674f)
                lineTo(8.6307f, 9.7002f)
                curveTo(8.5081f, 9.9455f, 8.2364f, 10.0784f, 7.9674f, 10.0246f)
                lineTo(7.895f, 10.0102f)
                curveTo(6.1172f, 9.6546f, 4.2933f, 10.3515f, 3.2055f, 11.8019f)
                curveTo(1.4059f, 14.2014f, 1.6445f, 17.559f, 3.7654f, 19.6799f)
                lineTo(4.3639f, 20.2784f)
                curveTo(6.4847f, 22.3993f, 9.8424f, 22.6379f, 12.2419f, 20.8383f)
                curveTo(13.6923f, 19.7505f, 14.3892f, 17.9265f, 14.0336f, 16.1487f)
                lineTo(14.0191f, 16.0764f)
                curveTo(13.9653f, 15.8074f, 14.0982f, 15.5357f, 14.3436f, 15.413f)
                lineTo(15.1764f, 14.9966f)
                curveTo(16.8553f, 14.1572f, 17.2184f, 11.9197f, 15.8911f, 10.5924f)
                lineTo(15.7319f, 10.4332f)
                lineTo(19.5524f, 6.6127f)
                lineTo(17.4311f, 4.4914f)
                close()
                moveTo(9.4393f, 14.5603f)
                curveTo(8.8535f, 13.9745f, 8.8535f, 13.0247f, 9.4393f, 12.4389f)
                curveTo(10.0251f, 11.8531f, 10.9749f, 11.8531f, 11.5607f, 12.4389f)
                curveTo(12.1464f, 13.0247f, 12.1464f, 13.9745f, 11.5607f, 14.5603f)
                curveTo(10.9749f, 15.146f, 10.0251f, 15.146f, 9.4393f, 14.5603f)
                close()
            }
        }
        .build()
        return _guitar!!
    }

private var _guitar: ImageVector? = null
