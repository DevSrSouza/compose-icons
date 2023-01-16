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

public val MaterialDesignIcons.BrightnessAuto: ImageVector
    get() {
        if (_brightnessAuto != null) {
            return _brightnessAuto!!
        }
        _brightnessAuto = Builder(name = "BrightnessAuto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3f, 16.0f)
                lineTo(13.6f, 14.0f)
                horizontalLineTo(10.4f)
                lineTo(9.7f, 16.0f)
                horizontalLineTo(7.8f)
                lineTo(11.0f, 7.0f)
                horizontalLineTo(13.0f)
                lineTo(16.2f, 16.0f)
                horizontalLineTo(14.3f)
                moveTo(20.0f, 8.69f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.31f)
                lineTo(12.0f, 0.69f)
                lineTo(8.69f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.69f)
                lineTo(0.69f, 12.0f)
                lineTo(4.0f, 15.31f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.69f)
                lineTo(12.0f, 23.31f)
                lineTo(15.31f, 20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.31f)
                lineTo(23.31f, 12.0f)
                lineTo(20.0f, 8.69f)
                moveTo(10.85f, 12.65f)
                horizontalLineTo(13.15f)
                lineTo(12.0f, 9.0f)
                lineTo(10.85f, 12.65f)
                close()
            }
        }
        .build()
        return _brightnessAuto!!
    }

private var _brightnessAuto: ImageVector? = null
