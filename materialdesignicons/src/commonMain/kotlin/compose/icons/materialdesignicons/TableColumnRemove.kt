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

public val MaterialDesignIcons.TableColumnRemove: ImageVector
    get() {
        if (_tableColumnRemove != null) {
            return _tableColumnRemove!!
        }
        _tableColumnRemove = Builder(name = "TableColumnRemove", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 22.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 2.0f)
                moveTo(4.0f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                moveTo(17.59f, 12.0f)
                lineTo(15.0f, 9.41f)
                lineTo(16.41f, 8.0f)
                lineTo(19.0f, 10.59f)
                lineTo(21.59f, 8.0f)
                lineTo(23.0f, 9.41f)
                lineTo(20.41f, 12.0f)
                lineTo(23.0f, 14.59f)
                lineTo(21.59f, 16.0f)
                lineTo(19.0f, 13.41f)
                lineTo(16.41f, 16.0f)
                lineTo(15.0f, 14.59f)
                lineTo(17.59f, 12.0f)
                close()
            }
        }
        .build()
        return _tableColumnRemove!!
    }

private var _tableColumnRemove: ImageVector? = null
