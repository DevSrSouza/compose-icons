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

public val FilledGroup.TextPositionTopBottom: ImageVector
    get() {
        if (_textPositionTopBottom != null) {
            return _textPositionTopBottom!!
        }
        _textPositionTopBottom = Builder(name = "TextPositionTopBottom", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 4.75f)
                curveTo(2.75f, 4.1977f, 3.1977f, 3.75f, 3.75f, 3.75f)
                horizontalLineTo(20.25f)
                curveTo(20.8023f, 3.75f, 21.25f, 4.1977f, 21.25f, 4.75f)
                curveTo(21.25f, 5.3023f, 20.8023f, 5.75f, 20.25f, 5.75f)
                horizontalLineTo(3.75f)
                curveTo(3.1977f, 5.75f, 2.75f, 5.3023f, 2.75f, 4.75f)
                close()
                moveTo(2.75f, 18.75f)
                curveTo(2.75f, 18.1977f, 3.1977f, 17.75f, 3.75f, 17.75f)
                horizontalLineTo(20.25f)
                curveTo(20.8023f, 17.75f, 21.25f, 18.1977f, 21.25f, 18.75f)
                curveTo(21.25f, 19.3023f, 20.8023f, 19.75f, 20.25f, 19.75f)
                horizontalLineTo(3.75f)
                curveTo(3.1977f, 19.75f, 2.75f, 19.3023f, 2.75f, 18.75f)
                close()
                moveTo(9.75f, 11.0f)
                curveTo(9.75f, 9.7574f, 10.7574f, 8.75f, 12.0f, 8.75f)
                curveTo(13.2426f, 8.75f, 14.25f, 9.7574f, 14.25f, 11.0f)
                verticalLineTo(15.75f)
                curveTo(14.25f, 16.3023f, 14.6977f, 16.75f, 15.25f, 16.75f)
                curveTo(15.8023f, 16.75f, 16.25f, 16.3023f, 16.25f, 15.75f)
                verticalLineTo(11.0f)
                curveTo(16.25f, 8.6528f, 14.3472f, 6.75f, 12.0f, 6.75f)
                curveTo(9.6528f, 6.75f, 7.75f, 8.6528f, 7.75f, 11.0f)
                verticalLineTo(15.75f)
                curveTo(7.75f, 16.3023f, 8.1977f, 16.75f, 8.75f, 16.75f)
                curveTo(9.3023f, 16.75f, 9.75f, 16.3023f, 9.75f, 15.75f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _textPositionTopBottom!!
    }

private var _textPositionTopBottom: ImageVector? = null
