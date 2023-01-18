package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 4.358f)
                verticalLineTo(16.823f)
                lineTo(4.1803f, 19.8614f)
                curveTo(3.7126f, 20.1902f, 3.0789f, 19.8947f, 3.0059f, 19.3523f)
                lineTo(2.999f, 19.2478f)
                verticalLineTo(8.6153f)
                curveTo(2.999f, 8.406f, 3.0864f, 8.2079f, 3.2371f, 8.0671f)
                lineTo(3.3177f, 8.0017f)
                lineTo(8.5f, 4.358f)
                close()
                moveTo(20.9944f, 4.6478f)
                lineTo(21.0014f, 4.7523f)
                verticalLineTo(15.3848f)
                curveTo(21.0014f, 15.5941f, 20.914f, 15.7922f, 20.7632f, 15.933f)
                lineTo(20.6827f, 15.9984f)
                lineTo(15.5f, 19.64f)
                verticalLineTo(7.174f)
                lineTo(19.82f, 4.1387f)
                curveTo(20.2878f, 3.8099f, 20.9215f, 4.1055f, 20.9944f, 4.6478f)
                close()
                moveTo(10.0f, 4.359f)
                lineTo(14.0f, 7.171f)
                verticalLineTo(19.638f)
                lineTo(10.0f, 16.824f)
                verticalLineTo(4.359f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
