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

public val RegularGroup.ContractDownLeft: ImageVector
    get() {
        if (_contractDownLeft != null) {
            return _contractDownLeft!!
        }
        _contractDownLeft = Builder(name = "ContractDownLeft", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 6.25f)
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
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(10.25f)
                curveTo(10.6642f, 3.0f, 11.0f, 3.3358f, 11.0f, 3.75f)
                curveTo(11.0f, 4.1642f, 10.6642f, 4.5f, 10.25f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                close()
                moveTo(4.5f, 13.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(14.75f)
                curveTo(10.5f, 14.0596f, 9.9404f, 13.5f, 9.25f, 13.5f)
                horizontalLineTo(4.5f)
                close()
                moveTo(15.5607f, 9.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 9.5f, 21.0f, 9.8358f, 21.0f, 10.25f)
                curveTo(21.0f, 10.6642f, 20.6642f, 11.0f, 20.25f, 11.0f)
                horizontalLineTo(13.7495f)
                curveTo(13.3353f, 11.0f, 12.9995f, 10.6642f, 12.9995f, 10.25f)
                verticalLineTo(3.75f)
                curveTo(12.9995f, 3.3358f, 13.3353f, 3.0f, 13.7495f, 3.0f)
                curveTo(14.1638f, 3.0f, 14.4995f, 3.3358f, 14.4995f, 3.75f)
                verticalLineTo(8.4398f)
                lineTo(19.7197f, 3.2197f)
                curveTo(20.0126f, 2.9268f, 20.4874f, 2.9268f, 20.7803f, 3.2197f)
                curveTo(21.0732f, 3.5126f, 21.0732f, 3.9874f, 20.7803f, 4.2803f)
                lineTo(15.5607f, 9.5f)
                close()
            }
        }
        .build()
        return _contractDownLeft!!
    }

private var _contractDownLeft: ImageVector? = null
