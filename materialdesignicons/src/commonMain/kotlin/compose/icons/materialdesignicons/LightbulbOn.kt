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

public val MaterialDesignIcons.LightbulbOn: ImageVector
    get() {
        if (_lightbulbOn != null) {
            return _lightbulbOn!!
        }
        _lightbulbOn = Builder(name = "LightbulbOn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 12.0f)
                curveTo(18.0f, 14.22f, 16.79f, 16.16f, 15.0f, 17.2f)
                verticalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 20.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 19.0f)
                verticalLineTo(17.2f)
                curveTo(7.21f, 16.16f, 6.0f, 14.22f, 6.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 6.0f)
                moveTo(14.0f, 21.0f)
                verticalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 23.0f)
                horizontalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                moveTo(20.0f, 11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                moveTo(1.0f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                moveTo(13.0f, 1.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                moveTo(4.92f, 3.5f)
                lineTo(7.05f, 5.64f)
                lineTo(5.63f, 7.05f)
                lineTo(3.5f, 4.93f)
                lineTo(4.92f, 3.5f)
                moveTo(16.95f, 5.63f)
                lineTo(19.07f, 3.5f)
                lineTo(20.5f, 4.93f)
                lineTo(18.37f, 7.05f)
                lineTo(16.95f, 5.63f)
                close()
            }
        }
        .build()
        return _lightbulbOn!!
    }

private var _lightbulbOn: ImageVector? = null
