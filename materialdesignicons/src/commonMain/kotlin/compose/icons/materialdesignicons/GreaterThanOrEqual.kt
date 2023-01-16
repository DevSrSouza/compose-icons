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

public val MaterialDesignIcons.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) {
            return _greaterThanOrEqual!!
        }
        _greaterThanOrEqual = Builder(name = "GreaterThanOrEqual", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 2.27f)
                lineTo(20.0f, 10.14f)
                lineTo(6.5f, 18.0f)
                lineTo(5.5f, 16.27f)
                lineTo(16.03f, 10.14f)
                lineTo(5.5f, 4.0f)
                lineTo(6.5f, 2.27f)
                moveTo(20.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
