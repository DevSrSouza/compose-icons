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

public val RegularGroup.AlignRight: ImageVector
    get() {
        if (_alignRight != null) {
            return _alignRight!!
        }
        _alignRight = Builder(name = "AlignRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.75f)
                curveTo(21.0f, 2.3358f, 20.6642f, 2.0f, 20.25f, 2.0f)
                curveTo(19.8358f, 2.0f, 19.5f, 2.3358f, 19.5f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(19.5f, 21.6642f, 19.8358f, 22.0f, 20.25f, 22.0f)
                curveTo(20.6642f, 22.0f, 21.0f, 21.6642f, 21.0f, 21.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(15.75f, 4.0f)
                curveTo(16.9926f, 4.0f, 18.0f, 5.0074f, 18.0f, 6.25f)
                verticalLineTo(8.75f)
                curveTo(18.0f, 9.9926f, 16.9926f, 11.0f, 15.75f, 11.0f)
                lineTo(5.25f, 11.0f)
                curveTo(4.0074f, 11.0f, 3.0f, 9.9926f, 3.0f, 8.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 5.0074f, 4.0074f, 4.0f, 5.25f, 4.0f)
                lineTo(15.75f, 4.0f)
                close()
                moveTo(16.5f, 6.25f)
                curveTo(16.5f, 5.8358f, 16.1642f, 5.5f, 15.75f, 5.5f)
                lineTo(5.25f, 5.5f)
                curveTo(4.8358f, 5.5f, 4.5f, 5.8358f, 4.5f, 6.25f)
                verticalLineTo(8.75f)
                curveTo(4.5f, 9.1642f, 4.8358f, 9.5f, 5.25f, 9.5f)
                lineTo(15.75f, 9.5f)
                curveTo(16.1642f, 9.5f, 16.5f, 9.1642f, 16.5f, 8.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(15.75f, 13.0f)
                curveTo(16.9926f, 13.0f, 18.0f, 14.0074f, 18.0f, 15.25f)
                verticalLineTo(17.75f)
                curveTo(18.0f, 18.9926f, 16.9926f, 20.0f, 15.75f, 20.0f)
                horizontalLineTo(8.75f)
                curveTo(7.5074f, 20.0f, 6.5f, 18.9926f, 6.5f, 17.75f)
                verticalLineTo(15.25f)
                curveTo(6.5f, 14.0074f, 7.5074f, 13.0f, 8.75f, 13.0f)
                lineTo(15.75f, 13.0f)
                close()
                moveTo(16.5f, 15.25f)
                curveTo(16.5f, 14.8358f, 16.1642f, 14.5f, 15.75f, 14.5f)
                lineTo(8.75f, 14.5f)
                curveTo(8.3358f, 14.5f, 8.0f, 14.8358f, 8.0f, 15.25f)
                verticalLineTo(17.75f)
                curveTo(8.0f, 18.1642f, 8.3358f, 18.5f, 8.75f, 18.5f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 18.5f, 16.5f, 18.1642f, 16.5f, 17.75f)
                verticalLineTo(15.25f)
                close()
            }
        }
        .build()
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
