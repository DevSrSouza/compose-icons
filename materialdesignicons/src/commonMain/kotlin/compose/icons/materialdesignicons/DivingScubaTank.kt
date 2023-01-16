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

public val MaterialDesignIcons.DivingScubaTank: ImageVector
    get() {
        if (_divingScubaTank != null) {
            return _divingScubaTank!!
        }
        _divingScubaTank = Builder(name = "DivingScubaTank", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.0f, 18.5f)
                curveTo(14.0f, 17.47f, 14.62f, 16.59f, 15.5f, 16.21f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.35f)
                curveTo(12.22f, 7.93f, 13.0f, 9.15f, 13.0f, 10.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.5f)
                curveTo(6.0f, 9.15f, 6.78f, 7.93f, 8.0f, 7.35f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 3.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.5f, 6.0f)
                verticalLineTo(16.21f)
                curveTo(18.38f, 16.59f, 19.0f, 17.47f, 19.0f, 18.5f)
                close()
            }
        }
        .build()
        return _divingScubaTank!!
    }

private var _divingScubaTank: ImageVector? = null
