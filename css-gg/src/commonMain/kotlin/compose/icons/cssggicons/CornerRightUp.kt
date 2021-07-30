package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CornerRightUp: ImageVector
    get() {
        if (_cornerRightUp != null) {
            return _cornerRightUp!!
        }
        _cornerRightUp = Builder(name = "CornerRightUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.29f, 10.6254f)
                lineTo(7.8771f, 9.2099f)
                lineTo(14.2469f, 2.8518f)
                lineTo(20.605f, 9.2216f)
                lineTo(19.1895f, 10.6346f)
                lineTo(15.4082f, 6.8463f)
                lineTo(15.3987f, 17.152f)
                curveTo(15.3967f, 19.3611f, 13.6042f, 21.1503f, 11.395f, 21.1483f)
                lineTo(3.395f, 21.1409f)
                lineTo(3.3969f, 19.1409f)
                lineTo(11.3969f, 19.1483f)
                curveTo(12.5014f, 19.1493f, 13.3977f, 18.2547f, 13.3987f, 17.1501f)
                lineTo(13.4085f, 6.5145f)
                lineTo(9.29f, 10.6254f)
                close()
            }
        }
        .build()
        return _cornerRightUp!!
    }

private var _cornerRightUp: ImageVector? = null
