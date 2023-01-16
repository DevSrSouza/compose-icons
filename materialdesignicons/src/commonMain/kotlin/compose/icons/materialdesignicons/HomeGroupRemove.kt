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

public val MaterialDesignIcons.HomeGroupRemove: ImageVector
    get() {
        if (_homeGroupRemove != null) {
            return _homeGroupRemove!!
        }
        _homeGroupRemove = Builder(name = "HomeGroupRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                horizontalLineTo(1.0f)
                lineTo(5.0f, 2.0f)
                lineTo(9.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                moveTo(13.0f, 10.9f)
                lineTo(14.3f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                lineTo(17.0f, 3.0f)
                lineTo(12.0f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.9f)
                moveTo(13.8f, 22.0f)
                curveTo(13.3f, 21.1f, 13.0f, 20.1f, 13.0f, 19.0f)
                curveTo(13.0f, 17.4f, 13.6f, 15.9f, 14.7f, 14.9f)
                lineTo(9.0f, 10.0f)
                lineTo(2.0f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.8f)
                moveTo(21.1f, 15.5f)
                lineTo(19.0f, 17.6f)
                lineTo(16.9f, 15.5f)
                lineTo(15.5f, 16.9f)
                lineTo(17.6f, 19.0f)
                lineTo(15.5f, 21.1f)
                lineTo(16.9f, 22.5f)
                lineTo(19.0f, 20.4f)
                lineTo(21.1f, 22.5f)
                lineTo(22.5f, 21.1f)
                lineTo(20.4f, 19.0f)
                lineTo(22.5f, 16.9f)
                lineTo(21.1f, 15.5f)
                close()
            }
        }
        .build()
        return _homeGroupRemove!!
    }

private var _homeGroupRemove: ImageVector? = null
