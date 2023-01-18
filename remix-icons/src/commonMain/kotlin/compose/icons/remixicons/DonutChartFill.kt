package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.DonutChartFill: ImageVector
    get() {
        if (_donutChartFill != null) {
            return _donutChartFill!!
        }
        _donutChartFill = Builder(name = "DonutChartFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.05f)
                verticalLineToRelative(3.02f)
                curveTo(7.608f, 5.557f, 5.0f, 8.475f, 5.0f, 12.0f)
                curveToRelative(0.0f, 3.866f, 3.134f, 7.0f, 7.0f, 7.0f)
                curveToRelative(1.572f, 0.0f, 3.024f, -0.518f, 4.192f, -1.394f)
                lineToRelative(2.137f, 2.137f)
                curveTo(16.605f, 21.153f, 14.4f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveToRelative(0.0f, -5.185f, 3.947f, -9.449f, 9.0f, -9.95f)
                close()
                moveTo(21.95f, 13.0f)
                curveToRelative(-0.2f, 2.011f, -0.994f, 3.847f, -2.207f, 5.328f)
                lineToRelative(-2.137f, -2.136f)
                curveToRelative(0.687f, -0.916f, 1.153f, -2.006f, 1.323f, -3.192f)
                horizontalLineToRelative(3.022f)
                close()
                moveTo(13.002f, 2.05f)
                curveToRelative(4.724f, 0.469f, 8.48f, 4.226f, 8.95f, 8.95f)
                horizontalLineToRelative(-3.022f)
                curveToRelative(-0.438f, -3.065f, -2.863f, -5.49f, -5.928f, -5.929f)
                verticalLineTo(2.049f)
                close()
            }
        }
        .build()
        return _donutChartFill!!
    }

private var _donutChartFill: ImageVector? = null
