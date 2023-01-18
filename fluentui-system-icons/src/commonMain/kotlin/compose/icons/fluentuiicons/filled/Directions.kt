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

public val FilledGroup.Directions: ImageVector
    get() {
        if (_directions != null) {
            return _directions!!
        }
        _directions = Builder(name = "Directions", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.2983f, 2.9851f)
                lineTo(21.0158f, 9.7026f)
                curveTo(22.285f, 10.9718f, 22.285f, 13.0296f, 21.0158f, 14.2988f)
                lineTo(14.2983f, 21.0163f)
                curveTo(13.0291f, 22.2855f, 10.9713f, 22.2855f, 9.7021f, 21.0163f)
                lineTo(2.9846f, 14.2988f)
                curveTo(1.7154f, 13.0296f, 1.7154f, 10.9718f, 2.9846f, 9.7026f)
                lineTo(9.7021f, 2.9851f)
                curveTo(10.9713f, 1.7159f, 13.0291f, 1.7159f, 14.2983f, 2.9851f)
                close()
                moveTo(13.5912f, 7.221f)
                lineTo(13.5071f, 7.1484f)
                curveTo(13.2461f, 6.9548f, 12.8879f, 6.9524f, 12.6245f, 7.1413f)
                lineTo(12.5306f, 7.221f)
                lineTo(12.4579f, 7.3052f)
                curveTo(12.2643f, 7.5662f, 12.2619f, 7.9244f, 12.4508f, 8.1878f)
                lineTo(12.5306f, 8.2817f)
                lineTo(13.2492f, 9.0004f)
                lineTo(11.7502f, 9.0007f)
                lineTo(11.5827f, 9.0057f)
                curveTo(10.1996f, 9.0889f, 9.092f, 10.1943f, 9.0057f, 11.5765f)
                lineTo(9.0002f, 11.7507f)
                verticalLineTo(15.0007f)
                lineTo(9.0071f, 15.1025f)
                curveTo(9.0567f, 15.4686f, 9.3705f, 15.7507f, 9.7502f, 15.7507f)
                curveTo(10.1299f, 15.7507f, 10.4437f, 15.4686f, 10.4934f, 15.1025f)
                lineTo(10.5002f, 15.0007f)
                verticalLineTo(11.7507f)
                lineTo(10.5067f, 11.6229f)
                curveTo(10.5664f, 11.0346f, 11.0341f, 10.5669f, 11.6224f, 10.5072f)
                lineTo(11.7502f, 10.5007f)
                lineTo(13.2502f, 10.5004f)
                lineTo(12.5306f, 11.221f)
                lineTo(12.4579f, 11.3052f)
                curveTo(12.2401f, 11.5988f, 12.2643f, 12.0154f, 12.5306f, 12.2817f)
                curveTo(12.7968f, 12.548f, 13.2135f, 12.5722f, 13.5071f, 12.3543f)
                lineTo(13.5912f, 12.2817f)
                lineTo(15.5912f, 10.2817f)
                lineTo(15.6638f, 10.1976f)
                curveTo(15.8575f, 9.9366f, 15.8599f, 9.5784f, 15.671f, 9.315f)
                lineTo(15.5912f, 9.2211f)
                lineTo(13.5912f, 7.221f)
                lineTo(13.5071f, 7.1484f)
                lineTo(13.5912f, 7.221f)
                close()
            }
        }
        .build()
        return _directions!!
    }

private var _directions: ImageVector? = null
