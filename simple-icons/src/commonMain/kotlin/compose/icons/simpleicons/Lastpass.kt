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

public val SimpleIcons.Lastpass: ImageVector
    get() {
        if (_lastpass != null) {
            return _lastpass!!
        }
        _lastpass = Builder(name = "Lastpass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.629f, 6.857f)
                curveToRelative(0.0f, -0.379f, 0.304f, -0.686f, 0.686f, -0.686f)
                curveTo(23.693f, 6.171f, 24.0f, 6.483f, 24.0f, 6.857f)
                verticalLineToRelative(10.286f)
                curveToRelative(0.0f, 0.379f, -0.304f, 0.686f, -0.686f, 0.686f)
                curveToRelative(-0.379f, 0.0f, -0.686f, -0.312f, -0.686f, -0.686f)
                verticalLineTo(6.857f)
                close()
                moveTo(2.057f, 10.286f)
                curveToRelative(1.136f, 0.0f, 2.057f, 0.921f, 2.057f, 2.057f)
                reflectiveCurveTo(3.193f, 14.4f, 2.057f, 14.4f)
                reflectiveCurveTo(0.0f, 13.479f, 0.0f, 12.343f)
                reflectiveCurveTo(0.921f, 10.286f, 2.057f, 10.286f)
                close()
                moveTo(9.6f, 10.286f)
                curveToRelative(1.136f, 0.0f, 2.057f, 0.921f, 2.057f, 2.057f)
                reflectiveCurveTo(10.736f, 14.4f, 9.6f, 14.4f)
                reflectiveCurveToRelative(-2.057f, -0.921f, -2.057f, -2.057f)
                reflectiveCurveTo(8.464f, 10.286f, 9.6f, 10.286f)
                close()
                moveTo(17.143f, 10.286f)
                curveToRelative(1.136f, 0.0f, 2.057f, 0.921f, 2.057f, 2.057f)
                reflectiveCurveTo(18.279f, 14.4f, 17.143f, 14.4f)
                reflectiveCurveToRelative(-2.057f, -0.921f, -2.057f, -2.057f)
                reflectiveCurveTo(16.007f, 10.286f, 17.143f, 10.286f)
                close()
            }
        }
        .build()
        return _lastpass!!
    }

private var _lastpass: ImageVector? = null
