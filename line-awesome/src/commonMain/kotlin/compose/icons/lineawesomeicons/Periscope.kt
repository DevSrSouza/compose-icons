package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Periscope: ImageVector
    get() {
        if (_periscope != null) {
            return _periscope!!
        }
        _periscope = Builder(name = "Periscope", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.141f, 3.0f)
                curveTo(9.948f, 3.0f, 5.0f, 7.937f, 5.0f, 13.904f)
                curveTo(5.0f, 17.197f, 7.111f, 20.785f, 9.439f, 23.697f)
                curveTo(10.604f, 25.154f, 11.836f, 26.426f, 12.961f, 27.361f)
                curveTo(13.523f, 27.829f, 14.056f, 28.215f, 14.566f, 28.5f)
                curveTo(15.076f, 28.785f, 15.547f, 29.0f, 16.141f, 29.0f)
                curveTo(16.743f, 29.0f, 17.167f, 28.77f, 17.646f, 28.484f)
                curveTo(18.126f, 28.198f, 18.634f, 27.816f, 19.174f, 27.35f)
                curveTo(20.254f, 26.416f, 21.457f, 25.146f, 22.602f, 23.691f)
                curveTo(24.891f, 20.782f, 27.0f, 17.197f, 27.0f, 13.904f)
                curveTo(27.0f, 7.937f, 22.079f, 3.0f, 16.141f, 3.0f)
                close()
                moveTo(16.141f, 5.0f)
                curveTo(20.967f, 5.0f, 25.0f, 9.039f, 25.0f, 13.904f)
                curveTo(25.0f, 16.269f, 23.173f, 19.731f, 21.029f, 22.455f)
                curveTo(19.957f, 23.817f, 18.82f, 25.01f, 17.865f, 25.836f)
                curveTo(17.388f, 26.249f, 16.954f, 26.57f, 16.623f, 26.768f)
                curveTo(16.292f, 26.965f, 16.035f, 27.0f, 16.141f, 27.0f)
                curveTo(16.167f, 27.0f, 15.898f, 26.952f, 15.543f, 26.754f)
                curveTo(15.188f, 26.556f, 14.733f, 26.236f, 14.238f, 25.824f)
                curveTo(13.249f, 25.001f, 12.09f, 23.81f, 11.002f, 22.449f)
                curveTo(8.827f, 19.728f, 7.0f, 16.269f, 7.0f, 13.904f)
                curveTo(7.0f, 9.039f, 11.005f, 5.0f, 16.141f, 5.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(15.939f, 10.0f, 15.882f, 10.015f, 15.822f, 10.018f)
                curveTo(15.93f, 10.327f, 16.0f, 10.654f, 16.0f, 11.0f)
                curveTo(16.0f, 12.657f, 14.657f, 14.0f, 13.0f, 14.0f)
                curveTo(12.654f, 14.0f, 12.327f, 13.93f, 12.018f, 13.822f)
                curveTo(12.015f, 13.882f, 12.0f, 13.939f, 12.0f, 14.0f)
                curveTo(12.0f, 16.209f, 13.791f, 18.0f, 16.0f, 18.0f)
                curveTo(18.209f, 18.0f, 20.0f, 16.209f, 20.0f, 14.0f)
                curveTo(20.0f, 11.791f, 18.209f, 10.0f, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _periscope!!
    }

private var _periscope: ImageVector? = null
