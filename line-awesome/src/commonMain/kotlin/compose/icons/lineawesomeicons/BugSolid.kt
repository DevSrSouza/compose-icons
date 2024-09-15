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

public val LineAwesomeIcons.BugSolid: ImageVector
    get() {
        if (_bugSolid != null) {
            return _bugSolid!!
        }
        _bugSolid = Builder(name = "BugSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.719f, 3.281f)
                lineTo(9.281f, 4.719f)
                lineTo(11.219f, 6.656f)
                curveTo(9.758f, 7.773f, 8.609f, 9.41f, 7.875f, 11.313f)
                lineTo(5.438f, 10.094f)
                lineTo(4.563f, 11.906f)
                lineTo(7.313f, 13.281f)
                curveTo(7.129f, 14.156f, 7.0f, 15.063f, 7.0f, 16.0f)
                curveTo(7.0f, 16.34f, 7.008f, 16.668f, 7.031f, 17.0f)
                lineTo(4.0f, 17.0f)
                lineTo(4.0f, 19.0f)
                lineTo(7.375f, 19.0f)
                curveTo(7.617f, 20.043f, 7.938f, 21.039f, 8.406f, 21.938f)
                lineTo(5.406f, 24.188f)
                lineTo(6.594f, 25.813f)
                lineTo(9.531f, 23.625f)
                curveTo(11.148f, 25.68f, 13.418f, 27.0f, 16.0f, 27.0f)
                curveTo(18.582f, 27.0f, 20.852f, 25.68f, 22.469f, 23.625f)
                lineTo(25.406f, 25.813f)
                lineTo(26.594f, 24.188f)
                lineTo(23.594f, 21.938f)
                curveTo(24.063f, 21.039f, 24.383f, 20.043f, 24.625f, 19.0f)
                lineTo(28.0f, 19.0f)
                lineTo(28.0f, 17.0f)
                lineTo(24.969f, 17.0f)
                curveTo(24.992f, 16.668f, 25.0f, 16.34f, 25.0f, 16.0f)
                curveTo(25.0f, 15.063f, 24.871f, 14.156f, 24.688f, 13.281f)
                lineTo(27.438f, 11.906f)
                lineTo(26.563f, 10.094f)
                lineTo(24.125f, 11.313f)
                curveTo(23.391f, 9.41f, 22.242f, 7.773f, 20.781f, 6.656f)
                lineTo(22.719f, 4.719f)
                lineTo(21.281f, 3.281f)
                lineTo(18.969f, 5.594f)
                curveTo(18.047f, 5.203f, 17.047f, 5.0f, 16.0f, 5.0f)
                curveTo(14.953f, 5.0f, 13.953f, 5.203f, 13.031f, 5.594f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(17.977f, 7.0f, 19.828f, 8.094f, 21.125f, 9.875f)
                curveTo(19.992f, 10.387f, 18.199f, 11.0f, 16.0f, 11.0f)
                curveTo(13.801f, 11.0f, 12.008f, 10.387f, 10.875f, 9.875f)
                curveTo(12.172f, 8.094f, 14.023f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(9.906f, 11.594f)
                curveTo(11.059f, 12.137f, 12.828f, 12.773f, 15.0f, 12.938f)
                lineTo(15.0f, 24.906f)
                curveTo(11.699f, 24.281f, 9.0f, 20.629f, 9.0f, 16.0f)
                curveTo(9.0f, 14.383f, 9.336f, 12.887f, 9.906f, 11.594f)
                close()
                moveTo(22.094f, 11.594f)
                curveTo(22.664f, 12.887f, 23.0f, 14.383f, 23.0f, 16.0f)
                curveTo(23.0f, 20.629f, 20.301f, 24.281f, 17.0f, 24.906f)
                lineTo(17.0f, 12.938f)
                curveTo(19.172f, 12.773f, 20.941f, 12.137f, 22.094f, 11.594f)
                close()
            }
        }
        .build()
        return _bugSolid!!
    }

private var _bugSolid: ImageVector? = null
