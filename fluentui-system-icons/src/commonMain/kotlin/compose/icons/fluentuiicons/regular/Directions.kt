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

public val RegularGroup.Directions: ImageVector
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
                moveTo(10.7628f, 4.0458f)
                lineTo(4.0453f, 10.7633f)
                curveTo(3.3619f, 11.4467f, 3.3619f, 12.5547f, 4.0453f, 13.2382f)
                lineTo(10.7628f, 19.9557f)
                curveTo(11.4462f, 20.6391f, 12.5542f, 20.6391f, 13.2377f, 19.9557f)
                lineTo(19.9552f, 13.2382f)
                curveTo(20.6386f, 12.5547f, 20.6386f, 11.4467f, 19.9552f, 10.7633f)
                lineTo(13.2377f, 4.0458f)
                curveTo(12.5542f, 3.3623f, 11.4462f, 3.3623f, 10.7628f, 4.0458f)
                close()
                moveTo(12.4579f, 7.3052f)
                lineTo(12.5306f, 7.221f)
                curveTo(12.7968f, 6.9548f, 13.2135f, 6.9306f, 13.5071f, 7.1484f)
                lineTo(13.5912f, 7.221f)
                lineTo(15.5912f, 9.2211f)
                curveTo(15.8575f, 9.4873f, 15.8817f, 9.904f, 15.6638f, 10.1976f)
                lineTo(15.5912f, 10.2817f)
                lineTo(13.5912f, 12.2817f)
                curveTo(13.2983f, 12.5746f, 12.8235f, 12.5746f, 12.5306f, 12.2817f)
                curveTo(12.2643f, 12.0154f, 12.2401f, 11.5988f, 12.4579f, 11.3052f)
                lineTo(12.5306f, 11.221f)
                lineTo(13.2497f, 10.5002f)
                lineTo(11.7502f, 10.5007f)
                curveTo(11.103f, 10.5007f, 10.5707f, 10.9926f, 10.5067f, 11.6229f)
                lineTo(10.5002f, 11.7507f)
                verticalLineTo(15.0007f)
                curveTo(10.5002f, 15.4149f, 10.1644f, 15.7507f, 9.7502f, 15.7507f)
                curveTo(9.3705f, 15.7507f, 9.0567f, 15.4686f, 9.0071f, 15.1025f)
                lineTo(9.0002f, 15.0007f)
                verticalLineTo(11.7507f)
                curveTo(9.0002f, 10.2882f, 10.1419f, 9.0923f, 11.5827f, 9.0057f)
                lineTo(11.7502f, 9.0007f)
                lineTo(13.2487f, 9.0002f)
                lineTo(12.5306f, 8.2817f)
                curveTo(12.2643f, 8.0154f, 12.2401f, 7.5988f, 12.4579f, 7.3052f)
                lineTo(12.5306f, 7.221f)
                lineTo(12.4579f, 7.3052f)
                close()
            }
        }
        .build()
        return _directions!!
    }

private var _directions: ImageVector? = null
