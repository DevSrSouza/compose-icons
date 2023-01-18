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

public val RegularGroup.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7803f, 5.7803f)
                curveTo(22.0732f, 5.4874f, 22.0732f, 5.0126f, 21.7803f, 4.7197f)
                curveTo(21.4874f, 4.4268f, 21.0126f, 4.4268f, 20.7197f, 4.7197f)
                lineTo(13.2197f, 12.2197f)
                curveTo(12.9268f, 12.5126f, 12.9268f, 12.9874f, 13.2197f, 13.2803f)
                curveTo(13.5126f, 13.5732f, 13.9874f, 13.5732f, 14.2803f, 13.2803f)
                lineTo(21.7803f, 5.7803f)
                close()
                moveTo(21.9466f, 7.0283f)
                curveTo(21.9816f, 7.1967f, 22.0f, 7.3712f, 22.0f, 7.55f)
                verticalLineTo(14.45f)
                curveTo(22.0f, 15.8583f, 20.8583f, 17.0f, 19.45f, 17.0f)
                lineTo(4.55f, 17.0f)
                curveTo(3.1417f, 17.0f, 2.0f, 15.8583f, 2.0f, 14.45f)
                verticalLineTo(7.55f)
                curveTo(2.0f, 6.1417f, 3.1417f, 5.0f, 4.55f, 5.0f)
                lineTo(19.0251f, 5.0f)
                lineTo(17.5251f, 6.5f)
                lineTo(4.55f, 6.5f)
                curveTo(3.9701f, 6.5f, 3.5f, 6.9701f, 3.5f, 7.55f)
                verticalLineTo(14.45f)
                curveTo(3.5f, 15.0299f, 3.9701f, 15.5f, 4.55f, 15.5f)
                lineTo(19.45f, 15.5f)
                curveTo(20.0299f, 15.5f, 20.5f, 15.0299f, 20.5f, 14.45f)
                verticalLineTo(8.4749f)
                lineTo(21.9466f, 7.0283f)
                close()
                moveTo(4.5f, 9.25f)
                curveTo(4.5f, 8.8358f, 4.8358f, 8.5f, 5.25f, 8.5f)
                horizontalLineTo(7.25f)
                curveTo(7.6642f, 8.5f, 8.0f, 8.8358f, 8.0f, 9.25f)
                curveTo(8.0f, 9.6642f, 7.6642f, 10.0f, 7.25f, 10.0f)
                horizontalLineTo(5.25f)
                curveTo(4.8358f, 10.0f, 4.5f, 9.6642f, 4.5f, 9.25f)
                close()
                moveTo(4.5f, 12.75f)
                curveTo(4.5f, 12.3358f, 4.8358f, 12.0f, 5.25f, 12.0f)
                horizontalLineTo(10.25f)
                curveTo(10.6642f, 12.0f, 11.0f, 12.3358f, 11.0f, 12.75f)
                curveTo(11.0f, 13.1642f, 10.6642f, 13.5f, 10.25f, 13.5f)
                horizontalLineTo(5.25f)
                curveTo(4.8358f, 13.5f, 4.5f, 13.1642f, 4.5f, 12.75f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
