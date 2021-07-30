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

public val SimpleIcons.Spinrilla: ImageVector
    get() {
        if (_spinrilla != null) {
            return _spinrilla!!
        }
        _spinrilla = Builder(name = "Spinrilla", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.816f)
                arcToRelative(3.184f, 3.184f, 0.0f, true, false, 0.0f, 6.368f)
                arcToRelative(3.184f, 3.184f, 0.0f, true, false, 0.0f, -6.368f)
                close()
                moveTo(12.0f, 0.0f)
                verticalLineToRelative(3.918f)
                arcTo(8.082f, 8.082f, 0.0f, false, false, 3.918f, 12.0f)
                lineTo(0.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 24.0f)
                verticalLineToRelative(-3.918f)
                arcTo(8.082f, 8.082f, 0.0f, false, false, 20.082f, 12.0f)
                lineTo(24.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _spinrilla!!
    }

private var _spinrilla: ImageVector? = null
