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

public val RegularGroup.DataLine: ImageVector
    get() {
        if (_dataLine != null) {
            return _dataLine!!
        }
        _dataLine = Builder(name = "DataLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.5f)
                curveTo(18.1716f, 4.5f, 17.5f, 5.1716f, 17.5f, 6.0f)
                curveTo(17.5f, 6.8284f, 18.1716f, 7.5f, 19.0f, 7.5f)
                curveTo(19.8284f, 7.5f, 20.5f, 6.8284f, 20.5f, 6.0f)
                curveTo(20.5f, 5.1716f, 19.8284f, 4.5f, 19.0f, 4.5f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(16.0f, 4.3432f, 17.3431f, 3.0f, 19.0f, 3.0f)
                curveTo(20.6569f, 3.0f, 22.0f, 4.3432f, 22.0f, 6.0f)
                curveTo(22.0f, 7.6568f, 20.6569f, 9.0f, 19.0f, 9.0f)
                curveTo(18.8382f, 9.0f, 18.6794f, 8.9872f, 18.5246f, 8.9625f)
                lineTo(16.4865f, 12.3209f)
                curveTo(16.8107f, 12.8001f, 17.0f, 13.3779f, 17.0f, 14.0f)
                curveTo(17.0f, 15.6569f, 15.6569f, 17.0f, 14.0f, 17.0f)
                curveTo(13.0971f, 17.0f, 12.2874f, 16.6012f, 11.7374f, 15.9701f)
                lineTo(7.9958f, 17.8406f)
                curveTo(7.9986f, 17.8934f, 8.0f, 17.9465f, 8.0f, 18.0f)
                curveTo(8.0f, 19.6569f, 6.6568f, 21.0f, 5.0f, 21.0f)
                curveTo(3.3431f, 21.0f, 2.0f, 19.6569f, 2.0f, 18.0f)
                curveTo(2.0f, 16.3431f, 3.3431f, 15.0f, 5.0f, 15.0f)
                curveTo(6.0662f, 15.0f, 7.0024f, 15.5562f, 7.5345f, 16.3942f)
                lineTo(11.066f, 14.6287f)
                curveTo(11.0228f, 14.426f, 11.0f, 14.2156f, 11.0f, 14.0f)
                curveTo(11.0f, 12.3431f, 12.3431f, 11.0f, 14.0f, 11.0f)
                curveTo(14.4823f, 11.0f, 14.938f, 11.1138f, 15.3417f, 11.316f)
                lineTo(17.1395f, 8.3536f)
                curveTo(16.4454f, 7.8041f, 16.0f, 6.9541f, 16.0f, 6.0f)
                close()
                moveTo(14.0f, 12.5f)
                curveTo(13.1716f, 12.5f, 12.5f, 13.1716f, 12.5f, 14.0f)
                curveTo(12.5f, 14.8284f, 13.1716f, 15.5f, 14.0f, 15.5f)
                curveTo(14.8284f, 15.5f, 15.5f, 14.8284f, 15.5f, 14.0f)
                curveTo(15.5f, 13.1716f, 14.8284f, 12.5f, 14.0f, 12.5f)
                close()
                moveTo(5.0f, 16.5f)
                curveTo(4.1716f, 16.5f, 3.5f, 17.1716f, 3.5f, 18.0f)
                curveTo(3.5f, 18.8284f, 4.1716f, 19.5f, 5.0f, 19.5f)
                curveTo(5.8284f, 19.5f, 6.5f, 18.8284f, 6.5f, 18.0f)
                curveTo(6.5f, 17.1716f, 5.8284f, 16.5f, 5.0f, 16.5f)
                close()
            }
        }
        .build()
        return _dataLine!!
    }

private var _dataLine: ImageVector? = null
