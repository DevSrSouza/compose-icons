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

public val SimpleIcons.Gamebanana: ImageVector
    get() {
        if (_gamebanana != null) {
            return _gamebanana!!
        }
        _gamebanana = Builder(name = "Gamebanana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.249f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.5f)
                lineTo(15.749f, 1.5f)
                horizontalLineToRelative(1.505f)
                lineTo(17.254f, 3.0f)
                horizontalLineToRelative(-1.505f)
                lineTo(15.749f, 7.5f)
                horizontalLineToRelative(1.5f)
                lineTo(17.249f, 4.5f)
                horizontalLineToRelative(3.002f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.505f)
                lineTo(18.746f, 0.0f)
                close()
                moveTo(20.251f, 4.498f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                lineTo(21.751f, 4.501f)
                close()
                moveTo(21.751f, 5.998f)
                verticalLineToRelative(10.503f)
                horizontalLineToRelative(1.5f)
                lineTo(23.251f, 5.998f)
                close()
                moveTo(21.751f, 16.501f)
                horizontalLineToRelative(-1.5f)
                lineTo(20.251f, 19.5f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(20.251f, 19.499f)
                horizontalLineToRelative(-1.505f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(18.751f, 20.999f)
                horizontalLineToRelative(-3.002f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.001f)
                close()
                moveTo(15.749f, 22.499f)
                lineTo(6.75f, 22.499f)
                lineTo(6.75f, 24.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(6.75f, 22.499f)
                lineTo(6.75f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(3.75f, 20.999f)
                verticalLineToRelative(-1.497f)
                lineTo(2.248f, 19.502f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(2.249f, 19.502f)
                verticalLineToRelative(-2.997f)
                lineTo(9.75f, 16.505f)
                verticalLineToRelative(-1.5f)
                lineTo(0.748f, 15.005f)
                verticalLineToRelative(4.497f)
                close()
                moveTo(9.751f, 15.005f)
                horizontalLineToRelative(2.997f)
                verticalLineToRelative(-1.5f)
                lineTo(9.751f, 13.505f)
                close()
                moveTo(12.748f, 13.505f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.501f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(14.248f, 12.004f)
                horizontalLineToRelative(1.501f)
                lineTo(15.749f, 7.506f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _gamebanana!!
    }

private var _gamebanana: ImageVector? = null
