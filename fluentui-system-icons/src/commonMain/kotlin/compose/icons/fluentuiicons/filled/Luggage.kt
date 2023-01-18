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

public val FilledGroup.Luggage: ImageVector
    get() {
        if (_luggage != null) {
            return _luggage!!
        }
        _luggage = Builder(name = "Luggage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 2.0f)
                curveTo(8.3358f, 2.0f, 8.0f, 2.3358f, 8.0f, 2.75f)
                curveTo(8.0f, 3.1642f, 8.3358f, 3.5f, 8.75f, 3.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.25f)
                curveTo(6.4551f, 5.0f, 5.0f, 6.4551f, 5.0f, 8.25f)
                verticalLineTo(17.25f)
                curveTo(5.0f, 18.602f, 5.8255f, 19.7611f, 7.0f, 20.2509f)
                verticalLineTo(21.25f)
                curveTo(7.0f, 21.6642f, 7.3358f, 22.0f, 7.75f, 22.0f)
                curveTo(8.1642f, 22.0f, 8.5f, 21.6642f, 8.5f, 21.25f)
                verticalLineTo(20.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(21.25f)
                curveTo(15.5f, 21.6642f, 15.8358f, 22.0f, 16.25f, 22.0f)
                curveTo(16.6642f, 22.0f, 17.0f, 21.6642f, 17.0f, 21.25f)
                verticalLineTo(20.2509f)
                curveTo(18.1745f, 19.7611f, 19.0f, 18.602f, 19.0f, 17.25f)
                verticalLineTo(8.25f)
                curveTo(19.0f, 6.4551f, 17.5449f, 5.0f, 15.75f, 5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 3.5f, 16.0f, 3.1642f, 16.0f, 2.75f)
                curveTo(16.0f, 2.3358f, 15.6642f, 2.0f, 15.25f, 2.0f)
                horizontalLineTo(8.75f)
                close()
                moveTo(13.5f, 3.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(13.5f)
                close()
                moveTo(8.0f, 9.75f)
                curveTo(8.0f, 9.3358f, 8.3358f, 9.0f, 8.75f, 9.0f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 9.0f, 16.0f, 9.3358f, 16.0f, 9.75f)
                curveTo(16.0f, 10.1642f, 15.6642f, 10.5f, 15.25f, 10.5f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 10.5f, 8.0f, 10.1642f, 8.0f, 9.75f)
                close()
            }
        }
        .build()
        return _luggage!!
    }

private var _luggage: ImageVector? = null
