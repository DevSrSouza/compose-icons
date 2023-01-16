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

public val MaterialDesignIcons.ChevronDoubleDown: ImageVector
    get() {
        if (_chevronDoubleDown != null) {
            return _chevronDoubleDown!!
        }
        _chevronDoubleDown = Builder(name = "ChevronDoubleDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.59f, 5.59f)
                lineTo(18.0f, 7.0f)
                lineTo(12.0f, 13.0f)
                lineTo(6.0f, 7.0f)
                lineTo(7.41f, 5.59f)
                lineTo(12.0f, 10.17f)
                lineTo(16.59f, 5.59f)
                moveTo(16.59f, 11.59f)
                lineTo(18.0f, 13.0f)
                lineTo(12.0f, 19.0f)
                lineTo(6.0f, 13.0f)
                lineTo(7.41f, 11.59f)
                lineTo(12.0f, 16.17f)
                lineTo(16.59f, 11.59f)
                close()
            }
        }
        .build()
        return _chevronDoubleDown!!
    }

private var _chevronDoubleDown: ImageVector? = null
