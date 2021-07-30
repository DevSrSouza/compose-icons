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

public val SimpleIcons.Zendesk: ImageVector
    get() {
        if (_zendesk != null) {
            return _zendesk!!
        }
        _zendesk = Builder(name = "Zendesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.914f, 2.904f)
                lineTo(12.914f, 16.29f)
                lineTo(24.0f, 2.905f)
                lineTo(12.914f, 2.905f)
                close()
                moveTo(0.0f, 2.906f)
                curveTo(0.0f, 5.966f, 2.483f, 8.45f, 5.543f, 8.45f)
                reflectiveCurveToRelative(5.542f, -2.484f, 5.543f, -5.544f)
                lineTo(0.0f, 2.906f)
                close()
                moveTo(11.086f, 7.713f)
                lineTo(0.0f, 21.096f)
                horizontalLineToRelative(11.086f)
                lineTo(11.086f, 7.713f)
                close()
                moveTo(18.456f, 15.553f)
                curveToRelative(-3.063f, 0.0f, -5.542f, 2.48f, -5.542f, 5.543f)
                lineTo(24.0f, 21.096f)
                curveToRelative(0.0f, -3.06f, -2.48f, -5.543f, -5.543f, -5.543f)
                close()
            }
        }
        .build()
        return _zendesk!!
    }

private var _zendesk: ImageVector? = null
