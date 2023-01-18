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

public val RegularGroup.Resize: ImageVector
    get() {
        if (_resize != null) {
            return _resize!!
        }
        _resize = Builder(name = "Resize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.75f)
                curveTo(11.0f, 2.3358f, 10.6642f, 2.0f, 10.25f, 2.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 2.0f, 2.0f, 3.4551f, 2.0f, 5.25f)
                verticalLineTo(10.25f)
                curveTo(2.0f, 10.6642f, 2.3358f, 11.0f, 2.75f, 11.0f)
                curveTo(3.1642f, 11.0f, 3.5f, 10.6642f, 3.5f, 10.25f)
                verticalLineTo(5.25f)
                curveTo(3.5f, 4.2835f, 4.2835f, 3.5f, 5.25f, 3.5f)
                horizontalLineTo(10.25f)
                curveTo(10.6642f, 3.5f, 11.0f, 3.1642f, 11.0f, 2.75f)
                close()
                moveTo(13.75f, 2.0f)
                curveTo(13.3358f, 2.0f, 13.0f, 2.3358f, 13.0f, 2.75f)
                curveTo(13.0f, 3.1642f, 13.3358f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 3.5f, 20.5f, 4.2835f, 20.5f, 5.25f)
                verticalLineTo(10.25f)
                curveTo(20.5f, 10.6642f, 20.8358f, 11.0f, 21.25f, 11.0f)
                curveTo(21.6642f, 11.0f, 22.0f, 10.6642f, 22.0f, 10.25f)
                verticalLineTo(5.25f)
                curveTo(22.0f, 3.4551f, 20.5449f, 2.0f, 18.75f, 2.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(13.75f, 22.0f)
                curveTo(13.3358f, 22.0f, 13.0f, 21.6642f, 13.0f, 21.25f)
                curveTo(13.0f, 20.8358f, 13.3358f, 20.5f, 13.75f, 20.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 20.5f, 20.5f, 19.7165f, 20.5f, 18.75f)
                verticalLineTo(13.75f)
                curveTo(20.5f, 13.3358f, 20.8358f, 13.0f, 21.25f, 13.0f)
                curveTo(21.6642f, 13.0f, 22.0f, 13.3358f, 22.0f, 13.75f)
                verticalLineTo(18.75f)
                curveTo(22.0f, 20.5449f, 20.5449f, 22.0f, 18.75f, 22.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(10.25f, 22.0f)
                curveTo(10.6642f, 22.0f, 11.0f, 21.6642f, 11.0f, 21.25f)
                curveTo(11.0f, 20.8358f, 10.6642f, 20.5f, 10.25f, 20.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 20.5f, 3.5f, 19.7165f, 3.5f, 18.75f)
                verticalLineTo(13.75f)
                curveTo(3.5f, 13.3358f, 3.1642f, 13.0f, 2.75f, 13.0f)
                curveTo(2.3358f, 13.0f, 2.0f, 13.3358f, 2.0f, 13.75f)
                verticalLineTo(18.75f)
                curveTo(2.0f, 20.5449f, 3.4551f, 22.0f, 5.25f, 22.0f)
                horizontalLineTo(10.25f)
                close()
            }
        }
        .build()
        return _resize!!
    }

private var _resize: ImageVector? = null
