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

public val SolidGroup.BookSkull: ImageVector
    get() {
        if (_bookSkull != null) {
            return _bookSkull!!
        }
        _bookSkull = Builder(name = "BookSkull", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 43.0f, 43.0f, 0.0f, 96.0f, 0.0f)
                lineTo(384.0f, 0.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(448.0f, 352.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(384.0f, 512.0f)
                lineTo(96.0f, 512.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(0.0f, 96.0f)
                close()
                moveTo(64.0f, 416.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(352.0f, 448.0f)
                lineTo(352.0f, 384.0f)
                lineTo(96.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
                moveTo(320.0f, 112.0f)
                curveToRelative(0.0f, -35.3f, -35.8f, -64.0f, -80.0f, -64.0f)
                reflectiveCurveToRelative(-80.0f, 28.7f, -80.0f, 64.0f)
                curveToRelative(0.0f, 20.9f, 12.6f, 39.5f, 32.0f, 51.2f)
                lineTo(192.0f, 176.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(288.0f, 163.2f)
                curveToRelative(19.4f, -11.7f, 32.0f, -30.3f, 32.0f, -51.2f)
                close()
                moveTo(208.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -32.0f)
                close()
                moveTo(256.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -32.0f, 0.0f)
                close()
                moveTo(134.3f, 209.3f)
                curveToRelative(-8.1f, -3.5f, -17.5f, 0.3f, -21.0f, 8.4f)
                reflectiveCurveToRelative(0.3f, 17.5f, 8.4f, 21.0f)
                lineTo(199.4f, 272.0f)
                lineToRelative(-77.7f, 33.3f)
                curveToRelative(-8.1f, 3.5f, -11.9f, 12.9f, -8.4f, 21.0f)
                reflectiveCurveToRelative(12.9f, 11.9f, 21.0f, 8.4f)
                lineTo(240.0f, 289.4f)
                lineToRelative(105.7f, 45.3f)
                curveToRelative(8.1f, 3.5f, 17.5f, -0.3f, 21.0f, -8.4f)
                reflectiveCurveToRelative(-0.3f, -17.5f, -8.4f, -21.0f)
                lineTo(280.6f, 272.0f)
                lineToRelative(77.7f, -33.3f)
                curveToRelative(8.1f, -3.5f, 11.9f, -12.9f, 8.4f, -21.0f)
                reflectiveCurveToRelative(-12.9f, -11.9f, -21.0f, -8.4f)
                lineTo(240.0f, 254.6f)
                lineTo(134.3f, 209.3f)
                close()
            }
        }
        .build()
        return _bookSkull!!
    }

private var _bookSkull: ImageVector? = null
