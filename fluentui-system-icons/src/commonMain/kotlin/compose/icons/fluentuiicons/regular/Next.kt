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

public val RegularGroup.Next: ImageVector
    get() {
        if (_next != null) {
            return _next!!
        }
        _next = Builder(name = "Next", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0001f, 4.753f)
                curveTo(3.0001f, 3.3452f, 4.5779f, 2.5136f, 5.7393f, 3.3094f)
                lineTo(16.2377f, 10.5028f)
                curveTo(17.2479f, 11.1949f, 17.2531f, 12.6839f, 16.2478f, 13.3831f)
                lineTo(5.7493f, 20.6847f)
                curveTo(4.589f, 21.4917f, 3.0001f, 20.6613f, 3.0001f, 19.248f)
                verticalLineTo(4.753f)
                close()
                moveTo(4.8914f, 4.5468f)
                curveTo(4.7255f, 4.4331f, 4.5001f, 4.5519f, 4.5001f, 4.753f)
                verticalLineTo(19.248f)
                curveTo(4.5001f, 19.4499f, 4.7271f, 19.5685f, 4.8929f, 19.4532f)
                lineTo(15.3913f, 12.1517f)
                curveTo(15.5349f, 12.0518f, 15.5342f, 11.8391f, 15.3899f, 11.7402f)
                lineTo(4.8914f, 4.5468f)
                close()
                moveTo(21.0f, 3.75f)
                curveTo(21.0f, 3.3358f, 20.6642f, 3.0f, 20.25f, 3.0f)
                curveTo(19.8358f, 3.0f, 19.5f, 3.3358f, 19.5f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(19.5f, 20.6642f, 19.8358f, 21.0f, 20.25f, 21.0f)
                curveTo(20.6642f, 21.0f, 21.0f, 20.6642f, 21.0f, 20.25f)
                verticalLineTo(3.75f)
                close()
            }
        }
        .build()
        return _next!!
    }

private var _next: ImageVector? = null
