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

public val SimpleIcons.Scala: ImageVector
    get() {
        if (_scala != null) {
            return _scala!!
        }
        _scala = Builder(name = "Scala", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.589f, 24.0f)
                curveToRelative(4.537f, 0.0f, 13.81f, -1.516f, 14.821f, -3.0f)
                verticalLineToRelative(-5.729f)
                curveToRelative(-0.957f, 1.408f, -10.284f, 2.912f, -14.821f, 2.912f)
                verticalLineTo(24.0f)
                close()
                moveTo(4.589f, 16.365f)
                curveToRelative(4.537f, 0.0f, 13.81f, -1.516f, 14.821f, -3.0f)
                verticalLineTo(7.636f)
                curveToRelative(-0.957f, 1.408f, -10.284f, 2.912f, -14.821f, 2.912f)
                verticalLineToRelative(5.817f)
                close()
                moveTo(4.589f, 8.729f)
                curveToRelative(4.537f, 0.0f, 13.81f, -1.516f, 14.821f, -3.0f)
                verticalLineTo(0.0f)
                curveTo(18.453f, 1.408f, 9.126f, 2.912f, 4.589f, 2.912f)
                verticalLineToRelative(5.817f)
                close()
            }
        }
        .build()
        return _scala!!
    }

private var _scala: ImageVector? = null
