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

public val CssGgIcons.CornerRightDown: ImageVector
    get() {
        if (_cornerRightDown != null) {
            return _cornerRightDown!!
        }
        _cornerRightDown = Builder(name = "CornerRightDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.399f, 6.85f)
                curveTo(13.398f, 5.745f, 12.501f, 4.851f, 11.397f, 4.852f)
                lineTo(3.397f, 4.859f)
                lineTo(3.395f, 2.859f)
                lineTo(11.395f, 2.852f)
                curveTo(13.604f, 2.85f, 15.397f, 4.639f, 15.399f, 6.848f)
                lineTo(15.408f, 17.154f)
                lineTo(19.19f, 13.366f)
                lineTo(20.605f, 14.778f)
                lineTo(14.247f, 21.148f)
                lineTo(7.877f, 14.79f)
                lineTo(9.29f, 13.375f)
                lineTo(13.408f, 17.486f)
                lineTo(13.399f, 6.85f)
                close()
            }
        }
        .build()
        return _cornerRightDown!!
    }

private var _cornerRightDown: ImageVector? = null
