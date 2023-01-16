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

public val MaterialDesignIcons.Warehouse: ImageVector
    get() {
        if (_warehouse != null) {
            return _warehouse!!
        }
        _warehouse = Builder(name = "Warehouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                moveTo(12.0f, 3.0f)
                lineTo(2.0f, 8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                lineTo(12.0f, 3.0f)
                moveTo(8.0f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                moveTo(14.0f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                moveTo(20.0f, 11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                moveTo(6.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                moveTo(10.0f, 15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                moveTo(10.0f, 19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                moveTo(14.0f, 19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
