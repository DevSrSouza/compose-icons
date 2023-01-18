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

public val FilledGroup.ShareAndroid: ImageVector
    get() {
        if (_shareAndroid != null) {
            return _shareAndroid!!
        }
        _shareAndroid = Builder(name = "ShareAndroid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0002f, 3.002f)
                curveTo(18.656f, 3.002f, 19.9983f, 4.3442f, 19.9983f, 6.0f)
                curveTo(19.9983f, 7.6558f, 18.656f, 8.9981f, 17.0002f, 8.9981f)
                curveTo(16.158f, 8.9981f, 15.3969f, 8.6509f, 14.8523f, 8.0917f)
                lineTo(9.3952f, 11.2113f)
                curveTo(9.4636f, 11.4626f, 9.5f, 11.7271f, 9.5f, 12.0f)
                curveTo(9.5f, 12.273f, 9.4636f, 12.5374f, 9.3952f, 12.7887f)
                lineTo(14.8531f, 15.9076f)
                curveTo(15.3976f, 15.3489f, 16.1584f, 15.002f, 17.0002f, 15.002f)
                curveTo(18.656f, 15.002f, 19.9983f, 16.3442f, 19.9983f, 18.0f)
                curveTo(19.9983f, 19.6558f, 18.656f, 20.9981f, 17.0002f, 20.9981f)
                curveTo(15.3444f, 20.9981f, 14.0021f, 19.6558f, 14.0021f, 18.0f)
                curveTo(14.0021f, 17.7271f, 14.0386f, 17.4626f, 14.107f, 17.2113f)
                lineTo(8.6498f, 14.0917f)
                curveTo(8.1053f, 14.6508f, 7.3442f, 14.9981f, 6.502f, 14.9981f)
                curveTo(4.8462f, 14.9981f, 3.5039f, 13.6558f, 3.5039f, 12.0f)
                curveTo(3.5039f, 10.3442f, 4.8462f, 9.002f, 6.502f, 9.002f)
                curveTo(7.3438f, 9.002f, 8.1046f, 9.3489f, 8.6491f, 9.9076f)
                lineTo(14.107f, 6.7887f)
                curveTo(14.0386f, 6.5374f, 14.0021f, 6.273f, 14.0021f, 6.0f)
                curveTo(14.0021f, 4.3442f, 15.3444f, 3.002f, 17.0002f, 3.002f)
                close()
            }
        }
        .build()
        return _shareAndroid!!
    }

private var _shareAndroid: ImageVector? = null
