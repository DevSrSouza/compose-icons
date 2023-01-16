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

public val MaterialDesignIcons.Lan: ImageVector
    get() {
        if (_lan != null) {
            return _lan!!
        }
        _lan = Builder(name = "Lan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(8.89f, 2.0f, 8.0f, 2.89f, 8.0f, 4.0f)
                verticalLineTo(7.0f)
                curveTo(8.0f, 8.11f, 8.89f, 9.0f, 10.0f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 15.0f, 3.0f, 15.89f, 3.0f, 17.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 21.11f, 3.89f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(10.11f, 22.0f, 11.0f, 21.11f, 11.0f, 20.0f)
                verticalLineTo(17.0f)
                curveTo(11.0f, 15.89f, 10.11f, 15.0f, 9.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                curveTo(13.89f, 15.0f, 13.0f, 15.89f, 13.0f, 17.0f)
                verticalLineTo(20.0f)
                curveTo(13.0f, 21.11f, 13.89f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 22.0f, 21.0f, 21.11f, 21.0f, 20.0f)
                verticalLineTo(17.0f)
                curveTo(21.0f, 15.89f, 20.11f, 15.0f, 19.0f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                curveTo(15.11f, 9.0f, 16.0f, 8.11f, 16.0f, 7.0f)
                verticalLineTo(4.0f)
                curveTo(16.0f, 2.89f, 15.11f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                moveTo(10.0f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                moveTo(5.0f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                moveTo(15.0f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _lan!!
    }

private var _lan: ImageVector? = null
