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

public val SolidGroup.CarOn: ImageVector
    get() {
        if (_carOn != null) {
            return _carOn!!
        }
        _carOn = Builder(name = "CarOn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(280.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(280.0f, 24.0f)
                close()
                moveTo(185.8f, 224.0f)
                lineTo(326.2f, 224.0f)
                curveToRelative(6.8f, 0.0f, 12.8f, 4.3f, 15.1f, 10.6f)
                lineTo(360.3f, 288.0f)
                lineTo(151.7f, 288.0f)
                lineToRelative(19.1f, -53.4f)
                curveToRelative(2.3f, -6.4f, 8.3f, -10.6f, 15.1f, -10.6f)
                close()
                moveTo(110.5f, 213.1f)
                lineTo(82.2f, 292.4f)
                curveTo(62.1f, 300.9f, 48.0f, 320.8f, 48.0f, 344.0f)
                verticalLineToRelative(40.0f)
                verticalLineToRelative(64.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(96.0f, 512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(128.0f, 448.0f)
                lineTo(384.0f, 448.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(464.0f, 448.0f)
                lineTo(464.0f, 384.0f)
                lineTo(464.0f, 344.0f)
                curveToRelative(0.0f, -23.2f, -14.1f, -43.1f, -34.2f, -51.6f)
                lineToRelative(-28.3f, -79.3f)
                curveTo(390.1f, 181.3f, 360.0f, 160.0f, 326.2f, 160.0f)
                lineTo(185.8f, 160.0f)
                curveToRelative(-33.8f, 0.0f, -64.0f, 21.3f, -75.3f, 53.1f)
                close()
                moveTo(128.0f, 344.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(360.0f, 368.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
                moveTo(39.0f, 39.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(48.0f, 48.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(73.0f, 39.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                close()
                moveTo(439.0f, 39.0f)
                lineTo(391.0f, 87.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(48.0f, -48.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(-24.6f, -9.4f, -33.9f, 0.0f)
                close()
            }
        }
        .build()
        return _carOn!!
    }

private var _carOn: ImageVector? = null
