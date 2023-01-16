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

public val MaterialDesignIcons.TableMultiple: ImageVector
    get() {
        if (_tableMultiple != null) {
            return _tableMultiple!!
        }
        _tableMultiple = Builder(name = "TableMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                horizontalLineTo(21.0f)
                curveTo(22.11f, 2.0f, 23.0f, 2.9f, 23.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(23.0f, 17.11f, 22.11f, 18.0f, 21.0f, 18.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 18.0f, 5.0f, 17.11f, 5.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 2.9f, 5.9f, 2.0f, 7.0f, 2.0f)
                moveTo(7.0f, 6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                moveTo(15.0f, 6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                moveTo(7.0f, 12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                moveTo(15.0f, 12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                moveTo(3.0f, 20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 21.11f, 1.89f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _tableMultiple!!
    }

private var _tableMultiple: ImageVector? = null
