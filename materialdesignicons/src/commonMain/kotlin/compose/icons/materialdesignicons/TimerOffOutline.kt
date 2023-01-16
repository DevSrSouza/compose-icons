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

public val MaterialDesignIcons.TimerOffOutline: ImageVector
    get() {
        if (_timerOffOutline != null) {
            return _timerOffOutline!!
        }
        _timerOffOutline = Builder(name = "TimerOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 13.0f)
                curveTo(5.0f, 11.72f, 5.35f, 10.5f, 5.95f, 9.5f)
                lineTo(15.5f, 19.04f)
                curveTo(14.5f, 19.65f, 13.28f, 20.0f, 12.0f, 20.0f)
                moveTo(3.0f, 4.0f)
                lineTo(1.75f, 5.27f)
                lineTo(4.5f, 8.03f)
                curveTo(3.55f, 9.45f, 3.0f, 11.16f, 3.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 22.0f)
                curveTo(13.84f, 22.0f, 15.55f, 21.45f, 17.0f, 20.5f)
                lineTo(19.5f, 23.0f)
                lineTo(20.75f, 21.73f)
                lineTo(13.04f, 14.0f)
                lineTo(3.0f, 4.0f)
                moveTo(11.0f, 9.44f)
                lineTo(13.0f, 11.44f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                moveTo(15.0f, 1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                moveTo(19.04f, 4.55f)
                lineTo(17.62f, 5.97f)
                curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f)
                curveTo(10.17f, 4.0f, 8.47f, 4.55f, 7.05f, 5.5f)
                lineTo(8.5f, 6.94f)
                curveTo(9.53f, 6.35f, 10.73f, 6.0f, 12.0f, 6.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 13.0f)
                curveTo(19.0f, 14.27f, 18.65f, 15.47f, 18.06f, 16.5f)
                lineTo(19.5f, 17.94f)
                curveTo(20.45f, 16.53f, 21.0f, 14.83f, 21.0f, 13.0f)
                curveTo(21.0f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f)
                lineTo(20.45f, 5.97f)
                lineTo(19.04f, 4.55f)
                close()
            }
        }
        .build()
        return _timerOffOutline!!
    }

private var _timerOffOutline: ImageVector? = null
