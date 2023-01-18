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

public val FilledGroup.Call: ImageVector
    get() {
        if (_call != null) {
            return _call!!
        }
        _call = Builder(name = "Call", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7716f, 2.439f)
                lineTo(8.8482f, 2.095f)
                curveTo(9.857f, 1.7726f, 10.9349f, 2.2936f, 11.3669f, 3.3123f)
                lineTo(12.2266f, 5.3397f)
                curveTo(12.6013f, 6.2231f, 12.3934f, 7.262f, 11.7126f, 7.9082f)
                lineTo(9.8183f, 9.7062f)
                curveTo(9.9352f, 10.7816f, 10.2967f, 11.8406f, 10.9029f, 12.8832f)
                curveTo(11.509f, 13.9257f, 12.266f, 14.7905f, 13.1739f, 15.4776f)
                lineTo(15.4491f, 14.7189f)
                curveTo(16.3115f, 14.4313f, 17.2507f, 14.7618f, 17.7797f, 15.539f)
                lineTo(19.0121f, 17.3495f)
                curveTo(19.627f, 18.2529f, 19.5164f, 19.4993f, 18.7534f, 20.2653f)
                lineTo(17.9356f, 21.0862f)
                curveTo(17.1217f, 21.9033f, 15.9592f, 22.1997f, 14.8838f, 21.8643f)
                curveTo(12.3449f, 21.0723f, 10.0106f, 18.7211f, 7.8808f, 14.8107f)
                curveTo(5.748f, 10.8945f, 4.9952f, 7.5719f, 5.6226f, 4.8429f)
                curveTo(5.8866f, 3.6946f, 6.7041f, 2.7801f, 7.7716f, 2.439f)
                close()
            }
        }
        .build()
        return _call!!
    }

private var _call: ImageVector? = null
