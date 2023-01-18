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

public val RegularGroup.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) {
            return _alignLeft!!
        }
        _alignLeft = Builder(name = "AlignLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.75f)
                curveTo(3.0f, 2.3358f, 3.3358f, 2.0f, 3.75f, 2.0f)
                curveTo(4.1642f, 2.0f, 4.5f, 2.3358f, 4.5f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(4.5f, 21.6642f, 4.1642f, 22.0f, 3.75f, 22.0f)
                curveTo(3.3358f, 22.0f, 3.0f, 21.6642f, 3.0f, 21.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(8.25f, 4.0f)
                curveTo(7.0074f, 4.0f, 6.0f, 5.0074f, 6.0f, 6.25f)
                verticalLineTo(8.75f)
                curveTo(6.0f, 9.9926f, 7.0074f, 11.0f, 8.25f, 11.0f)
                lineTo(18.75f, 11.0f)
                curveTo(19.9926f, 11.0f, 21.0f, 9.9926f, 21.0f, 8.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 5.0074f, 19.9926f, 4.0f, 18.75f, 4.0f)
                lineTo(8.25f, 4.0f)
                close()
                moveTo(7.5f, 6.25f)
                curveTo(7.5f, 5.8358f, 7.8358f, 5.5f, 8.25f, 5.5f)
                lineTo(18.75f, 5.5f)
                curveTo(19.1642f, 5.5f, 19.5f, 5.8358f, 19.5f, 6.25f)
                verticalLineTo(8.75f)
                curveTo(19.5f, 9.1642f, 19.1642f, 9.5f, 18.75f, 9.5f)
                lineTo(8.25f, 9.5f)
                curveTo(7.8358f, 9.5f, 7.5f, 9.1642f, 7.5f, 8.75f)
                lineTo(7.5f, 6.25f)
                close()
                moveTo(8.25f, 13.0f)
                curveTo(7.0074f, 13.0f, 6.0f, 14.0074f, 6.0f, 15.25f)
                verticalLineTo(17.75f)
                curveTo(6.0f, 18.9926f, 7.0074f, 20.0f, 8.25f, 20.0f)
                horizontalLineTo(15.25f)
                curveTo(16.4926f, 20.0f, 17.5f, 18.9926f, 17.5f, 17.75f)
                verticalLineTo(15.25f)
                curveTo(17.5f, 14.0074f, 16.4926f, 13.0f, 15.25f, 13.0f)
                lineTo(8.25f, 13.0f)
                close()
                moveTo(7.5f, 15.25f)
                curveTo(7.5f, 14.8358f, 7.8358f, 14.5f, 8.25f, 14.5f)
                lineTo(15.25f, 14.5f)
                curveTo(15.6642f, 14.5f, 16.0f, 14.8358f, 16.0f, 15.25f)
                verticalLineTo(17.75f)
                curveTo(16.0f, 18.1642f, 15.6642f, 18.5f, 15.25f, 18.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 18.5f, 7.5f, 18.1642f, 7.5f, 17.75f)
                lineTo(7.5f, 15.25f)
                close()
            }
        }
        .build()
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
