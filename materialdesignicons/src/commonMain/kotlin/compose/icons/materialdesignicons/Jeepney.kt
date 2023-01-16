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

public val MaterialDesignIcons.Jeepney: ImageVector
    get() {
        if (_jeepney != null) {
            return _jeepney!!
        }
        _jeepney = Builder(name = "Jeepney", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 13.93f, 2.5f, 14.71f, 3.5f, 14.93f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.5f, 21.0f)
                horizontalLineTo(5.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.5f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.5f, 21.0f)
                horizontalLineTo(19.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.5f, 20.0f)
                verticalLineTo(14.93f)
                curveTo(21.5f, 14.7f, 22.0f, 13.93f, 22.0f, 13.0f)
                horizontalLineTo(19.0f)
                moveTo(8.0f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 15.0f)
                moveTo(16.0f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 15.0f)
                moveTo(17.5f, 10.5f)
                curveTo(15.92f, 10.18f, 14.03f, 10.0f, 12.0f, 10.0f)
                curveTo(9.97f, 10.0f, 8.0f, 10.18f, 6.5f, 10.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _jeepney!!
    }

private var _jeepney: ImageVector? = null
