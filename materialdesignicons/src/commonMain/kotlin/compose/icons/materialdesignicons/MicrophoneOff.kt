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

public val MaterialDesignIcons.MicrophoneOff: ImageVector
    get() {
        if (_microphoneOff != null) {
            return _microphoneOff!!
        }
        _microphoneOff = Builder(name = "MicrophoneOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                curveTo(19.0f, 12.19f, 18.66f, 13.3f, 18.1f, 14.28f)
                lineTo(16.87f, 13.05f)
                curveTo(17.14f, 12.43f, 17.3f, 11.74f, 17.3f, 11.0f)
                horizontalLineTo(19.0f)
                moveTo(15.0f, 11.16f)
                lineTo(9.0f, 5.18f)
                verticalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 5.0f)
                verticalLineTo(11.0f)
                lineTo(15.0f, 11.16f)
                moveTo(4.27f, 3.0f)
                lineTo(21.0f, 19.73f)
                lineTo(19.73f, 21.0f)
                lineTo(15.54f, 16.81f)
                curveTo(14.77f, 17.27f, 13.91f, 17.58f, 13.0f, 17.72f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.72f)
                curveTo(7.72f, 17.23f, 5.0f, 14.41f, 5.0f, 11.0f)
                horizontalLineTo(6.7f)
                curveTo(6.7f, 14.0f, 9.24f, 16.1f, 12.0f, 16.1f)
                curveTo(12.81f, 16.1f, 13.6f, 15.91f, 14.31f, 15.58f)
                lineTo(12.65f, 13.92f)
                lineTo(12.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 11.0f)
                verticalLineTo(10.28f)
                lineTo(3.0f, 4.27f)
                lineTo(4.27f, 3.0f)
                close()
            }
        }
        .build()
        return _microphoneOff!!
    }

private var _microphoneOff: ImageVector? = null
