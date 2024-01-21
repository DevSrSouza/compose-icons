package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.TrashCan: ImageVector
    get() {
        if (_trashCan != null) {
            return _trashCan!!
        }
        _trashCan = Builder(name = "TrashCan", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.5f, 51.6f)
                lineTo(151.5f, 80.0f)
                horizontalLineToRelative(145.0f)
                lineToRelative(-19.0f, -28.4f)
                curveToRelative(-1.5f, -2.2f, -4.0f, -3.6f, -6.7f, -3.6f)
                lineTo(177.1f, 48.0f)
                curveToRelative(-2.7f, 0.0f, -5.2f, 1.3f, -6.7f, 3.6f)
                close()
                moveTo(317.5f, 25.0f)
                lineTo(354.2f, 80.0f)
                lineTo(368.0f, 80.0f)
                horizontalLineToRelative(48.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(416.0f, 432.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                lineTo(112.0f, 512.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, -35.8f, -80.0f, -80.0f)
                lineTo(32.0f, 128.0f)
                lineTo(24.0f, 128.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveTo(10.7f, 80.0f, 24.0f, 80.0f)
                horizontalLineToRelative(8.0f)
                lineTo(80.0f, 80.0f)
                lineTo(93.8f, 80.0f)
                lineToRelative(36.7f, -55.1f)
                curveTo(140.9f, 9.4f, 158.4f, 0.0f, 177.1f, 0.0f)
                horizontalLineToRelative(93.7f)
                curveToRelative(18.7f, 0.0f, 36.2f, 9.4f, 46.6f, 24.9f)
                close()
                moveTo(80.0f, 128.0f)
                lineTo(80.0f, 432.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(336.0f, 464.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(368.0f, 128.0f)
                lineTo(80.0f, 128.0f)
                close()
                moveTo(160.0f, 192.0f)
                lineTo(160.0f, 400.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(128.0f, 192.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                close()
                moveTo(240.0f, 192.0f)
                lineTo(240.0f, 400.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(208.0f, 192.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                close()
                moveTo(320.0f, 192.0f)
                lineTo(320.0f, 400.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(288.0f, 192.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _trashCan!!
    }

private var _trashCan: ImageVector? = null
