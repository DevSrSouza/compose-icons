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

public val MaterialDesignIcons.Sausage: ImageVector
    get() {
        if (_sausage != null) {
            return _sausage!!
        }
        _sausage = Builder(name = "Sausage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.3f)
                curveTo(20.2f, 5.8f, 21.0f, 7.1f, 21.0f, 8.5f)
                curveTo(21.0f, 15.4f, 15.4f, 21.0f, 8.5f, 21.0f)
                curveTo(7.1f, 21.0f, 5.9f, 20.2f, 5.3f, 19.0f)
                lineTo(3.0f, 20.5f)
                verticalLineTo(14.5f)
                lineTo(5.3f, 16.0f)
                curveTo(5.9f, 14.8f, 7.1f, 14.0f, 8.5f, 14.0f)
                curveTo(11.5f, 14.0f, 14.0f, 11.5f, 14.0f, 8.5f)
                curveTo(14.0f, 7.1f, 14.8f, 5.9f, 16.0f, 5.3f)
                lineTo(14.5f, 3.0f)
                horizontalLineTo(20.5f)
                lineTo(19.0f, 5.3f)
                close()
            }
        }
        .build()
        return _sausage!!
    }

private var _sausage: ImageVector? = null
