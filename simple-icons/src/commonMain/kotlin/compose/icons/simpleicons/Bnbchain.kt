package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Bnbchain: ImageVector
    get() {
        if (_bnbchain != null) {
            return _bnbchain!!
        }
        _bnbchain = Builder(name = "Bnbchain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.631f, 3.676f)
                lineTo(12.001f, 0.0f)
                lineToRelative(6.367f, 3.676f)
                lineToRelative(-2.34f, 1.358f)
                lineTo(12.0f, 2.716f)
                lineTo(7.972f, 5.034f)
                lineToRelative(-2.34f, -1.358f)
                close()
                moveTo(18.368f, 8.312f)
                lineTo(16.028f, 6.954f)
                lineTo(12.0f, 9.272f)
                lineTo(7.972f, 6.954f)
                lineToRelative(-2.34f, 1.358f)
                verticalLineToRelative(2.716f)
                lineToRelative(4.026f, 2.318f)
                verticalLineToRelative(4.636f)
                lineTo(12.0f, 19.341f)
                lineToRelative(2.341f, -1.359f)
                verticalLineToRelative(-4.636f)
                lineToRelative(4.027f, -2.318f)
                lineTo(18.368f, 8.312f)
                close()
                moveTo(18.368f, 15.664f)
                verticalLineToRelative(-2.716f)
                lineToRelative(-2.34f, 1.358f)
                verticalLineToRelative(2.716f)
                lineToRelative(2.34f, -1.358f)
                close()
                moveTo(20.031f, 16.624f)
                lineTo(16.004f, 18.942f)
                verticalLineToRelative(2.717f)
                lineToRelative(6.368f, -3.677f)
                lineTo(22.372f, 10.63f)
                lineToRelative(-2.34f, 1.358f)
                verticalLineToRelative(4.636f)
                close()
                moveTo(17.691f, 5.994f)
                lineTo(20.031f, 7.352f)
                verticalLineToRelative(2.716f)
                lineToRelative(2.341f, -1.358f)
                lineTo(22.372f, 5.994f)
                lineToRelative(-2.34f, -1.358f)
                lineToRelative(-2.342f, 1.358f)
                close()
                moveTo(9.657f, 19.926f)
                verticalLineToRelative(2.716f)
                lineTo(12.0f, 24.0f)
                lineToRelative(2.341f, -1.358f)
                verticalLineToRelative(-2.716f)
                lineToRelative(-2.34f, 1.358f)
                lineToRelative(-2.343f, -1.358f)
                close()
                moveTo(5.63f, 15.664f)
                lineTo(7.971f, 17.022f)
                verticalLineToRelative(-2.716f)
                lineToRelative(-2.34f, -1.358f)
                verticalLineToRelative(2.716f)
                close()
                moveTo(9.657f, 5.994f)
                lineTo(12.0f, 7.352f)
                lineToRelative(2.341f, -1.358f)
                lineToRelative(-2.34f, -1.358f)
                lineToRelative(-2.343f, 1.358f)
                close()
                moveTo(3.967f, 7.352f)
                lineTo(6.31f, 5.994f)
                lineTo(3.968f, 4.636f)
                lineToRelative(-2.34f, 1.358f)
                lineTo(1.628f, 8.71f)
                lineToRelative(2.34f, 1.358f)
                lineTo(3.968f, 7.352f)
                close()
                moveTo(3.967f, 11.988f)
                lineTo(1.627f, 10.63f)
                verticalLineToRelative(7.352f)
                lineToRelative(6.368f, 3.677f)
                verticalLineToRelative(-2.717f)
                lineToRelative(-4.028f, -2.318f)
                verticalLineToRelative(-4.636f)
                close()
            }
        }
        .build()
        return _bnbchain!!
    }

private var _bnbchain: ImageVector? = null
