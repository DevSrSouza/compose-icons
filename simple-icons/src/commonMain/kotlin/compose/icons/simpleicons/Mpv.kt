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

public val SimpleIcons.Mpv: ImageVector
    get() {
        if (_mpv != null) {
            return _mpv!!
        }
        _mpv = Builder(name = "Mpv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.312f, 22.775f)
                curveToRelative(-6.153f, 0.0f, -11.142f, -4.988f, -11.142f, -11.142f)
                reflectiveCurveTo(6.16f, 0.491f, 12.312f, 0.491f)
                curveToRelative(6.154f, 0.0f, 11.142f, 4.989f, 11.142f, 11.142f)
                reflectiveCurveToRelative(-4.988f, 11.142f, -11.142f, 11.142f)
                close()
                moveTo(12.955f, 2.311f)
                arcToRelative(8.587f, 8.587f, 0.0f, true, false, 0.0f, 17.174f)
                arcToRelative(8.587f, 8.587f, 0.0f, false, false, 0.0f, -17.174f)
                close()
                moveTo(11.842f, 17.568f)
                arcToRelative(5.517f, 5.517f, 0.0f, true, true, 0.0f, -11.034f)
                arcToRelative(5.517f, 5.517f, 0.0f, false, true, 0.0f, 11.034f)
                close()
                moveTo(10.443f, 9.573f)
                lineTo(14.4f, 11.97f)
                lineToRelative(-3.957f, 2.518f)
                lineTo(10.443f, 9.573f)
                close()
            }
        }
        .build()
        return _mpv!!
    }

private var _mpv: ImageVector? = null
