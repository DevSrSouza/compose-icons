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

public val MaterialDesignIcons.RouterNetwork: ImageVector
    get() {
        if (_routerNetwork != null) {
            return _routerNetwork!!
        }
        _routerNetwork = Builder(name = "RouterNetwork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 9.0f)
                curveTo(3.9f, 9.0f, 3.0f, 9.9f, 3.0f, 11.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 16.11f, 3.9f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                curveTo(9.45f, 19.0f, 9.0f, 19.45f, 9.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 22.55f, 9.45f, 23.0f, 10.0f, 23.0f)
                horizontalLineTo(14.0f)
                curveTo(14.55f, 23.0f, 15.0f, 22.55f, 15.0f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 19.45f, 14.55f, 19.0f, 14.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 17.0f, 21.0f, 16.11f, 21.0f, 15.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 9.9f, 20.11f, 9.0f, 19.0f, 9.0f)
                horizontalLineTo(5.0f)
                moveTo(6.0f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                moveTo(9.5f, 12.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(12.0f)
                moveTo(13.0f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _routerNetwork!!
    }

private var _routerNetwork: ImageVector? = null