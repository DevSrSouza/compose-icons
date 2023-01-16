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

public val MaterialDesignIcons.SwapVerticalCircle: ImageVector
    get() {
        if (_swapVerticalCircle != null) {
            return _swapVerticalCircle!!
        }
        _swapVerticalCircle = Builder(name = "SwapVerticalCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(6.5f, 9.0f)
                lineTo(10.0f, 5.5f)
                lineTo(13.5f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.5f)
                moveTo(17.5f, 15.0f)
                lineTo(14.0f, 18.5f)
                lineTo(10.5f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _swapVerticalCircle!!
    }

private var _swapVerticalCircle: ImageVector? = null
