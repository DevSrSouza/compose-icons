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

public val RegularGroup.ArrowReplyDown: ImageVector
    get() {
        if (_arrowReplyDown != null) {
            return _arrowReplyDown!!
        }
        _arrowReplyDown = Builder(name = "ArrowReplyDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2773f, 7.7789f)
                curveTo(9.57f, 7.4858f, 9.5697f, 7.0109f, 9.2766f, 6.7182f)
                curveTo(8.9835f, 6.4255f, 8.5086f, 6.4258f, 8.2159f, 6.7189f)
                lineTo(3.2193f, 11.7224f)
                curveTo(2.9268f, 12.0153f, 2.9269f, 12.4899f, 3.2196f, 12.7826f)
                lineTo(8.2162f, 17.7803f)
                curveTo(8.5091f, 18.0732f, 8.984f, 18.0732f, 9.2769f, 17.7804f)
                curveTo(9.5698f, 17.4875f, 9.5699f, 17.0126f, 9.277f, 16.7197f)
                lineTo(5.557f, 13.0f)
                horizontalLineTo(13.3988f)
                curveTo(14.9936f, 13.0f, 16.2099f, 12.758f, 17.2878f, 12.2355f)
                lineTo(17.5342f, 12.11f)
                curveTo(18.6427f, 11.5171f, 19.5171f, 10.6427f, 20.11f, 9.5342f)
                curveTo(20.7194f, 8.3947f, 21.0f, 7.1163f, 21.0f, 5.3988f)
                curveTo(21.0f, 4.9846f, 20.6642f, 4.6488f, 20.25f, 4.6488f)
                curveTo(19.8358f, 4.6488f, 19.5f, 4.9846f, 19.5f, 5.3988f)
                curveTo(19.5f, 6.8826f, 19.2723f, 7.9198f, 18.7872f, 8.8268f)
                curveTo(18.3342f, 9.6739f, 17.6739f, 10.3342f, 16.8268f, 10.7872f)
                curveTo(15.9895f, 11.235f, 15.0414f, 11.4635f, 13.7334f, 11.4959f)
                lineTo(13.3988f, 11.5f)
                horizontalLineTo(5.562f)
                lineTo(9.2773f, 7.7789f)
                close()
            }
        }
        .build()
        return _arrowReplyDown!!
    }

private var _arrowReplyDown: ImageVector? = null
