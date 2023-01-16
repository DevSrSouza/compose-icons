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

public val MaterialDesignIcons.TableLarge: ImageVector
    get() {
        if (_tableLarge != null) {
            return _tableLarge!!
        }
        _tableLarge = Builder(name = "TableLarge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 5.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 3.0f)
                moveTo(4.0f, 7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                moveTo(10.0f, 7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                moveTo(20.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                moveTo(4.0f, 12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                moveTo(10.0f, 12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                moveTo(10.0f, 20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                moveTo(20.0f, 20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _tableLarge!!
    }

private var _tableLarge: ImageVector? = null
