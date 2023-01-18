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

public val FilledGroup.Headphones: ImageVector
    get() {
        if (_headphones != null) {
            return _headphones!!
        }
        _headphones = Builder(name = "Headphones", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 20.6569f, 20.6569f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(15.4477f, 22.0f, 15.0f, 21.5523f, 15.0f, 21.0f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 14.4477f, 15.4477f, 14.0f, 16.0f, 14.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(12.0f)
                curveTo(20.5f, 7.3056f, 16.6944f, 3.5f, 12.0f, 3.5f)
                curveTo(7.3056f, 3.5f, 3.5f, 7.3056f, 3.5f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                curveTo(8.5523f, 14.0f, 9.0f, 14.4477f, 9.0f, 15.0f)
                verticalLineTo(21.0f)
                curveTo(9.0f, 21.5523f, 8.5523f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3431f, 22.0f, 2.0f, 20.6569f, 2.0f, 19.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _headphones!!
    }

private var _headphones: ImageVector? = null
