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

public val RegularGroup.ScanDash: ImageVector
    get() {
        if (_scanDash != null) {
            return _scanDash!!
        }
        _scanDash = Builder(name = "ScanDash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(8.25f)
                curveTo(3.0f, 8.6642f, 3.3358f, 9.0f, 3.75f, 9.0f)
                curveTo(4.1642f, 9.0f, 4.5f, 8.6642f, 4.5f, 8.25f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(8.25f)
                curveTo(8.6642f, 4.5f, 9.0f, 4.1642f, 9.0f, 3.75f)
                curveTo(9.0f, 3.3358f, 8.6642f, 3.0f, 8.25f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(15.75f, 3.0f)
                curveTo(15.3358f, 3.0f, 15.0f, 3.3358f, 15.0f, 3.75f)
                curveTo(15.0f, 4.1642f, 15.3358f, 4.5f, 15.75f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                verticalLineTo(8.25f)
                curveTo(19.5f, 8.6642f, 19.8358f, 9.0f, 20.25f, 9.0f)
                curveTo(20.6642f, 9.0f, 21.0f, 8.6642f, 21.0f, 8.25f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(15.75f)
                close()
                moveTo(4.5f, 15.75f)
                curveTo(4.5f, 15.3358f, 4.1642f, 15.0f, 3.75f, 15.0f)
                curveTo(3.3358f, 15.0f, 3.0f, 15.3358f, 3.0f, 15.75f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(8.25f)
                curveTo(8.6642f, 21.0f, 9.0f, 20.6642f, 9.0f, 20.25f)
                curveTo(9.0f, 19.8358f, 8.6642f, 19.5f, 8.25f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                verticalLineTo(15.75f)
                close()
                moveTo(21.0f, 15.75f)
                curveTo(21.0f, 15.3358f, 20.6642f, 15.0f, 20.25f, 15.0f)
                curveTo(19.8358f, 15.0f, 19.5f, 15.3358f, 19.5f, 15.75f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.7165f, 18.7165f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(15.75f)
                curveTo(15.3358f, 19.5f, 15.0f, 19.8358f, 15.0f, 20.25f)
                curveTo(15.0f, 20.6642f, 15.3358f, 21.0f, 15.75f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(15.75f)
                close()
                moveTo(7.5f, 11.25f)
                curveTo(7.0858f, 11.25f, 6.75f, 11.5858f, 6.75f, 12.0f)
                curveTo(6.75f, 12.4142f, 7.0858f, 12.75f, 7.5f, 12.75f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 12.75f, 17.25f, 12.4142f, 17.25f, 12.0f)
                curveTo(17.25f, 11.5858f, 16.9142f, 11.25f, 16.5f, 11.25f)
                horizontalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _scanDash!!
    }

private var _scanDash: ImageVector? = null
