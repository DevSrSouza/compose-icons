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

public val FilledGroup.TextPositionFront: ImageVector
    get() {
        if (_textPositionFront != null) {
            return _textPositionFront!!
        }
        _textPositionFront = Builder(name = "TextPositionFront", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 3.75f)
                curveTo(3.1977f, 3.75f, 2.75f, 4.1977f, 2.75f, 4.75f)
                curveTo(2.75f, 5.3023f, 3.1977f, 5.75f, 3.75f, 5.75f)
                horizontalLineTo(20.25f)
                curveTo(20.8023f, 5.75f, 21.25f, 5.3023f, 21.25f, 4.75f)
                curveTo(21.25f, 4.1977f, 20.8023f, 3.75f, 20.25f, 3.75f)
                horizontalLineTo(3.75f)
                close()
                moveTo(12.0f, 8.75f)
                curveTo(11.2199f, 8.75f, 10.5325f, 9.147f, 10.1289f, 9.75f)
                horizontalLineTo(7.9368f)
                curveTo(8.4706f, 8.0128f, 10.0878f, 6.75f, 12.0f, 6.75f)
                curveTo(13.9122f, 6.75f, 15.5294f, 8.0128f, 16.0632f, 9.75f)
                horizontalLineTo(13.8711f)
                curveTo(13.4675f, 9.147f, 12.7801f, 8.75f, 12.0f, 8.75f)
                close()
                moveTo(3.75f, 10.75f)
                curveTo(3.1977f, 10.75f, 2.75f, 11.1977f, 2.75f, 11.75f)
                curveTo(2.75f, 12.3023f, 3.1977f, 12.75f, 3.75f, 12.75f)
                horizontalLineTo(20.25f)
                curveTo(20.8023f, 12.75f, 21.25f, 12.3023f, 21.25f, 11.75f)
                curveTo(21.25f, 11.1977f, 20.8023f, 10.75f, 20.25f, 10.75f)
                horizontalLineTo(3.75f)
                close()
                moveTo(7.75f, 13.75f)
                horizontalLineTo(9.75f)
                verticalLineTo(15.75f)
                curveTo(9.75f, 16.3023f, 9.3023f, 16.75f, 8.75f, 16.75f)
                curveTo(8.1977f, 16.75f, 7.75f, 16.3023f, 7.75f, 15.75f)
                verticalLineTo(13.75f)
                close()
                moveTo(16.25f, 13.75f)
                horizontalLineTo(14.25f)
                verticalLineTo(15.75f)
                curveTo(14.25f, 16.3023f, 14.6977f, 16.75f, 15.25f, 16.75f)
                curveTo(15.8023f, 16.75f, 16.25f, 16.3023f, 16.25f, 15.75f)
                verticalLineTo(13.75f)
                close()
                moveTo(2.75f, 18.75f)
                curveTo(2.75f, 18.1977f, 3.1977f, 17.75f, 3.75f, 17.75f)
                horizontalLineTo(20.25f)
                curveTo(20.8023f, 17.75f, 21.25f, 18.1977f, 21.25f, 18.75f)
                curveTo(21.25f, 19.3023f, 20.8023f, 19.75f, 20.25f, 19.75f)
                horizontalLineTo(3.75f)
                curveTo(3.1977f, 19.75f, 2.75f, 19.3023f, 2.75f, 18.75f)
                close()
            }
        }
        .build()
        return _textPositionFront!!
    }

private var _textPositionFront: ImageVector? = null
