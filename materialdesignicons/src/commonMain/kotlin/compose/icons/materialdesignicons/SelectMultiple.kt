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

public val MaterialDesignIcons.SelectMultiple: ImageVector
    get() {
        if (_selectMultiple != null) {
            return _selectMultiple!!
        }
        _selectMultiple = Builder(name = "SelectMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                moveTo(14.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                moveTo(20.0f, 17.0f)
                curveTo(20.0f, 17.55f, 19.55f, 18.0f, 19.0f, 18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                moveTo(7.0f, 4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                curveTo(6.0f, 4.45f, 6.45f, 4.0f, 7.0f, 4.0f)
                moveTo(19.0f, 4.0f)
                curveTo(19.55f, 4.0f, 20.0f, 4.45f, 20.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                moveTo(14.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                moveTo(10.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                moveTo(10.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                moveTo(7.0f, 18.0f)
                curveTo(6.45f, 18.0f, 6.0f, 17.55f, 6.0f, 17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                moveTo(6.0f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                moveTo(6.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                moveTo(20.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                moveTo(3.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                curveTo(16.0f, 21.54f, 15.57f, 22.0f, 15.03f, 22.0f)
                horizontalLineTo(15.0f)
                lineTo(3.0f, 22.0f)
                curveTo(2.45f, 22.0f, 2.0f, 21.55f, 2.0f, 21.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 8.45f, 2.45f, 8.0f, 3.0f, 8.0f)
                close()
            }
        }
        .build()
        return _selectMultiple!!
    }

private var _selectMultiple: ImageVector? = null
