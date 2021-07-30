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

public val SimpleIcons.Uikit: ImageVector
    get() {
        if (_uikit != null) {
            return _uikit!!
        }
        _uikit = Builder(name = "Uikit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.697f, 3.292f)
                lineToRelative(-4.109f, 2.489f)
                lineToRelative(4.738f, 2.696f)
                verticalLineToRelative(7.077f)
                lineToRelative(-6.365f, 3.538f)
                lineToRelative(-6.258f, -3.538f)
                verticalLineToRelative(-5.485f)
                lineTo(1.596f, 7.956f)
                lineTo(1.596f, 18.0f)
                lineToRelative(10.219f, 6.0f)
                lineToRelative(10.589f, -6.0f)
                lineTo(22.404f, 6.002f)
                lineToRelative(-4.707f, -2.71f)
                close()
                moveTo(15.793f, 2.303f)
                lineTo(11.813f, 0.0f)
                lineTo(7.665f, 2.568f)
                lineToRelative(4.032f, 2.218f)
                lineToRelative(4.096f, -2.483f)
                close()
            }
        }
        .build()
        return _uikit!!
    }

private var _uikit: ImageVector? = null
