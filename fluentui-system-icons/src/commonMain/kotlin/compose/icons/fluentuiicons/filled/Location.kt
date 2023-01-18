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

public val FilledGroup.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(name = "Location", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.157f, 16.8819f)
                lineTo(16.97f, 18.0558f)
                curveTo(16.0952f, 18.9144f, 14.96f, 20.0184f, 13.5642f, 21.3679f)
                curveTo(12.6919f, 22.2113f, 11.3081f, 22.2112f, 10.436f, 21.3677f)
                lineTo(6.9449f, 17.9718f)
                curveTo(6.5061f, 17.541f, 6.1389f, 17.1777f, 5.843f, 16.8819f)
                curveTo(2.4426f, 13.4815f, 2.4426f, 7.9683f, 5.843f, 4.5679f)
                curveTo(9.2434f, 1.1675f, 14.7566f, 1.1675f, 18.157f, 4.5679f)
                curveTo(21.5574f, 7.9683f, 21.5574f, 13.4815f, 18.157f, 16.8819f)
                close()
                moveTo(14.5002f, 10.9996f)
                curveTo(14.5002f, 9.6187f, 13.3808f, 8.4994f, 12.0f, 8.4994f)
                curveTo(10.6192f, 8.4994f, 9.4998f, 9.6187f, 9.4998f, 10.9996f)
                curveTo(9.4998f, 12.3804f, 10.6192f, 13.4998f, 12.0f, 13.4998f)
                curveTo(13.3808f, 13.4998f, 14.5002f, 12.3804f, 14.5002f, 10.9996f)
                close()
            }
        }
        .build()
        return _location!!
    }

private var _location: ImageVector? = null
