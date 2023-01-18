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

public val FilledGroup.PhoneDismiss: ImageVector
    get() {
        if (_phoneDismiss != null) {
            return _phoneDismiss!!
        }
        _phoneDismiss = Builder(name = "PhoneDismiss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(13.75f, 2.0f)
                curveTo(14.9926f, 2.0f, 16.0f, 3.0074f, 16.0f, 4.25f)
                lineTo(16.0002f, 11.1739f)
                curveTo(13.1334f, 11.851f, 11.0f, 14.4264f, 11.0f, 17.5f)
                curveTo(11.0f, 17.6683f, 11.0064f, 17.8352f, 11.019f, 18.0003f)
                lineTo(8.75f, 18.0f)
                curveTo(8.3358f, 18.0f, 8.0f, 18.3358f, 8.0f, 18.75f)
                curveTo(8.0f, 19.1297f, 8.2822f, 19.4435f, 8.6482f, 19.4932f)
                lineTo(8.75f, 19.5f)
                horizontalLineTo(11.25f)
                lineTo(11.3124f, 19.4965f)
                curveTo(11.6182f, 20.4451f, 12.1362f, 21.2985f, 12.8104f, 22.0008f)
                lineTo(6.25f, 22.0f)
                curveTo(5.0074f, 22.0f, 4.0f, 20.9926f, 4.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4.0f, 3.0074f, 5.0074f, 2.0f, 6.25f, 2.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(15.093f, 14.9663f)
                lineTo(15.0238f, 15.0241f)
                lineTo(14.9659f, 15.0934f)
                curveTo(14.8478f, 15.2639f, 14.8478f, 15.4915f, 14.9659f, 15.662f)
                lineTo(15.0238f, 15.7312f)
                lineTo(16.7934f, 17.5007f)
                lineTo(15.0264f, 19.2675f)
                lineTo(14.9685f, 19.3367f)
                curveTo(14.8504f, 19.5072f, 14.8504f, 19.7348f, 14.9685f, 19.9053f)
                lineTo(15.0264f, 19.9746f)
                lineTo(15.0956f, 20.0325f)
                curveTo(15.2661f, 20.1506f, 15.4937f, 20.1506f, 15.6642f, 20.0325f)
                lineTo(15.7335f, 19.9746f)
                lineTo(17.5004f, 18.2077f)
                lineTo(19.2694f, 19.9768f)
                lineTo(19.3386f, 20.0347f)
                curveTo(19.5092f, 20.1528f, 19.7367f, 20.1528f, 19.9073f, 20.0347f)
                lineTo(19.9765f, 19.9768f)
                lineTo(20.0344f, 19.9076f)
                curveTo(20.1525f, 19.7371f, 20.1525f, 19.5095f, 20.0344f, 19.339f)
                lineTo(19.9765f, 19.2697f)
                lineTo(18.2074f, 17.5007f)
                lineTo(19.9793f, 15.7313f)
                lineTo(20.0371f, 15.662f)
                curveTo(20.1552f, 15.4915f, 20.1552f, 15.2639f, 20.0371f, 15.0934f)
                lineTo(19.9793f, 15.0242f)
                lineTo(19.91f, 14.9663f)
                curveTo(19.7395f, 14.8482f, 19.5119f, 14.8482f, 19.3414f, 14.9663f)
                lineTo(19.2722f, 15.0242f)
                lineTo(17.5004f, 16.7937f)
                lineTo(15.7309f, 15.0241f)
                lineTo(15.6617f, 14.9663f)
                curveTo(15.5155f, 14.865f, 15.3274f, 14.8506f, 15.1693f, 14.9229f)
                lineTo(15.093f, 14.9663f)
                close()
            }
        }
        .build()
        return _phoneDismiss!!
    }

private var _phoneDismiss: ImageVector? = null
