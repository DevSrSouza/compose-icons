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

public val RegularGroup.ExpandUpLeft: ImageVector
    get() {
        if (_expandUpLeft != null) {
            return _expandUpLeft!!
        }
        _expandUpLeft = Builder(name = "ExpandUpLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.75f)
                curveTo(11.0f, 3.3358f, 10.6642f, 3.0f, 10.25f, 3.0f)
                horizontalLineTo(3.7495f)
                curveTo(3.3353f, 3.0f, 2.9995f, 3.3358f, 2.9995f, 3.75f)
                verticalLineTo(10.25f)
                curveTo(2.9995f, 10.6642f, 3.3353f, 11.0f, 3.7495f, 11.0f)
                curveTo(4.1637f, 11.0f, 4.4995f, 10.6642f, 4.4995f, 10.25f)
                verticalLineTo(5.5607f)
                lineTo(9.7197f, 10.7804f)
                curveTo(10.0126f, 11.0732f, 10.4874f, 11.0732f, 10.7803f, 10.7803f)
                curveTo(11.0732f, 10.4874f, 11.0732f, 10.0125f, 10.7803f, 9.7196f)
                lineTo(5.5601f, 4.5f)
                horizontalLineTo(10.25f)
                curveTo(10.6642f, 4.5f, 11.0f, 4.1642f, 11.0f, 3.75f)
                close()
                moveTo(19.5f, 6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(13.75f)
                curveTo(13.3357f, 4.5f, 13.0f, 4.1642f, 13.0f, 3.75f)
                curveTo(13.0f, 3.3358f, 13.3357f, 3.0f, 13.75f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(13.75f)
                curveTo(3.0f, 13.3358f, 3.3358f, 13.0f, 3.75f, 13.0f)
                curveTo(4.1642f, 13.0f, 4.5f, 13.3358f, 4.5f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.75f)
                curveTo(12.0f, 13.2312f, 13.2312f, 12.0f, 14.75f, 12.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                close()
                moveTo(19.5f, 13.5f)
                horizontalLineTo(14.75f)
                curveTo(14.0596f, 13.5f, 13.5f, 14.0596f, 13.5f, 14.75f)
                verticalLineTo(19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 19.5f, 19.5f, 18.7165f, 19.5f, 17.75f)
                verticalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _expandUpLeft!!
    }

private var _expandUpLeft: ImageVector? = null
