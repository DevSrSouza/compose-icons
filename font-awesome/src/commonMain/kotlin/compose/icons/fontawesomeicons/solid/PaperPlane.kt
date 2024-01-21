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

public val SolidGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(498.1f, 5.6f)
                curveToRelative(10.1f, 7.0f, 15.4f, 19.1f, 13.5f, 31.2f)
                lineToRelative(-64.0f, 416.0f)
                curveToRelative(-1.5f, 9.7f, -7.4f, 18.2f, -16.0f, 23.0f)
                reflectiveCurveToRelative(-18.9f, 5.4f, -28.0f, 1.6f)
                lineTo(284.0f, 427.7f)
                lineToRelative(-68.5f, 74.1f)
                curveToRelative(-8.9f, 9.7f, -22.9f, 12.9f, -35.2f, 8.1f)
                reflectiveCurveTo(160.0f, 493.2f, 160.0f, 480.0f)
                verticalLineTo(396.4f)
                curveToRelative(0.0f, -4.0f, 1.5f, -7.8f, 4.2f, -10.7f)
                lineTo(331.8f, 202.8f)
                curveToRelative(5.8f, -6.3f, 5.6f, -16.0f, -0.4f, -22.0f)
                reflectiveCurveToRelative(-15.7f, -6.4f, -22.0f, -0.7f)
                lineTo(106.0f, 360.8f)
                lineTo(17.7f, 316.6f)
                curveTo(7.1f, 311.3f, 0.3f, 300.7f, 0.0f, 288.9f)
                reflectiveCurveToRelative(5.9f, -22.8f, 16.1f, -28.7f)
                lineToRelative(448.0f, -256.0f)
                curveToRelative(10.7f, -6.1f, 23.9f, -5.5f, 34.0f, 1.4f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
