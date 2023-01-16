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

public val MaterialDesignIcons.NumericOff: ImageVector
    get() {
        if (_numericOff != null) {
            return _numericOff!!
        }
        _numericOff = Builder(name = "NumericOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(5.1f, 7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.9f)
                lineTo(9.3f, 11.2f)
                curveTo(8.5f, 11.4f, 8.0f, 12.2f, 8.0f, 13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.9f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(10.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.1f)
                lineTo(13.1f, 15.0f)
                horizontalLineTo(10.0f)
                moveTo(14.0f, 10.8f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(12.0f)
                curveTo(13.1f, 7.0f, 14.0f, 7.9f, 14.0f, 9.0f)
                verticalLineTo(10.8f)
                moveTo(20.0f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 7.0f, 22.0f, 7.9f, 22.0f, 9.0f)
                verticalLineTo(10.5f)
                curveTo(22.0f, 11.3f, 21.3f, 12.0f, 20.5f, 12.0f)
                curveTo(21.3f, 12.0f, 22.0f, 12.7f, 22.0f, 13.5f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 16.0f, 21.2f, 16.9f, 20.2f, 17.0f)
                lineTo(18.2f, 15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _numericOff!!
    }

private var _numericOff: ImageVector? = null
