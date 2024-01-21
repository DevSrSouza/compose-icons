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

public val SimpleIcons.Dolby: ImageVector
    get() {
        if (_dolby != null) {
            return _dolby!!
        }
        _dolby = Builder(name = "Dolby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.564f)
                verticalLineToRelative(16.872f)
                horizontalLineToRelative(2.488f)
                curveToRelative(4.648f, 0.0f, 8.438f, -3.788f, 8.438f, -8.436f)
                reflectiveCurveToRelative(-3.79f, -8.436f, -8.438f, -8.436f)
                lineTo(0.0f, 3.564f)
                close()
                moveTo(21.512f, 3.564f)
                curveToRelative(-4.648f, 0.0f, -8.438f, 3.788f, -8.438f, 8.436f)
                reflectiveCurveToRelative(3.79f, 8.436f, 8.438f, 8.436f)
                lineTo(24.0f, 20.436f)
                lineTo(24.0f, 3.564f)
                horizontalLineToRelative(-2.488f)
                close()
            }
        }
        .build()
        return _dolby!!
    }

private var _dolby: ImageVector? = null
