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

public val SimpleIcons.Portswigger: ImageVector
    get() {
        if (_portswigger != null) {
            return _portswigger!!
        }
        _portswigger = Builder(name = "Portswigger", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(10.718f)
                verticalLineToRelative(-3.805f)
                lineToRelative(3.496f, -4.272f)
                horizontalLineToRelative(-3.496f)
                verticalLineToRelative(-5.205f)
                lineTo(4.427f, 10.718f)
                lineToRelative(6.291f, -7.767f)
                lineTo(10.718f, 0.0f)
                close()
                moveTo(13.282f, 0.0f)
                verticalLineToRelative(3.884f)
                lineTo(9.786f, 8.155f)
                horizontalLineToRelative(3.496f)
                verticalLineToRelative(5.205f)
                horizontalLineToRelative(6.291f)
                lineToRelative(-6.291f, 7.767f)
                lineTo(13.282f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _portswigger!!
    }

private var _portswigger: ImageVector? = null
