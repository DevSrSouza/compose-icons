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

public val FilledGroup.LocationOff: ImageVector
    get() {
        if (_locationOff != null) {
            return _locationOff!!
        }
        _locationOff = Builder(name = "LocationOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(4.7859f, 5.8466f)
                curveTo(2.4895f, 9.2342f, 2.8419f, 13.8811f, 5.843f, 16.8823f)
                curveTo(6.1389f, 17.1781f, 6.5061f, 17.5414f, 6.9449f, 17.9723f)
                lineTo(10.436f, 21.3681f)
                curveTo(11.3081f, 22.2116f, 12.6919f, 22.2117f, 13.5642f, 21.3684f)
                curveTo(14.96f, 20.0188f, 16.0952f, 18.9149f, 16.97f, 18.0562f)
                lineTo(16.9827f, 18.0437f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(12.4065f, 13.4673f)
                curveTo(12.2742f, 13.489f, 12.1384f, 13.5002f, 12.0f, 13.5002f)
                curveTo(10.6192f, 13.5002f, 9.4998f, 12.3808f, 9.4998f, 11.0f)
                curveTo(9.4998f, 10.8616f, 9.5111f, 10.7258f, 9.5327f, 10.5935f)
                lineTo(12.4065f, 13.4673f)
                close()
                moveTo(14.5002f, 11.0f)
                curveTo(14.5002f, 11.1017f, 14.4941f, 11.202f, 14.4823f, 11.3005f)
                lineTo(19.0371f, 15.8554f)
                curveTo(21.5265f, 12.4495f, 21.2331f, 7.6444f, 18.157f, 4.5683f)
                curveTo(15.0809f, 1.4922f, 10.2759f, 1.1988f, 6.87f, 3.6881f)
                lineTo(11.6995f, 8.5177f)
                curveTo(11.798f, 8.5059f, 11.8983f, 8.4998f, 12.0f, 8.4998f)
                curveTo(13.3808f, 8.4998f, 14.5002f, 9.6192f, 14.5002f, 11.0f)
                close()
            }
        }
        .build()
        return _locationOff!!
    }

private var _locationOff: ImageVector? = null
