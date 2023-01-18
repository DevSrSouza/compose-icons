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

public val FilledGroup.TextboxAlignTop: ImageVector
    get() {
        if (_textboxAlignTop != null) {
            return _textboxAlignTop!!
        }
        _textboxAlignTop = Builder(name = "TextboxAlignTop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(7.0f, 7.4844f)
                lineTo(6.8643f, 7.4912f)
                curveTo(6.3762f, 7.5409f, 6.0f, 7.8547f, 6.0f, 8.2344f)
                curveTo(6.0f, 8.6486f, 6.4477f, 8.9844f, 7.0f, 8.9844f)
                horizontalLineTo(17.0f)
                lineTo(17.1357f, 8.9775f)
                curveTo(17.6238f, 8.9279f, 18.0f, 8.6141f, 18.0f, 8.2344f)
                curveTo(18.0f, 7.8202f, 17.5523f, 7.4844f, 17.0f, 7.4844f)
                horizontalLineTo(7.0f)
                close()
                moveTo(17.0f, 10.4844f)
                horizontalLineTo(7.0f)
                lineTo(6.8643f, 10.4912f)
                curveTo(6.3762f, 10.5409f, 6.0f, 10.8547f, 6.0f, 11.2344f)
                curveTo(6.0f, 11.6486f, 6.4477f, 11.9844f, 7.0f, 11.9844f)
                horizontalLineTo(17.0f)
                lineTo(17.1357f, 11.9775f)
                curveTo(17.6238f, 11.9279f, 18.0f, 11.6141f, 18.0f, 11.2344f)
                curveTo(18.0f, 10.8202f, 17.5523f, 10.4844f, 17.0f, 10.4844f)
                close()
            }
        }
        .build()
        return _textboxAlignTop!!
    }

private var _textboxAlignTop: ImageVector? = null
