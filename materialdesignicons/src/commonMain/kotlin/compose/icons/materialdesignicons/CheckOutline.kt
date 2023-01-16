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

public val MaterialDesignIcons.CheckOutline: ImageVector
    get() {
        if (_checkOutline != null) {
            return _checkOutline!!
        }
        _checkOutline = Builder(name = "CheckOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.78f, 2.2f)
                lineTo(24.0f, 6.42f)
                lineTo(8.44f, 22.0f)
                lineTo(0.0f, 13.55f)
                lineTo(4.22f, 9.33f)
                lineTo(8.44f, 13.55f)
                lineTo(19.78f, 2.2f)
                moveTo(19.78f, 5.0f)
                lineTo(8.44f, 16.36f)
                lineTo(4.22f, 12.19f)
                lineTo(2.81f, 13.55f)
                lineTo(8.44f, 19.17f)
                lineTo(21.19f, 6.42f)
                lineTo(19.78f, 5.0f)
                close()
            }
        }
        .build()
        return _checkOutline!!
    }

private var _checkOutline: ImageVector? = null
