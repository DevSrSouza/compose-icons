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

public val MaterialDesignIcons.TimerSandEmpty: ImageVector
    get() {
        if (_timerSandEmpty != null) {
            return _timerSandEmpty!!
        }
        _timerSandEmpty = Builder(name = "TimerSandEmpty", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                lineTo(10.0f, 12.0f)
                lineTo(6.0f, 16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                lineTo(14.0f, 12.0f)
                lineTo(18.0f, 8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                moveTo(16.0f, 16.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.5f)
                lineTo(12.0f, 12.5f)
                lineTo(16.0f, 16.5f)
                moveTo(12.0f, 11.5f)
                lineTo(8.0f, 7.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.5f)
                lineTo(12.0f, 11.5f)
                close()
            }
        }
        .build()
        return _timerSandEmpty!!
    }

private var _timerSandEmpty: ImageVector? = null
