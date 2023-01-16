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

public val MaterialDesignIcons.CellphoneMessageOff: ImageVector
    get() {
        if (_cellphoneMessageOff != null) {
            return _cellphoneMessageOff!!
        }
        _cellphoneMessageOff = Builder(name = "CellphoneMessageOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(2.22f, 4.11f)
                curveTo(2.08f, 4.38f, 2.0f, 4.68f, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.1f, 2.89f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(11.0f)
                curveTo(12.1f, 21.0f, 13.0f, 20.1f, 13.0f, 19.0f)
                verticalLineTo(14.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(11.0f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.11f)
                lineTo(11.0f, 12.89f)
                verticalLineTo(17.0f)
                moveTo(23.0f, 4.5f)
                verticalLineTo(7.5f)
                curveTo(23.0f, 8.33f, 22.33f, 9.0f, 21.5f, 9.0f)
                horizontalLineTo(18.0f)
                lineTo(15.1f, 11.9f)
                lineTo(15.0f, 11.8f)
                verticalLineTo(4.5f)
                curveTo(15.0f, 3.67f, 15.67f, 3.0f, 16.5f, 3.0f)
                horizontalLineTo(21.5f)
                curveTo(22.33f, 3.0f, 23.0f, 3.67f, 23.0f, 4.5f)
                moveTo(10.2f, 7.0f)
                lineTo(6.2f, 3.0f)
                horizontalLineTo(11.0f)
                curveTo(12.1f, 3.0f, 13.0f, 3.9f, 13.0f, 5.0f)
                verticalLineTo(9.8f)
                lineTo(11.0f, 7.8f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.2f)
            }
        }
        .build()
        return _cellphoneMessageOff!!
    }

private var _cellphoneMessageOff: ImageVector? = null
