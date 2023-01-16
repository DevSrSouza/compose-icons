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

public val MaterialDesignIcons.LanPending: ImageVector
    get() {
        if (_lanPending != null) {
            return _lanPending!!
        }
        _lanPending = Builder(name = "LanPending", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 1.0f)
                curveTo(2.89f, 1.0f, 2.0f, 1.89f, 2.0f, 3.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 8.11f, 2.89f, 9.0f, 4.0f, 9.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                curveTo(11.11f, 9.0f, 12.0f, 8.11f, 12.0f, 7.0f)
                verticalLineTo(3.0f)
                curveTo(12.0f, 1.89f, 11.11f, 1.0f, 10.0f, 1.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(3.0f)
                moveTo(3.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                moveTo(14.0f, 13.0f)
                curveTo(12.89f, 13.0f, 12.0f, 13.89f, 12.0f, 15.0f)
                verticalLineTo(19.0f)
                curveTo(12.0f, 20.11f, 12.89f, 21.0f, 14.0f, 21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 21.0f, 22.0f, 20.11f, 22.0f, 19.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 13.89f, 21.11f, 13.0f, 20.0f, 13.0f)
                horizontalLineTo(14.0f)
                moveTo(3.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                moveTo(14.0f, 15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                moveTo(3.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                moveTo(6.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                moveTo(9.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _lanPending!!
    }

private var _lanPending: ImageVector? = null
