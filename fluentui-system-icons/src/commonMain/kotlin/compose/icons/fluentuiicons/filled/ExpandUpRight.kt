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

public val FilledGroup.ExpandUpRight: ImageVector
    get() {
        if (_expandUpRight != null) {
            return _expandUpRight!!
        }
        _expandUpRight = Builder(name = "ExpandUpRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 4.5f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.25f)
                curveTo(10.7688f, 12.0f, 12.0f, 13.2312f, 12.0f, 14.75f)
                verticalLineTo(19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 19.5f, 19.5f, 18.7165f, 19.5f, 17.75f)
                verticalLineTo(13.75f)
                curveTo(19.5f, 13.3358f, 19.8358f, 13.0f, 20.25f, 13.0f)
                curveTo(20.6642f, 13.0f, 21.0f, 13.3358f, 21.0f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                lineTo(6.75f, 21.0002f)
                lineTo(6.716f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(10.25f)
                curveTo(10.6642f, 3.0f, 11.0f, 3.3358f, 11.0f, 3.75f)
                curveTo(11.0f, 4.1642f, 10.6642f, 4.5f, 10.25f, 4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(13.0f, 3.75f)
                curveTo(13.0f, 3.3358f, 13.3358f, 3.0f, 13.75f, 3.0f)
                horizontalLineTo(20.2505f)
                curveTo(20.6647f, 3.0f, 21.0005f, 3.3358f, 21.0005f, 3.75f)
                verticalLineTo(10.25f)
                curveTo(21.0005f, 10.6642f, 20.6647f, 11.0f, 20.2505f, 11.0f)
                curveTo(19.8362f, 11.0f, 19.5005f, 10.6642f, 19.5005f, 10.25f)
                verticalLineTo(5.5607f)
                lineTo(14.2803f, 10.7804f)
                curveTo(13.9874f, 11.0732f, 13.5125f, 11.0732f, 13.2196f, 10.7803f)
                curveTo(12.9268f, 10.4874f, 12.9268f, 10.0125f, 13.2197f, 9.7196f)
                lineTo(18.4399f, 4.5f)
                horizontalLineTo(13.75f)
                curveTo(13.3358f, 4.5f, 13.0f, 4.1642f, 13.0f, 3.75f)
                close()
            }
        }
        .build()
        return _expandUpRight!!
    }

private var _expandUpRight: ImageVector? = null
