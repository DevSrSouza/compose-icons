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

public val MaterialDesignIcons.ChevronDoubleLeft: ImageVector
    get() {
        if (_chevronDoubleLeft != null) {
            return _chevronDoubleLeft!!
        }
        _chevronDoubleLeft = Builder(name = "ChevronDoubleLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.41f, 7.41f)
                lineTo(17.0f, 6.0f)
                lineTo(11.0f, 12.0f)
                lineTo(17.0f, 18.0f)
                lineTo(18.41f, 16.59f)
                lineTo(13.83f, 12.0f)
                lineTo(18.41f, 7.41f)
                moveTo(12.41f, 7.41f)
                lineTo(11.0f, 6.0f)
                lineTo(5.0f, 12.0f)
                lineTo(11.0f, 18.0f)
                lineTo(12.41f, 16.59f)
                lineTo(7.83f, 12.0f)
                lineTo(12.41f, 7.41f)
                close()
            }
        }
        .build()
        return _chevronDoubleLeft!!
    }

private var _chevronDoubleLeft: ImageVector? = null
