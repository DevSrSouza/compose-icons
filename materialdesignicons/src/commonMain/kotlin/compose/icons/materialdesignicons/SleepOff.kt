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

public val MaterialDesignIcons.SleepOff: ImageVector
    get() {
        if (_sleepOff != null) {
            return _sleepOff!!
        }
        _sleepOff = Builder(name = "SleepOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(12.73f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                lineTo(9.79f, 13.06f)
                lineTo(2.0f, 5.27f)
                moveTo(23.0f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                lineTo(20.39f, 6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(6.0f)
                lineTo(19.62f, 10.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(12.0f)
                moveTo(9.82f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                lineTo(13.54f, 11.72f)
                lineTo(9.82f, 8.0f)
                moveTo(7.0f, 20.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(18.0f)
                lineTo(4.39f, 14.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                lineTo(3.62f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _sleepOff!!
    }

private var _sleepOff: ImageVector? = null
