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

public val RegularGroup.ArrowReplyAll: ImageVector
    get() {
        if (_arrowReplyAll != null) {
            return _arrowReplyAll!!
        }
        _arrowReplyAll = Builder(name = "ArrowReplyAll", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2773f, 16.2211f)
                curveTo(13.57f, 16.5142f, 13.5697f, 16.9891f, 13.2766f, 17.2818f)
                curveTo(12.9835f, 17.5745f, 12.5086f, 17.5742f, 12.2159f, 17.2811f)
                lineTo(7.2193f, 12.2776f)
                curveTo(6.9268f, 11.9847f, 6.9269f, 11.5101f, 7.2196f, 11.2174f)
                lineTo(12.2162f, 6.2197f)
                curveTo(12.5091f, 5.9268f, 12.984f, 5.9268f, 13.2769f, 6.2196f)
                curveTo(13.5698f, 6.5125f, 13.5699f, 6.9873f, 13.277f, 7.2803f)
                lineTo(9.557f, 11.0f)
                horizontalLineTo(13.3988f)
                curveTo(14.9936f, 11.0f, 16.2099f, 11.242f, 17.2878f, 11.7645f)
                lineTo(17.5342f, 11.89f)
                curveTo(18.6427f, 12.4829f, 19.5171f, 13.3573f, 20.11f, 14.4658f)
                curveTo(20.7194f, 15.6053f, 21.0f, 16.8837f, 21.0f, 18.6012f)
                curveTo(21.0f, 19.0154f, 20.6642f, 19.3512f, 20.25f, 19.3512f)
                curveTo(19.8358f, 19.3512f, 19.5f, 19.0154f, 19.5f, 18.6012f)
                curveTo(19.5f, 17.1174f, 19.2723f, 16.0802f, 18.7872f, 15.1732f)
                curveTo(18.3342f, 14.3261f, 17.6739f, 13.6658f, 16.8268f, 13.2128f)
                curveTo(15.9895f, 12.765f, 15.0414f, 12.5365f, 13.7334f, 12.5041f)
                lineTo(13.3988f, 12.5f)
                horizontalLineTo(9.562f)
                lineTo(13.2773f, 16.2211f)
                close()
                moveTo(9.2769f, 6.2196f)
                curveTo(9.5698f, 6.5125f, 9.5699f, 6.9873f, 9.277f, 7.2803f)
                lineTo(4.8102f, 11.748f)
                lineTo(9.2773f, 16.2211f)
                curveTo(9.57f, 16.5142f, 9.5697f, 16.9891f, 9.2766f, 17.2818f)
                curveTo(8.9835f, 17.5745f, 8.5086f, 17.5742f, 8.2159f, 17.2811f)
                lineTo(3.2193f, 12.2776f)
                curveTo(2.9268f, 11.9847f, 2.9269f, 11.5101f, 3.2196f, 11.2174f)
                lineTo(8.2162f, 6.2197f)
                curveTo(8.5091f, 5.9268f, 8.984f, 5.9268f, 9.2769f, 6.2196f)
                close()
            }
        }
        .build()
        return _arrowReplyAll!!
    }

private var _arrowReplyAll: ImageVector? = null
