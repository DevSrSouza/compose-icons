package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.BbcIplayer: ImageVector
    get() {
        if (_bbcIplayer != null) {
            return _bbcIplayer!!
        }
        _bbcIplayer = Builder(name = "BbcIplayer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.315f, 0.0f)
                horizontalLineTo(2.382f)
                verticalLineToRelative(6.022f)
                horizontalLineToRelative(5.933f)
                verticalLineTo(3.506f)
                lineToRelative(9.618f, 8.45f)
                lineToRelative(-9.618f, 8.538f)
                verticalLineTo(8.99f)
                horizontalLineTo(2.382f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(5.933f)
                lineToRelative(13.303f, -12.045f)
                close()
            }
        }
        .build()
        return _bbcIplayer!!
    }

private var _bbcIplayer: ImageVector? = null
