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

public val LineAwesomeIcons.SkiingSolid: ImageVector
    get() {
        if (_skiingSolid != null) {
            return _skiingSolid!!
        }
        _skiingSolid = Builder(name = "SkiingSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveTo(22.355f, 4.0f, 21.0f, 5.355f, 21.0f, 7.0f)
                curveTo(21.0f, 8.645f, 22.355f, 10.0f, 24.0f, 10.0f)
                curveTo(25.645f, 10.0f, 27.0f, 8.645f, 27.0f, 7.0f)
                curveTo(27.0f, 5.355f, 25.645f, 4.0f, 24.0f, 4.0f)
                close()
                moveTo(8.031f, 4.219f)
                lineTo(6.875f, 5.813f)
                lineTo(13.188f, 10.406f)
                curveTo(13.078f, 10.523f, 12.949f, 10.633f, 12.844f, 10.75f)
                curveTo(11.547f, 12.168f, 11.809f, 14.465f, 13.406f, 15.531f)
                lineTo(17.094f, 17.969f)
                lineTo(13.281f, 20.219f)
                lineTo(5.5f, 15.75f)
                lineTo(4.5f, 17.5f)
                lineTo(22.031f, 27.563f)
                curveTo(22.063f, 27.574f, 22.094f, 27.586f, 22.125f, 27.594f)
                curveTo(22.125f, 27.594f, 22.832f, 27.938f, 23.75f, 28.0f)
                curveTo(24.668f, 28.063f, 25.973f, 27.797f, 26.813f, 26.656f)
                lineTo(25.219f, 25.469f)
                curveTo(24.852f, 25.969f, 24.426f, 26.035f, 23.906f, 26.0f)
                curveTo(23.438f, 25.969f, 23.105f, 25.844f, 23.031f, 25.813f)
                lineTo(22.938f, 25.781f)
                lineTo(15.25f, 21.375f)
                lineTo(18.094f, 19.688f)
                curveTo(19.324f, 18.957f, 19.379f, 17.109f, 18.188f, 16.313f)
                lineTo(14.531f, 13.875f)
                curveTo(13.918f, 13.465f, 13.816f, 12.637f, 14.313f, 12.094f)
                curveTo(14.84f, 11.516f, 15.426f, 10.895f, 15.969f, 10.375f)
                curveTo(16.75f, 9.625f, 17.777f, 9.281f, 18.594f, 9.125f)
                curveTo(18.813f, 9.082f, 18.969f, 9.23f, 18.969f, 9.469f)
                lineTo(19.0f, 13.469f)
                lineTo(19.0f, 13.938f)
                lineTo(19.406f, 14.25f)
                lineTo(23.375f, 17.281f)
                lineTo(24.594f, 15.719f)
                lineTo(21.0f, 12.969f)
                lineTo(20.969f, 9.469f)
                curveTo(20.961f, 8.027f, 19.621f, 6.879f, 18.188f, 7.156f)
                curveTo(17.125f, 7.363f, 15.75f, 7.828f, 14.594f, 8.938f)
                close()
                moveTo(24.0f, 6.0f)
                curveTo(24.563f, 6.0f, 25.0f, 6.438f, 25.0f, 7.0f)
                curveTo(25.0f, 7.563f, 24.563f, 8.0f, 24.0f, 8.0f)
                curveTo(23.438f, 8.0f, 23.0f, 7.563f, 23.0f, 7.0f)
                curveTo(23.0f, 6.438f, 23.438f, 6.0f, 24.0f, 6.0f)
                close()
            }
        }
        .build()
        return _skiingSolid!!
    }

private var _skiingSolid: ImageVector? = null
