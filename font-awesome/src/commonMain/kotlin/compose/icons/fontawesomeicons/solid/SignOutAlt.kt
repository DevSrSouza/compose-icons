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

public val SolidGroup.SignOutAlt: ImageVector
    get() {
        if (_signOutAlt != null) {
            return _signOutAlt!!
        }
        _signOutAlt = Builder(name = "SignOutAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(497.0f, 273.0f)
                lineTo(329.0f, 441.0f)
                curveToRelative(-15.0f, 15.0f, -41.0f, 4.5f, -41.0f, -17.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineTo(152.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(136.0f)
                verticalLineTo(88.0f)
                curveToRelative(0.0f, -21.4f, 25.9f, -32.0f, 41.0f, -17.0f)
                lineToRelative(168.0f, 168.0f)
                curveToRelative(9.3f, 9.4f, 9.3f, 24.6f, 0.0f, 34.0f)
                close()
                moveTo(192.0f, 436.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(160.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(84.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineTo(76.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                verticalLineToRelative(192.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                horizontalLineToRelative(84.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _signOutAlt!!
    }

private var _signOutAlt: ImageVector? = null
