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

public val SimpleIcons.Eclipseche: ImageVector
    get() {
        if (_eclipseche != null) {
            return _eclipseche!!
        }
        _eclipseche = Builder(name = "Eclipseche", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(1.604f, 6.021f)
                verticalLineToRelative(7.452f)
                lineTo(12.0f, 7.494f)
                lineToRelative(3.941f, 2.254f)
                lineToRelative(6.455f, -3.727f)
                close()
                moveTo(22.396f, 10.527f)
                lineTo(12.0f, 16.506f)
                lineToRelative(-7.334f, -4.217f)
                lineToRelative(-3.062f, 1.76f)
                verticalLineToRelative(3.93f)
                lineTo(12.0f, 24.0f)
                lineToRelative(10.396f, -6.021f)
                close()
            }
        }
        .build()
        return _eclipseche!!
    }

private var _eclipseche: ImageVector? = null
