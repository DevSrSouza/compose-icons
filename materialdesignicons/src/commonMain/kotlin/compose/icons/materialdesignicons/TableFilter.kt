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

public val MaterialDesignIcons.TableFilter: ImageVector
    get() {
        if (_tableFilter != null) {
            return _tableFilter!!
        }
        _tableFilter = Builder(name = "TableFilter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 21.0f)
                lineTo(18.8f, 22.77f)
                curveTo(19.3f, 23.27f, 20.0f, 22.87f, 20.0f, 22.28f)
                verticalLineTo(18.0f)
                lineTo(22.8f, 14.6f)
                curveTo(23.3f, 13.9f, 22.8f, 13.0f, 22.0f, 13.0f)
                horizontalLineTo(15.0f)
                curveTo(14.2f, 13.0f, 13.7f, 14.0f, 14.2f, 14.6f)
                lineTo(17.0f, 18.0f)
                verticalLineTo(21.0f)
                moveTo(12.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(3.0f)
                curveTo(20.0f, 1.9f, 19.11f, 1.0f, 18.0f, 1.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 1.0f, 2.0f, 1.9f, 2.0f, 3.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 16.11f, 2.9f, 17.0f, 4.0f, 17.0f)
                horizontalLineTo(13.42f)
                lineTo(12.0f, 15.0f)
                verticalLineTo(11.0f)
                moveTo(12.0f, 5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                moveTo(10.0f, 15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                moveTo(10.0f, 9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _tableFilter!!
    }

private var _tableFilter: ImageVector? = null
