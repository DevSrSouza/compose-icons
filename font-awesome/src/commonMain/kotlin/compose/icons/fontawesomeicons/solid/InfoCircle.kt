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

public val SolidGroup.InfoCircle: ImageVector
    get() {
        if (_infoCircle != null) {
            return _infoCircle!!
        }
        _infoCircle = Builder(name = "InfoCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.04f, 8.0f, 8.0f, 119.08f, 8.0f, 256.0f)
                curveToRelative(0.0f, 137.0f, 111.04f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                curveTo(504.0f, 119.08f, 392.96f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(256.0f, 118.0f)
                curveToRelative(23.2f, 0.0f, 42.0f, 18.8f, 42.0f, 42.0f)
                reflectiveCurveToRelative(-18.8f, 42.0f, -42.0f, 42.0f)
                reflectiveCurveToRelative(-42.0f, -18.8f, -42.0f, -42.0f)
                reflectiveCurveToRelative(18.8f, -42.0f, 42.0f, -42.0f)
                close()
                moveTo(312.0f, 372.0f)
                curveToRelative(0.0f, 6.63f, -5.37f, 12.0f, -12.0f, 12.0f)
                horizontalLineToRelative(-88.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, -5.37f, -12.0f, -12.0f)
                verticalLineToRelative(-24.0f)
                curveToRelative(0.0f, -6.63f, 5.37f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(-12.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, -5.37f, -12.0f, -12.0f)
                verticalLineToRelative(-24.0f)
                curveToRelative(0.0f, -6.63f, 5.37f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, 5.37f, 12.0f, 12.0f)
                verticalLineToRelative(100.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, 5.37f, 12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _infoCircle!!
    }

private var _infoCircle: ImageVector? = null
