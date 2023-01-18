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

public val RegularGroup.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.25f)
                curveTo(4.0f, 5.0074f, 5.0074f, 4.0f, 6.25f, 4.0f)
                horizontalLineTo(14.75f)
                curveTo(15.9926f, 4.0f, 17.0f, 5.0074f, 17.0f, 6.25f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(17.25f)
                curveTo(20.5f, 19.0449f, 19.0449f, 20.5f, 17.25f, 20.5f)
                horizontalLineTo(7.25f)
                curveTo(5.4551f, 20.5f, 4.0f, 19.0449f, 4.0f, 17.25f)
                verticalLineTo(6.25f)
                close()
                moveTo(17.0f, 15.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.25f)
                curveTo(18.2165f, 19.0f, 19.0f, 18.2165f, 19.0f, 17.25f)
                verticalLineTo(15.5f)
                horizontalLineTo(17.0f)
                close()
                moveTo(15.5f, 19.0f)
                verticalLineTo(6.25f)
                curveTo(15.5f, 5.8358f, 15.1642f, 5.5f, 14.75f, 5.5f)
                horizontalLineTo(6.25f)
                curveTo(5.8358f, 5.5f, 5.5f, 5.8358f, 5.5f, 6.25f)
                verticalLineTo(17.25f)
                curveTo(5.5f, 18.2165f, 6.2835f, 19.0f, 7.25f, 19.0f)
                horizontalLineTo(15.5f)
                close()
                moveTo(7.0f, 8.75f)
                curveTo(7.0f, 8.3358f, 7.3358f, 8.0f, 7.75f, 8.0f)
                horizontalLineTo(13.25f)
                curveTo(13.6642f, 8.0f, 14.0f, 8.3358f, 14.0f, 8.75f)
                curveTo(14.0f, 9.1642f, 13.6642f, 9.5f, 13.25f, 9.5f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 9.5f, 7.0f, 9.1642f, 7.0f, 8.75f)
                close()
                moveTo(7.0f, 12.25f)
                curveTo(7.0f, 11.8358f, 7.3358f, 11.5f, 7.75f, 11.5f)
                horizontalLineTo(13.25f)
                curveTo(13.6642f, 11.5f, 14.0f, 11.8358f, 14.0f, 12.25f)
                curveTo(14.0f, 12.6642f, 13.6642f, 13.0f, 13.25f, 13.0f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 13.0f, 7.0f, 12.6642f, 7.0f, 12.25f)
                close()
                moveTo(7.0f, 15.75f)
                curveTo(7.0f, 15.3358f, 7.3358f, 15.0f, 7.75f, 15.0f)
                horizontalLineTo(10.25f)
                curveTo(10.6642f, 15.0f, 11.0f, 15.3358f, 11.0f, 15.75f)
                curveTo(11.0f, 16.1642f, 10.6642f, 16.5f, 10.25f, 16.5f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 16.5f, 7.0f, 16.1642f, 7.0f, 15.75f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
