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

public val MaterialDesignIcons.AxisXArrowLock: ImageVector
    get() {
        if (_axisXArrowLock != null) {
            return _axisXArrowLock!!
        }
        _axisXArrowLock = Builder(name = "AxisXArrowLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8f, 5.0f)
                curveTo(22.4f, 5.0f, 23.0f, 5.6f, 23.0f, 6.3f)
                verticalLineTo(9.8f)
                curveTo(23.0f, 10.4f, 22.4f, 11.0f, 21.7f, 11.0f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 11.0f, 15.0f, 10.4f, 15.0f, 9.7f)
                verticalLineTo(6.2f)
                curveTo(15.0f, 5.6f, 15.6f, 5.0f, 16.2f, 5.0f)
                verticalLineTo(3.5f)
                curveTo(16.2f, 2.1f, 17.6f, 1.0f, 19.0f, 1.0f)
                curveTo(20.4f, 1.0f, 21.8f, 2.1f, 21.8f, 3.5f)
                verticalLineTo(5.0f)
                moveTo(20.5f, 5.0f)
                verticalLineTo(3.5f)
                curveTo(20.5f, 2.7f, 19.8f, 2.2f, 19.0f, 2.2f)
                curveTo(18.31f, 2.2f, 17.69f, 2.58f, 17.54f, 3.2f)
                curveTo(17.5f, 3.29f, 17.5f, 3.39f, 17.5f, 3.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.5f)
                moveTo(1.74f, 19.25f)
                lineTo(3.21f, 13.79f)
                lineTo(4.67f, 16.32f)
                lineTo(9.0f, 13.82f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.82f)
                lineTo(20.39f, 19.25f)
                lineTo(19.39f, 21.0f)
                lineTo(10.0f, 15.56f)
                lineTo(5.67f, 18.06f)
                lineTo(7.21f, 20.71f)
                lineTo(1.74f, 19.25f)
                close()
            }
        }
        .build()
        return _axisXArrowLock!!
    }

private var _axisXArrowLock: ImageVector? = null
