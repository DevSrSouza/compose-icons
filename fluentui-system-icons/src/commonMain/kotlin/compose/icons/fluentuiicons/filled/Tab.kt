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

public val FilledGroup.Tab: ImageVector
    get() {
        if (_tab != null) {
            return _tab!!
        }
        _tab = Builder(name = "Tab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 4.2312f, 4.2312f, 3.0f, 5.75f, 3.0f)
                horizontalLineTo(18.25f)
                curveTo(19.7688f, 3.0f, 21.0f, 4.2312f, 21.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(21.0f, 19.7688f, 19.7688f, 21.0f, 18.25f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 21.0f, 3.0f, 19.7688f, 3.0f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(5.75f, 5.0f)
                curveTo(5.3358f, 5.0f, 5.0f, 5.3358f, 5.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(5.0f, 18.6642f, 5.3358f, 19.0f, 5.75f, 19.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 19.0f, 19.0f, 18.6642f, 19.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(19.0f, 5.3358f, 18.6642f, 5.0f, 18.25f, 5.0f)
                horizontalLineTo(5.75f)
                close()
            }
        }
        .build()
        return _tab!!
    }

private var _tab: ImageVector? = null
