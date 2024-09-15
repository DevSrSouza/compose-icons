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

public val LineAwesomeIcons.CatSolid: ImageVector
    get() {
        if (_catSolid != null) {
            return _catSolid!!
        }
        _catSolid = Builder(name = "CatSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                curveTo(10.0f, 5.117f, 9.117f, 6.0f, 8.0f, 6.0f)
                lineTo(7.0f, 6.0f)
                curveTo(4.801f, 6.0f, 3.0f, 7.801f, 3.0f, 10.0f)
                curveTo(3.0f, 12.199f, 4.801f, 14.0f, 7.0f, 14.0f)
                lineTo(8.156f, 14.0f)
                curveTo(8.055f, 14.488f, 8.0f, 14.984f, 8.0f, 15.5f)
                lineTo(8.0f, 28.0f)
                lineTo(10.0f, 28.0f)
                lineTo(10.0f, 15.5f)
                curveTo(10.0f, 12.469f, 12.469f, 10.0f, 15.5f, 10.0f)
                curveTo(16.402f, 10.0f, 17.25f, 10.207f, 18.0f, 10.594f)
                lineTo(18.0f, 8.438f)
                curveTo(17.219f, 8.16f, 16.379f, 8.0f, 15.5f, 8.0f)
                curveTo(12.633f, 8.0f, 10.137f, 9.629f, 8.875f, 12.0f)
                lineTo(7.0f, 12.0f)
                curveTo(5.883f, 12.0f, 5.0f, 11.117f, 5.0f, 10.0f)
                curveTo(5.0f, 8.883f, 5.883f, 8.0f, 7.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                curveTo(10.199f, 8.0f, 12.0f, 6.199f, 12.0f, 4.0f)
                close()
                moveTo(19.0f, 6.094f)
                lineTo(19.0f, 12.5f)
                curveTo(19.0f, 15.051f, 21.316f, 17.0f, 24.0f, 17.0f)
                curveTo(26.684f, 17.0f, 29.0f, 15.051f, 29.0f, 12.5f)
                lineTo(29.0f, 6.094f)
                lineTo(27.438f, 7.188f)
                lineTo(25.781f, 8.344f)
                curveTo(25.211f, 8.141f, 24.648f, 7.906f, 24.0f, 7.906f)
                curveTo(23.352f, 7.906f, 22.789f, 8.141f, 22.219f, 8.344f)
                lineTo(20.563f, 7.188f)
                close()
                moveTo(24.0f, 9.906f)
                curveTo(24.578f, 9.906f, 25.109f, 10.047f, 25.563f, 10.281f)
                lineTo(26.094f, 10.563f)
                lineTo(26.594f, 10.219f)
                lineTo(27.0f, 9.938f)
                lineTo(27.0f, 12.5f)
                curveTo(27.0f, 13.816f, 25.734f, 15.0f, 24.0f, 15.0f)
                curveTo(22.266f, 15.0f, 21.0f, 13.816f, 21.0f, 12.5f)
                lineTo(21.0f, 9.938f)
                lineTo(21.406f, 10.219f)
                lineTo(21.906f, 10.563f)
                lineTo(22.438f, 10.281f)
                curveTo(22.891f, 10.047f, 23.422f, 9.906f, 24.0f, 9.906f)
                close()
                moveTo(17.0f, 15.0f)
                curveTo(14.242f, 15.0f, 12.0f, 17.242f, 12.0f, 20.0f)
                lineTo(12.0f, 28.0f)
                lineTo(14.0f, 28.0f)
                lineTo(14.0f, 20.0f)
                curveTo(14.0f, 18.348f, 15.348f, 17.0f, 17.0f, 17.0f)
                curveTo(18.652f, 17.0f, 20.0f, 18.348f, 20.0f, 20.0f)
                lineTo(20.0f, 28.0f)
                lineTo(22.0f, 28.0f)
                lineTo(22.0f, 20.0f)
                curveTo(22.0f, 19.035f, 21.727f, 18.141f, 21.25f, 17.375f)
                curveTo(20.285f, 16.914f, 19.477f, 16.219f, 18.906f, 15.375f)
                curveTo(18.32f, 15.133f, 17.672f, 15.0f, 17.0f, 15.0f)
                close()
                moveTo(26.0f, 17.688f)
                curveTo(25.371f, 17.891f, 24.703f, 18.0f, 24.0f, 18.0f)
                lineTo(24.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                close()
            }
        }
        .build()
        return _catSolid!!
    }

private var _catSolid: ImageVector? = null
