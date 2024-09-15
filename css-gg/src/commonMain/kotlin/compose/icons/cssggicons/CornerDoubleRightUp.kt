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

public val CssGgIcons.CornerDoubleRightUp: ImageVector
    get() {
        if (_cornerDoubleRightUp != null) {
            return _cornerDoubleRightUp!!
        }
        _cornerDoubleRightUp = Builder(name = "CornerDoubleRightUp", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.216f, 9.25f)
                lineTo(17.631f, 7.836f)
                lineTo(13.388f, 3.594f)
                lineTo(9.145f, 7.836f)
                lineTo(10.559f, 9.25f)
                lineTo(13.388f, 6.422f)
                lineTo(16.216f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.559f, 13.493f)
                lineTo(9.145f, 12.079f)
                lineTo(13.388f, 7.836f)
                lineTo(17.631f, 12.079f)
                lineTo(16.216f, 13.493f)
                lineTo(14.37f, 11.646f)
                verticalLineTo(16.406f)
                curveTo(14.37f, 18.615f, 12.579f, 20.406f, 10.37f, 20.406f)
                horizontalLineTo(6.37f)
                verticalLineTo(18.406f)
                horizontalLineTo(10.37f)
                curveTo(11.474f, 18.406f, 12.37f, 17.511f, 12.37f, 16.406f)
                verticalLineTo(11.683f)
                lineTo(10.559f, 13.493f)
                close()
            }
        }
        .build()
        return _cornerDoubleRightUp!!
    }

private var _cornerDoubleRightUp: ImageVector? = null
