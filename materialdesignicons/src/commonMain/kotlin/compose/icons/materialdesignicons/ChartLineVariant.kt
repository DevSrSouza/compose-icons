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

public val MaterialDesignIcons.ChartLineVariant: ImageVector
    get() {
        if (_chartLineVariant != null) {
            return _chartLineVariant!!
        }
        _chartLineVariant = Builder(name = "ChartLineVariant", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 18.5f)
                lineTo(9.5f, 12.5f)
                lineTo(13.5f, 16.5f)
                lineTo(22.0f, 6.92f)
                lineTo(20.59f, 5.5f)
                lineTo(13.5f, 13.5f)
                lineTo(9.5f, 9.5f)
                lineTo(2.0f, 17.0f)
                lineTo(3.5f, 18.5f)
                close()
            }
        }
        .build()
        return _chartLineVariant!!
    }

private var _chartLineVariant: ImageVector? = null
