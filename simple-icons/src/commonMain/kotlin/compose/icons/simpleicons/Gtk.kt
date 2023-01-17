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

public val SimpleIcons.Gtk: ImageVector
    get() {
        if (_gtk != null) {
            return _gtk!!
        }
        _gtk = Builder(name = "Gtk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.01f, 23.773f)
                lineTo(9.01f, 14.45f)
                lineToRelative(-7.584f, 2.245f)
                close()
                moveTo(9.01f, 9.903f)
                lineTo(0.91f, 3.828f)
                lineToRelative(0.502f, 12.526f)
                lineToRelative(7.597f, -2.249f)
                close()
                moveTo(9.57f, 24.0f)
                lineToRelative(12.353f, -5.146f)
                lineToRelative(-8.285f, -5.775f)
                lineToRelative(-4.068f, 1.204f)
                close()
                moveTo(23.09f, 5.815f)
                lineToRelative(-9.257f, 2.849f)
                verticalLineToRelative(4.148f)
                lineToRelative(8.237f, 5.741f)
                close()
                moveTo(9.57f, 9.975f)
                verticalLineToRelative(3.964f)
                lineToRelative(3.932f, -1.164f)
                verticalLineToRelative(-4.01f)
                close()
                moveTo(9.342f, 9.455f)
                lineTo(13.502f, 8.175f)
                lineTo(13.502f, 0.0f)
                lineTo(1.231f, 3.37f)
                close()
                moveTo(22.715f, 5.34f)
                lineTo(13.833f, 0.052f)
                verticalLineToRelative(8.021f)
                close()
            }
        }
        .build()
        return _gtk!!
    }

private var _gtk: ImageVector? = null
