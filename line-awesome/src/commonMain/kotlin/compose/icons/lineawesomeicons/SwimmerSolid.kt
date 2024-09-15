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

public val LineAwesomeIcons.SwimmerSolid: ImageVector
    get() {
        if (_swimmerSolid != null) {
            return _swimmerSolid!!
        }
        _swimmerSolid = Builder(name = "SwimmerSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 11.0f)
                curveTo(21.578f, 11.0f, 20.0f, 12.578f, 20.0f, 14.5f)
                curveTo(20.0f, 16.422f, 21.578f, 18.0f, 23.5f, 18.0f)
                curveTo(25.422f, 18.0f, 27.0f, 16.422f, 27.0f, 14.5f)
                curveTo(27.0f, 12.578f, 25.422f, 11.0f, 23.5f, 11.0f)
                close()
                moveTo(13.719f, 11.031f)
                curveTo(13.355f, 11.055f, 13.004f, 11.176f, 12.688f, 11.406f)
                lineTo(7.406f, 15.188f)
                lineTo(8.594f, 16.813f)
                lineTo(13.844f, 13.031f)
                lineTo(16.125f, 15.656f)
                lineTo(8.719f, 21.938f)
                curveTo(9.125f, 21.973f, 9.559f, 22.0f, 10.0f, 22.0f)
                curveTo(10.676f, 22.0f, 11.324f, 21.93f, 11.969f, 21.813f)
                lineTo(17.406f, 17.156f)
                lineTo(19.438f, 19.5f)
                curveTo(20.176f, 19.309f, 20.934f, 19.145f, 21.719f, 19.063f)
                lineTo(15.344f, 11.719f)
                curveTo(14.918f, 11.223f, 14.324f, 10.992f, 13.719f, 11.031f)
                close()
                moveTo(23.5f, 13.0f)
                curveTo(24.34f, 13.0f, 25.0f, 13.66f, 25.0f, 14.5f)
                curveTo(25.0f, 15.344f, 24.34f, 16.0f, 23.5f, 16.0f)
                curveTo(22.656f, 16.0f, 22.0f, 15.344f, 22.0f, 14.5f)
                curveTo(22.0f, 13.66f, 22.656f, 13.0f, 23.5f, 13.0f)
                close()
                moveTo(23.0f, 20.0f)
                curveTo(20.563f, 20.0f, 18.426f, 20.816f, 16.344f, 21.563f)
                curveTo(14.262f, 22.309f, 12.234f, 23.0f, 10.0f, 23.0f)
                curveTo(4.504f, 23.0f, 1.688f, 20.281f, 1.688f, 20.281f)
                lineTo(0.313f, 21.719f)
                curveTo(0.313f, 21.719f, 3.816f, 25.0f, 10.0f, 25.0f)
                curveTo(12.645f, 25.0f, 14.906f, 24.191f, 17.0f, 23.438f)
                curveTo(19.094f, 22.684f, 21.016f, 22.0f, 23.0f, 22.0f)
                curveTo(26.969f, 22.0f, 30.344f, 24.781f, 30.344f, 24.781f)
                lineTo(31.656f, 23.219f)
                curveTo(31.656f, 23.219f, 27.875f, 20.0f, 23.0f, 20.0f)
                close()
            }
        }
        .build()
        return _swimmerSolid!!
    }

private var _swimmerSolid: ImageVector? = null
