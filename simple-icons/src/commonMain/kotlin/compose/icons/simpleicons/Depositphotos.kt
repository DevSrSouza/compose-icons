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

public val SimpleIcons.Depositphotos: ImageVector
    get() {
        if (_depositphotos != null) {
            return _depositphotos!!
        }
        _depositphotos = Builder(name = "Depositphotos", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(5.119f, 0.0f, 9.061f, -3.942f, 9.061f, -9.06f)
                reflectiveCurveTo(17.119f, 5.88f, 12.0f, 5.88f)
                curveToRelative(-5.117f, 0.0f, -9.059f, 3.942f, -9.059f, 9.06f)
                reflectiveCurveTo(6.883f, 24.0f, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 18.402f)
                curveToRelative(-1.954f, 0.0f, -3.461f, -1.508f, -3.461f, -3.462f)
                curveToRelative(0.0f, -1.955f, 1.507f, -3.462f, 3.461f, -3.462f)
                curveToRelative(1.955f, 0.0f, 3.462f, 1.507f, 3.462f, 3.462f)
                curveToRelative(0.0f, 1.954f, -1.507f, 3.462f, -3.462f, 3.462f)
                close()
                moveTo(14.634f, 6.161f)
                horizontalLineToRelative(6.161f)
                lineTo(20.795f, 0.0f)
                horizontalLineToRelative(-6.161f)
                verticalLineToRelative(6.161f)
                close()
            }
        }
        .build()
        return _depositphotos!!
    }

private var _depositphotos: ImageVector? = null
