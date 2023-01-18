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

public val FilledGroup.Filmstrip: ImageVector
    get() {
        if (_filmstrip != null) {
            return _filmstrip!!
        }
        _filmstrip = Builder(name = "Filmstrip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.25f)
                curveTo(22.0f, 5.0074f, 20.9926f, 4.0f, 19.75f, 4.0f)
                lineTo(4.25f, 4.0f)
                curveTo(3.0074f, 4.0f, 2.0f, 5.0074f, 2.0f, 6.25f)
                lineTo(2.0f, 17.75f)
                curveTo(2.0f, 18.9926f, 3.0074f, 20.0f, 4.25f, 20.0f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 20.0f, 22.0f, 18.9926f, 22.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(19.75f, 5.5f)
                curveTo(20.1642f, 5.5f, 20.5f, 5.8358f, 20.5f, 6.25f)
                verticalLineTo(7.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.5f)
                horizontalLineTo(19.75f)
                close()
                moveTo(18.0f, 9.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(18.0f, 16.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(17.75f)
                curveTo(20.5f, 18.1642f, 20.1642f, 18.5f, 19.75f, 18.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.5f)
                close()
                moveTo(6.0f, 5.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(6.25f)
                curveTo(3.5f, 5.8358f, 3.8358f, 5.5f, 4.25f, 5.5f)
                horizontalLineTo(6.0f)
                close()
                moveTo(6.0f, 16.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(4.25f)
                curveTo(3.8358f, 18.5f, 3.5f, 18.1642f, 3.5f, 17.75f)
                verticalLineTo(16.5f)
                horizontalLineTo(6.0f)
                close()
                moveTo(6.0f, 15.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(6.0f, 9.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(3.5f)
                lineTo(3.5f, 9.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _filmstrip!!
    }

private var _filmstrip: ImageVector? = null
