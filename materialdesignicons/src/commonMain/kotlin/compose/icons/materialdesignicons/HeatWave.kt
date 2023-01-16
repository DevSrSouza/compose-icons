package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.HeatWave: ImageVector
    get() {
        if (_heatWave != null) {
            return _heatWave!!
        }
        _heatWave = Builder(name = "HeatWave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 4.5f)
                lineTo(5.4f, 9.5f)
                lineTo(8.5f, 14.7f)
                lineTo(5.2f, 20.5f)
                lineTo(3.4f, 19.6f)
                lineTo(6.1f, 14.7f)
                lineTo(3.0f, 9.5f)
                lineTo(6.7f, 3.6f)
                lineTo(8.5f, 4.5f)
                moveTo(14.7f, 4.4f)
                lineTo(11.6f, 9.5f)
                lineTo(14.7f, 14.5f)
                lineTo(11.4f, 20.3f)
                lineTo(9.6f, 19.4f)
                lineTo(12.3f, 14.5f)
                lineTo(9.2f, 9.5f)
                lineTo(12.9f, 3.5f)
                lineTo(14.7f, 4.4f)
                moveTo(21.0f, 4.4f)
                lineTo(17.9f, 9.5f)
                lineTo(21.0f, 14.5f)
                lineTo(17.7f, 20.3f)
                lineTo(15.9f, 19.4f)
                lineTo(18.6f, 14.5f)
                lineTo(15.5f, 9.5f)
                lineTo(19.2f, 3.5f)
                lineTo(21.0f, 4.4f)
            }
        }
        .build()
        return _heatWave!!
    }

private var _heatWave: ImageVector? = null
