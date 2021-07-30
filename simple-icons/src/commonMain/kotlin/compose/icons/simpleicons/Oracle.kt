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

public val SimpleIcons.Oracle: ImageVector
    get() {
        if (_oracle != null) {
            return _oracle!!
        }
        _oracle = Builder(name = "Oracle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.412f, 4.412f)
                horizontalLineToRelative(-8.82f)
                arcToRelative(7.588f, 7.588f, 0.0f, false, false, -0.008f, 15.176f)
                horizontalLineToRelative(8.828f)
                arcToRelative(7.588f, 7.588f, 0.0f, false, false, 0.0f, -15.176f)
                close()
                moveTo(16.219f, 16.914f)
                lineTo(7.786f, 16.914f)
                arcToRelative(4.915f, 4.915f, 0.0f, false, true, 0.0f, -9.828f)
                horizontalLineToRelative(8.433f)
                arcToRelative(4.914f, 4.914f, 0.0f, true, true, 0.0f, 9.828f)
                close()
            }
        }
        .build()
        return _oracle!!
    }

private var _oracle: ImageVector? = null
