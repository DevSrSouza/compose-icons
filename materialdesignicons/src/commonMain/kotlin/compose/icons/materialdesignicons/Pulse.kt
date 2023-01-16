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

public val MaterialDesignIcons.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = Builder(name = "Pulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                horizontalLineTo(5.79f)
                lineTo(10.1f, 4.79f)
                lineTo(11.28f, 13.75f)
                lineTo(14.5f, 9.66f)
                lineTo(17.83f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                lineTo(14.67f, 12.67f)
                lineTo(9.92f, 18.73f)
                lineTo(8.94f, 11.31f)
                lineTo(7.0f, 15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _pulse!!
    }

private var _pulse: ImageVector? = null
