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

public val MaterialDesignIcons.LanDisconnect: ImageVector
    get() {
        if (_lanDisconnect != null) {
            return _lanDisconnect!!
        }
        _lanDisconnect = Builder(name = "LanDisconnect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(3.88f, 13.46f)
                lineTo(2.46f, 14.88f)
                lineTo(4.59f, 17.0f)
                lineTo(2.46f, 19.12f)
                lineTo(3.88f, 20.54f)
                lineTo(6.0f, 18.41f)
                lineTo(8.12f, 20.54f)
                lineTo(9.54f, 19.12f)
                lineTo(7.41f, 17.0f)
                lineTo(9.54f, 14.88f)
                lineTo(8.12f, 13.46f)
                lineTo(6.0f, 15.59f)
                lineTo(3.88f, 13.46f)
                moveTo(14.0f, 15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _lanDisconnect!!
    }

private var _lanDisconnect: ImageVector? = null
