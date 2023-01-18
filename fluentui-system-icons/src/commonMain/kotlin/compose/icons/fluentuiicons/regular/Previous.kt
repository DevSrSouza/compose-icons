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

public val RegularGroup.Previous: ImageVector
    get() {
        if (_previous != null) {
            return _previous!!
        }
        _previous = Builder(name = "Previous", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9999f, 4.753f)
                curveTo(20.9999f, 3.3452f, 19.4221f, 2.5136f, 18.2607f, 3.3094f)
                lineTo(7.7623f, 10.5028f)
                curveTo(6.7521f, 11.1949f, 6.7469f, 12.6839f, 7.7522f, 13.3831f)
                lineTo(18.2507f, 20.6847f)
                curveTo(19.411f, 21.4917f, 20.9999f, 20.6613f, 20.9999f, 19.248f)
                verticalLineTo(4.753f)
                close()
                moveTo(19.1086f, 4.5468f)
                curveTo(19.2745f, 4.4331f, 19.4999f, 4.5519f, 19.4999f, 4.753f)
                verticalLineTo(19.248f)
                curveTo(19.4999f, 19.4499f, 19.2729f, 19.5685f, 19.1072f, 19.4532f)
                lineTo(8.6087f, 12.1517f)
                curveTo(8.4651f, 12.0518f, 8.4658f, 11.8391f, 8.6101f, 11.7402f)
                lineTo(19.1086f, 4.5468f)
                close()
                moveTo(3.0f, 3.75f)
                curveTo(3.0f, 3.3358f, 3.3358f, 3.0f, 3.75f, 3.0f)
                curveTo(4.1642f, 3.0f, 4.5f, 3.3358f, 4.5f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(4.5f, 20.6642f, 4.1642f, 21.0f, 3.75f, 21.0f)
                curveTo(3.3358f, 21.0f, 3.0f, 20.6642f, 3.0f, 20.25f)
                verticalLineTo(3.75f)
                close()
            }
        }
        .build()
        return _previous!!
    }

private var _previous: ImageVector? = null
