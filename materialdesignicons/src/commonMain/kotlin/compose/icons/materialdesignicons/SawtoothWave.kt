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

public val MaterialDesignIcons.SawtoothWave: ImageVector
    get() {
        if (_sawtoothWave != null) {
            return _sawtoothWave!!
        }
        _sawtoothWave = Builder(name = "SawtoothWave", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 22.0f)
                verticalLineTo(6.83f)
                lineTo(2.0f, 16.0f)
                verticalLineTo(13.17f)
                lineTo(13.0f, 2.0f)
                verticalLineTo(17.17f)
                lineTo(22.0f, 8.0f)
                verticalLineTo(10.83f)
                lineTo(11.0f, 22.0f)
                close()
            }
        }
        .build()
        return _sawtoothWave!!
    }

private var _sawtoothWave: ImageVector? = null
