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

public val FilledGroup.DataLine: ImageVector
    get() {
        if (_dataLine != null) {
            return _dataLine!!
        }
        _dataLine = Builder(name = "DataLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                curveTo(16.0f, 4.3432f, 17.3431f, 3.0f, 19.0f, 3.0f)
                curveTo(20.6569f, 3.0f, 22.0f, 4.3432f, 22.0f, 6.0f)
                curveTo(22.0f, 7.6568f, 20.6569f, 9.0f, 19.0f, 9.0f)
                curveTo(18.838f, 9.0f, 18.679f, 8.9872f, 18.524f, 8.9625f)
                lineTo(16.4862f, 12.3205f)
                curveTo(16.8105f, 12.7997f, 17.0f, 13.3777f, 17.0f, 14.0f)
                curveTo(17.0f, 15.6569f, 15.6569f, 17.0f, 14.0f, 17.0f)
                curveTo(13.0972f, 17.0f, 12.2875f, 16.6012f, 11.7375f, 15.9701f)
                lineTo(7.9958f, 17.8407f)
                curveTo(7.9986f, 17.8934f, 8.0f, 17.9466f, 8.0f, 18.0f)
                curveTo(8.0f, 19.6569f, 6.6568f, 21.0f, 5.0f, 21.0f)
                curveTo(3.3431f, 21.0f, 2.0f, 19.6569f, 2.0f, 18.0f)
                curveTo(2.0f, 16.3431f, 3.3431f, 15.0f, 5.0f, 15.0f)
                curveTo(6.0662f, 15.0f, 7.0025f, 15.5562f, 7.5346f, 16.3943f)
                lineTo(11.066f, 14.6288f)
                curveTo(11.0228f, 14.4261f, 11.0f, 14.2157f, 11.0f, 14.0f)
                curveTo(11.0f, 12.3431f, 12.3431f, 11.0f, 14.0f, 11.0f)
                curveTo(14.4821f, 11.0f, 14.9376f, 11.1137f, 15.3413f, 11.3158f)
                lineTo(17.1391f, 8.3533f)
                curveTo(16.4452f, 7.8038f, 16.0f, 6.9539f, 16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _dataLine!!
    }

private var _dataLine: ImageVector? = null
