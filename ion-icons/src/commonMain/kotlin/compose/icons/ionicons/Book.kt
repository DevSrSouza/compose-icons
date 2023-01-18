package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.24f, 74.0f)
                curveTo(166.11f, 56.75f, 115.61f, 48.3f, 48.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(31.36f, 31.36f, 0.0f, false, false, -17.92f, 5.33f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 16.0f, 79.9f)
                verticalLineTo(366.0f)
                curveToRelative(0.0f, 19.34f, 13.76f, 33.93f, 32.0f, 33.93f)
                curveToRelative(71.07f, 0.0f, 142.36f, 6.64f, 185.06f, 47.0f)
                arcToRelative(4.11f, 4.11f, 0.0f, false, false, 6.94f, -3.0f)
                verticalLineTo(106.82f)
                arcToRelative(15.89f, 15.89f, 0.0f, false, false, -5.46f, -12.0f)
                arcTo(143.0f, 143.0f, 0.0f, false, false, 202.24f, 74.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(481.92f, 53.3f)
                arcTo(31.33f, 31.33f, 0.0f, false, false, 464.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-67.61f, 0.3f, -118.11f, 8.71f, -154.24f, 26.0f)
                arcToRelative(143.31f, 143.31f, 0.0f, false, false, -32.31f, 20.78f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, -5.45f, 12.0f)
                verticalLineTo(443.91f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, 6.68f, 2.81f)
                curveToRelative(25.67f, -25.5f, 70.72f, -46.82f, 185.36f, -46.81f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineToRelative(-288.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 481.92f, 53.3f)
                close()
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
