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

public val SimpleIcons.Kongregate: ImageVector
    get() {
        if (_kongregate != null) {
            return _kongregate!!
        }
        _kongregate = Builder(name = "Kongregate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.358f, 22.95f)
                verticalLineToRelative(-3.736f)
                horizontalLineToRelative(1.551f)
                lineToRelative(0.106f, -0.141f)
                lineToRelative(-3.877f, -5.851f)
                lineToRelative(-3.172f, 3.264f)
                lineToRelative(-0.026f, 2.351f)
                lineToRelative(0.166f, 0.095f)
                lineToRelative(2.22f, 1.342f)
                lineToRelative(0.071f, 2.676f)
                horizontalLineTo(0.141f)
                lineToRelative(0.053f, -3.021f)
                lineToRelative(2.027f, -0.715f)
                lineToRelative(0.106f, -0.141f)
                verticalLineTo(5.187f)
                lineToRelative(-0.07f, -0.141f)
                lineTo(0.0f, 4.165f)
                verticalLineTo(0.922f)
                horizontalLineToRelative(10.362f)
                verticalLineToRelative(3.736f)
                horizontalLineToRelative(-2.22f)
                lineToRelative(-0.106f, 0.141f)
                verticalLineToRelative(7.014f)
                lineToRelative(7.472f, -6.802f)
                verticalLineTo(4.87f)
                lineToRelative(-1.163f, -0.352f)
                lineToRelative(-1.163f, -0.352f)
                verticalLineTo(0.922f)
                horizontalLineToRelative(10.75f)
                verticalLineToRelative(3.736f)
                horizontalLineToRelative(-1.41f)
                lineToRelative(-0.352f, 0.106f)
                lineToRelative(-7.219f, 6.165f)
                lineToRelative(6.493f, 8.46f)
                lineToRelative(0.246f, 0.246f)
                lineToRelative(2.31f, 0.787f)
                verticalLineToRelative(2.656f)
                lineToRelative(-10.642f, -0.128f)
                close()
            }
        }
        .build()
        return _kongregate!!
    }

private var _kongregate: ImageVector? = null
