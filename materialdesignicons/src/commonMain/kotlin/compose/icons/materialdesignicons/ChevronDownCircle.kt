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

public val MaterialDesignIcons.ChevronDownCircle: ImageVector
    get() {
        if (_chevronDownCircle != null) {
            return _chevronDownCircle!!
        }
        _chevronDownCircle = Builder(name = "ChevronDownCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                moveTo(6.0f, 10.0f)
                lineTo(12.0f, 16.0f)
                lineTo(18.0f, 10.0f)
                lineTo(16.6f, 8.6f)
                lineTo(12.0f, 13.2f)
                lineTo(7.4f, 8.6f)
                lineTo(6.0f, 10.0f)
                close()
            }
        }
        .build()
        return _chevronDownCircle!!
    }

private var _chevronDownCircle: ImageVector? = null
