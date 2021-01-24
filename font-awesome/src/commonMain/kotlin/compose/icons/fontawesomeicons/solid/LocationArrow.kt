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

public val SolidGroup.LocationArrow: ImageVector
    get() {
        if (_locationArrow != null) {
            return _locationArrow!!
        }
        _locationArrow = Builder(name = "LocationArrow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(444.52f, 3.52f)
                lineTo(28.74f, 195.42f)
                curveToRelative(-47.97f, 22.39f, -31.98f, 92.75f, 19.19f, 92.75f)
                horizontalLineToRelative(175.91f)
                verticalLineToRelative(175.91f)
                curveToRelative(0.0f, 51.17f, 70.36f, 67.17f, 92.75f, 19.19f)
                lineToRelative(191.9f, -415.78f)
                curveToRelative(15.99f, -38.39f, -25.59f, -79.97f, -63.97f, -63.97f)
                close()
            }
        }
        .build()
        return _locationArrow!!
    }

private var _locationArrow: ImageVector? = null
