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

public val SimpleIcons.Elm: ImageVector
    get() {
        if (_elm != null) {
            return _elm!!
        }
        _elm = Builder(name = "Elm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.986f, 12.806f)
                lineTo(23.986f, 23.2f)
                lineToRelative(-5.197f, -5.197f)
                close()
                moveTo(6.796f, 6.01f)
                lineTo(17.19f, 6.01f)
                lineToRelative(-5.197f, 5.197f)
                close()
                moveTo(16.071f, 4.89f)
                lineTo(5.677f, 4.89f)
                lineTo(0.8f, 0.015f)
                horizontalLineToRelative(10.394f)
                close()
                moveTo(23.187f, 12.007f)
                lineTo(17.99f, 6.81f)
                lineToRelative(-5.197f, 5.197f)
                lineToRelative(5.197f, 5.197f)
                close()
                moveTo(24.0f, 11.194f)
                lineTo(12.806f, 0.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(0.0f, 23.2f)
                lineTo(0.0f, 0.813f)
                lineToRelative(11.194f, 11.194f)
                close()
                moveTo(23.187f, 24.0f)
                lineTo(0.8f, 24.0f)
                lineToRelative(11.193f, -11.194f)
                close()
            }
        }
        .build()
        return _elm!!
    }

private var _elm: ImageVector? = null
