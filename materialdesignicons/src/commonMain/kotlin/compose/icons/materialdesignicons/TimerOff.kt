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

public val MaterialDesignIcons.TimerOff: ImageVector
    get() {
        if (_timerOff != null) {
            return _timerOff!!
        }
        _timerOff = Builder(name = "TimerOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                lineTo(1.75f, 5.27f)
                lineTo(4.5f, 8.03f)
                curveTo(3.55f, 9.45f, 3.0f, 11.16f, 3.0f, 13.0f)
                curveTo(3.0f, 17.97f, 7.03f, 22.0f, 12.0f, 22.0f)
                curveTo(13.84f, 22.0f, 15.55f, 21.45f, 17.0f, 20.5f)
                lineTo(19.5f, 23.0f)
                lineTo(20.75f, 21.73f)
                lineTo(13.04f, 14.0f)
                lineTo(3.0f, 4.0f)
                moveTo(15.0f, 1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                moveTo(21.0f, 13.0f)
                curveTo(21.0f, 14.83f, 20.45f, 16.53f, 19.5f, 17.94f)
                lineTo(13.0f, 11.45f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.45f)
                lineTo(7.05f, 5.5f)
                curveTo(8.47f, 4.55f, 10.17f, 4.0f, 12.0f, 4.0f)
                curveTo(14.12f, 4.0f, 16.07f, 4.74f, 17.62f, 5.97f)
                lineTo(19.04f, 4.55f)
                lineTo(20.45f, 5.97f)
                lineTo(19.03f, 7.39f)
                curveTo(20.26f, 8.93f, 21.0f, 10.88f, 21.0f, 13.0f)
                close()
            }
        }
        .build()
        return _timerOff!!
    }

private var _timerOff: ImageVector? = null
