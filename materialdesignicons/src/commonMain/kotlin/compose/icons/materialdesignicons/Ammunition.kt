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

public val MaterialDesignIcons.Ammunition: ImageVector
    get() {
        if (_ammunition != null) {
            return _ammunition!!
        }
        _ammunition = Builder(name = "Ammunition", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                moveTo(13.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                lineTo(10.0f, 11.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.5f)
                lineTo(13.0f, 10.0f)
                moveTo(12.0f, 2.0f)
                curveTo(12.0f, 2.0f, 11.0f, 3.0f, 11.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                curveTo(13.0f, 5.0f, 13.0f, 3.0f, 12.0f, 2.0f)
                moveTo(8.0f, 22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                moveTo(7.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                lineTo(4.0f, 11.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.5f)
                lineTo(7.0f, 10.0f)
                moveTo(6.0f, 2.0f)
                curveTo(6.0f, 2.0f, 5.0f, 3.0f, 5.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                curveTo(7.0f, 5.0f, 7.0f, 3.0f, 6.0f, 2.0f)
                moveTo(20.0f, 22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                moveTo(19.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                lineTo(16.0f, 11.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.5f)
                lineTo(19.0f, 10.0f)
                moveTo(18.0f, 2.0f)
                curveTo(18.0f, 2.0f, 17.0f, 3.0f, 17.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                curveTo(19.0f, 5.0f, 19.0f, 3.0f, 18.0f, 2.0f)
                close()
            }
        }
        .build()
        return _ammunition!!
    }

private var _ammunition: ImageVector? = null
