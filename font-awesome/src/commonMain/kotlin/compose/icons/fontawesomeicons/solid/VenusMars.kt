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

public val SolidGroup.VenusMars: ImageVector
    get() {
        if (_venusMars != null) {
            return _venusMars!!
        }
        _venusMars = Builder(name = "VenusMars", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(564.0f, 0.0f)
                horizontalLineToRelative(-79.0f)
                curveToRelative(-10.7f, 0.0f, -16.0f, 12.9f, -8.5f, 20.5f)
                lineToRelative(16.9f, 16.9f)
                lineToRelative(-48.7f, 48.7f)
                curveTo(422.5f, 72.1f, 396.2f, 64.0f, 368.0f, 64.0f)
                curveToRelative(-33.7f, 0.0f, -64.6f, 11.6f, -89.2f, 30.9f)
                curveToRelative(14.0f, 16.7f, 25.0f, 36.0f, 32.1f, 57.1f)
                curveToRelative(14.5f, -14.8f, 34.7f, -24.0f, 57.1f, -24.0f)
                curveToRelative(44.1f, 0.0f, 80.0f, 35.9f, 80.0f, 80.0f)
                reflectiveCurveToRelative(-35.9f, 80.0f, -80.0f, 80.0f)
                curveToRelative(-22.3f, 0.0f, -42.6f, -9.2f, -57.1f, -24.0f)
                curveToRelative(-7.1f, 21.1f, -18.0f, 40.4f, -32.1f, 57.1f)
                curveToRelative(24.5f, 19.4f, 55.5f, 30.9f, 89.2f, 30.9f)
                curveToRelative(79.5f, 0.0f, 144.0f, -64.5f, 144.0f, -144.0f)
                curveToRelative(0.0f, -28.2f, -8.1f, -54.5f, -22.1f, -76.7f)
                lineToRelative(48.7f, -48.7f)
                lineToRelative(16.9f, 16.9f)
                curveToRelative(2.4f, 2.4f, 5.4f, 3.5f, 8.4f, 3.5f)
                curveToRelative(6.2f, 0.0f, 12.1f, -4.8f, 12.1f, -12.0f)
                lineTo(576.0f, 12.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(144.0f, 64.0f)
                curveTo(64.5f, 64.0f, 0.0f, 128.5f, 0.0f, 208.0f)
                curveToRelative(0.0f, 68.5f, 47.9f, 125.9f, 112.0f, 140.4f)
                lineTo(112.0f, 400.0f)
                lineTo(76.0f, 400.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-36.0f)
                horizontalLineToRelative(36.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-36.0f)
                verticalLineToRelative(-51.6f)
                curveToRelative(64.1f, -14.6f, 112.0f, -71.9f, 112.0f, -140.4f)
                curveToRelative(0.0f, -79.5f, -64.5f, -144.0f, -144.0f, -144.0f)
                close()
                moveTo(144.0f, 288.0f)
                curveToRelative(-44.1f, 0.0f, -80.0f, -35.9f, -80.0f, -80.0f)
                reflectiveCurveToRelative(35.9f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.9f, 80.0f, 80.0f)
                reflectiveCurveToRelative(-35.9f, 80.0f, -80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _venusMars!!
    }

private var _venusMars: ImageVector? = null
