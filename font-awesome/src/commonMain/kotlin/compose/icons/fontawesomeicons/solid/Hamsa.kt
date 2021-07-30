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

public val SolidGroup.Hamsa: ImageVector
    get() {
        if (_hamsa != null) {
            return _hamsa!!
        }
        _hamsa = Builder(name = "Hamsa", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(509.34f, 307.25f)
                curveTo(504.28f, 295.56f, 492.75f, 288.0f, 480.0f, 288.0f)
                horizontalLineToRelative(-64.0f)
                lineTo(416.0f, 80.0f)
                curveToRelative(0.0f, -22.0f, -18.0f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveToRelative(-40.0f, 18.0f, -40.0f, 40.0f)
                verticalLineToRelative(134.0f)
                curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f)
                horizontalLineToRelative(-20.0f)
                curveToRelative(-5.52f, 0.0f, -10.0f, -4.48f, -10.0f, -10.0f)
                lineTo(296.0f, 40.0f)
                curveToRelative(0.0f, -22.0f, -18.0f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveToRelative(-40.0f, 18.0f, -40.0f, 40.0f)
                verticalLineToRelative(174.0f)
                curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f)
                horizontalLineToRelative(-20.0f)
                curveToRelative(-5.52f, 0.0f, -10.0f, -4.48f, -10.0f, -10.0f)
                lineTo(176.0f, 80.0f)
                curveToRelative(0.0f, -22.0f, -18.0f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveTo(96.0f, 58.0f, 96.0f, 80.0f)
                verticalLineToRelative(208.0f)
                lineTo(32.0f, 288.0f)
                curveToRelative(-12.75f, 0.0f, -24.28f, 7.56f, -29.34f, 19.25f)
                arcToRelative(31.966f, 31.966f, 0.0f, false, false, 5.94f, 34.58f)
                lineToRelative(102.69f, 110.03f)
                curveTo(146.97f, 490.08f, 199.69f, 512.0f, 256.0f, 512.0f)
                reflectiveCurveToRelative(109.03f, -21.92f, 144.72f, -60.14f)
                lineTo(503.4f, 341.83f)
                arcToRelative(31.966f, 31.966f, 0.0f, false, false, 5.94f, -34.58f)
                close()
                moveTo(256.0f, 416.0f)
                curveToRelative(-53.02f, 0.0f, -96.0f, -64.0f, -96.0f, -64.0f)
                reflectiveCurveToRelative(42.98f, -64.0f, 96.0f, -64.0f)
                reflectiveCurveToRelative(96.0f, 64.0f, 96.0f, 64.0f)
                reflectiveCurveToRelative(-42.98f, 64.0f, -96.0f, 64.0f)
                close()
                moveTo(256.0f, 320.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.33f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.33f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.33f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _hamsa!!
    }

private var _hamsa: ImageVector? = null
