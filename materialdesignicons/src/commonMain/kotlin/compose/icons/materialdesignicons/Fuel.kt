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

public val MaterialDesignIcons.Fuel: ImageVector
    get() {
        if (_fuel != null) {
            return _fuel!!
        }
        _fuel = Builder(name = "Fuel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(6.28f, 2.0f, 6.53f, 2.11f, 6.71f, 2.29f)
                lineTo(8.79f, 4.38f)
                lineTo(9.59f, 3.59f)
                curveTo(10.0f, 3.2f, 10.5f, 3.0f, 11.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5f, 3.0f, 18.0f, 3.2f, 18.41f, 3.59f)
                lineTo(19.41f, 4.59f)
                curveTo(19.8f, 5.0f, 20.0f, 5.5f, 20.0f, 6.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 21.0f)
                horizontalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 19.0f)
                verticalLineTo(13.0f)
                lineTo(6.0f, 12.0f)
                verticalLineTo(8.0f)
                curveTo(6.0f, 7.5f, 6.2f, 7.0f, 6.59f, 6.59f)
                lineTo(7.38f, 5.79f)
                lineTo(5.59f, 4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(2.0f)
                moveTo(11.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                moveTo(11.41f, 11.0f)
                lineTo(9.41f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.41f)
                lineTo(10.0f, 12.41f)
                verticalLineTo(15.59f)
                lineTo(8.0f, 17.59f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.41f)
                lineTo(11.41f, 17.0f)
                horizontalLineTo(14.59f)
                lineTo(16.59f, 19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.59f)
                lineTo(16.0f, 15.59f)
                verticalLineTo(12.41f)
                lineTo(18.0f, 10.41f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.59f)
                lineTo(14.59f, 11.0f)
                horizontalLineTo(11.41f)
                moveTo(12.0f, 13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _fuel!!
    }

private var _fuel: ImageVector? = null
