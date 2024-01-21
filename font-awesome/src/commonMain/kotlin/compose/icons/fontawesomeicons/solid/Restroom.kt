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

public val SolidGroup.Restroom: ImageVector
    get() {
        if (_restroom != null) {
            return _restroom!!
        }
        _restroom = Builder(name = "Restroom", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 80.0f, 48.0f)
                close()
                moveTo(120.0f, 352.0f)
                lineTo(120.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(56.0f, 325.2f)
                curveToRelative(-8.1f, 9.2f, -21.1f, 13.2f, -33.5f, 9.4f)
                curveToRelative(-16.9f, -5.3f, -26.3f, -23.2f, -21.0f, -40.1f)
                lineToRelative(30.9f, -99.1f)
                curveTo(44.9f, 155.3f, 82.0f, 128.0f, 124.0f, 128.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(42.0f, 0.0f, 79.1f, 27.3f, 91.6f, 67.4f)
                lineToRelative(30.9f, 99.1f)
                curveToRelative(5.3f, 16.9f, -4.1f, 34.8f, -21.0f, 40.1f)
                curveToRelative(-12.4f, 3.9f, -25.4f, -0.2f, -33.5f, -9.4f)
                lineTo(200.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(136.0f, 352.0f)
                lineTo(120.0f, 352.0f)
                close()
                moveTo(320.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineTo(344.0f, 488.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(296.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(464.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(440.0f, 480.0f)
                lineTo(440.0f, 384.0f)
                lineTo(422.2f, 384.0f)
                curveToRelative(-10.9f, 0.0f, -18.6f, -10.7f, -15.2f, -21.1f)
                lineToRelative(9.0f, -26.9f)
                curveToRelative(-3.2f, 0.0f, -6.4f, -0.5f, -9.5f, -1.5f)
                curveToRelative(-16.9f, -5.3f, -26.3f, -23.2f, -21.0f, -40.1f)
                lineToRelative(29.7f, -95.2f)
                curveTo(428.4f, 156.9f, 467.6f, 128.0f, 512.0f, 128.0f)
                reflectiveCurveToRelative(83.6f, 28.9f, 96.8f, 71.2f)
                lineToRelative(29.7f, 95.2f)
                curveToRelative(5.3f, 16.9f, -4.1f, 34.8f, -21.0f, 40.1f)
                curveToRelative(-3.2f, 1.0f, -6.4f, 1.5f, -9.5f, 1.5f)
                lineToRelative(9.0f, 26.9f)
                curveToRelative(3.5f, 10.4f, -4.3f, 21.1f, -15.2f, 21.1f)
                lineTo(584.0f, 384.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(520.0f, 384.0f)
                lineTo(504.0f, 384.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _restroom!!
    }

private var _restroom: ImageVector? = null
