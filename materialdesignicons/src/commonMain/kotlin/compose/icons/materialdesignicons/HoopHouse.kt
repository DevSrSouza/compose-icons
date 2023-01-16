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

public val MaterialDesignIcons.HoopHouse: ImageVector
    get() {
        if (_hoopHouse != null) {
            return _hoopHouse!!
        }
        _hoopHouse = Builder(name = "HoopHouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(6.5f, 5.0f, 2.0f, 9.5f, 2.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 9.5f, 17.5f, 5.0f, 12.0f, 5.0f)
                moveTo(12.0f, 7.0f)
                curveTo(14.53f, 7.0f, 16.78f, 8.17f, 18.25f, 10.0f)
                horizontalLineTo(5.76f)
                curveTo(7.22f, 8.17f, 9.47f, 7.0f, 12.0f, 7.0f)
                moveTo(8.0f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                curveTo(4.0f, 13.94f, 4.21f, 12.93f, 4.58f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                moveTo(14.0f, 19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                moveTo(20.0f, 19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.42f)
                curveTo(19.79f, 12.93f, 20.0f, 13.94f, 20.0f, 15.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _hoopHouse!!
    }

private var _hoopHouse: ImageVector? = null
