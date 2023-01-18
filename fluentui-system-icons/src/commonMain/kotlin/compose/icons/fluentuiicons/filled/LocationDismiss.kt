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

public val FilledGroup.LocationDismiss: ImageVector
    get() {
        if (_locationDismiss != null) {
            return _locationDismiss!!
        }
        _locationDismiss = Builder(name = "LocationDismiss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.843f, 4.5591f)
                curveTo(9.2434f, 1.1587f, 14.7566f, 1.1587f, 18.157f, 4.5591f)
                curveTo(21.4894f, 7.8915f, 21.5561f, 13.253f, 18.357f, 16.6665f)
                lineTo(18.157f, 16.8731f)
                curveTo(17.242f, 17.7881f, 15.7116f, 19.2829f, 13.5642f, 21.3592f)
                curveTo(12.6919f, 22.2025f, 11.3081f, 22.2024f, 10.436f, 21.3589f)
                lineTo(6.5863f, 17.6103f)
                curveTo(6.3021f, 17.3301f, 6.0543f, 17.0844f, 5.843f, 16.8731f)
                curveTo(2.4426f, 13.4727f, 2.4426f, 7.9595f, 5.843f, 4.5591f)
                close()
                moveTo(15.0303f, 7.6858f)
                lineTo(14.9462f, 7.6131f)
                curveTo(14.6852f, 7.4195f, 14.327f, 7.4171f, 14.0636f, 7.606f)
                lineTo(13.9697f, 7.6858f)
                lineTo(12.0f, 9.6551f)
                lineTo(10.0303f, 7.6858f)
                lineTo(9.9462f, 7.6131f)
                curveTo(9.6852f, 7.4195f, 9.327f, 7.4171f, 9.0636f, 7.606f)
                lineTo(8.9697f, 7.6858f)
                lineTo(8.8971f, 7.7699f)
                curveTo(8.7034f, 8.0309f, 8.701f, 8.3891f, 8.8899f, 8.6525f)
                lineTo(8.9697f, 8.7464f)
                lineTo(10.939f, 10.7161f)
                lineTo(8.9697f, 12.6858f)
                lineTo(8.8971f, 12.7699f)
                curveTo(8.7034f, 13.0309f, 8.701f, 13.3891f, 8.8899f, 13.6525f)
                lineTo(8.9697f, 13.7464f)
                lineTo(9.0538f, 13.819f)
                curveTo(9.3148f, 14.0127f, 9.673f, 14.0151f, 9.9364f, 13.8262f)
                lineTo(10.0303f, 13.7464f)
                lineTo(12.0f, 11.7771f)
                lineTo(13.9697f, 13.7464f)
                lineTo(14.0538f, 13.819f)
                curveTo(14.3148f, 14.0127f, 14.673f, 14.0151f, 14.9364f, 13.8262f)
                lineTo(15.0303f, 13.7464f)
                lineTo(15.103f, 13.6623f)
                curveTo(15.2966f, 13.4013f, 15.299f, 13.0431f, 15.1101f, 12.7797f)
                lineTo(15.0303f, 12.6858f)
                lineTo(13.061f, 10.7161f)
                lineTo(15.0303f, 8.7464f)
                lineTo(15.103f, 8.6623f)
                curveTo(15.2966f, 8.4013f, 15.299f, 8.0431f, 15.1101f, 7.7797f)
                lineTo(15.0303f, 7.6858f)
                lineTo(14.9462f, 7.6131f)
                lineTo(15.0303f, 7.6858f)
                close()
            }
        }
        .build()
        return _locationDismiss!!
    }

private var _locationDismiss: ImageVector? = null
