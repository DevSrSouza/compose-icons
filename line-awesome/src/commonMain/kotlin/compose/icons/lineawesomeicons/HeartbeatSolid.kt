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

public val LineAwesomeIcons.HeartbeatSolid: ImageVector
    get() {
        if (_heartbeatSolid != null) {
            return _heartbeatSolid!!
        }
        _heartbeatSolid = Builder(name = "HeartbeatSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.781f, 5.0f)
                curveTo(6.492f, 5.0f, 3.0f, 8.301f, 3.0f, 12.359f)
                curveTo(3.0f, 12.578f, 3.02f, 12.785f, 3.035f, 13.0f)
                lineTo(5.039f, 13.0f)
                curveTo(5.02f, 12.789f, 5.0f, 12.578f, 5.0f, 12.359f)
                curveTo(5.0f, 9.406f, 7.594f, 7.0f, 10.781f, 7.0f)
                curveTo(12.238f, 7.0f, 13.629f, 7.504f, 14.699f, 8.418f)
                lineTo(16.0f, 9.531f)
                lineTo(17.301f, 8.418f)
                curveTo(18.367f, 7.504f, 19.758f, 7.0f, 21.219f, 7.0f)
                curveTo(24.406f, 7.0f, 27.0f, 9.406f, 27.0f, 12.359f)
                curveTo(27.0f, 17.48f, 22.176f, 20.516f, 18.297f, 22.957f)
                curveTo(17.41f, 23.512f, 16.633f, 24.004f, 16.0f, 24.469f)
                curveTo(15.367f, 24.004f, 14.59f, 23.512f, 13.703f, 22.957f)
                curveTo(11.895f, 21.82f, 9.883f, 20.551f, 8.246f, 19.0f)
                lineTo(5.531f, 19.0f)
                curveTo(7.512f, 21.41f, 10.316f, 23.188f, 12.641f, 24.652f)
                curveTo(13.613f, 25.262f, 14.449f, 25.789f, 15.043f, 26.254f)
                curveTo(15.043f, 26.254f, 15.992f, 26.992f, 16.0f, 27.0f)
                curveTo(16.004f, 26.992f, 16.953f, 26.254f, 16.953f, 26.254f)
                curveTo(17.547f, 25.789f, 18.383f, 25.262f, 19.359f, 24.652f)
                curveTo(23.426f, 22.09f, 29.0f, 18.586f, 29.0f, 12.359f)
                curveTo(29.0f, 8.301f, 25.508f, 5.0f, 21.219f, 5.0f)
                curveTo(19.27f, 5.0f, 17.422f, 5.68f, 16.0f, 6.898f)
                curveTo(14.578f, 5.68f, 12.727f, 5.0f, 10.781f, 5.0f)
                close()
                moveTo(11.969f, 9.387f)
                lineTo(9.633f, 15.219f)
                lineTo(9.414f, 15.0f)
                lineTo(3.0f, 15.0f)
                lineTo(3.0f, 17.0f)
                lineTo(8.586f, 17.0f)
                lineTo(10.363f, 18.781f)
                lineTo(12.031f, 14.613f)
                lineTo(15.031f, 21.613f)
                lineTo(17.102f, 16.438f)
                lineTo(17.383f, 17.0f)
                lineTo(19.27f, 17.0f)
                curveTo(19.629f, 17.617f, 20.285f, 18.0f, 21.0f, 18.0f)
                curveTo(22.105f, 18.0f, 23.0f, 17.105f, 23.0f, 16.0f)
                curveTo(23.0f, 14.895f, 22.105f, 14.0f, 21.0f, 14.0f)
                curveTo(20.285f, 14.0f, 19.625f, 14.383f, 19.27f, 15.0f)
                lineTo(18.617f, 15.0f)
                lineTo(16.898f, 11.563f)
                lineTo(14.969f, 16.387f)
                close()
            }
        }
        .build()
        return _heartbeatSolid!!
    }

private var _heartbeatSolid: ImageVector? = null
