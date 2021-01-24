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

public val SolidGroup.SearchLocation: ImageVector
    get() {
        if (_searchLocation != null) {
            return _searchLocation!!
        }
        _searchLocation = Builder(name = "SearchLocation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(505.04f, 442.66f)
                lineToRelative(-99.71f, -99.69f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7.0f, -17.0f, -7.0f)
                horizontalLineToRelative(-16.3f)
                curveToRelative(27.6f, -35.3f, 44.0f, -79.69f, 44.0f, -127.99f)
                curveTo(416.03f, 93.09f, 322.92f, 0.0f, 208.02f, 0.0f)
                reflectiveCurveTo(0.0f, 93.09f, 0.0f, 207.98f)
                reflectiveCurveToRelative(93.11f, 207.98f, 208.02f, 207.98f)
                curveToRelative(48.3f, 0.0f, 92.71f, -16.4f, 128.01f, -44.0f)
                verticalLineToRelative(16.3f)
                curveToRelative(0.0f, 6.4f, 2.5f, 12.5f, 7.0f, 17.0f)
                lineToRelative(99.71f, 99.69f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(28.3f, -28.3f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.59f, 0.1f, -33.99f)
                close()
                moveTo(208.02f, 351.96f)
                curveToRelative(-79.54f, 0.0f, -144.0f, -64.34f, -144.0f, -143.98f)
                curveToRelative(0.0f, -79.53f, 64.35f, -143.98f, 144.0f, -143.98f)
                curveToRelative(79.54f, 0.0f, 144.0f, 64.34f, 144.0f, 143.98f)
                curveToRelative(0.0f, 79.53f, -64.35f, 143.98f, -144.0f, 143.98f)
                close()
                moveTo(208.04f, 112.0f)
                curveToRelative(-40.78f, 0.0f, -73.84f, 33.05f, -73.84f, 73.83f)
                curveToRelative(0.0f, 32.96f, 48.26f, 93.05f, 66.75f, 114.86f)
                arcToRelative(9.24f, 9.24f, 0.0f, false, false, 14.18f, 0.0f)
                curveToRelative(18.49f, -21.81f, 66.75f, -81.89f, 66.75f, -114.86f)
                curveToRelative(0.0f, -40.78f, -33.06f, -73.83f, -73.84f, -73.83f)
                close()
                moveTo(208.04f, 208.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, -10.75f, -24.0f, -24.0f)
                curveToRelative(0.0f, -13.26f, 10.75f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.74f, 24.0f, 24.0f)
                curveToRelative(0.0f, 13.25f, -10.75f, 24.0f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _searchLocation!!
    }

private var _searchLocation: ImageVector? = null
