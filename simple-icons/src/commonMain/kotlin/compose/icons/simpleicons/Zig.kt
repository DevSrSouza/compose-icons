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

public val SimpleIcons.Zig: ImageVector
    get() {
        if (_zig != null) {
            return _zig!!
        }
        _zig = Builder(name = "Zig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.53f, 1.02f)
                lineToRelative(-7.686f, 3.45f)
                horizontalLineToRelative(-7.06f)
                lineToRelative(-2.98f, 3.452f)
                horizontalLineToRelative(7.173f)
                lineTo(0.47f, 22.98f)
                lineToRelative(7.681f, -3.607f)
                horizontalLineToRelative(7.065f)
                verticalLineToRelative(-0.002f)
                lineToRelative(2.978f, -3.45f)
                lineToRelative(-7.148f, -0.001f)
                lineToRelative(12.482f, -14.9f)
                close()
                moveTo(0.0f, 4.47f)
                verticalLineToRelative(14.901f)
                horizontalLineToRelative(1.883f)
                lineToRelative(2.98f, -3.45f)
                lineTo(3.451f, 15.921f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(0.942f)
                lineToRelative(2.824f, -3.45f)
                lineTo(0.0f, 4.471f)
                close()
                moveTo(22.117f, 4.47f)
                lineTo(19.137f, 8.078f)
                horizontalLineToRelative(1.412f)
                verticalLineToRelative(7.844f)
                horizontalLineToRelative(-0.942f)
                lineToRelative(-2.98f, 3.45f)
                lineTo(24.0f, 19.372f)
                lineTo(24.0f, 4.47f)
                horizontalLineToRelative(-1.883f)
                close()
            }
        }
        .build()
        return _zig!!
    }

private var _zig: ImageVector? = null
