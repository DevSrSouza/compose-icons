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

public val MaterialDesignIcons.ServerNetworkOff: ImageVector
    get() {
        if (_serverNetworkOff != null) {
            return _serverNetworkOff!!
        }
        _serverNetworkOff = Builder(name = "ServerNetworkOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 20.0f)
                horizontalLineTo(15.73f)
                lineTo(13.0f, 17.27f)
                verticalLineTo(19.0f)
                moveTo(22.0f, 20.0f)
                verticalLineTo(21.18f)
                lineTo(20.82f, 20.0f)
                horizontalLineTo(22.0f)
                moveTo(21.0f, 22.72f)
                lineTo(19.73f, 24.0f)
                lineTo(17.73f, 22.0f)
                horizontalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 16.0f)
                verticalLineTo(12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 11.0f)
                horizontalLineTo(6.73f)
                lineTo(4.73f, 9.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 8.0f)
                verticalLineTo(7.27f)
                lineTo(1.0f, 5.27f)
                lineTo(2.28f, 4.0f)
                lineTo(21.0f, 22.72f)
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 4.0f)
                verticalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 9.0f)
                horizontalLineTo(9.82f)
                lineTo(7.0f, 6.18f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.82f)
                lineTo(3.84f, 3.0f)
                curveTo(3.89f, 3.0f, 3.94f, 3.0f, 4.0f, 3.0f)
                moveTo(20.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 12.0f)
                verticalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 17.0f)
                horizontalLineTo(17.82f)
                lineTo(11.82f, 11.0f)
                horizontalLineTo(20.0f)
                moveTo(9.0f, 7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                moveTo(9.0f, 15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.27f)
                lineTo(9.0f, 13.27f)
                verticalLineTo(15.0f)
                moveTo(5.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _serverNetworkOff!!
    }

private var _serverNetworkOff: ImageVector? = null
