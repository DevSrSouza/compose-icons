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

public val MaterialDesignIcons.Multicast: ImageVector
    get() {
        if (_multicast != null) {
            return _multicast!!
        }
        _multicast = Builder(name = "Multicast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                curveTo(10.9f, 4.0f, 10.0f, 4.89f, 10.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                lineTo(20.0f, 5.0f)
                lineTo(17.0f, 2.0f)
                moveTo(17.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.73f)
                curveTo(6.37f, 10.38f, 5.71f, 10.0f, 5.0f, 10.0f)
                curveTo(3.9f, 10.0f, 3.0f, 10.9f, 3.0f, 12.0f)
                reflectiveCurveTo(3.9f, 14.0f, 5.0f, 14.0f)
                curveTo(5.71f, 14.0f, 6.37f, 13.62f, 6.73f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                lineTo(20.0f, 12.0f)
                lineTo(17.0f, 9.0f)
                moveTo(10.0f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(10.0f, 19.11f, 10.9f, 20.0f, 12.0f, 20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                lineTo(20.0f, 19.0f)
                lineTo(17.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _multicast!!
    }

private var _multicast: ImageVector? = null
