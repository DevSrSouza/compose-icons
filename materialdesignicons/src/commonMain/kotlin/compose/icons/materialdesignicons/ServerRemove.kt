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

public val MaterialDesignIcons.ServerRemove: ImageVector
    get() {
        if (_serverRemove != null) {
            return _serverRemove!!
        }
        _serverRemove = Builder(name = "ServerRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 10.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 9.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 4.0f)
                moveTo(9.0f, 8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                moveTo(5.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                moveTo(10.59f, 17.0f)
                lineTo(8.0f, 14.41f)
                lineTo(9.41f, 13.0f)
                lineTo(12.0f, 15.59f)
                lineTo(14.59f, 13.0f)
                lineTo(16.0f, 14.41f)
                lineTo(13.41f, 17.0f)
                lineTo(16.0f, 19.59f)
                lineTo(14.59f, 21.0f)
                lineTo(12.0f, 18.41f)
                lineTo(9.41f, 21.0f)
                lineTo(8.0f, 19.59f)
                lineTo(10.59f, 17.0f)
                close()
            }
        }
        .build()
        return _serverRemove!!
    }

private var _serverRemove: ImageVector? = null
