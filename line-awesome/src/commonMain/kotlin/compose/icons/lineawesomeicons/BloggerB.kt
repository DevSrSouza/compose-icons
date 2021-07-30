package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.BloggerB: ImageVector
    get() {
        if (_bloggerB != null) {
            return _bloggerB!!
        }
        _bloggerB = Builder(name = "BloggerB", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.0f)
                curveTo(9.686f, 7.0f, 7.0f, 9.686f, 7.0f, 13.0f)
                lineTo(7.0f, 20.0f)
                curveTo(7.0f, 23.314f, 9.686f, 26.0f, 13.0f, 26.0f)
                lineTo(20.0f, 26.0f)
                curveTo(23.314f, 26.0f, 26.0f, 23.314f, 26.0f, 20.0f)
                lineTo(26.0f, 15.0f)
                curveTo(26.0f, 14.448f, 25.552f, 14.0f, 25.0f, 14.0f)
                lineTo(24.0f, 14.0f)
                curveTo(23.448f, 14.0f, 23.0f, 13.552f, 23.0f, 13.0f)
                curveTo(23.0f, 9.686f, 20.314f, 7.0f, 17.0f, 7.0f)
                lineTo(13.0f, 7.0f)
                close()
                moveTo(13.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                curveTo(17.55f, 12.0f, 18.0f, 12.45f, 18.0f, 13.0f)
                curveTo(18.0f, 13.55f, 17.55f, 14.0f, 17.0f, 14.0f)
                lineTo(13.0f, 14.0f)
                curveTo(12.45f, 14.0f, 12.0f, 13.55f, 12.0f, 13.0f)
                curveTo(12.0f, 12.45f, 12.45f, 12.0f, 13.0f, 12.0f)
                close()
                moveTo(13.0f, 19.0f)
                lineTo(20.0f, 19.0f)
                curveTo(20.55f, 19.0f, 21.0f, 19.45f, 21.0f, 20.0f)
                curveTo(21.0f, 20.55f, 20.55f, 21.0f, 20.0f, 21.0f)
                lineTo(13.0f, 21.0f)
                curveTo(12.45f, 21.0f, 12.0f, 20.55f, 12.0f, 20.0f)
                curveTo(12.0f, 19.45f, 12.45f, 19.0f, 13.0f, 19.0f)
                close()
            }
        }
        .build()
        return _bloggerB!!
    }

private var _bloggerB: ImageVector? = null
