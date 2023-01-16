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

public val MaterialDesignIcons.Beer: ImageVector
    get() {
        if (_beer != null) {
            return _beer!!
        }
        _beer = Builder(name = "Beer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(19.0f)
                lineTo(17.0f, 22.0f)
                horizontalLineTo(6.0f)
                lineTo(4.0f, 2.0f)
                moveTo(6.2f, 4.0f)
                lineTo(7.8f, 20.0f)
                horizontalLineTo(8.8f)
                lineTo(7.43f, 6.34f)
                curveTo(8.5f, 6.0f, 9.89f, 5.89f, 11.0f, 7.0f)
                curveTo(12.56f, 8.56f, 15.33f, 7.69f, 16.5f, 7.23f)
                lineTo(16.8f, 4.0f)
                horizontalLineTo(6.2f)
                close()
            }
        }
        .build()
        return _beer!!
    }

private var _beer: ImageVector? = null
