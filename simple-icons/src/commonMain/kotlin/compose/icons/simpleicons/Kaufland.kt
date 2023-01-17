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

public val SimpleIcons.Kaufland: ImageVector
    get() {
        if (_kaufland != null) {
            return _kaufland!!
        }
        _kaufland = Builder(name = "Kaufland", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(23.008f, 23.011f)
                lineTo(0.989f, 23.011f)
                lineTo(0.989f, 0.989f)
                horizontalLineToRelative(22.022f)
                close()
                moveTo(3.773f, 3.776f)
                horizontalLineToRelative(7.651f)
                verticalLineToRelative(7.65f)
                lineTo(3.773f, 11.426f)
                close()
                moveTo(12.574f, 3.776f)
                verticalLineToRelative(7.652f)
                lineToRelative(7.653f, -7.652f)
                close()
                moveTo(3.773f, 12.576f)
                horizontalLineToRelative(7.651f)
                verticalLineToRelative(7.651f)
                lineTo(3.773f, 20.227f)
                close()
                moveTo(12.574f, 12.572f)
                verticalLineToRelative(7.652f)
                horizontalLineToRelative(7.653f)
                close()
            }
        }
        .build()
        return _kaufland!!
    }

private var _kaufland: ImageVector? = null
