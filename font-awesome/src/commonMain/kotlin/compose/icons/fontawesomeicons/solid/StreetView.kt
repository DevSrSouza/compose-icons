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

public val SolidGroup.StreetView: ImageVector
    get() {
        if (_streetView != null) {
            return _streetView!!
        }
        _streetView = Builder(name = "StreetView", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(367.9f, 329.76f)
                curveToRelative(-4.62f, 5.3f, -9.78f, 10.1f, -15.9f, 13.65f)
                verticalLineToRelative(22.94f)
                curveToRelative(66.52f, 9.34f, 112.0f, 28.05f, 112.0f, 49.65f)
                curveToRelative(0.0f, 30.93f, -93.12f, 56.0f, -208.0f, 56.0f)
                reflectiveCurveTo(48.0f, 446.93f, 48.0f, 416.0f)
                curveToRelative(0.0f, -21.6f, 45.48f, -40.3f, 112.0f, -49.65f)
                verticalLineToRelative(-22.94f)
                curveToRelative(-6.12f, -3.55f, -11.28f, -8.35f, -15.9f, -13.65f)
                curveTo(58.87f, 345.34f, 0.0f, 378.05f, 0.0f, 416.0f)
                curveToRelative(0.0f, 53.02f, 114.62f, 96.0f, 256.0f, 96.0f)
                reflectiveCurveToRelative(256.0f, -42.98f, 256.0f, -96.0f)
                curveToRelative(0.0f, -37.95f, -58.87f, -70.66f, -144.1f, -86.24f)
                close()
                moveTo(256.0f, 128.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                reflectiveCurveTo(291.35f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(-64.0f, 28.65f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.65f, 64.0f, 64.0f, 64.0f)
                close()
                moveTo(192.0f, 320.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                horizontalLineToRelative(-11.8f)
                curveToRelative(-11.07f, 5.03f, -23.26f, 8.0f, -36.2f, 8.0f)
                reflectiveCurveToRelative(-25.13f, -2.97f, -36.2f, -8.0f)
                lineTo(208.0f, 144.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _streetView!!
    }

private var _streetView: ImageVector? = null
