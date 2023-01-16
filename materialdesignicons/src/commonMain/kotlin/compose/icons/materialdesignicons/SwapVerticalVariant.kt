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

public val MaterialDesignIcons.SwapVerticalVariant: ImageVector
    get() {
        if (_swapVerticalVariant != null) {
            return _swapVerticalVariant!!
        }
        _swapVerticalVariant = Builder(name = "SwapVerticalVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                lineTo(14.0f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 16.0f)
                verticalLineTo(8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 9.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 5.0f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                lineTo(6.0f, 20.0f)
                lineTo(10.0f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 8.0f)
                verticalLineTo(16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 15.0f, 20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 19.0f, 16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                lineTo(18.0f, 4.0f)
                close()
            }
        }
        .build()
        return _swapVerticalVariant!!
    }

private var _swapVerticalVariant: ImageVector? = null
