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

public val FilledGroup.Router: ImageVector
    get() {
        if (_router != null) {
            return _router!!
        }
        _router = Builder(name = "Router", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.5f)
                curveTo(7.8579f, 3.5f, 4.5f, 6.8579f, 4.5f, 11.0f)
                verticalLineTo(11.25f)
                curveTo(4.5f, 11.6642f, 4.1642f, 12.0f, 3.75f, 12.0f)
                curveTo(3.3358f, 12.0f, 3.0f, 11.6642f, 3.0f, 11.25f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 6.0294f, 7.0294f, 2.0f, 12.0f, 2.0f)
                curveTo(16.9706f, 2.0f, 21.0f, 6.0294f, 21.0f, 11.0f)
                verticalLineTo(11.25f)
                curveTo(21.0f, 11.6642f, 20.6642f, 12.0f, 20.25f, 12.0f)
                curveTo(19.8358f, 12.0f, 19.5f, 11.6642f, 19.5f, 11.25f)
                verticalLineTo(11.0f)
                curveTo(19.5f, 6.8579f, 16.1421f, 3.5f, 12.0f, 3.5f)
                close()
                moveTo(12.0f, 6.5f)
                curveTo(9.5147f, 6.5f, 7.5f, 8.5147f, 7.5f, 11.0f)
                verticalLineTo(11.25f)
                curveTo(7.5f, 11.6642f, 7.1642f, 12.0f, 6.75f, 12.0f)
                curveTo(6.3358f, 12.0f, 6.0f, 11.6642f, 6.0f, 11.25f)
                verticalLineTo(11.0f)
                curveTo(6.0f, 7.6863f, 8.6863f, 5.0f, 12.0f, 5.0f)
                curveTo(15.3137f, 5.0f, 18.0f, 7.6863f, 18.0f, 11.0f)
                verticalLineTo(11.25f)
                curveTo(18.0f, 11.6642f, 17.6642f, 12.0f, 17.25f, 12.0f)
                curveTo(16.8358f, 12.0f, 16.5f, 11.6642f, 16.5f, 11.25f)
                verticalLineTo(11.0f)
                curveTo(16.5f, 8.5147f, 14.4853f, 6.5f, 12.0f, 6.5f)
                close()
                moveTo(9.0f, 11.0f)
                curveTo(9.0f, 9.3432f, 10.3431f, 8.0f, 12.0f, 8.0f)
                curveTo(13.6569f, 8.0f, 15.0f, 9.3432f, 15.0f, 11.0f)
                curveTo(15.0f, 12.3979f, 14.0439f, 13.5725f, 12.75f, 13.9055f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 16.0f, 21.0f, 17.3431f, 21.0f, 19.0f)
                curveTo(21.0f, 20.6569f, 19.6569f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 22.0f, 3.0f, 20.6569f, 3.0f, 19.0f)
                curveTo(3.0f, 17.3431f, 4.3432f, 16.0f, 6.0f, 16.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(13.9055f)
                curveTo(9.9561f, 13.5725f, 9.0f, 12.3979f, 9.0f, 11.0f)
                close()
            }
        }
        .build()
        return _router!!
    }

private var _router: ImageVector? = null
