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

public val RegularGroup.DividerTall: ImageVector
    get() {
        if (_dividerTall != null) {
            return _dividerTall!!
        }
        _dividerTall = Builder(name = "DividerTall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(11.25f, 21.6642f, 11.5858f, 22.0f, 12.0f, 22.0f)
                curveTo(12.4142f, 22.0f, 12.75f, 21.6642f, 12.75f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(12.75f, 2.3358f, 12.4142f, 2.0f, 12.0f, 2.0f)
                curveTo(11.5858f, 2.0f, 11.25f, 2.3358f, 11.25f, 2.75f)
                close()
            }
        }
        .build()
        return _dividerTall!!
    }

private var _dividerTall: ImageVector? = null
