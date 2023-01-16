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

public val MaterialDesignIcons.SelectionOff: ImageVector
    get() {
        if (_selectionOff != null) {
            return _selectionOff!!
        }
        _selectionOff = Builder(name = "SelectionOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.5f, 3.77f)
                lineTo(1.78f, 2.5f)
                lineTo(21.5f, 22.22f)
                lineTo(20.23f, 23.5f)
                lineTo(18.73f, 22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.27f)
                lineTo(3.73f, 7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.27f)
                lineTo(0.5f, 3.77f)
                moveTo(4.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.82f)
                lineTo(3.83f, 2.0f)
                horizontalLineTo(4.0f)
                moveTo(22.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 4.0f)
                moveTo(20.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                lineTo(22.0f, 20.17f)
                lineTo(20.0f, 18.18f)
                verticalLineTo(17.0f)
                moveTo(2.0f, 20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                moveTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.0f)
                moveTo(10.0f, 20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                moveTo(20.0f, 10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                moveTo(2.0f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _selectionOff!!
    }

private var _selectionOff: ImageVector? = null
