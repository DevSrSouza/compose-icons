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

public val SolidGroup.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(478.21f, 334.09f)
                lineTo(336.0f, 256.0f)
                lineToRelative(142.21f, -78.09f)
                curveToRelative(11.8f, -6.48f, 15.96f, -21.38f, 9.23f, -33.04f)
                lineToRelative(-19.48f, -33.74f)
                curveToRelative(-6.73f, -11.65f, -21.72f, -15.5f, -33.23f, -8.52f)
                lineTo(296.0f, 186.72f)
                lineToRelative(3.47f, -162.2f)
                curveTo(299.76f, 11.06f, 288.94f, 0.0f, 275.48f, 0.0f)
                horizontalLineToRelative(-38.96f)
                curveToRelative(-13.46f, 0.0f, -24.28f, 11.06f, -23.99f, 24.51f)
                lineTo(216.0f, 186.72f)
                lineTo(77.26f, 102.61f)
                curveToRelative(-11.51f, -6.98f, -26.5f, -3.13f, -33.23f, 8.52f)
                lineToRelative(-19.48f, 33.74f)
                curveToRelative(-6.73f, 11.65f, -2.56f, 26.56f, 9.23f, 33.04f)
                lineTo(176.0f, 256.0f)
                lineTo(33.79f, 334.09f)
                curveToRelative(-11.8f, 6.48f, -15.96f, 21.38f, -9.23f, 33.04f)
                lineToRelative(19.48f, 33.74f)
                curveToRelative(6.73f, 11.65f, 21.72f, 15.5f, 33.23f, 8.52f)
                lineTo(216.0f, 325.28f)
                lineToRelative(-3.47f, 162.2f)
                curveTo(212.24f, 500.94f, 223.06f, 512.0f, 236.52f, 512.0f)
                horizontalLineToRelative(38.96f)
                curveToRelative(13.46f, 0.0f, 24.28f, -11.06f, 24.0f, -24.51f)
                lineTo(296.0f, 325.28f)
                lineToRelative(138.74f, 84.11f)
                curveToRelative(11.51f, 6.98f, 26.5f, 3.13f, 33.23f, -8.52f)
                lineToRelative(19.48f, -33.74f)
                curveToRelative(6.73f, -11.65f, 2.56f, -26.56f, -9.23f, -33.04f)
                close()
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
