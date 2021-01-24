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

public val SolidGroup.TrafficLight: ImageVector
    get() {
        if (_trafficLight != null) {
            return _trafficLight!!
        }
        _trafficLight = Builder(name = "TrafficLight", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 192.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(-37.88f)
                curveToRelative(37.2f, -13.22f, 64.0f, -48.38f, 64.0f, -90.12f)
                horizontalLineToRelative(-64.0f)
                lineTo(320.0f, 32.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                lineTo(96.0f, 0.0f)
                curveTo(78.33f, 0.0f, 64.0f, 14.33f, 64.0f, 32.0f)
                verticalLineToRelative(32.0f)
                lineTo(0.0f, 64.0f)
                curveToRelative(0.0f, 41.74f, 26.8f, 76.9f, 64.0f, 90.12f)
                lineTo(64.0f, 192.0f)
                lineTo(0.0f, 192.0f)
                curveToRelative(0.0f, 41.74f, 26.8f, 76.9f, 64.0f, 90.12f)
                lineTo(64.0f, 320.0f)
                lineTo(0.0f, 320.0f)
                curveToRelative(0.0f, 42.84f, 28.25f, 78.69f, 66.99f, 91.05f)
                curveTo(79.42f, 468.72f, 130.6f, 512.0f, 192.0f, 512.0f)
                reflectiveCurveToRelative(112.58f, -43.28f, 125.01f, -100.95f)
                curveTo(355.75f, 398.69f, 384.0f, 362.84f, 384.0f, 320.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(-37.88f)
                curveToRelative(37.2f, -13.22f, 64.0f, -48.38f, 64.0f, -90.12f)
                close()
                moveTo(192.0f, 416.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.49f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.49f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.49f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(192.0f, 288.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.49f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.49f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.49f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(192.0f, 160.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.49f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.49f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.49f, 48.0f, -48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _trafficLight!!
    }

private var _trafficLight: ImageVector? = null
