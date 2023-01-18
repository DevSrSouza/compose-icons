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

public val FilledGroup.TextboxAlignBottom: ImageVector
    get() {
        if (_textboxAlignBottom != null) {
            return _textboxAlignBottom!!
        }
        _textboxAlignBottom = Builder(name = "TextboxAlignBottom", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 3.0f)
                curveTo(19.7688f, 3.0f, 21.0f, 4.2312f, 21.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(21.0f, 19.7688f, 19.7688f, 21.0f, 18.25f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 21.0f, 3.0f, 19.7688f, 3.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(3.0f, 4.2312f, 4.2312f, 3.0f, 5.75f, 3.0f)
                horizontalLineTo(18.25f)
                close()
                moveTo(6.75f, 13.5f)
                lineTo(6.6482f, 13.5068f)
                curveTo(6.2821f, 13.5565f, 6.0f, 13.8703f, 6.0f, 14.25f)
                curveTo(6.0f, 14.6642f, 6.3358f, 15.0f, 6.75f, 15.0f)
                horizontalLineTo(17.25f)
                lineTo(17.3518f, 14.9932f)
                curveTo(17.7178f, 14.9435f, 18.0f, 14.6297f, 18.0f, 14.25f)
                curveTo(18.0f, 13.8358f, 17.6642f, 13.5f, 17.25f, 13.5f)
                horizontalLineTo(6.75f)
                close()
                moveTo(17.25f, 16.5f)
                horizontalLineTo(6.75f)
                lineTo(6.6482f, 16.5068f)
                curveTo(6.2821f, 16.5565f, 6.0f, 16.8703f, 6.0f, 17.25f)
                curveTo(6.0f, 17.6642f, 6.3358f, 18.0f, 6.75f, 18.0f)
                horizontalLineTo(17.25f)
                lineTo(17.3518f, 17.9932f)
                curveTo(17.7178f, 17.9435f, 18.0f, 17.6297f, 18.0f, 17.25f)
                curveTo(18.0f, 16.8358f, 17.6642f, 16.5f, 17.25f, 16.5f)
                close()
            }
        }
        .build()
        return _textboxAlignBottom!!
    }

private var _textboxAlignBottom: ImageVector? = null
