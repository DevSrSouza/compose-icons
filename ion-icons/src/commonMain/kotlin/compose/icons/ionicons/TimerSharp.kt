package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.TimerSharp: ImageVector
    get() {
        if (_timerSharp != null) {
            return _timerSharp!!
        }
        _timerSharp = Builder(name = "TimerSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.12f, 48.0f, 48.0f, 141.12f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.12f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.12f, 208.0f, -208.0f)
                reflectiveCurveTo(370.88f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(256.0f, 432.0f)
                curveTo(159.0f, 432.0f, 80.0f, 353.05f, 80.0f, 256.0f)
                arcToRelative(174.55f, 174.55f, 0.0f, false, true, 53.87f, -126.72f)
                lineTo(279.0f, 233.0f)
                lineToRelative(-19.0f, 30.0f)
                lineTo(135.0f, 172.0f)
                curveToRelative(-13.0f, 23.0f, -26.7f, 46.0f, -26.7f, 84.0f)
                curveToRelative(0.0f, 81.44f, 66.26f, 147.7f, 147.7f, 147.7f)
                reflectiveCurveTo(403.7f, 337.44f, 403.7f, 256.0f)
                curveToRelative(0.0f, -76.67f, -58.72f, -139.88f, -133.55f, -147.0f)
                lineTo(270.15f, 164.0f)
                horizontalLineToRelative(-28.3f)
                lineTo(241.85f, 79.89f)
                curveToRelative(4.24f, 0.07f, 8.94f, 0.11f, 14.15f, 0.11f)
                curveTo(353.05f, 80.0f, 432.0f, 159.0f, 432.0f, 256.0f)
                reflectiveCurveTo(353.05f, 432.0f, 256.0f, 432.0f)
                close()
            }
        }
        .build()
        return _timerSharp!!
    }

private var _timerSharp: ImageVector? = null
