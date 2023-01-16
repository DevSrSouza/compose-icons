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

public val MaterialDesignIcons.MicrophoneMessageOff: ImageVector
    get() {
        if (_microphoneMessageOff != null) {
            return _microphoneMessageOff!!
        }
        _microphoneMessageOff = Builder(name = "MicrophoneMessageOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(13.38f, 16.65f)
                curveTo(12.55f, 18.35f, 10.93f, 19.59f, 9.0f, 19.92f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.92f)
                curveTo(4.16f, 19.44f, 2.0f, 16.97f, 2.0f, 14.0f)
                horizontalLineTo(4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 18.0f)
                curveTo(9.82f, 18.0f, 11.36f, 16.78f, 11.84f, 15.11f)
                lineTo(10.0f, 13.27f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 14.0f)
                verticalLineTo(9.27f)
                lineTo(2.0f, 5.27f)
                moveTo(21.41f, 9.41f)
                lineTo(17.17f, 13.66f)
                lineTo(18.18f, 10.0f)
                horizontalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 8.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 2.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 4.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 8.55f, 21.78f, 9.05f, 21.41f, 9.41f)
                close()
            }
        }
        .build()
        return _microphoneMessageOff!!
    }

private var _microphoneMessageOff: ImageVector? = null
