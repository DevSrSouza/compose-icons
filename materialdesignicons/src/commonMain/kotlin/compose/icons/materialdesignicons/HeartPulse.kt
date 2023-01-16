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

public val MaterialDesignIcons.HeartPulse: ImageVector
    get() {
        if (_heartPulse != null) {
            return _heartPulse!!
        }
        _heartPulse = Builder(name = "HeartPulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 4.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 2.0f, 9.5f)
                curveTo(2.0f, 10.0f, 2.09f, 10.5f, 2.22f, 11.0f)
                horizontalLineTo(6.3f)
                lineTo(7.57f, 7.63f)
                curveTo(7.87f, 6.83f, 9.05f, 6.75f, 9.43f, 7.63f)
                lineTo(11.5f, 13.0f)
                lineTo(12.09f, 11.58f)
                curveTo(12.22f, 11.25f, 12.57f, 11.0f, 13.0f, 11.0f)
                horizontalLineTo(21.78f)
                curveTo(21.91f, 10.5f, 22.0f, 10.0f, 22.0f, 9.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 16.5f, 4.0f)
                curveTo(14.64f, 4.0f, 13.0f, 4.93f, 12.0f, 6.34f)
                curveTo(11.0f, 4.93f, 9.36f, 4.0f, 7.5f, 4.0f)
                verticalLineTo(4.0f)
                moveTo(3.0f, 12.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 13.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 14.5f)
                horizontalLineTo(5.44f)
                lineTo(11.0f, 20.0f)
                curveTo(12.0f, 20.9f, 12.0f, 20.9f, 13.0f, 20.0f)
                lineTo(18.56f, 14.5f)
                horizontalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 13.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 12.5f)
                horizontalLineTo(13.4f)
                lineTo(12.47f, 14.8f)
                curveTo(12.07f, 15.81f, 10.92f, 15.67f, 10.55f, 14.83f)
                lineTo(8.5f, 9.5f)
                lineTo(7.54f, 11.83f)
                curveTo(7.39f, 12.21f, 7.05f, 12.5f, 6.6f, 12.5f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _heartPulse!!
    }

private var _heartPulse: ImageVector? = null
