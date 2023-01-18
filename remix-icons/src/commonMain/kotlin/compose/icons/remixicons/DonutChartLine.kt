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

public val RemixIcons.DonutChartLine: ImageVector
    get() {
        if (_donutChartLine != null) {
            return _donutChartLine!!
        }
        _donutChartLine = Builder(name = "DonutChartLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.05f)
                verticalLineToRelative(2.012f)
                curveTo(7.054f, 4.554f, 4.0f, 7.92f, 4.0f, 12.0f)
                curveToRelative(0.0f, 4.418f, 3.582f, 8.0f, 8.0f, 8.0f)
                curveToRelative(1.849f, 0.0f, 3.55f, -0.627f, 4.906f, -1.68f)
                lineToRelative(1.423f, 1.423f)
                curveTo(16.605f, 21.153f, 14.4f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveToRelative(0.0f, -5.185f, 3.947f, -9.449f, 9.0f, -9.95f)
                close()
                moveTo(21.95f, 13.0f)
                curveToRelative(-0.2f, 2.011f, -0.994f, 3.847f, -2.207f, 5.328f)
                lineToRelative(-1.423f, -1.422f)
                curveToRelative(0.86f, -1.107f, 1.436f, -2.445f, 1.618f, -3.906f)
                horizontalLineToRelative(2.013f)
                close()
                moveTo(13.002f, 2.05f)
                curveToRelative(4.724f, 0.469f, 8.48f, 4.226f, 8.95f, 8.95f)
                horizontalLineToRelative(-2.013f)
                curveToRelative(-0.451f, -3.618f, -3.319f, -6.486f, -6.937f, -6.938f)
                verticalLineTo(2.049f)
                close()
            }
        }
        .build()
        return _donutChartLine!!
    }

private var _donutChartLine: ImageVector? = null
