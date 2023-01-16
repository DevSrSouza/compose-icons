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

public val MaterialDesignIcons.VibrateOff: ImageVector
    get() {
        if (_vibrateOff != null) {
            return _vibrateOff!!
        }
        _vibrateOff = Builder(name = "VibrateOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2f, 5.0f)
                lineTo(6.55f, 3.35f)
                curveTo(6.81f, 3.12f, 7.15f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 4.5f)
                verticalLineTo(14.8f)
                lineTo(16.0f, 12.8f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.2f)
                moveTo(0.0f, 15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(15.0f)
                moveTo(21.0f, 17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.8f)
                lineTo(20.2f, 17.0f)
                horizontalLineTo(21.0f)
                moveTo(3.0f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                moveTo(18.0f, 17.35f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.0f, 19.85f)
                curveTo(17.83f, 20.54f, 17.21f, 21.0f, 16.5f, 21.0f)
                horizontalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 19.5f)
                verticalLineTo(7.89f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(6.09f, 5.44f)
                lineTo(8.0f, 7.34f)
                lineTo(16.0f, 15.34f)
                lineTo(18.0f, 17.34f)
                verticalLineTo(17.35f)
                moveTo(16.0f, 17.89f)
                lineTo(8.0f, 9.89f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.89f)
                moveTo(22.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _vibrateOff!!
    }

private var _vibrateOff: ImageVector? = null
