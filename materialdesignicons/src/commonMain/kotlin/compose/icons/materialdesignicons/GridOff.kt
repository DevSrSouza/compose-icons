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

public val MaterialDesignIcons.GridOff: ImageVector
    get() {
        if (_gridOff != null) {
            return _gridOff!!
        }
        _gridOff = Builder(name = "GridOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.77f)
                lineTo(1.28f, 1.5f)
                lineTo(22.5f, 22.72f)
                lineTo(21.23f, 24.0f)
                lineTo(19.23f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.92f, 22.0f, 2.0f, 21.1f, 2.0f, 20.0f)
                verticalLineTo(4.77f)
                lineTo(0.0f, 2.77f)
                moveTo(10.0f, 4.0f)
                verticalLineTo(7.68f)
                lineTo(8.0f, 5.68f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.32f)
                lineTo(4.32f, 2.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 4.0f)
                verticalLineTo(19.7f)
                lineTo(20.0f, 17.7f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.32f)
                lineTo(16.32f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.68f)
                lineTo(14.0f, 11.68f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.32f)
                lineTo(10.32f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                moveTo(16.0f, 4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                moveTo(16.0f, 20.0f)
                horizontalLineTo(17.23f)
                lineTo(16.0f, 18.77f)
                verticalLineTo(20.0f)
                moveTo(4.0f, 8.0f)
                horizontalLineTo(5.23f)
                lineTo(4.0f, 6.77f)
                verticalLineTo(8.0f)
                moveTo(10.0f, 14.0f)
                horizontalLineTo(11.23f)
                lineTo(10.0f, 12.77f)
                verticalLineTo(14.0f)
                moveTo(14.0f, 20.0f)
                verticalLineTo(16.77f)
                lineTo(13.23f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                moveTo(8.0f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                moveTo(8.0f, 14.0f)
                verticalLineTo(10.77f)
                lineTo(7.23f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _gridOff!!
    }

private var _gridOff: ImageVector? = null
