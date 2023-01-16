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

public val MaterialDesignIcons.BrightnessPercent: ImageVector
    get() {
        if (_brightnessPercent != null) {
            return _brightnessPercent!!
        }
        _brightnessPercent = Builder(name = "BrightnessPercent", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.04f, 8.71f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.34f)
                lineTo(12.0f, 0.69f)
                lineTo(8.71f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.71f)
                lineTo(0.69f, 12.0f)
                lineTo(4.0f, 15.34f)
                verticalLineTo(20.04f)
                horizontalLineTo(8.71f)
                lineTo(12.0f, 23.35f)
                lineTo(15.34f, 20.04f)
                horizontalLineTo(20.04f)
                verticalLineTo(15.34f)
                lineTo(23.35f, 12.0f)
                lineTo(20.04f, 8.71f)
                moveTo(8.83f, 7.05f)
                curveTo(9.81f, 7.05f, 10.6f, 7.84f, 10.6f, 8.83f)
                arcTo(1.77f, 1.77f, 0.0f, false, true, 8.83f, 10.6f)
                curveTo(7.84f, 10.6f, 7.05f, 9.81f, 7.05f, 8.83f)
                curveTo(7.05f, 7.84f, 7.84f, 7.05f, 8.83f, 7.05f)
                moveTo(15.22f, 17.0f)
                curveTo(14.24f, 17.0f, 13.45f, 16.2f, 13.45f, 15.22f)
                arcTo(1.77f, 1.77f, 0.0f, false, true, 15.22f, 13.45f)
                curveTo(16.2f, 13.45f, 17.0f, 14.24f, 17.0f, 15.22f)
                arcTo(1.78f, 1.78f, 0.0f, false, true, 15.22f, 17.0f)
                moveTo(8.5f, 17.03f)
                lineTo(7.0f, 15.53f)
                lineTo(15.53f, 7.0f)
                lineTo(17.03f, 8.5f)
                lineTo(8.5f, 17.03f)
                close()
            }
        }
        .build()
        return _brightnessPercent!!
    }

private var _brightnessPercent: ImageVector? = null
