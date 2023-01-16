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

public val MaterialDesignIcons.ServerSecurity: ImageVector
    get() {
        if (_serverSecurity != null) {
            return _serverSecurity!!
        }
        _serverSecurity = Builder(name = "ServerSecurity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 1.0f)
                horizontalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 2.0f)
                verticalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 7.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 6.0f)
                verticalLineTo(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 1.0f)
                moveTo(3.0f, 9.0f)
                horizontalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 10.0f)
                verticalLineTo(10.67f)
                lineTo(17.5f, 9.56f)
                lineTo(11.0f, 12.44f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 14.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 9.0f)
                moveTo(3.0f, 17.0f)
                horizontalLineTo(11.0f)
                curveTo(11.06f, 19.25f, 12.0f, 21.4f, 13.46f, 23.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 22.0f)
                verticalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 17.0f)
                moveTo(8.0f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                moveTo(8.0f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                moveTo(8.0f, 21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                moveTo(4.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                moveTo(17.5f, 12.0f)
                lineTo(22.0f, 14.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 19.78f, 20.08f, 22.37f, 17.5f, 23.0f)
                curveTo(14.92f, 22.37f, 13.0f, 19.78f, 13.0f, 17.0f)
                verticalLineTo(14.0f)
                lineTo(17.5f, 12.0f)
                moveTo(17.5f, 13.94f)
                lineTo(15.0f, 15.06f)
                verticalLineTo(17.72f)
                curveTo(15.0f, 19.26f, 16.07f, 20.7f, 17.5f, 21.06f)
                verticalLineTo(13.94f)
                close()
            }
        }
        .build()
        return _serverSecurity!!
    }

private var _serverSecurity: ImageVector? = null
