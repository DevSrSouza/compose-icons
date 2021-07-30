package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 9.0f)
                curveTo(4.0f, 4.5817f, 7.5817f, 1.0f, 12.0f, 1.0f)
                curveTo(16.4183f, 1.0f, 20.0f, 4.5817f, 20.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0187f)
                verticalLineTo(20.5f)
                curveTo(13.0187f, 21.8807f, 11.8994f, 23.0f, 10.5187f, 23.0f)
                curveTo(9.138f, 23.0f, 8.0187f, 21.8807f, 8.0187f, 20.5f)
                verticalLineTo(17.8571f)
                horizontalLineTo(10.0187f)
                verticalLineTo(20.5f)
                curveTo(10.0187f, 20.7761f, 10.2425f, 21.0f, 10.5187f, 21.0f)
                curveTo(10.7948f, 21.0f, 11.0187f, 20.7761f, 11.0187f, 20.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(15.3137f, 3.0f, 18.0f, 5.6863f, 18.0f, 9.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 5.6863f, 8.6863f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
