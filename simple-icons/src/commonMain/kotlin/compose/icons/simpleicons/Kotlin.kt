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

public val SimpleIcons.Kotlin: ImageVector
    get() {
        if (_kotlin != null) {
            return _kotlin!!
        }
        _kotlin = Builder(name = "Kotlin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                lineTo(0.0f, 13.848f)
                lineTo(13.505f, 0.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 24.0f)
                close()
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(12.672f)
                lineTo(12.05f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(1.335f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(12.699f, 12.618f)
                lineTo(1.335f, 24.0f)
                close()
            }
        }
        .build()
        return _kotlin!!
    }

private var _kotlin: ImageVector? = null
