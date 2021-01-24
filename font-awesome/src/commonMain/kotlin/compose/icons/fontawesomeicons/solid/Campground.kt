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

public val SolidGroup.Campground: ImageVector
    get() {
        if (_campground != null) {
            return _campground!!
        }
        _campground = Builder(name = "Campground", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(624.0f, 448.0f)
                horizontalLineToRelative(-24.68f)
                lineTo(359.54f, 117.75f)
                lineToRelative(53.41f, -73.55f)
                curveToRelative(5.19f, -7.15f, 3.61f, -17.16f, -3.54f, -22.35f)
                lineToRelative(-25.9f, -18.79f)
                curveToRelative(-7.15f, -5.19f, -17.15f, -3.61f, -22.35f, 3.55f)
                lineTo(320.0f, 63.3f)
                lineTo(278.83f, 6.6f)
                curveToRelative(-5.19f, -7.15f, -15.2f, -8.74f, -22.35f, -3.55f)
                lineToRelative(-25.88f, 18.8f)
                curveToRelative(-7.15f, 5.19f, -8.74f, 15.2f, -3.54f, 22.35f)
                lineToRelative(53.41f, 73.55f)
                lineTo(40.68f, 448.0f)
                horizontalLineTo(16.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(608.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(320.0f, 288.0f)
                lineToRelative(116.36f, 160.0f)
                horizontalLineTo(203.64f)
                lineTo(320.0f, 288.0f)
                close()
            }
        }
        .build()
        return _campground!!
    }

private var _campground: ImageVector? = null
