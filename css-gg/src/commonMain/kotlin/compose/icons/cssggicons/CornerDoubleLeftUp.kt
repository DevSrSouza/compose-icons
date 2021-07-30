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
                moveTo(7.7837f, 9.2505f)
                lineTo(6.3695f, 7.8362f)
                lineTo(10.6121f, 3.5936f)
                lineTo(14.8548f, 7.8363f)
                lineTo(13.4406f, 9.2505f)
                lineTo(10.6121f, 6.422f)
                lineTo(7.7837f, 9.2505f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4406f, 13.4932f)
                lineTo(14.8548f, 12.0789f)
                lineTo(10.6121f, 7.8363f)
                lineTo(6.3695f, 12.0789f)
                lineTo(7.7837f, 13.4931f)
                lineTo(9.6305f, 11.6463f)
                verticalLineTo(16.4063f)
                curveTo(9.6305f, 18.6155f, 11.4214f, 20.4063f, 13.6305f, 20.4063f)
                horizontalLineTo(17.6305f)
                verticalLineTo(18.4063f)
                horizontalLineTo(13.6305f)
                curveTo(12.526f, 18.4063f, 11.6305f, 17.5109f, 11.6305f, 16.4063f)
                verticalLineTo(11.6831f)
                lineTo(13.4406f, 13.4932f)
                close()
            }
        }
        .build()
        return _cornerDoubleLeftUp!!
    }

private var _cornerDoubleLeftUp: ImageVector? = null
