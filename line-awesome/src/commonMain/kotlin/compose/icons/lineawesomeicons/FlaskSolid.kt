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

public val LineAwesomeIcons.FlaskSolid: ImageVector
    get() {
        if (_flaskSolid != null) {
            return _flaskSolid!!
        }
        _flaskSolid = Builder(name = "FlaskSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 0.0f)
                curveTo(16.449f, 0.0f, 16.0f, 0.449f, 16.0f, 1.0f)
                curveTo(16.0f, 1.551f, 16.449f, 2.0f, 17.0f, 2.0f)
                curveTo(17.551f, 2.0f, 18.0f, 1.551f, 18.0f, 1.0f)
                curveTo(18.0f, 0.449f, 17.551f, 0.0f, 17.0f, 0.0f)
                close()
                moveTo(14.0f, 3.0f)
                curveTo(13.449f, 3.0f, 13.0f, 3.449f, 13.0f, 4.0f)
                lineTo(10.0f, 4.0f)
                lineTo(10.0f, 6.0f)
                lineTo(11.0f, 6.0f)
                lineTo(11.0f, 13.656f)
                lineTo(4.844f, 21.594f)
                curveTo(4.301f, 22.293f, 4.0f, 23.148f, 4.0f, 24.031f)
                curveTo(4.0f, 26.215f, 5.785f, 28.0f, 7.969f, 28.0f)
                lineTo(24.031f, 28.0f)
                curveTo(26.215f, 28.0f, 28.0f, 26.215f, 28.0f, 24.031f)
                curveTo(28.0f, 23.148f, 27.699f, 22.293f, 27.156f, 21.594f)
                lineTo(21.0f, 13.656f)
                lineTo(21.0f, 6.0f)
                lineTo(22.0f, 6.0f)
                lineTo(22.0f, 4.0f)
                lineTo(15.0f, 4.0f)
                curveTo(15.0f, 3.449f, 14.551f, 3.0f, 14.0f, 3.0f)
                close()
                moveTo(13.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                lineTo(19.0f, 14.344f)
                lineTo(21.844f, 18.0f)
                lineTo(10.156f, 18.0f)
                lineTo(13.0f, 14.344f)
                close()
                moveTo(17.0f, 10.0f)
                curveTo(16.449f, 10.0f, 16.0f, 10.449f, 16.0f, 11.0f)
                curveTo(16.0f, 11.551f, 16.449f, 12.0f, 17.0f, 12.0f)
                curveTo(17.551f, 12.0f, 18.0f, 11.551f, 18.0f, 11.0f)
                curveTo(18.0f, 10.449f, 17.551f, 10.0f, 17.0f, 10.0f)
                close()
                moveTo(8.594f, 20.0f)
                lineTo(23.406f, 20.0f)
                lineTo(25.594f, 22.813f)
                curveTo(25.863f, 23.16f, 26.0f, 23.594f, 26.0f, 24.031f)
                curveTo(26.0f, 25.137f, 25.137f, 26.0f, 24.031f, 26.0f)
                lineTo(7.969f, 26.0f)
                curveTo(6.863f, 26.0f, 6.0f, 25.137f, 6.0f, 24.031f)
                curveTo(6.0f, 23.594f, 6.137f, 23.16f, 6.406f, 22.813f)
                close()
            }
        }
        .build()
        return _flaskSolid!!
    }

private var _flaskSolid: ImageVector? = null
