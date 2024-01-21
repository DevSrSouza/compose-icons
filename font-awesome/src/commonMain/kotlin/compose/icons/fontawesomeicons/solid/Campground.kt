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

public val SolidGroup.Campground: ImageVector
    get() {
        if (_campground != null) {
            return _campground!!
        }
        _campground = Builder(name = "Campground", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(377.0f, 52.0f)
                curveToRelative(11.0f, -13.8f, 8.8f, -33.9f, -5.0f, -45.0f)
                reflectiveCurveToRelative(-33.9f, -8.8f, -45.0f, 5.0f)
                lineTo(288.0f, 60.8f)
                lineTo(249.0f, 12.0f)
                curveToRelative(-11.0f, -13.8f, -31.2f, -16.0f, -45.0f, -5.0f)
                reflectiveCurveToRelative(-16.0f, 31.2f, -5.0f, 45.0f)
                lineToRelative(48.0f, 60.0f)
                lineTo(12.3f, 405.4f)
                curveTo(4.3f, 415.4f, 0.0f, 427.7f, 0.0f, 440.4f)
                verticalLineTo(464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineTo(288.0f)
                horizontalLineTo(528.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(440.4f)
                curveToRelative(0.0f, -12.7f, -4.3f, -25.1f, -12.3f, -35.0f)
                lineTo(329.0f, 112.0f)
                lineToRelative(48.0f, -60.0f)
                close()
                moveTo(288.0f, 448.0f)
                horizontalLineTo(168.5f)
                lineTo(288.0f, 291.7f)
                lineTo(407.5f, 448.0f)
                horizontalLineTo(288.0f)
                close()
            }
        }
        .build()
        return _campground!!
    }

private var _campground: ImageVector? = null
