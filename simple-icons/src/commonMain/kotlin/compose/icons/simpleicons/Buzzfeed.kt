package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Buzzfeed: ImageVector
    get() {
        if (_buzzfeed != null) {
            return _buzzfeed!!
        }
        _buzzfeed = Builder(name = "Buzzfeed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                close()
                moveTo(19.852f, 11.727f)
                lineToRelative(-0.977f, -6.94f)
                lineToRelative(-6.5f, 2.624f)
                lineToRelative(2.575f, 1.487f)
                lineToRelative(-2.435f, 4.215f)
                lineTo(8.3f, 10.68f)
                lineToRelative(-4.153f, 7.19f)
                lineToRelative(2.327f, 1.346f)
                lineToRelative(2.812f, -4.868f)
                lineTo(13.5f, 16.78f)
                lineToRelative(3.777f, -6.54f)
                lineToRelative(2.575f, 1.487f)
                close()
            }
        }
        .build()
        return _buzzfeed!!
    }

private var _buzzfeed: ImageVector? = null
