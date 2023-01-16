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

public val MaterialDesignIcons.Hexagram: ImageVector
    get() {
        if (_hexagram != null) {
            return _hexagram!!
        }
        _hexagram = Builder(name = "Hexagram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 7.66f)
                lineTo(20.64f, 6.97f)
                lineTo(17.0f, 12.0f)
                lineTo(20.68f, 16.97f)
                lineTo(14.5f, 16.32f)
                lineTo(12.03f, 22.0f)
                lineTo(9.5f, 16.34f)
                lineTo(3.36f, 17.03f)
                lineTo(7.0f, 12.0f)
                lineTo(3.32f, 7.03f)
                lineTo(9.5f, 7.68f)
                lineTo(11.97f, 2.0f)
                lineTo(14.5f, 7.66f)
                close()
            }
        }
        .build()
        return _hexagram!!
    }

private var _hexagram: ImageVector? = null
