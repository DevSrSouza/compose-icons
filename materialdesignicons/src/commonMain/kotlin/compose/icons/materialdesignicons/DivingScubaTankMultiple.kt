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

public val MaterialDesignIcons.DivingScubaTankMultiple: ImageVector
    get() {
        if (_divingScubaTankMultiple != null) {
            return _divingScubaTankMultiple!!
        }
        _divingScubaTankMultiple = Builder(name = "DivingScubaTankMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.5f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.0f, 18.5f)
                curveTo(17.0f, 17.47f, 17.62f, 16.59f, 18.5f, 16.21f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.35f)
                curveTo(15.22f, 7.93f, 16.0f, 9.15f, 16.0f, 10.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.5f)
                curveTo(2.0f, 9.15f, 2.78f, 7.93f, 4.0f, 7.35f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 3.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.5f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 3.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.5f, 6.0f)
                verticalLineTo(16.21f)
                curveTo(21.38f, 16.59f, 22.0f, 17.47f, 22.0f, 18.5f)
                moveTo(11.0f, 7.35f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.35f)
                curveTo(8.22f, 7.93f, 9.0f, 9.15f, 9.0f, 10.5f)
                curveTo(9.0f, 9.15f, 9.78f, 7.93f, 11.0f, 7.35f)
                close()
            }
        }
        .build()
        return _divingScubaTankMultiple!!
    }

private var _divingScubaTankMultiple: ImageVector? = null
