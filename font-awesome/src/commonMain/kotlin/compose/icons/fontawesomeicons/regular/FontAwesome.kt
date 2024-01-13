package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.FontAwesome: ImageVector
    get() {
        if (_fontAwesome != null) {
            return _fontAwesome!!
        }
        _fontAwesome = Builder(name = "FontAwesome", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 56.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveTo(0.0f, 42.7f, 0.0f, 56.0f)
                verticalLineTo(456.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineTo(124.2f)
                lineToRelative(12.5f, -2.4f)
                curveToRelative(16.7f, -3.2f, 31.5f, -8.5f, 44.2f, -13.1f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(3.7f, -1.3f, 7.1f, -2.6f, 10.4f, -3.7f)
                curveToRelative(15.2f, -5.2f, 30.4f, -9.1f, 51.2f, -9.1f)
                curveToRelative(25.6f, 0.0f, 43.0f, 6.0f, 63.5f, 13.3f)
                lineToRelative(0.5f, 0.2f)
                curveToRelative(20.9f, 7.4f, 44.8f, 15.9f, 79.1f, 15.9f)
                curveToRelative(32.4f, 0.0f, 53.7f, -6.8f, 90.5f, -19.6f)
                verticalLineTo(342.9f)
                lineToRelative(-9.5f, 3.3f)
                curveToRelative(-41.5f, 14.4f, -55.2f, 19.2f, -81.0f, 19.2f)
                curveToRelative(-25.7f, 0.0f, -43.1f, -6.0f, -63.6f, -13.3f)
                lineToRelative(-0.6f, -0.2f)
                curveToRelative(-20.8f, -7.4f, -44.8f, -15.8f, -79.0f, -15.8f)
                curveToRelative(-16.8f, 0.0f, -31.0f, 2.0f, -43.9f, 5.0f)
                curveToRelative(-12.9f, 3.0f, -20.9f, 16.0f, -17.9f, 28.9f)
                reflectiveCurveToRelative(16.0f, 20.9f, 28.9f, 17.9f)
                curveToRelative(9.6f, -2.2f, 20.1f, -3.7f, 32.9f, -3.7f)
                curveToRelative(25.6f, 0.0f, 43.0f, 6.0f, 63.5f, 13.3f)
                lineToRelative(0.5f, 0.2f)
                curveToRelative(20.9f, 7.4f, 44.8f, 15.9f, 79.1f, 15.9f)
                curveToRelative(34.4f, 0.0f, 56.4f, -7.7f, 97.8f, -22.2f)
                curveToRelative(7.5f, -2.6f, 15.5f, -5.4f, 24.4f, -8.5f)
                lineToRelative(16.2f, -5.5f)
                verticalLineTo(360.0f)
                verticalLineTo(72.0f)
                verticalLineTo(38.4f)
                lineTo(416.2f, 49.3f)
                curveToRelative(-9.7f, 3.3f, -18.2f, 6.3f, -25.7f, 8.9f)
                curveToRelative(-41.5f, 14.4f, -55.2f, 19.2f, -81.0f, 19.2f)
                curveToRelative(-25.7f, 0.0f, -43.1f, -6.0f, -63.6f, -13.3f)
                lineToRelative(-0.6f, -0.2f)
                curveToRelative(-20.8f, -7.4f, -44.8f, -15.8f, -79.0f, -15.8f)
                curveToRelative(-27.8f, 0.0f, -48.5f, 5.5f, -66.6f, 11.6f)
                curveToRelative(-4.9f, 1.7f, -9.3f, 3.3f, -13.6f, 4.8f)
                curveToRelative(-11.9f, 4.3f, -22.0f, 7.9f, -34.7f, 10.3f)
                lineTo(48.0f, 75.4f)
                verticalLineTo(56.0f)
                close()
            }
        }
        .build()
        return _fontAwesome!!
    }

private var _fontAwesome: ImageVector? = null
