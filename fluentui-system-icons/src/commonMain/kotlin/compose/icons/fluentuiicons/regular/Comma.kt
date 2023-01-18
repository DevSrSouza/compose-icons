package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Comma: ImageVector
    get() {
        if (_comma != null) {
            return _comma!!
        }
        _comma = Builder(name = "Comma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6195f, 12.023f)
                curveTo(13.9177f, 12.6317f, 13.0019f, 13.0f, 12.0f, 13.0f)
                curveTo(9.7909f, 13.0f, 8.0f, 11.2091f, 8.0f, 9.0f)
                curveTo(8.0f, 6.7909f, 9.7909f, 5.0f, 12.0f, 5.0f)
                curveTo(14.0534f, 5.0f, 15.7454f, 6.5472f, 15.9738f, 8.5394f)
                curveTo(16.3304f, 10.3496f, 16.3261f, 12.5064f, 15.5096f, 14.4394f)
                curveTo(14.6478f, 16.4797f, 12.909f, 18.1983f, 9.9399f, 18.9755f)
                curveTo(9.5392f, 19.0805f, 9.1294f, 18.8407f, 9.0245f, 18.4399f)
                curveTo(8.9195f, 18.0392f, 9.1594f, 17.6294f, 9.5601f, 17.5245f)
                curveTo(12.091f, 16.8619f, 13.4522f, 15.4554f, 14.1279f, 13.8557f)
                curveTo(14.3745f, 13.2717f, 14.5334f, 12.6527f, 14.6195f, 12.023f)
                close()
            }
        }
        .build()
        return _comma!!
    }

private var _comma: ImageVector? = null
