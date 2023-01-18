package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DocumentMargins: ImageVector
    get() {
        if (_documentMargins != null) {
            return _documentMargins!!
        }
        _documentMargins = Builder(name = "DocumentMargins", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 2.0f)
                curveTo(5.1193f, 2.0f, 4.0f, 3.1193f, 4.0f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(4.0f, 20.8807f, 5.1193f, 22.0f, 6.5f, 22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.75f)
                curveTo(7.0f, 18.3358f, 7.3358f, 18.0f, 7.75f, 18.0f)
                curveTo(8.1642f, 18.0f, 8.5f, 18.3358f, 8.5f, 18.75f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(18.75f)
                curveTo(15.5f, 18.3358f, 15.8358f, 18.0f, 16.25f, 18.0f)
                curveTo(16.6642f, 18.0f, 17.0f, 18.3358f, 17.0f, 18.75f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 22.0f, 20.0f, 20.8807f, 20.0f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(20.0f, 3.1193f, 18.8807f, 2.0f, 17.5f, 2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.25f)
                curveTo(17.0f, 5.6642f, 16.6642f, 6.0f, 16.25f, 6.0f)
                curveTo(15.8358f, 6.0f, 15.5f, 5.6642f, 15.5f, 5.25f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(5.25f)
                curveTo(8.5f, 5.6642f, 8.1642f, 6.0f, 7.75f, 6.0f)
                curveTo(7.3358f, 6.0f, 7.0f, 5.6642f, 7.0f, 5.25f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(7.75f, 16.5f)
                curveTo(7.3358f, 16.5f, 7.0f, 16.1642f, 7.0f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(7.0f, 7.8358f, 7.3358f, 7.5f, 7.75f, 7.5f)
                curveTo(8.1642f, 7.5f, 8.5f, 7.8358f, 8.5f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(8.5f, 16.1642f, 8.1642f, 16.5f, 7.75f, 16.5f)
                close()
                moveTo(16.25f, 16.5f)
                curveTo(15.8358f, 16.5f, 15.5f, 16.1642f, 15.5f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(15.5f, 7.8358f, 15.8358f, 7.5f, 16.25f, 7.5f)
                curveTo(16.6642f, 7.5f, 17.0f, 7.8358f, 17.0f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(17.0f, 16.1642f, 16.6642f, 16.5f, 16.25f, 16.5f)
                close()
            }
        }
        .build()
        return _documentMargins!!
    }

private var _documentMargins: ImageVector? = null
