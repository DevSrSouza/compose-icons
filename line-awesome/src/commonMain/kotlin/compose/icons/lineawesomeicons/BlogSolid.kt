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

public val LineAwesomeIcons.BlogSolid: ImageVector
    get() {
        if (_blogSolid != null) {
            return _blogSolid!!
        }
        _blogSolid = Builder(name = "BlogSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.52f, 4.01f)
                curveTo(14.24f, 4.0f, 14.0f, 4.23f, 14.0f, 4.52f)
                lineTo(14.0f, 6.5f)
                curveTo(14.0f, 6.78f, 14.22f, 7.0f, 14.5f, 7.0f)
                lineTo(14.5f, 7.02f)
                curveTo(20.73f, 7.26f, 25.74f, 12.27f, 25.98f, 18.5f)
                lineTo(26.0f, 18.5f)
                curveTo(26.0f, 18.78f, 26.22f, 19.0f, 26.5f, 19.0f)
                lineTo(28.48f, 19.0f)
                curveTo(28.77f, 19.0f, 29.0f, 18.76f, 28.99f, 18.48f)
                curveTo(28.72f, 10.62f, 22.38f, 4.28f, 14.52f, 4.01f)
                close()
                moveTo(14.52f, 9.01f)
                curveTo(14.24f, 9.0f, 14.0f, 9.24f, 14.0f, 9.52f)
                lineTo(14.0f, 11.5f)
                curveTo(14.0f, 11.78f, 14.22f, 12.0f, 14.5f, 12.0f)
                lineTo(14.5f, 12.029f)
                curveTo(17.97f, 12.259f, 20.741f, 15.03f, 20.971f, 18.5f)
                lineTo(21.0f, 18.5f)
                curveTo(21.0f, 18.78f, 21.22f, 19.0f, 21.5f, 19.0f)
                lineTo(23.48f, 19.0f)
                curveTo(23.76f, 19.0f, 24.0f, 18.76f, 23.99f, 18.48f)
                curveTo(23.72f, 13.38f, 19.62f, 9.28f, 14.52f, 9.01f)
                close()
                moveTo(5.5f, 10.0f)
                curveTo(5.22f, 10.0f, 5.0f, 10.22f, 5.0f, 10.5f)
                lineTo(5.0f, 21.5f)
                curveTo(5.0f, 25.08f, 7.92f, 28.0f, 11.5f, 28.0f)
                curveTo(15.08f, 28.0f, 18.0f, 25.08f, 18.0f, 21.5f)
                curveTo(18.0f, 17.92f, 15.08f, 15.0f, 11.5f, 15.0f)
                curveTo(11.22f, 15.0f, 11.0f, 15.22f, 11.0f, 15.5f)
                lineTo(11.0f, 18.5f)
                curveTo(11.0f, 18.78f, 11.22f, 19.0f, 11.5f, 19.0f)
                curveTo(12.88f, 19.0f, 14.0f, 20.12f, 14.0f, 21.5f)
                curveTo(14.0f, 22.88f, 12.88f, 24.0f, 11.5f, 24.0f)
                curveTo(10.12f, 24.0f, 9.0f, 22.88f, 9.0f, 21.5f)
                lineTo(9.0f, 10.5f)
                curveTo(9.0f, 10.22f, 8.78f, 10.0f, 8.5f, 10.0f)
                lineTo(5.5f, 10.0f)
                close()
            }
        }
        .build()
        return _blogSolid!!
    }

private var _blogSolid: ImageVector? = null
