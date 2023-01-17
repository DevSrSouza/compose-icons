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

public val SimpleIcons.Icons8: ImageVector
    get() {
        if (_icons8 != null) {
            return _icons8!!
        }
        _icons8 = Builder(name = "Icons8", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(3.3137f, 0.0f, 6.0f, -2.6863f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.6863f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.6863f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.6863f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(18.0f, 24.0f)
                curveToRelative(3.3137f, 0.0f, 6.0f, -2.6863f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.6863f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.6863f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.6863f, 6.0f, 6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _icons8!!
    }

private var _icons8: ImageVector? = null
