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

public val SimpleIcons.Accenture: ImageVector
    get() {
        if (_accenture != null) {
            return _accenture!!
        }
        _accenture = Builder(name = "Accenture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.297f, 14.74f)
                lineTo(0.434f, 24.0f)
                verticalLineToRelative(-5.263f)
                lineTo(16.8f, 12.11f)
                lineToRelative(6.497f, 2.631f)
                close()
                moveTo(23.567f, 9.369f)
                lineTo(0.433f, 0.0f)
                verticalLineToRelative(5.263f)
                lineToRelative(23.132f, 9.368f)
                lineTo(23.565f, 9.37f)
                close()
            }
        }
        .build()
        return _accenture!!
    }

private var _accenture: ImageVector? = null
