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

public val SimpleIcons.Shotcut: ImageVector
    get() {
        if (_shotcut != null) {
            return _shotcut!!
        }
        _shotcut = Builder(name = "Shotcut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(6.667f)
                verticalLineToRelative(24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-0.889f)
                horizontalLineToRelative(5.778f)
                lineTo(5.778f, 0.889f)
                lineTo(0.0f, 0.889f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(7.556f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(24.0f, 24.0f)
                verticalLineToRelative(-0.889f)
                lineTo(8.444f, 23.111f)
                lineTo(8.444f, 0.889f)
                lineTo(24.0f, 0.889f)
                lineTo(24.0f, 0.0f)
                lineTo(7.556f, 0.0f)
                close()
                moveTo(8.944f, 22.611f)
                lineTo(24.0f, 22.611f)
                lineTo(24.0f, 1.389f)
                lineTo(8.944f, 1.389f)
                verticalLineToRelative(21.222f)
                close()
                moveTo(5.278f, 1.389f)
                lineTo(0.0f, 1.389f)
                verticalLineToRelative(21.222f)
                horizontalLineToRelative(5.278f)
                lineTo(5.278f, 1.389f)
                close()
            }
        }
        .build()
        return _shotcut!!
    }

private var _shotcut: ImageVector? = null
