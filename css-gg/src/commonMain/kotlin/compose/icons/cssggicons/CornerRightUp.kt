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
                moveTo(9.29f, 10.625f)
                lineTo(7.877f, 9.21f)
                lineTo(14.247f, 2.852f)
                lineTo(20.605f, 9.222f)
                lineTo(19.19f, 10.635f)
                lineTo(15.408f, 6.846f)
                lineTo(15.399f, 17.152f)
                curveTo(15.397f, 19.361f, 13.604f, 21.15f, 11.395f, 21.148f)
                lineTo(3.395f, 21.141f)
                lineTo(3.397f, 19.141f)
                lineTo(11.397f, 19.148f)
                curveTo(12.501f, 19.149f, 13.398f, 18.255f, 13.399f, 17.15f)
                lineTo(13.408f, 6.514f)
                lineTo(9.29f, 10.625f)
                close()
            }
        }
        .build()
        return _cornerRightUp!!
    }

private var _cornerRightUp: ImageVector? = null
