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

public val RegularGroup.BorderLeftRight: ImageVector
    get() {
        if (_borderLeftRight != null) {
            return _borderLeftRight!!
        }
        _borderLeftRight = Builder(name = "BorderLeftRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.75f)
                curveTo(17.0f, 3.3358f, 17.3358f, 3.0f, 17.75f, 3.0f)
                lineTo(18.25f, 3.0f)
                curveTo(19.7688f, 3.0f, 21.0f, 4.2312f, 21.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(21.0f, 19.7688f, 19.7688f, 21.0f, 18.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(17.3358f, 21.0f, 17.0f, 20.6642f, 17.0f, 20.25f)
                curveTo(17.0f, 19.8358f, 17.3358f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(18.25f)
                curveTo(18.9404f, 19.5f, 19.5f, 18.9404f, 19.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(19.5f, 5.0596f, 18.9404f, 4.5f, 18.25f, 4.5f)
                lineTo(17.75f, 4.5f)
                curveTo(17.3358f, 4.5f, 17.0f, 4.1642f, 17.0f, 3.75f)
                close()
                moveTo(13.25f, 4.5f)
                curveTo(13.6642f, 4.5f, 14.0f, 4.1642f, 14.0f, 3.75f)
                curveTo(14.0f, 3.3358f, 13.6642f, 3.0f, 13.25f, 3.0f)
                lineTo(10.75f, 3.0f)
                curveTo(10.3358f, 3.0f, 10.0f, 3.3358f, 10.0f, 3.75f)
                curveTo(10.0f, 4.1642f, 10.3358f, 4.5f, 10.75f, 4.5f)
                lineTo(13.25f, 4.5f)
                close()
                moveTo(13.25f, 19.5f)
                curveTo(13.6642f, 19.5f, 14.0f, 19.8358f, 14.0f, 20.25f)
                curveTo(14.0f, 20.6642f, 13.6642f, 21.0f, 13.25f, 21.0f)
                horizontalLineTo(10.75f)
                curveTo(10.3358f, 21.0f, 10.0f, 20.6642f, 10.0f, 20.25f)
                curveTo(10.0f, 19.8358f, 10.3358f, 19.5f, 10.75f, 19.5f)
                horizontalLineTo(13.25f)
                close()
                moveTo(6.25f, 3.0f)
                curveTo(6.6642f, 3.0f, 7.0f, 3.3358f, 7.0f, 3.75f)
                curveTo(7.0f, 4.1642f, 6.6642f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(5.75f)
                curveTo(5.0596f, 4.5f, 4.5f, 5.0596f, 4.5f, 5.75f)
                lineTo(4.5f, 18.25f)
                curveTo(4.5f, 18.9404f, 5.0596f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(6.6642f, 19.5f, 7.0f, 19.8358f, 7.0f, 20.25f)
                curveTo(7.0f, 20.6642f, 6.6642f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 21.0f, 3.0f, 19.7688f, 3.0f, 18.25f)
                lineTo(3.0f, 5.75f)
                curveTo(3.0f, 4.2312f, 4.2312f, 3.0f, 5.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
            }
        }
        .build()
        return _borderLeftRight!!
    }

private var _borderLeftRight: ImageVector? = null
