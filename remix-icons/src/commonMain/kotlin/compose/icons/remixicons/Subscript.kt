package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Subscript: ImageVector
    get() {
        if (_subscript != null) {
            return _subscript!!
        }
        _subscript = Builder(name = "Subscript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.596f, 4.0f)
                lineTo(10.5f, 9.928f)
                lineTo(15.404f, 4.0f)
                horizontalLineTo(18.0f)
                lineToRelative(-6.202f, 7.497f)
                lineTo(18.0f, 18.994f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(-4.91f, -5.934f)
                lineTo(5.59f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-0.006f)
                lineToRelative(6.202f, -7.497f)
                lineTo(3.0f, 4.0f)
                horizontalLineToRelative(2.596f)
                close()
                moveTo(21.55f, 16.58f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, false, -1.32f, -0.36f)
                lineToRelative(-1.155f, 0.33f)
                arcTo(2.001f, 2.001f, 0.0f, false, true, 21.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.373f, 3.454f)
                lineTo(20.744f, 19.0f)
                horizontalLineTo(23.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(2.55f, -2.42f)
                close()
            }
        }
        .build()
        return _subscript!!
    }

private var _subscript: ImageVector? = null
