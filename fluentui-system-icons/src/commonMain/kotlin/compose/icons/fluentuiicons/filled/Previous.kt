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

public val FilledGroup.Previous: ImageVector
    get() {
        if (_previous != null) {
            return _previous!!
        }
        _previous = Builder(name = "Previous", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.75f)
                curveTo(3.0f, 3.3358f, 3.3358f, 3.0f, 3.75f, 3.0f)
                curveTo(4.1642f, 3.0f, 4.5f, 3.3358f, 4.5f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(4.5f, 20.6642f, 4.1642f, 21.0f, 3.75f, 21.0f)
                curveTo(3.3358f, 21.0f, 3.0f, 20.6642f, 3.0f, 20.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(20.9999f, 4.753f)
                curveTo(20.9999f, 3.3452f, 19.4221f, 2.5136f, 18.2608f, 3.3094f)
                lineTo(7.7623f, 10.5028f)
                curveTo(6.7521f, 11.1949f, 6.7469f, 12.6839f, 7.7523f, 13.3831f)
                lineTo(18.2507f, 20.6847f)
                curveTo(19.4111f, 21.4917f, 20.9999f, 20.6613f, 20.9999f, 19.248f)
                verticalLineTo(4.753f)
                close()
            }
        }
        .build()
        return _previous!!
    }

private var _previous: ImageVector? = null
