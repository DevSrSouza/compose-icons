package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SportsFootball: ImageVector
    get() {
        if (_sportsFootball != null) {
            return _sportsFootball!!
        }
        _sportsFootball = Builder(name = "SportsFootball", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.02f, 15.62f)
                curveToRelative(-0.08f, 2.42f, 0.32f, 4.34f, 0.67f, 4.69f)
                reflectiveCurveToRelative(2.28f, 0.76f, 4.69f, 0.67f)
                lineTo(3.02f, 15.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.08f, 3.28f)
                curveTo(10.75f, 3.7f, 8.29f, 4.62f, 6.46f, 6.46f)
                reflectiveCurveToRelative(-2.76f, 4.29f, -3.18f, 6.62f)
                lineToRelative(7.63f, 7.63f)
                curveToRelative(2.34f, -0.41f, 4.79f, -1.34f, 6.62f, -3.18f)
                reflectiveCurveToRelative(2.76f, -4.29f, 3.18f, -6.62f)
                lineTo(13.08f, 3.28f)
                close()
                moveTo(9.9f, 15.5f)
                lineToRelative(-1.4f, -1.4f)
                lineToRelative(5.6f, -5.6f)
                lineToRelative(1.4f, 1.4f)
                lineTo(9.9f, 15.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.98f, 8.38f)
                curveToRelative(0.08f, -2.42f, -0.32f, -4.34f, -0.67f, -4.69f)
                reflectiveCurveToRelative(-2.28f, -0.76f, -4.69f, -0.67f)
                lineTo(20.98f, 8.38f)
                close()
            }
        }
        .build()
        return _sportsFootball!!
    }

private var _sportsFootball: ImageVector? = null
