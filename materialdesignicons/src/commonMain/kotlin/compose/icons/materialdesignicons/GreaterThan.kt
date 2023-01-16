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

public val MaterialDesignIcons.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) {
            return _greaterThan!!
        }
        _greaterThan = Builder(name = "GreaterThan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 4.14f)
                lineTo(4.5f, 5.86f)
                lineTo(15.0f, 12.0f)
                lineTo(4.5f, 18.14f)
                lineTo(5.5f, 19.86f)
                lineTo(19.0f, 12.0f)
                lineTo(5.5f, 4.14f)
                close()
            }
        }
        .build()
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
