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

public val SolidGroup.Baby: ImageVector
    get() {
        if (_baby != null) {
            return _baby!!
        }
        _baby = Builder(name = "Baby", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 88.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 144.0f, 0.0f)
                arcTo(72.0f, 72.0f, 0.0f, true, true, 152.0f, 88.0f)
                close()
                moveTo(39.7f, 144.5f)
                curveToRelative(13.0f, -17.9f, 38.0f, -21.8f, 55.9f, -8.8f)
                lineTo(131.8f, 162.0f)
                curveToRelative(26.8f, 19.5f, 59.1f, 30.0f, 92.2f, 30.0f)
                reflectiveCurveToRelative(65.4f, -10.5f, 92.2f, -30.0f)
                lineToRelative(36.2f, -26.4f)
                curveToRelative(17.9f, -13.0f, 42.9f, -9.0f, 55.9f, 8.8f)
                reflectiveCurveToRelative(9.0f, 42.9f, -8.8f, 55.9f)
                lineToRelative(-36.2f, 26.4f)
                curveToRelative(-13.6f, 9.9f, -28.1f, 18.2f, -43.3f, 25.0f)
                lineTo(320.0f, 288.0f)
                lineTo(128.0f, 288.0f)
                lineTo(128.0f, 251.7f)
                curveToRelative(-15.2f, -6.7f, -29.7f, -15.1f, -43.3f, -25.0f)
                lineTo(48.5f, 200.3f)
                curveToRelative(-17.9f, -13.0f, -21.8f, -38.0f, -8.8f, -55.9f)
                close()
                moveTo(129.5f, 329.3f)
                lineToRelative(60.6f, 53.0f)
                lineToRelative(-26.0f, 37.2f)
                lineToRelative(24.3f, 24.3f)
                curveToRelative(15.6f, 15.6f, 15.6f, 40.9f, 0.0f, 56.6f)
                reflectiveCurveToRelative(-40.9f, 15.6f, -56.6f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                curveTo(70.0f, 438.6f, 68.1f, 417.0f, 79.2f, 401.1f)
                lineToRelative(50.2f, -71.8f)
                close()
                moveTo(258.0f, 382.3f)
                lineToRelative(60.6f, -53.0f)
                lineToRelative(50.2f, 71.8f)
                curveToRelative(11.1f, 15.9f, 9.2f, 37.5f, -4.5f, 51.2f)
                lineToRelative(-48.0f, 48.0f)
                curveToRelative(-15.6f, 15.6f, -40.9f, 15.6f, -56.6f, 0.0f)
                reflectiveCurveToRelative(-15.6f, -40.9f, 0.0f, -56.6f)
                lineTo(284.0f, 419.4f)
                lineToRelative(-26.0f, -37.2f)
                close()
            }
        }
        .build()
        return _baby!!
    }

private var _baby: ImageVector? = null
