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

public val SimpleIcons.Ea: ImageVector
    get() {
        if (_ea != null) {
            return _ea!!
        }
        _ea = Builder(name = "Ea", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.635f, 6.162f)
                lineToRelative(-5.928f, 9.377f)
                lineTo(4.24f, 15.539f)
                lineToRelative(1.508f, -2.3f)
                horizontalLineToRelative(4.024f)
                lineToRelative(1.474f, -2.335f)
                lineTo(2.264f, 10.904f)
                lineTo(0.79f, 13.239f)
                horizontalLineToRelative(2.156f)
                lineTo(0.0f, 17.84f)
                horizontalLineToRelative(12.072f)
                lineToRelative(4.563f, -7.259f)
                lineToRelative(1.652f, 2.66f)
                horizontalLineToRelative(-1.401f)
                lineToRelative(-1.473f, 2.299f)
                horizontalLineToRelative(4.347f)
                lineToRelative(1.473f, 2.3f)
                lineTo(24.0f, 17.84f)
                close()
                moveTo(5.174f, 6.269f)
                lineTo(3.7f, 8.604f)
                lineToRelative(9.52f, -0.035f)
                lineToRelative(1.474f, -2.3f)
                close()
            }
        }
        .build()
        return _ea!!
    }

private var _ea: ImageVector? = null
