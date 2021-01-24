package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.MehRollingEyes: ImageVector
    get() {
        if (_mehRollingEyes != null) {
            return _mehRollingEyes!!
        }
        _mehRollingEyes = Builder(name = "MehRollingEyes", defaultWidth = 496.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(88.0f, 224.0f)
                curveToRelative(0.0f, -24.3f, 13.7f, -45.2f, 33.6f, -56.0f)
                curveToRelative(-0.7f, 2.6f, -1.6f, 5.2f, -1.6f, 8.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -2.8f, -0.9f, -5.4f, -1.6f, -8.0f)
                curveToRelative(19.9f, 10.8f, 33.6f, 31.7f, 33.6f, 56.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.7f, -64.0f, -64.0f)
                close()
                moveTo(312.0f, 400.0f)
                lineTo(184.0f, 400.0f)
                curveToRelative(-21.2f, 0.0f, -21.2f, -32.0f, 0.0f, -32.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(21.2f, 0.0f, 21.2f, 32.0f, 0.0f, 32.0f)
                close()
                moveTo(344.0f, 288.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                curveToRelative(0.0f, -24.3f, 13.7f, -45.2f, 33.6f, -56.0f)
                curveToRelative(-0.7f, 2.6f, -1.6f, 5.2f, -1.6f, 8.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -2.8f, -0.9f, -5.4f, -1.6f, -8.0f)
                curveToRelative(19.9f, 10.8f, 33.6f, 31.7f, 33.6f, 56.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _mehRollingEyes!!
    }

private var _mehRollingEyes: ImageVector? = null
