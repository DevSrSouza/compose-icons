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

public val RegularGroup.ShiftsOpen: ImageVector
    get() {
        if (_shiftsOpen != null) {
            return _shiftsOpen!!
        }
        _shiftsOpen = Builder(name = "ShiftsOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(9.25f)
                curveTo(9.6642f, 4.5f, 10.0f, 4.1642f, 10.0f, 3.75f)
                curveTo(10.0f, 3.3358f, 9.6642f, 3.0f, 9.25f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(9.25f)
                curveTo(9.6642f, 21.0f, 10.0f, 20.6642f, 10.0f, 20.25f)
                curveTo(10.0f, 19.8358f, 9.6642f, 19.5f, 9.25f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(14.7472f, 3.0f)
                curveTo(14.333f, 3.0f, 13.9972f, 3.3358f, 13.9972f, 3.75f)
                curveTo(13.9972f, 4.1642f, 14.333f, 4.5f, 14.7472f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.7165f, 18.7165f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(14.7472f)
                curveTo(14.333f, 19.5f, 13.9972f, 19.8358f, 13.9972f, 20.25f)
                curveTo(13.9972f, 20.6642f, 14.333f, 21.0f, 14.7472f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(14.7472f)
                close()
                moveTo(12.5f, 6.75f)
                curveTo(12.5f, 6.3358f, 12.1642f, 6.0f, 11.75f, 6.0f)
                curveTo(11.3358f, 6.0f, 11.0f, 6.3358f, 11.0f, 6.75f)
                verticalLineTo(12.75f)
                curveTo(11.0f, 13.1642f, 11.3358f, 13.5f, 11.75f, 13.5f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 13.5f, 17.0f, 13.1642f, 17.0f, 12.75f)
                curveTo(17.0f, 12.3358f, 16.6642f, 12.0f, 16.25f, 12.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _shiftsOpen!!
    }

private var _shiftsOpen: ImageVector? = null
