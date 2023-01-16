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

public val MaterialDesignIcons.SwapHorizontalCircleOutline: ImageVector
    get() {
        if (_swapHorizontalCircleOutline != null) {
            return _swapHorizontalCircleOutline!!
        }
        _swapHorizontalCircleOutline = Builder(name = "SwapHorizontalCircleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 20.0f)
                curveTo(7.59f, 20.0f, 4.0f, 16.41f, 4.0f, 12.0f)
                reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(20.0f, 7.59f, 20.0f, 12.0f)
                reflectiveCurveTo(16.41f, 20.0f, 12.0f, 20.0f)
                moveTo(15.0f, 6.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.5f)
                lineTo(18.5f, 10.0f)
                lineTo(15.0f, 6.5f)
                moveTo(9.0f, 10.5f)
                lineTo(5.5f, 14.0f)
                lineTo(9.0f, 17.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _swapHorizontalCircleOutline!!
    }

private var _swapHorizontalCircleOutline: ImageVector? = null
