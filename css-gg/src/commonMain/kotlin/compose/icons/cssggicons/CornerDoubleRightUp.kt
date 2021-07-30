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
                moveTo(16.2163f, 9.2505f)
                lineTo(17.6305f, 7.8362f)
                lineTo(13.3879f, 3.5936f)
                lineTo(9.1453f, 7.8363f)
                lineTo(10.5595f, 9.2505f)
                lineTo(13.3879f, 6.422f)
                lineTo(16.2163f, 9.2505f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5595f, 13.4932f)
                lineTo(9.1453f, 12.0789f)
                lineTo(13.3879f, 7.8363f)
                lineTo(17.6305f, 12.0789f)
                lineTo(16.2163f, 13.4931f)
                lineTo(14.3695f, 11.6463f)
                verticalLineTo(16.4063f)
                curveTo(14.3695f, 18.6155f, 12.5786f, 20.4063f, 10.3695f, 20.4063f)
                horizontalLineTo(6.3695f)
                verticalLineTo(18.4063f)
                horizontalLineTo(10.3695f)
                curveTo(11.4741f, 18.4063f, 12.3695f, 17.5109f, 12.3695f, 16.4063f)
                verticalLineTo(11.6831f)
                lineTo(10.5595f, 13.4932f)
                close()
            }
        }
        .build()
        return _cornerDoubleRightUp!!
    }

private var _cornerDoubleRightUp: ImageVector? = null
