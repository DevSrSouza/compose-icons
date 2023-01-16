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

public val MaterialDesignIcons.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(name = "Golf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 18.0f)
                moveTo(17.0f, 5.92f)
                lineTo(11.0f, 9.0f)
                verticalLineTo(18.03f)
                curveTo(13.84f, 18.19f, 16.0f, 19.0f, 16.0f, 20.0f)
                curveTo(16.0f, 21.1f, 13.31f, 22.0f, 10.0f, 22.0f)
                curveTo(6.69f, 22.0f, 4.0f, 21.1f, 4.0f, 20.0f)
                curveTo(4.0f, 19.26f, 5.21f, 18.62f, 7.0f, 18.27f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.0f)
                lineTo(17.0f, 5.92f)
                close()
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
