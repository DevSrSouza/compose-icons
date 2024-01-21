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

public val SolidGroup.Transgender: ImageVector
    get() {
        if (_transgender != null) {
            return _transgender!!
        }
        _transgender = Builder(name = "Transgender", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 0.0f)
                curveToRelative(6.5f, 0.0f, 12.3f, 3.9f, 14.8f, 9.9f)
                reflectiveCurveToRelative(1.1f, 12.9f, -3.5f, 17.4f)
                lineToRelative(-31.0f, 31.0f)
                lineTo(112.0f, 78.1f)
                lineToRelative(7.0f, -7.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-7.0f, 7.0f)
                lineToRelative(15.2f, 15.2f)
                curveTo(187.7f, 107.6f, 220.5f, 96.0f, 256.0f, 96.0f)
                reflectiveCurveToRelative(68.3f, 11.6f, 94.9f, 31.2f)
                lineToRelative(68.8f, -68.8f)
                lineToRelative(-31.0f, -31.0f)
                curveToRelative(-4.6f, -4.6f, -5.9f, -11.5f, -3.5f, -17.4f)
                reflectiveCurveToRelative(8.3f, -9.9f, 14.8f, -9.9f)
                horizontalLineToRelative(96.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 6.5f, -3.9f, 12.3f, -9.9f, 14.8f)
                reflectiveCurveToRelative(-12.9f, 1.1f, -17.4f, -3.5f)
                lineToRelative(-31.0f, -31.0f)
                lineToRelative(-68.8f, 68.8f)
                curveTo(404.4f, 187.7f, 416.0f, 220.5f, 416.0f, 256.0f)
                curveToRelative(0.0f, 80.2f, -59.0f, 146.6f, -136.0f, 158.2f)
                verticalLineTo(432.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(280.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(216.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(414.2f)
                curveTo(155.0f, 402.6f, 96.0f, 336.2f, 96.0f, 256.0f)
                curveToRelative(0.0f, -35.5f, 11.6f, -68.3f, 31.2f, -94.9f)
                lineTo(112.0f, 145.9f)
                lineToRelative(-7.0f, 7.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(7.0f, -7.0f)
                lineTo(58.3f, 92.3f)
                lineToRelative(-31.0f, 31.0f)
                curveToRelative(-4.6f, 4.6f, -11.5f, 5.9f, -17.4f, 3.5f)
                reflectiveCurveTo(0.0f, 118.5f, 0.0f, 112.0f)
                verticalLineTo(16.0f)
                curveTo(0.0f, 7.2f, 7.2f, 0.0f, 16.0f, 0.0f)
                horizontalLineToRelative(96.0f)
                close()
                moveTo(352.0f, 256.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, -192.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 192.0f, 0.0f)
                close()
            }
        }
        .build()
        return _transgender!!
    }

private var _transgender: ImageVector? = null
