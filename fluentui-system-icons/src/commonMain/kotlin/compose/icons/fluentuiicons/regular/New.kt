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

public val RegularGroup.New: ImageVector
    get() {
        if (_new != null) {
            return _new!!
        }
        _new = Builder(name = "New", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 4.0f)
                curveTo(18.6642f, 4.0f, 19.0f, 4.3358f, 19.0f, 4.75f)
                verticalLineTo(13.25f)
                curveTo(19.0f, 13.6642f, 18.6642f, 14.0f, 18.25f, 14.0f)
                curveTo(17.8358f, 14.0f, 17.5f, 13.6642f, 17.5f, 13.25f)
                verticalLineTo(4.75f)
                curveTo(17.5f, 4.3358f, 17.8358f, 4.0f, 18.25f, 4.0f)
                close()
                moveTo(4.0f, 18.25f)
                curveTo(4.0f, 17.8358f, 4.3358f, 17.5f, 4.75f, 17.5f)
                horizontalLineTo(13.25f)
                curveTo(13.6642f, 17.5f, 14.0f, 17.8358f, 14.0f, 18.25f)
                curveTo(14.0f, 18.6642f, 13.6642f, 19.0f, 13.25f, 19.0f)
                horizontalLineTo(4.75f)
                curveTo(4.3358f, 19.0f, 4.0f, 18.6642f, 4.0f, 18.25f)
                close()
                moveTo(8.2803f, 7.2197f)
                curveTo(7.9874f, 6.9268f, 7.5126f, 6.9268f, 7.2197f, 7.2197f)
                curveTo(6.9268f, 7.5126f, 6.9268f, 7.9874f, 7.2197f, 8.2803f)
                lineTo(13.7197f, 14.7803f)
                curveTo(14.0126f, 15.0732f, 14.4874f, 15.0732f, 14.7803f, 14.7803f)
                curveTo(15.0732f, 14.4874f, 15.0732f, 14.0126f, 14.7803f, 13.7197f)
                lineTo(8.2803f, 7.2197f)
                close()
            }
        }
        .build()
        return _new!!
    }

private var _new: ImageVector? = null
