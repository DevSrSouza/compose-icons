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

public val SimpleIcons.UniqloJa: ImageVector
    get() {
        if (_uniqloJa != null) {
            return _uniqloJa!!
        }
        _uniqloJa = Builder(name = "UniqloJa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.01f)
                verticalLineToRelative(23.98f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.01f)
                close()
                moveTo(4.291f, 3.29f)
                horizontalLineToRelative(4.553f)
                lineToRelative(0.006f, 5.803f)
                horizontalLineToRelative(1.511f)
                verticalLineToRelative(1.511f)
                horizontalLineToRelative(-6.82f)
                lineTo(3.541f, 9.094f)
                horizontalLineToRelative(3.783f)
                verticalLineToRelative(-4.29f)
                lineTo(4.291f, 4.804f)
                close()
                moveTo(14.401f, 3.29f)
                horizontalLineToRelative(5.302f)
                verticalLineToRelative(1.514f)
                lineTo(14.4f, 4.804f)
                close()
                moveTo(13.639f, 9.097f)
                horizontalLineToRelative(6.816f)
                verticalLineToRelative(1.511f)
                lineTo(13.64f, 10.608f)
                close()
                moveTo(4.29f, 13.385f)
                lineToRelative(6.072f, 0.002f)
                lineToRelative(-1.513f, 7.322f)
                lineTo(2.777f, 20.709f)
                lineToRelative(0.305f, -1.516f)
                horizontalLineToRelative(4.553f)
                lineToRelative(0.892f, -4.29f)
                lineTo(5.49f, 14.903f)
                lineToRelative(-0.457f, 2.148f)
                lineTo(3.521f, 17.051f)
                close()
                moveTo(13.638f, 13.385f)
                horizontalLineToRelative(6.816f)
                verticalLineToRelative(7.324f)
                lineTo(13.64f, 20.709f)
                close()
                moveTo(15.155f, 14.902f)
                verticalLineToRelative(4.291f)
                horizontalLineToRelative(3.787f)
                verticalLineToRelative(-4.29f)
                close()
            }
        }
        .build()
        return _uniqloJa!!
    }

private var _uniqloJa: ImageVector? = null
