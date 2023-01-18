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

public val RegularGroup.AlignBottom: ImageVector
    get() {
        if (_alignBottom != null) {
            return _alignBottom!!
        }
        _alignBottom = Builder(name = "AlignBottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 21.0f)
                curveTo(2.3358f, 21.0f, 2.0f, 20.6642f, 2.0f, 20.25f)
                curveTo(2.0f, 19.8358f, 2.3358f, 19.5f, 2.75f, 19.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 19.5f, 22.0f, 19.8358f, 22.0f, 20.25f)
                curveTo(22.0f, 20.6642f, 21.6642f, 21.0f, 21.25f, 21.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(4.0f, 15.75f)
                curveTo(4.0f, 16.9926f, 5.0074f, 18.0f, 6.25f, 18.0f)
                horizontalLineTo(8.75f)
                curveTo(9.9926f, 18.0f, 11.0f, 16.9926f, 11.0f, 15.75f)
                lineTo(11.0f, 5.25f)
                curveTo(11.0f, 4.0074f, 9.9926f, 3.0f, 8.75f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 3.0f, 4.0f, 4.0074f, 4.0f, 5.25f)
                lineTo(4.0f, 15.75f)
                close()
                moveTo(6.25f, 16.5f)
                curveTo(5.8358f, 16.5f, 5.5f, 16.1642f, 5.5f, 15.75f)
                lineTo(5.5f, 5.25f)
                curveTo(5.5f, 4.8358f, 5.8358f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(8.75f)
                curveTo(9.1642f, 4.5f, 9.5f, 4.8358f, 9.5f, 5.25f)
                lineTo(9.5f, 15.75f)
                curveTo(9.5f, 16.1642f, 9.1642f, 16.5f, 8.75f, 16.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(13.0f, 15.75f)
                curveTo(13.0f, 16.9926f, 14.0074f, 18.0f, 15.25f, 18.0f)
                horizontalLineTo(17.75f)
                curveTo(18.9926f, 18.0f, 20.0f, 16.9926f, 20.0f, 15.75f)
                verticalLineTo(8.75f)
                curveTo(20.0f, 7.5074f, 18.9926f, 6.5f, 17.75f, 6.5f)
                horizontalLineTo(15.25f)
                curveTo(14.0074f, 6.5f, 13.0f, 7.5074f, 13.0f, 8.75f)
                lineTo(13.0f, 15.75f)
                close()
                moveTo(15.25f, 16.5f)
                curveTo(14.8358f, 16.5f, 14.5f, 16.1642f, 14.5f, 15.75f)
                lineTo(14.5f, 8.75f)
                curveTo(14.5f, 8.3358f, 14.8358f, 8.0f, 15.25f, 8.0f)
                horizontalLineTo(17.75f)
                curveTo(18.1642f, 8.0f, 18.5f, 8.3358f, 18.5f, 8.75f)
                verticalLineTo(15.75f)
                curveTo(18.5f, 16.1642f, 18.1642f, 16.5f, 17.75f, 16.5f)
                horizontalLineTo(15.25f)
                close()
            }
        }
        .build()
        return _alignBottom!!
    }

private var _alignBottom: ImageVector? = null
