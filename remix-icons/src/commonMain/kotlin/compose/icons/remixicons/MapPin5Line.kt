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

public val RemixIcons.MapPin5Line: ImageVector
    get() {
        if (_mapPin5Line != null) {
            return _mapPin5Line!!
        }
        _mapPin5Line = Builder(name = "MapPin5Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.485f)
                lineToRelative(4.243f, -4.242f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.486f, 0.0f)
                lineTo(12.0f, 18.485f)
                close()
                moveTo(17.657f, 15.657f)
                lineTo(12.0f, 21.314f)
                lineToRelative(-5.657f, -5.657f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.314f, 0.0f)
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
        return _mapPin5Line!!
    }

private var _mapPin5Line: ImageVector? = null
