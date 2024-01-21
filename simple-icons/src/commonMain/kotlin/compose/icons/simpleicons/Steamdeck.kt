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

public val SimpleIcons.Steamdeck: ImageVector
    get() {
        if (_steamdeck != null) {
            return _steamdeck!!
        }
        _steamdeck = Builder(name = "Steamdeck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.999f, 0.0f)
                verticalLineToRelative(4.309f)
                curveToRelative(4.242f, 0.0f, 7.694f, 3.45f, 7.694f, 7.691f)
                reflectiveCurveToRelative(-3.452f, 7.691f, -7.694f, 7.691f)
                lineTo(8.999f, 24.0f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveToRelative(-5.383f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(8.999f, 6.011f)
                curveToRelative(-3.313f, 0.0f, -6.0f, 2.687f, -5.998f, 6.0f)
                arcToRelative(5.999f, 5.999f, 0.0f, true, false, 5.998f, -6.0f)
                close()
            }
        }
        .build()
        return _steamdeck!!
    }

private var _steamdeck: ImageVector? = null
