package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.LocationDisabled: ImageVector
    get() {
        if (_locationDisabled != null) {
            return _locationDisabled!!
        }
        _locationDisabled = Builder(name = "LocationDisabled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.94f, 11.0f)
                curveToRelative(-0.46f, -4.17f, -3.77f, -7.48f, -7.94f, -7.94f)
                lineTo(13.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.06f)
                curveToRelative(-1.13f, 0.12f, -2.19f, 0.46f, -3.16f, 0.97f)
                lineToRelative(1.5f, 1.5f)
                curveTo(10.16f, 5.19f, 11.06f, 5.0f, 12.0f, 5.0f)
                curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f)
                curveToRelative(0.0f, 0.94f, -0.19f, 1.84f, -0.52f, 2.65f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.5f, -0.96f, 0.84f, -2.02f, 0.97f, -3.15f)
                lineTo(23.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.06f)
                close()
                moveTo(3.0f, 4.27f)
                lineToRelative(2.04f, 2.04f)
                curveTo(3.97f, 7.62f, 3.25f, 9.23f, 3.06f, 11.0f)
                lineTo(1.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.06f)
                curveToRelative(0.46f, 4.17f, 3.77f, 7.48f, 7.94f, 7.94f)
                lineTo(11.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.06f)
                curveToRelative(1.77f, -0.2f, 3.38f, -0.91f, 4.69f, -1.98f)
                lineTo(19.73f, 21.0f)
                lineTo(21.0f, 19.73f)
                lineTo(4.27f, 3.0f)
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
        return _locationDisabled!!
    }

private var _locationDisabled: ImageVector? = null
