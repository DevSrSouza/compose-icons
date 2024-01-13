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

public val SimpleIcons.Openverse: ImageVector
    get() {
        if (_openverse != null) {
            return _openverse!!
        }
        _openverse = Builder(name = "Openverse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.882f, 1.018f)
                curveTo(2.182f, 1.018f, 0.0f, 3.214f, 0.0f, 5.932f)
                curveToRelative(0.0f, 2.704f, 2.182f, 4.915f, 4.882f, 4.915f)
                close()
                moveTo(12.0f, 1.018f)
                curveToRelative(-2.686f, 0.0f, -4.882f, 2.196f, -4.882f, 4.914f)
                curveToRelative(0.0f, 2.704f, 2.182f, 4.915f, 4.882f, 4.915f)
                close()
                moveTo(19.118f, 1.018f)
                curveToRelative(-2.696f, 0.0f, -4.881f, 2.2f, -4.881f, 4.914f)
                curveToRelative(0.0f, 2.714f, 2.185f, 4.915f, 4.88f, 4.915f)
                curveToRelative(2.697f, 0.0f, 4.883f, -2.2f, 4.883f, -4.915f)
                curveToRelative(0.0f, -2.714f, -2.186f, -4.914f, -4.882f, -4.914f)
                close()
                moveTo(19.118f, 13.111f)
                curveToRelative(-2.696f, 0.0f, -4.881f, 2.2f, -4.881f, 4.915f)
                curveToRelative(0.0f, 2.714f, 2.185f, 4.914f, 4.88f, 4.914f)
                curveToRelative(2.697f, 0.0f, 4.883f, -2.2f, 4.883f, -4.914f)
                curveToRelative(0.0f, -2.714f, -2.186f, -4.915f, -4.882f, -4.915f)
                close()
                moveTo(12.0f, 13.126f)
                curveToRelative(-2.686f, 0.0f, -4.882f, 2.196f, -4.882f, 4.9f)
                reflectiveCurveTo(9.3f, 22.94f, 12.0f, 22.94f)
                close()
                moveTo(4.882f, 13.166f)
                curveToRelative(-2.7f, 0.0f, -4.882f, 2.197f, -4.882f, 4.9f)
                curveToRelative(0.0f, 2.719f, 2.182f, 4.916f, 4.882f, 4.916f)
                close()
            }
        }
        .build()
        return _openverse!!
    }

private var _openverse: ImageVector? = null
