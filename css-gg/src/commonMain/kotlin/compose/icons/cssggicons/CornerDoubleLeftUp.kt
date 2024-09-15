package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CornerDoubleLeftUp: ImageVector
    get() {
        if (_cornerDoubleLeftUp != null) {
            return _cornerDoubleLeftUp!!
        }
        _cornerDoubleLeftUp = Builder(name = "CornerDoubleLeftUp", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.784f, 9.25f)
                lineTo(6.37f, 7.836f)
                lineTo(10.612f, 3.594f)
                lineTo(14.855f, 7.836f)
                lineTo(13.441f, 9.25f)
                lineTo(10.612f, 6.422f)
                lineTo(7.784f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.441f, 13.493f)
                lineTo(14.855f, 12.079f)
                lineTo(10.612f, 7.836f)
                lineTo(6.37f, 12.079f)
                lineTo(7.784f, 13.493f)
                lineTo(9.631f, 11.646f)
                verticalLineTo(16.406f)
                curveTo(9.631f, 18.615f, 11.421f, 20.406f, 13.63f, 20.406f)
                horizontalLineTo(17.631f)
                verticalLineTo(18.406f)
                horizontalLineTo(13.63f)
                curveTo(12.526f, 18.406f, 11.63f, 17.511f, 11.63f, 16.406f)
                verticalLineTo(11.683f)
                lineTo(13.441f, 13.493f)
                close()
            }
        }
        .build()
        return _cornerDoubleLeftUp!!
    }

private var _cornerDoubleLeftUp: ImageVector? = null
