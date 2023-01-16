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

public val MaterialDesignIcons.MicrophoneVariantOff: ImageVector
    get() {
        if (_microphoneVariantOff != null) {
            return _microphoneVariantOff!!
        }
        _microphoneVariantOff = Builder(name = "MicrophoneVariantOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(16.0f, 19.26f)
                curveTo(15.86f, 21.35f, 14.12f, 23.0f, 12.0f, 23.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                lineTo(6.16f, 9.82f)
                curveTo(5.82f, 9.47f, 5.53f, 9.06f, 5.33f, 8.6f)
                lineTo(2.0f, 5.27f)
                moveTo(9.0f, 3.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 13.0f, 7.0f)
                horizontalLineTo(8.82f)
                lineTo(6.08f, 4.26f)
                curveTo(6.81f, 3.5f, 7.85f, 3.0f, 9.0f, 3.0f)
                moveTo(11.84f, 9.82f)
                lineTo(11.82f, 10.0f)
                lineTo(9.82f, 8.0f)
                horizontalLineTo(12.87f)
                curveTo(12.69f, 8.7f, 12.33f, 9.32f, 11.84f, 9.82f)
                moveTo(11.0f, 18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 19.0f)
                verticalLineTo(17.27f)
                lineTo(11.35f, 14.62f)
                lineTo(11.0f, 18.0f)
                moveTo(18.0f, 10.0f)
                horizontalLineTo(20.0f)
                lineTo(19.0f, 11.0f)
                lineTo(20.0f, 12.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 14.0f)
                verticalLineTo(14.18f)
                lineTo(14.3f, 12.5f)
                curveTo(14.9f, 11.0f, 16.33f, 10.0f, 18.0f, 10.0f)
                moveTo(8.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 13.0f)
                curveTo(9.21f, 13.0f, 9.4f, 12.94f, 9.56f, 12.83f)
                lineTo(8.17f, 11.44f)
                curveTo(8.06f, 11.6f, 8.0f, 11.79f, 8.0f, 12.0f)
                close()
            }
        }
        .build()
        return _microphoneVariantOff!!
    }

private var _microphoneVariantOff: ImageVector? = null
