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

public val RegularGroup.DividerShort: ImageVector
    get() {
        if (_dividerShort != null) {
            return _dividerShort!!
        }
        _dividerShort = Builder(name = "DividerShort", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 4.75f)
                verticalLineTo(19.25f)
                curveTo(11.25f, 19.6642f, 11.5858f, 20.0f, 12.0f, 20.0f)
                curveTo(12.4142f, 20.0f, 12.75f, 19.6642f, 12.75f, 19.25f)
                verticalLineTo(4.75f)
                curveTo(12.75f, 4.3358f, 12.4142f, 4.0f, 12.0f, 4.0f)
                curveTo(11.5858f, 4.0f, 11.25f, 4.3358f, 11.25f, 4.75f)
                close()
            }
        }
        .build()
        return _dividerShort!!
    }

private var _dividerShort: ImageVector? = null
