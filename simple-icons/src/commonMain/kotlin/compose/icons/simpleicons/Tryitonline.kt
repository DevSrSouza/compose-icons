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

public val SimpleIcons.Tryitonline: ImageVector
    get() {
        if (_tryitonline != null) {
            return _tryitonline!!
        }
        _tryitonline = Builder(name = "Tryitonline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.75f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                lineTo(4.5f, 7.5f)
                verticalLineToRelative(9.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                lineTo(6.0f, 7.5f)
                horizontalLineToRelative(17.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                close()
                moveTo(11.25f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(19.5f, 9.0f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, false, -4.5f, 4.5f)
                curveToRelative(0.0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveTo(21.98f, 9.0f, 19.5f, 9.0f)
                close()
                moveTo(19.5f, 10.5f)
                curveToRelative(1.67f, 0.0f, 3.0f, 1.33f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.33f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.33f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.33f, -3.0f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _tryitonline!!
    }

private var _tryitonline: ImageVector? = null
