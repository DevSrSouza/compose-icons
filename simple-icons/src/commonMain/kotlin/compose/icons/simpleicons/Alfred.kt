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

public val SimpleIcons.Alfred: ImageVector
    get() {
        if (_alfred != null) {
            return _alfred!!
        }
        _alfred = Builder(name = "Alfred", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 15.902f)
                curveToRelative(0.0f, -1.142f, 1.133f, -2.184f, 3.0f, -2.977f)
                verticalLineToRelative(-1.827f)
                curveToRelative(0.0f, -4.142f, 4.029f, -7.5f, 9.0f, -7.5f)
                reflectiveCurveToRelative(9.0f, 3.358f, 9.0f, 7.5f)
                verticalLineToRelative(1.827f)
                curveToRelative(1.867f, 0.793f, 3.0f, 1.835f, 3.0f, 2.977f)
                curveToRelative(0.0f, 2.485f, -5.373f, 4.5f, -12.0f, 4.5f)
                reflectiveCurveToRelative(-12.0f, -2.015f, -12.0f, -4.5f)
                close()
            }
        }
        .build()
        return _alfred!!
    }

private var _alfred: ImageVector? = null
