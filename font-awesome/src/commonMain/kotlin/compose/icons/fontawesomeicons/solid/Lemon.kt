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

public val SolidGroup.Lemon: ImageVector
    get() {
        if (_lemon != null) {
            return _lemon!!
        }
        _lemon = Builder(name = "Lemon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(489.04f, 22.96f)
                curveTo(465.94f, -0.13f, 434.65f, -5.93f, 413.95f, 6.13f)
                curveToRelative(-58.91f, 34.31f, -181.25f, -53.08f, -321.07f, 86.75f)
                reflectiveCurveTo(40.44f, 355.04f, 6.13f, 413.95f)
                curveToRelative(-12.06f, 20.7f, -6.26f, 52.0f, 16.83f, 75.09f)
                curveToRelative(23.09f, 23.09f, 54.39f, 28.89f, 75.1f, 16.83f)
                curveToRelative(58.9f, -34.31f, 181.25f, 53.08f, 321.07f, -86.74f)
                reflectiveCurveTo(471.56f, 156.96f, 505.87f, 98.06f)
                curveToRelative(12.06f, -20.7f, 6.26f, -52.0f, -16.83f, -75.09f)
                close()
                moveTo(243.88f, 95.52f)
                curveToRelative(-58.19f, 14.55f, -133.81f, 90.15f, -148.36f, 148.36f)
                curveToRelative(-1.82f, 7.27f, -8.34f, 12.12f, -15.51f, 12.12f)
                curveToRelative(-1.28f, 0.0f, -2.59f, -0.16f, -3.89f, -0.48f)
                curveToRelative(-8.57f, -2.14f, -13.78f, -10.83f, -11.64f, -19.4f)
                curveTo(81.9f, 166.43f, 166.32f, 81.93f, 236.12f, 64.48f)
                curveToRelative(8.57f, -2.14f, 17.26f, 3.07f, 19.4f, 11.64f)
                reflectiveCurveToRelative(-3.07f, 17.26f, -11.64f, 19.4f)
                close()
            }
        }
        .build()
        return _lemon!!
    }

private var _lemon: ImageVector? = null
