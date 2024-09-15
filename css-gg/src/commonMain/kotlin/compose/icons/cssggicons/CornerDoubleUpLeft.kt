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

public val CssGgIcons.CornerDoubleUpLeft: ImageVector
    get() {
        if (_cornerDoubleUpLeft != null) {
            return _cornerDoubleUpLeft!!
        }
        _cornerDoubleUpLeft = Builder(name = "CornerDoubleUpLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.25f, 7.784f)
                lineTo(7.836f, 6.369f)
                lineTo(3.594f, 10.612f)
                lineTo(7.836f, 14.855f)
                lineTo(9.25f, 13.441f)
                lineTo(6.422f, 10.612f)
                lineTo(9.25f, 7.784f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.493f, 13.441f)
                lineTo(12.079f, 14.855f)
                lineTo(7.836f, 10.612f)
                lineTo(12.079f, 6.369f)
                lineTo(13.493f, 7.784f)
                lineTo(11.646f, 9.63f)
                lineTo(16.406f, 9.63f)
                curveTo(18.615f, 9.63f, 20.406f, 11.421f, 20.406f, 13.63f)
                lineTo(20.406f, 17.631f)
                lineTo(18.406f, 17.631f)
                lineTo(18.406f, 13.63f)
                curveTo(18.406f, 12.526f, 17.511f, 11.63f, 16.406f, 11.63f)
                lineTo(11.683f, 11.63f)
                lineTo(13.493f, 13.441f)
                close()
            }
        }
        .build()
        return _cornerDoubleUpLeft!!
    }

private var _cornerDoubleUpLeft: ImageVector? = null
