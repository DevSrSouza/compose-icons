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

public val SolidGroup.UpLong: ImageVector
    get() {
        if (_upLong != null) {
            return _upLong!!
        }
        _upLong = Builder(name = "UpLong", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(318.0f, 177.5f)
                curveToRelative(3.8f, -8.8f, 2.0f, -19.0f, -4.6f, -26.0f)
                lineToRelative(-136.0f, -144.0f)
                curveTo(172.9f, 2.7f, 166.6f, 0.0f, 160.0f, 0.0f)
                reflectiveCurveToRelative(-12.9f, 2.7f, -17.4f, 7.5f)
                lineToRelative(-136.0f, 144.0f)
                curveToRelative(-6.6f, 7.0f, -8.4f, 17.2f, -4.6f, 26.0f)
                reflectiveCurveTo(14.4f, 192.0f, 24.0f, 192.0f)
                horizontalLineTo(96.0f)
                lineToRelative(0.0f, 288.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -288.0f)
                horizontalLineToRelative(72.0f)
                curveToRelative(9.6f, 0.0f, 18.2f, -5.7f, 22.0f, -14.5f)
                close()
            }
        }
        .build()
        return _upLong!!
    }

private var _upLong: ImageVector? = null
