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

public val FilledGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5492f, 2.5332f)
                curveTo(11.3872f, 1.8262f, 12.6128f, 1.8262f, 13.4508f, 2.5332f)
                lineTo(20.2008f, 8.2277f)
                curveTo(20.7076f, 8.6552f, 21.0f, 9.2845f, 21.0f, 9.9475f)
                verticalLineTo(19.7504f)
                curveTo(21.0f, 20.7169f, 20.2165f, 21.5004f, 19.25f, 21.5004f)
                horizontalLineTo(16.25f)
                curveTo(15.2835f, 21.5004f, 14.5f, 20.7169f, 14.5f, 19.7504f)
                verticalLineTo(14.7504f)
                curveTo(14.5f, 14.3362f, 14.1642f, 14.0004f, 13.75f, 14.0004f)
                horizontalLineTo(10.25f)
                curveTo(9.8358f, 14.0004f, 9.5f, 14.3362f, 9.5f, 14.7504f)
                verticalLineTo(19.7504f)
                curveTo(9.5f, 20.7169f, 8.7165f, 21.5004f, 7.75f, 21.5004f)
                horizontalLineTo(4.75f)
                curveTo(3.7835f, 21.5004f, 3.0f, 20.7169f, 3.0f, 19.7504f)
                verticalLineTo(9.9475f)
                curveTo(3.0f, 9.2845f, 3.2924f, 8.6552f, 3.7992f, 8.2277f)
                lineTo(10.5492f, 2.5332f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
