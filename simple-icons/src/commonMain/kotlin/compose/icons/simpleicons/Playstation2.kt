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

public val SimpleIcons.Playstation2: ImageVector
    get() {
        if (_playstation2 != null) {
            return _playstation2!!
        }
        _playstation2 = Builder(name = "Playstation2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.46f, 13.779f)
                verticalLineToRelative(0.292f)
                horizontalLineToRelative(4.142f)
                verticalLineToRelative(-3.85f)
                horizontalLineToRelative(3.796f)
                lineTo(15.398f, 9.93f)
                horizontalLineToRelative(-4.115f)
                verticalLineToRelative(3.85f)
                close()
                moveTo(23.708f, 10.221f)
                verticalLineToRelative(1.62f)
                horizontalLineToRelative(-7.195f)
                verticalLineToRelative(2.23f)
                lineTo(24.0f, 14.071f)
                verticalLineToRelative(-0.292f)
                horizontalLineToRelative(-7.168f)
                verticalLineToRelative(-1.646f)
                lineTo(24.0f, 12.133f)
                lineTo(24.0f, 9.929f)
                horizontalLineToRelative(-7.487f)
                verticalLineToRelative(0.292f)
                close()
                moveTo(7.195f, 10.221f)
                verticalLineToRelative(1.62f)
                lineTo(0.0f, 11.841f)
                verticalLineToRelative(2.23f)
                horizontalLineToRelative(0.292f)
                verticalLineToRelative(-1.938f)
                lineTo(7.46f, 12.133f)
                lineTo(7.46f, 9.929f)
                lineTo(0.0f, 9.929f)
                verticalLineToRelative(0.292f)
                close()
            }
        }
        .build()
        return _playstation2!!
    }

private var _playstation2: ImageVector? = null
