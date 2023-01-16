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

public val MaterialDesignIcons.StoreOff: ImageVector
    get() {
        if (_storeOff != null) {
            return _storeOff!!
        }
        _storeOff = Builder(name = "StoreOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2f, 6.0f)
                lineTo(7.2f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.2f)
                moveTo(20.0f, 16.8f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.0f)
                lineTo(20.0f, 7.0f)
                horizontalLineTo(10.2f)
                lineTo(17.2f, 14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.8f)
                lineTo(20.0f, 16.8f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(14.0f, 15.89f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                lineTo(4.0f, 7.0f)
                horizontalLineTo(5.11f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12.0f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _storeOff!!
    }

private var _storeOff: ImageVector? = null
