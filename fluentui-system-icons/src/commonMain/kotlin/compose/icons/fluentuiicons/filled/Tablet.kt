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

public val FilledGroup.Tablet: ImageVector
    get() {
        if (_tablet != null) {
            return _tablet!!
        }
        _tablet = Builder(name = "Tablet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7488f, 4.0f)
                curveTo(20.9915f, 4.0f, 21.9988f, 5.0074f, 21.9988f, 6.25f)
                verticalLineTo(17.7523f)
                curveTo(21.9988f, 18.9949f, 20.9915f, 20.0023f, 19.7488f, 20.0023f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 20.0023f, 2.0f, 18.9949f, 2.0f, 17.7523f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.0074f, 3.0074f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(19.7488f)
                close()
                moveTo(13.75f, 15.5004f)
                horizontalLineTo(10.25f)
                curveTo(9.8358f, 15.5004f, 9.5f, 15.8362f, 9.5f, 16.2504f)
                curveTo(9.5f, 16.6647f, 9.8358f, 17.0004f, 10.25f, 17.0004f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 17.0004f, 14.5f, 16.6647f, 14.5f, 16.2504f)
                curveTo(14.5f, 15.8362f, 14.1642f, 15.5004f, 13.75f, 15.5004f)
                close()
            }
        }
        .build()
        return _tablet!!
    }

private var _tablet: ImageVector? = null
