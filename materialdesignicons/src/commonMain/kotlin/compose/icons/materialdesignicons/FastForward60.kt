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

public val MaterialDesignIcons.FastForward60: ImageVector
    get() {
        if (_fastForward60 != null) {
            return _fastForward60!!
        }
        _fastForward60 = Builder(name = "FastForward60", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 3.0f)
                curveTo(6.8f, 3.0f, 2.9f, 6.0f, 1.5f, 10.2f)
                lineTo(3.9f, 11.0f)
                curveTo(4.9f, 7.8f, 8.0f, 5.5f, 11.5f, 5.5f)
                curveTo(13.5f, 5.5f, 15.2f, 6.2f, 16.6f, 7.4f)
                lineTo(14.0f, 10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                lineTo(18.4f, 5.6f)
                curveTo(16.5f, 4.0f, 14.1f, 3.0f, 11.5f, 3.0f)
                moveTo(19.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 21.1f, 18.1f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(13.9f, 22.0f, 13.0f, 21.1f, 13.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(13.0f, 12.9f, 13.9f, 12.0f, 15.0f, 12.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 12.0f, 19.0f, 12.9f, 19.0f, 14.0f)
                moveTo(15.0f, 14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                moveTo(7.0f, 12.0f)
                curveTo(5.9f, 12.0f, 5.0f, 12.9f, 5.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(5.0f, 21.1f, 5.9f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(10.1f, 22.0f, 11.0f, 21.1f, 11.0f, 20.0f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 16.9f, 10.1f, 16.0f, 9.0f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _fastForward60!!
    }

private var _fastForward60: ImageVector? = null
