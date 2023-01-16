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

public val MaterialDesignIcons.ServerOff: ImageVector
    get() {
        if (_serverOff != null) {
            return _serverOff!!
        }
        _serverOff = Builder(name = "ServerOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 1.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 2.0f)
                verticalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 7.0f)
                horizontalLineTo(8.82f)
                lineTo(6.82f, 5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.18f)
                lineTo(3.21f, 1.39f)
                curveTo(3.39f, 1.15f, 3.68f, 1.0f, 4.0f, 1.0f)
                moveTo(22.0f, 22.72f)
                lineTo(20.73f, 24.0f)
                lineTo(19.73f, 23.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 22.0f)
                verticalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 17.0f)
                horizontalLineTo(13.73f)
                lineTo(11.73f, 15.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 14.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 9.0f)
                horizontalLineTo(5.73f)
                lineTo(3.68f, 6.95f)
                curveTo(3.38f, 6.85f, 3.15f, 6.62f, 3.05f, 6.32f)
                lineTo(1.0f, 4.27f)
                lineTo(2.28f, 3.0f)
                lineTo(22.0f, 22.72f)
                moveTo(20.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 10.0f)
                verticalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 15.0f)
                horizontalLineTo(16.82f)
                lineTo(10.82f, 9.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 18.0f)
                verticalLineTo(19.18f)
                lineTo(18.82f, 17.0f)
                horizontalLineTo(20.0f)
                moveTo(9.0f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                moveTo(9.0f, 13.0f)
                horizontalLineTo(9.73f)
                lineTo(9.0f, 12.27f)
                verticalLineTo(13.0f)
                moveTo(9.0f, 21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                moveTo(5.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                moveTo(5.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _serverOff!!
    }

private var _serverOff: ImageVector? = null
