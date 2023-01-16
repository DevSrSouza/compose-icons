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

public val MaterialDesignIcons.FastForward45: ImageVector
    get() {
        if (_fastForward45 != null) {
            return _fastForward45!!
        }
        _fastForward45 = Builder(name = "FastForward45", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 3.0f)
                curveTo(14.1f, 3.0f, 16.5f, 4.0f, 18.4f, 5.6f)
                lineTo(21.0f, 3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                lineTo(16.6f, 7.4f)
                curveTo(15.2f, 6.2f, 13.4f, 5.5f, 11.5f, 5.5f)
                curveTo(8.0f, 5.5f, 4.9f, 7.8f, 3.9f, 11.0f)
                lineTo(1.5f, 10.2f)
                curveTo(2.9f, 6.0f, 6.8f, 3.0f, 11.5f, 3.0f)
                moveTo(13.0f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 16.0f, 19.0f, 16.9f, 19.0f, 18.0f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 21.1f, 18.1f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                moveTo(5.0f, 12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _fastForward45!!
    }

private var _fastForward45: ImageVector? = null
