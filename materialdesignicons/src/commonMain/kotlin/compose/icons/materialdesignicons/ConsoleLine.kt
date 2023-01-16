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

public val MaterialDesignIcons.ConsoleLine: ImageVector
    get() {
        if (_consoleLine != null) {
            return _consoleLine!!
        }
        _consoleLine = Builder(name = "ConsoleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                moveTo(8.5f, 13.0f)
                lineTo(2.47f, 7.0f)
                horizontalLineTo(6.71f)
                lineTo(11.67f, 11.95f)
                curveTo(12.25f, 12.54f, 12.25f, 13.5f, 11.67f, 14.07f)
                lineTo(6.74f, 19.0f)
                horizontalLineTo(2.5f)
                lineTo(8.5f, 13.0f)
                close()
            }
        }
        .build()
        return _consoleLine!!
    }

private var _consoleLine: ImageVector? = null
