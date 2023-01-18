package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MapPin4Line: ImageVector
    get() {
        if (_mapPin4Line != null) {
            return _mapPin4Line!!
        }
        _mapPin4Line = Builder(name = "MapPin4Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.938f)
                arcTo(8.001f, 8.001f, 0.0f, false, true, 12.0f, 2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.0f, 15.938f)
                lineTo(13.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.062f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(5.0f, 22.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _mapPin4Line!!
    }

private var _mapPin4Line: ImageVector? = null