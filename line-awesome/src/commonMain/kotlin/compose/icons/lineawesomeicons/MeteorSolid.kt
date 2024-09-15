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

public val LineAwesomeIcons.MeteorSolid: ImageVector
    get() {
        if (_meteorSolid != null) {
            return _meteorSolid!!
        }
        _meteorSolid = Builder(name = "MeteorSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(30.344f, 1.594f)
                lineTo(26.438f, 4.156f)
                lineTo(20.188f, 8.25f)
                lineTo(20.563f, 7.594f)
                lineTo(22.188f, 4.656f)
                lineTo(19.219f, 6.219f)
                curveTo(19.219f, 6.219f, 16.492f, 7.68f, 13.281f, 9.594f)
                curveTo(10.07f, 11.508f, 6.414f, 13.824f, 4.406f, 15.781f)
                curveTo(1.141f, 19.047f, 1.133f, 24.316f, 4.406f, 27.5f)
                lineTo(4.438f, 27.5f)
                curveTo(7.707f, 30.75f, 12.918f, 30.77f, 16.094f, 27.5f)
                lineTo(16.094f, 27.469f)
                curveTo(17.797f, 25.762f, 19.902f, 22.656f, 21.625f, 19.906f)
                curveTo(23.352f, 17.148f, 24.656f, 14.781f, 24.656f, 14.781f)
                lineTo(26.063f, 12.313f)
                lineTo(23.438f, 13.375f)
                lineTo(22.625f, 13.688f)
                lineTo(27.844f, 5.531f)
                close()
                moveTo(23.625f, 8.406f)
                lineTo(19.25f, 15.25f)
                lineTo(17.563f, 17.906f)
                lineTo(20.469f, 16.719f)
                lineTo(21.406f, 16.344f)
                curveTo(20.867f, 17.266f, 20.75f, 17.496f, 19.906f, 18.844f)
                curveTo(18.207f, 21.559f, 16.082f, 24.699f, 14.688f, 26.094f)
                curveTo(12.27f, 28.602f, 8.34f, 28.621f, 5.813f, 26.094f)
                lineTo(5.781f, 26.094f)
                curveTo(3.273f, 23.676f, 3.285f, 19.746f, 5.813f, 17.219f)
                curveTo(7.504f, 15.574f, 11.148f, 13.199f, 14.313f, 11.313f)
                curveTo(15.84f, 10.402f, 16.063f, 10.277f, 17.125f, 9.688f)
                lineTo(16.531f, 10.813f)
                lineTo(14.594f, 14.344f)
                lineTo(17.938f, 12.125f)
                close()
                moveTo(10.0f, 18.0f)
                curveTo(7.789f, 18.0f, 6.0f, 19.789f, 6.0f, 22.0f)
                curveTo(6.0f, 24.211f, 7.789f, 26.0f, 10.0f, 26.0f)
                curveTo(12.211f, 26.0f, 14.0f, 24.211f, 14.0f, 22.0f)
                curveTo(14.0f, 19.789f, 12.211f, 18.0f, 10.0f, 18.0f)
                close()
                moveTo(10.0f, 20.0f)
                curveTo(11.191f, 20.0f, 12.0f, 20.809f, 12.0f, 22.0f)
                curveTo(12.0f, 23.191f, 11.191f, 24.0f, 10.0f, 24.0f)
                curveTo(8.809f, 24.0f, 8.0f, 23.191f, 8.0f, 22.0f)
                curveTo(8.0f, 20.809f, 8.809f, 20.0f, 10.0f, 20.0f)
                close()
            }
        }
        .build()
        return _meteorSolid!!
    }

private var _meteorSolid: ImageVector? = null
