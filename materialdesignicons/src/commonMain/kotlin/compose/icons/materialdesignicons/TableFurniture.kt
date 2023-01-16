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

public val MaterialDesignIcons.TableFurniture: ImageVector
    get() {
        if (_tableFurniture != null) {
            return _tableFurniture!!
        }
        _tableFurniture = Builder(name = "TableFurniture", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                lineTo(21.0f, 19.0f)
                horizontalLineTo(18.5f)
                lineTo(17.94f, 14.0f)
                horizontalLineTo(6.06f)
                lineTo(5.5f, 19.0f)
                horizontalLineTo(3.0f)
                lineTo(4.0f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                moveTo(17.5f, 10.0f)
                horizontalLineTo(6.5f)
                lineTo(6.29f, 12.0f)
                horizontalLineTo(17.71f)
                lineTo(17.5f, 10.0f)
                close()
            }
        }
        .build()
        return _tableFurniture!!
    }

private var _tableFurniture: ImageVector? = null
