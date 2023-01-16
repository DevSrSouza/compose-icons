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

public val MaterialDesignIcons.TableTennis: ImageVector
    get() {
        if (_tableTennis != null) {
            return _tableTennis!!
        }
        _tableTennis = Builder(name = "TableTennis", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 14.0f)
                curveTo(19.9f, 14.0f, 21.0f, 15.1f, 21.0f, 16.5f)
                curveTo(21.0f, 17.9f, 19.9f, 19.0f, 18.5f, 19.0f)
                curveTo(17.1f, 19.0f, 16.0f, 17.9f, 16.0f, 16.5f)
                curveTo(16.0f, 15.1f, 17.1f, 14.0f, 18.5f, 14.0f)
                moveTo(7.0f, 15.0f)
                curveTo(7.0f, 15.0f, 8.0f, 16.0f, 8.0f, 17.0f)
                verticalLineTo(20.5f)
                curveTo(8.0f, 21.3f, 8.7f, 22.0f, 9.5f, 22.0f)
                curveTo(10.3f, 22.0f, 11.0f, 21.3f, 11.0f, 20.5f)
                verticalLineTo(17.0f)
                curveTo(11.0f, 16.0f, 12.0f, 15.0f, 12.0f, 15.0f)
                horizontalLineTo(7.0f)
                moveTo(8.0f, 14.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 14.0f, 16.0f, 14.0f, 16.0f, 9.0f)
                curveTo(16.0f, 4.0f, 12.0f, 2.0f, 9.5f, 2.0f)
                curveTo(7.0f, 2.0f, 3.0f, 4.0f, 3.0f, 9.0f)
                curveTo(3.0f, 14.0f, 8.0f, 14.0f, 8.0f, 14.0f)
                close()
            }
        }
        .build()
        return _tableTennis!!
    }

private var _tableTennis: ImageVector? = null
