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

public val RegularGroup.AlignTop: ImageVector
    get() {
        if (_alignTop != null) {
            return _alignTop!!
        }
        _alignTop = Builder(name = "AlignTop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 3.0f)
                curveTo(2.3358f, 3.0f, 2.0f, 3.3358f, 2.0f, 3.75f)
                curveTo(2.0f, 4.1642f, 2.3358f, 4.5f, 2.75f, 4.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 4.5f, 22.0f, 4.1642f, 22.0f, 3.75f)
                curveTo(22.0f, 3.3358f, 21.6642f, 3.0f, 21.25f, 3.0f)
                lineTo(2.75f, 3.0f)
                close()
                moveTo(4.0f, 8.25f)
                curveTo(4.0f, 7.0074f, 5.0074f, 6.0f, 6.25f, 6.0f)
                horizontalLineTo(8.75f)
                curveTo(9.9926f, 6.0f, 11.0f, 7.0074f, 11.0f, 8.25f)
                lineTo(11.0f, 18.75f)
                curveTo(11.0f, 19.9926f, 9.9926f, 21.0f, 8.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 21.0f, 4.0f, 19.9926f, 4.0f, 18.75f)
                lineTo(4.0f, 8.25f)
                close()
                moveTo(6.25f, 7.5f)
                curveTo(5.8358f, 7.5f, 5.5f, 7.8358f, 5.5f, 8.25f)
                lineTo(5.5f, 18.75f)
                curveTo(5.5f, 19.1642f, 5.8358f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(8.75f)
                curveTo(9.1642f, 19.5f, 9.5f, 19.1642f, 9.5f, 18.75f)
                lineTo(9.5f, 8.25f)
                curveTo(9.5f, 7.8358f, 9.1642f, 7.5f, 8.75f, 7.5f)
                lineTo(6.25f, 7.5f)
                close()
                moveTo(13.0f, 8.25f)
                curveTo(13.0f, 7.0074f, 14.0074f, 6.0f, 15.25f, 6.0f)
                horizontalLineTo(17.75f)
                curveTo(18.9926f, 6.0f, 20.0f, 7.0074f, 20.0f, 8.25f)
                verticalLineTo(15.25f)
                curveTo(20.0f, 16.4926f, 18.9926f, 17.5f, 17.75f, 17.5f)
                horizontalLineTo(15.25f)
                curveTo(14.0074f, 17.5f, 13.0f, 16.4926f, 13.0f, 15.25f)
                lineTo(13.0f, 8.25f)
                close()
                moveTo(15.25f, 7.5f)
                curveTo(14.8358f, 7.5f, 14.5f, 7.8358f, 14.5f, 8.25f)
                lineTo(14.5f, 15.25f)
                curveTo(14.5f, 15.6642f, 14.8358f, 16.0f, 15.25f, 16.0f)
                horizontalLineTo(17.75f)
                curveTo(18.1642f, 16.0f, 18.5f, 15.6642f, 18.5f, 15.25f)
                verticalLineTo(8.25f)
                curveTo(18.5f, 7.8358f, 18.1642f, 7.5f, 17.75f, 7.5f)
                lineTo(15.25f, 7.5f)
                close()
            }
        }
        .build()
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
