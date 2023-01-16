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

public val MaterialDesignIcons.TimerSandPaused: ImageVector
    get() {
        if (_timerSandPaused != null) {
            return _timerSandPaused!!
        }
        _timerSandPaused = Builder(name = "TimerSandPaused", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 14.0f)
                lineTo(8.0f, 18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 10.0f)
                lineTo(16.0f, 6.0f)
                moveTo(7.5f, 16.0f)
                lineTo(11.5f, 12.0f)
                lineTo(7.5f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                moveTo(12.5f, 12.0f)
                lineTo(16.5f, 16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.5f)
                moveTo(18.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.2f)
                lineTo(15.2f, 12.0f)
                moveTo(8.8f, 12.0f)
                lineTo(6.8f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _timerSandPaused!!
    }

private var _timerSandPaused: ImageVector? = null
