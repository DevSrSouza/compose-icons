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

public val MaterialDesignIcons.CupOffOutline: ImageVector
    get() {
        if (_cupOffOutline != null) {
            return _cupOffOutline!!
        }
        _cupOffOutline = Builder(name = "CupOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.83f, 2.0f)
                lineTo(5.83f, 4.0f)
                horizontalLineTo(18.78f)
                lineTo(17.5f, 15.66f)
                lineTo(19.3f, 17.5f)
                lineTo(21.0f, 2.0f)
                moveTo(2.27f, 3.0f)
                lineTo(1.0f, 4.27f)
                lineTo(3.53f, 6.8f)
                lineTo(5.0f, 20.23f)
                curveTo(5.13f, 21.23f, 5.97f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(17.0f)
                curveTo(17.47f, 22.0f, 17.91f, 21.82f, 18.26f, 21.54f)
                lineTo(19.73f, 23.0f)
                lineTo(21.0f, 21.73f)
                moveTo(5.78f, 9.06f)
                lineTo(16.73f, 20.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _cupOffOutline!!
    }

private var _cupOffOutline: ImageVector? = null
