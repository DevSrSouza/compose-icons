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

public val MaterialDesignIcons.RadioactiveOff: ImageVector
    get() {
        if (_radioactiveOff != null) {
            return _radioactiveOff!!
        }
        _radioactiveOff = Builder(name = "RadioactiveOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 4.27f)
                lineTo(2.28f, 3.0f)
                lineTo(21.0f, 21.72f)
                lineTo(19.73f, 23.0f)
                lineTo(17.25f, 20.5f)
                curveTo(15.72f, 21.46f, 13.92f, 22.0f, 12.0f, 22.0f)
                curveTo(10.05f, 22.0f, 8.22f, 21.44f, 6.69f, 20.47f)
                lineTo(10.0f, 15.47f)
                curveTo(10.6f, 15.81f, 11.28f, 16.0f, 12.0f, 16.0f)
                curveTo(12.23f, 16.0f, 12.46f, 16.0f, 12.67f, 15.94f)
                lineTo(8.06f, 11.33f)
                curveTo(8.0f, 11.54f, 8.0f, 11.77f, 8.0f, 12.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 10.08f, 2.54f, 8.28f, 3.5f, 6.75f)
                lineTo(1.0f, 4.27f)
                moveTo(12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 12.0f)
                verticalLineTo(12.17f)
                lineTo(11.83f, 10.0f)
                horizontalLineTo(12.0f)
                moveTo(8.11f, 2.78f)
                lineTo(10.23f, 8.41f)
                lineTo(5.9f, 4.08f)
                curveTo(6.57f, 3.56f, 7.32f, 3.12f, 8.11f, 2.78f)
                moveTo(16.0f, 12.0f)
                curveTo(16.0f, 10.38f, 15.04f, 9.0f, 13.66f, 8.36f)
                lineTo(15.89f, 2.78f)
                curveTo(19.5f, 4.3f, 22.0f, 7.86f, 22.0f, 12.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _radioactiveOff!!
    }

private var _radioactiveOff: ImageVector? = null
