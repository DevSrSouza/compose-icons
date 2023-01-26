package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.GpsOff: ImageVector
    get() {
        if (_gpsOff != null) {
            return _gpsOff!!
        }
        _gpsOff = Builder(name = "GpsOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.94f, 11.0f)
                curveToRelative(-0.46f, -4.17f, -3.77f, -7.48f, -7.94f, -7.94f)
                lineTo(13.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.06f)
                curveToRelative(-0.98f, 0.11f, -1.91f, 0.38f, -2.77f, 0.78f)
                lineToRelative(1.53f, 1.53f)
                curveTo(10.46f, 5.13f, 11.22f, 5.0f, 12.0f, 5.0f)
                curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f)
                curveToRelative(0.0f, 0.79f, -0.13f, 1.54f, -0.37f, 2.24f)
                lineToRelative(1.53f, 1.53f)
                curveToRelative(0.4f, -0.86f, 0.67f, -1.79f, 0.78f, -2.77f)
                lineTo(23.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.06f)
                close()
                moveTo(3.0f, 4.27f)
                lineToRelative(2.04f, 2.04f)
                curveTo(3.97f, 7.62f, 3.26f, 9.23f, 3.06f, 11.0f)
                lineTo(1.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.06f)
                curveToRelative(0.46f, 4.17f, 3.77f, 7.48f, 7.94f, 7.94f)
                lineTo(11.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.06f)
                curveToRelative(1.77f, -0.2f, 3.38f, -0.91f, 4.69f, -1.98f)
                lineTo(19.73f, 21.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.41f, 2.86f)
                lineTo(3.0f, 4.27f)
                close()
                moveTo(16.27f, 17.54f)
                curveTo(15.09f, 18.45f, 13.61f, 19.0f, 12.0f, 19.0f)
                curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f)
                curveToRelative(0.0f, -1.61f, 0.55f, -3.09f, 1.46f, -4.27f)
                lineToRelative(9.81f, 9.81f)
                close()
            }
        }
        .build()
        return _gpsOff!!
    }

private var _gpsOff: ImageVector? = null
