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

public val FilledGroup.Live: ImageVector
    get() {
        if (_live != null) {
            return _live!!
        }
        _live = Builder(name = "Live", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3427f, 4.9384f)
                curveTo(6.7332f, 5.3289f, 6.7332f, 5.9621f, 6.3427f, 6.3526f)
                curveTo(3.2175f, 9.4778f, 3.2175f, 14.5448f, 6.3427f, 17.67f)
                curveTo(6.7332f, 18.0605f, 6.7332f, 18.6937f, 6.3427f, 19.0842f)
                curveTo(5.9522f, 19.4747f, 5.319f, 19.4747f, 4.9285f, 19.0842f)
                curveTo(1.0222f, 15.1779f, 1.0222f, 8.8447f, 4.9285f, 4.9384f)
                curveTo(5.319f, 4.5479f, 5.9522f, 4.5479f, 6.3427f, 4.9384f)
                close()
                moveTo(19.0742f, 4.9384f)
                curveTo(22.9805f, 8.8447f, 22.9805f, 15.1779f, 19.0742f, 19.0842f)
                curveTo(18.6837f, 19.4747f, 18.0506f, 19.4747f, 17.66f, 19.0842f)
                curveTo(17.2695f, 18.6937f, 17.2695f, 18.0605f, 17.66f, 17.67f)
                curveTo(20.7852f, 14.5448f, 20.7852f, 9.4778f, 17.66f, 6.3526f)
                curveTo(17.2695f, 5.9621f, 17.2695f, 5.3289f, 17.66f, 4.9384f)
                curveTo(18.0506f, 4.5479f, 18.6837f, 4.5479f, 19.0742f, 4.9384f)
                close()
                moveTo(9.3093f, 7.8118f)
                curveTo(9.6999f, 8.2023f, 9.6999f, 8.8355f, 9.3093f, 9.226f)
                curveTo(7.7784f, 10.757f, 7.7784f, 13.2391f, 9.3093f, 14.7701f)
                curveTo(9.6999f, 15.1606f, 9.6999f, 15.7938f, 9.3093f, 16.1843f)
                curveTo(8.9188f, 16.5748f, 8.2856f, 16.5748f, 7.8951f, 16.1843f)
                curveTo(5.5831f, 13.8723f, 5.5831f, 10.1238f, 7.8951f, 7.8118f)
                curveTo(8.2856f, 7.4212f, 8.9188f, 7.4212f, 9.3093f, 7.8118f)
                close()
                moveTo(16.2676f, 7.8118f)
                curveTo(18.5797f, 10.1238f, 18.5797f, 13.8723f, 16.2676f, 16.1843f)
                curveTo(15.8771f, 16.5748f, 15.244f, 16.5748f, 14.8534f, 16.1843f)
                curveTo(14.4629f, 15.7938f, 14.4629f, 15.1606f, 14.8534f, 14.7701f)
                curveTo(16.3844f, 13.2391f, 16.3844f, 10.757f, 14.8534f, 9.226f)
                curveTo(14.4629f, 8.8355f, 14.4629f, 8.2023f, 14.8534f, 7.8118f)
                curveTo(15.244f, 7.4212f, 15.8771f, 7.4212f, 16.2676f, 7.8118f)
                close()
                moveTo(12.0814f, 10.5812f)
                curveTo(12.9098f, 10.5812f, 13.5814f, 11.2528f, 13.5814f, 12.0812f)
                curveTo(13.5814f, 12.9096f, 12.9098f, 13.5812f, 12.0814f, 13.5812f)
                curveTo(11.253f, 13.5812f, 10.5814f, 12.9096f, 10.5814f, 12.0812f)
                curveTo(10.5814f, 11.2528f, 11.253f, 10.5812f, 12.0814f, 10.5812f)
                close()
            }
        }
        .build()
        return _live!!
    }

private var _live: ImageVector? = null
