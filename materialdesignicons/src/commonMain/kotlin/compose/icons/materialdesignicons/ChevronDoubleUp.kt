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

public val MaterialDesignIcons.ChevronDoubleUp: ImageVector
    get() {
        if (_chevronDoubleUp != null) {
            return _chevronDoubleUp!!
        }
        _chevronDoubleUp = Builder(name = "ChevronDoubleUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.41f, 18.41f)
                lineTo(6.0f, 17.0f)
                lineTo(12.0f, 11.0f)
                lineTo(18.0f, 17.0f)
                lineTo(16.59f, 18.41f)
                lineTo(12.0f, 13.83f)
                lineTo(7.41f, 18.41f)
                moveTo(7.41f, 12.41f)
                lineTo(6.0f, 11.0f)
                lineTo(12.0f, 5.0f)
                lineTo(18.0f, 11.0f)
                lineTo(16.59f, 12.41f)
                lineTo(12.0f, 7.83f)
                lineTo(7.41f, 12.41f)
                close()
            }
        }
        .build()
        return _chevronDoubleUp!!
    }

private var _chevronDoubleUp: ImageVector? = null
