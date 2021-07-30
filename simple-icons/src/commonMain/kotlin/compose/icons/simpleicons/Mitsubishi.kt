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

public val SimpleIcons.Mitsubishi: ImageVector
    get() {
        if (_mitsubishi != null) {
            return _mitsubishi!!
        }
        _mitsubishi = Builder(name = "Mitsubishi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 22.38f)
                lineTo(0.0f, 22.38f)
                lineToRelative(4.0f, -6.92f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(16.0f, 22.38f)
                horizontalLineToRelative(8.0f)
                lineToRelative(-4.0f, -6.92f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(16.0f, 8.54f)
                lineToRelative(-4.0f, -6.92f)
                lineToRelative(-4.0f, 6.92f)
                lineToRelative(4.0f, 6.92f)
                close()
            }
        }
        .build()
        return _mitsubishi!!
    }

private var _mitsubishi: ImageVector? = null
