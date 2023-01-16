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

public val MaterialDesignIcons.Lambda: ImageVector
    get() {
        if (_lambda != null) {
            return _lambda!!
        }
        _lambda = Builder(name = "Lambda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 20.0f)
                lineTo(10.16f, 7.91f)
                lineTo(9.34f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                curveTo(10.42f, 4.0f, 10.78f, 4.26f, 10.93f, 4.63f)
                lineTo(16.66f, 18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                curveTo(15.57f, 20.0f, 15.21f, 19.73f, 15.07f, 19.36f)
                lineTo(11.33f, 10.65f)
                lineTo(8.12f, 20.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _lambda!!
    }

private var _lambda: ImageVector? = null
