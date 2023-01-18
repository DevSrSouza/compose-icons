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

public val RegularGroup.BowlChopsticks: ImageVector
    get() {
        if (_bowlChopsticks != null) {
            return _bowlChopsticks!!
        }
        _bowlChopsticks = Builder(name = "BowlChopsticks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.4f, 2.3758f)
                curveTo(6.1933f, 2.0168f, 5.7347f, 1.8934f, 5.3758f, 2.1f)
                curveTo(5.0168f, 2.3067f, 4.8934f, 2.7652f, 5.1f, 3.1242f)
                lineTo(9.6346f, 11.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 11.0f, 2.0f, 11.3358f, 2.0f, 11.75f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                verticalLineTo(11.75f)
                curveTo(22.0f, 11.3358f, 21.6642f, 11.0f, 21.25f, 11.0f)
                horizontalLineTo(15.3654f)
                lineTo(10.4f, 2.3758f)
                curveTo(10.1933f, 2.0168f, 9.7347f, 1.8934f, 9.3758f, 2.1f)
                curveTo(9.0168f, 2.3067f, 8.8934f, 2.7652f, 9.1f, 3.1242f)
                lineTo(13.6346f, 11.0f)
                horizontalLineTo(11.3654f)
                lineTo(6.4f, 2.3758f)
                close()
                moveTo(4.7875f, 16.5f)
                horizontalLineTo(19.2124f)
                curveTo(17.7105f, 18.9021f, 15.0419f, 20.5f, 12.0f, 20.5f)
                curveTo(8.9581f, 20.5f, 6.2895f, 18.9021f, 4.7875f, 16.5f)
                close()
                moveTo(4.0445f, 15.0f)
                curveTo(3.7485f, 14.2154f, 3.5652f, 13.3755f, 3.5145f, 12.5f)
                horizontalLineTo(20.4855f)
                curveTo(20.4348f, 13.3755f, 20.2515f, 14.2154f, 19.9554f, 15.0f)
                horizontalLineTo(4.0445f)
                close()
            }
        }
        .build()
        return _bowlChopsticks!!
    }

private var _bowlChopsticks: ImageVector? = null
