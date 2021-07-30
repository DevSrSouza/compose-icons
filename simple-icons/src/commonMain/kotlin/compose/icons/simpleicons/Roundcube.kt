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

public val SimpleIcons.Roundcube: ImageVector
    get() {
        if (_roundcube != null) {
            return _roundcube!!
        }
        _roundcube = Builder(name = "Roundcube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.002f, 0.072f)
                arcToRelative(8.302f, 8.302f, 0.0f, false, false, -8.266f, 7.512f)
                lineTo(0.498f, 9.454f)
                lineToRelative(4.682f, 2.704f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 12.002f, 0.572f)
                arcToRelative(7.802f, 7.802f, 0.0f, false, true, 6.824f, 11.582f)
                lineToRelative(4.676f, -2.7f)
                lineToRelative(-3.236f, -1.87f)
                arcTo(8.302f, 8.302f, 0.0f, false, false, 12.002f, 0.072f)
                close()
                moveTo(0.0f, 9.742f)
                verticalLineToRelative(7.399f)
                lineToRelative(11.75f, 6.787f)
                verticalLineToRelative(-7.399f)
                lineTo(0.0f, 9.742f)
                close()
                moveTo(24.0f, 9.742f)
                lineToRelative(-5.777f, 3.338f)
                lineToRelative(-5.248f, 3.031f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.108f, 0.063f)
                lineToRelative(-0.615f, 0.355f)
                verticalLineToRelative(7.399f)
                lineTo(24.0f, 17.14f)
                lineTo(24.0f, 9.744f)
                close()
            }
        }
        .build()
        return _roundcube!!
    }

private var _roundcube: ImageVector? = null
