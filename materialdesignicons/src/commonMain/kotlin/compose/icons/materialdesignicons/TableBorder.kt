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

public val MaterialDesignIcons.TableBorder: ImageVector
    get() {
        if (_tableBorder != null) {
            return _tableBorder!!
        }
        _tableBorder = Builder(name = "TableBorder", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                moveTo(15.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                moveTo(11.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                moveTo(7.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                moveTo(4.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                moveTo(19.0f, 4.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineTo(13.0f)
                lineTo(19.0f, 8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.89f, 20.11f, 4.0f, 19.0f, 4.0f)
                moveTo(5.0f, 14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                moveTo(5.0f, 10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                moveTo(21.0f, 10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                moveTo(21.0f, 14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                moveTo(11.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
            }
        }
        .build()
        return _tableBorder!!
    }

private var _tableBorder: ImageVector? = null
