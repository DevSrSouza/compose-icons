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

public val SolidGroup.HandFist: ImageVector
    get() {
        if (_handFist != null) {
            return _handFist!!
        }
        _handFist = Builder(name = "HandFist", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(224.0f, 144.0f)
                lineTo(160.0f, 144.0f)
                lineTo(160.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(64.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(80.0f)
                lineTo(64.0f, 144.0f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(256.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(256.0f, 64.0f)
                close()
                moveTo(352.0f, 128.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(352.0f, 128.0f)
                close()
                moveTo(256.0f, 216.0f)
                lineToRelative(0.0f, -0.6f)
                curveToRelative(9.4f, 5.4f, 20.3f, 8.6f, 32.0f, 8.6f)
                curveToRelative(13.2f, 0.0f, 25.4f, -4.0f, 35.6f, -10.8f)
                curveToRelative(8.7f, 24.9f, 32.5f, 42.8f, 60.4f, 42.8f)
                curveToRelative(11.7f, 0.0f, 22.6f, -3.1f, 32.0f, -8.6f)
                lineTo(416.0f, 256.0f)
                curveToRelative(0.0f, 52.3f, -25.1f, 98.8f, -64.0f, 128.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(160.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(128.0f, 401.6f)
                curveToRelative(-17.3f, -7.9f, -33.2f, -18.8f, -46.9f, -32.5f)
                lineTo(69.5f, 357.5f)
                curveTo(45.5f, 333.5f, 32.0f, 300.9f, 32.0f, 267.0f)
                lineTo(32.0f, 240.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                horizontalLineToRelative(88.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, 17.9f, 40.0f, 40.0f)
                reflectiveCurveToRelative(-17.9f, 40.0f, -40.0f, 40.0f)
                lineTo(128.0f, 256.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, -32.2f, 72.0f, -72.0f)
                close()
            }
        }
        .build()
        return _handFist!!
    }

private var _handFist: ImageVector? = null
