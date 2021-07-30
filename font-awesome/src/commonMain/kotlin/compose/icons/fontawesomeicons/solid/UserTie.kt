package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.UserTie: ImageVector
    get() {
        if (_userTie != null) {
            return _userTie!!
        }
        _userTie = Builder(name = "UserTie", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 256.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                reflectiveCurveTo(294.7f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(96.0f, 57.3f, 96.0f, 128.0f)
                reflectiveCurveToRelative(57.3f, 128.0f, 128.0f, 128.0f)
                close()
                moveTo(319.8f, 288.6f)
                lineTo(272.0f, 480.0f)
                lineToRelative(-32.0f, -136.0f)
                lineToRelative(32.0f, -56.0f)
                horizontalLineToRelative(-96.0f)
                lineToRelative(32.0f, 56.0f)
                lineToRelative(-32.0f, 136.0f)
                lineToRelative(-47.8f, -191.4f)
                curveTo(56.9f, 292.0f, 0.0f, 350.3f, 0.0f, 422.4f)
                lineTo(0.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineToRelative(-41.6f)
                curveToRelative(0.0f, -72.1f, -56.9f, -130.4f, -128.2f, -133.8f)
                close()
            }
        }
        .build()
        return _userTie!!
    }

private var _userTie: ImageVector? = null
