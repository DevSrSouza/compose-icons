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
                moveTo(9.2505f, 7.7837f)
                lineTo(7.8362f, 6.3695f)
                lineTo(3.5936f, 10.6121f)
                lineTo(7.8363f, 14.8547f)
                lineTo(9.2505f, 13.4405f)
                lineTo(6.422f, 10.6121f)
                lineTo(9.2505f, 7.7837f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4932f, 13.4405f)
                lineTo(12.0789f, 14.8547f)
                lineTo(7.8363f, 10.6121f)
                lineTo(12.0789f, 6.3695f)
                lineTo(13.4931f, 7.7837f)
                lineTo(11.6463f, 9.6305f)
                lineTo(16.4063f, 9.6305f)
                curveTo(18.6155f, 9.6305f, 20.4063f, 11.4214f, 20.4063f, 13.6305f)
                lineTo(20.4063f, 17.6305f)
                lineTo(18.4063f, 17.6305f)
                lineTo(18.4063f, 13.6305f)
                curveTo(18.4063f, 12.5259f, 17.5109f, 11.6305f, 16.4063f, 11.6305f)
                lineTo(11.6831f, 11.6305f)
                lineTo(13.4932f, 13.4405f)
                close()
            }
        }
        .build()
        return _cornerDoubleUpLeft!!
    }

private var _cornerDoubleUpLeft: ImageVector? = null
