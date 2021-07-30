package compose.icons.lineaicons.ecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.EcommerceGroup

public val EcommerceGroup.Graph1: ImageVector
    get() {
        if (_graph1 != null) {
            return _graph1!!
        }
        _graph1 = Builder(name = "Graph1", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(54.999f, 36.001f)
                curveTo(55.0f, 50.913f, 42.912f, 63.0f, 28.0f, 62.999f)
                curveTo(13.087f, 63.0f, 1.0f, 50.912f, 1.001f, 36.0f)
                curveTo(1.0f, 21.088f, 13.088f, 9.0f, 28.0f, 9.001f)
                verticalLineTo(36.0f)
                lineTo(54.999f, 36.001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(63.0f, 28.0f)
                curveTo(63.001f, 13.087f, 50.914f, 0.998f, 36.001f, 1.0f)
                verticalLineToRelative(27.0f)
                horizontalLineTo(63.0f)
                close()
            }
        }
        .build()
        return _graph1!!
    }

private var _graph1: ImageVector? = null
