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

public val MaterialDesignIcons.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(name = "Satellite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 18.0f)
                lineTo(8.5f, 13.5f)
                lineTo(11.0f, 16.5f)
                lineTo(14.5f, 12.0f)
                lineTo(19.0f, 18.0f)
                moveTo(5.0f, 12.0f)
                verticalLineTo(10.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 10.0f, 5.0f)
                horizontalLineTo(12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 12.0f)
                moveTo(5.0f, 5.0f)
                horizontalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 8.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
            }
        }
        .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
