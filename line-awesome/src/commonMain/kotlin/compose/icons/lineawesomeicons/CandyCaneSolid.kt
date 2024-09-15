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

public val LineAwesomeIcons.CandyCaneSolid: ImageVector
    get() {
        if (_candyCaneSolid != null) {
            return _candyCaneSolid!!
        }
        _candyCaneSolid = Builder(name = "CandyCaneSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                curveTo(15.852f, 2.0f, 13.82f, 2.848f, 12.313f, 4.375f)
                lineTo(11.594f, 5.094f)
                lineTo(10.906f, 5.813f)
                lineTo(11.625f, 6.5f)
                lineTo(14.469f, 9.313f)
                lineTo(15.156f, 10.031f)
                lineTo(15.875f, 9.313f)
                lineTo(16.563f, 8.594f)
                curveTo(16.945f, 8.207f, 17.453f, 8.0f, 18.0f, 8.0f)
                curveTo(19.113f, 8.0f, 20.0f, 8.887f, 20.0f, 10.0f)
                curveTo(20.0f, 10.543f, 19.789f, 11.023f, 19.406f, 11.406f)
                lineTo(5.719f, 25.031f)
                lineTo(5.0f, 25.75f)
                lineTo(5.719f, 26.438f)
                lineTo(8.531f, 29.281f)
                lineTo(9.25f, 30.0f)
                lineTo(9.938f, 29.281f)
                lineTo(23.656f, 15.656f)
                curveTo(25.164f, 14.148f, 26.0f, 12.129f, 26.0f, 10.0f)
                curveTo(26.0f, 5.598f, 22.402f, 2.0f, 18.0f, 2.0f)
                close()
                moveTo(18.0f, 4.0f)
                curveTo(18.805f, 4.0f, 19.582f, 4.152f, 20.281f, 4.438f)
                lineTo(19.219f, 6.219f)
                curveTo(18.852f, 6.102f, 18.465f, 6.008f, 18.063f, 6.0f)
                lineTo(17.438f, 4.031f)
                curveTo(17.625f, 4.016f, 17.809f, 4.0f, 18.0f, 4.0f)
                close()
                moveTo(15.531f, 4.563f)
                lineTo(16.125f, 6.5f)
                curveTo(15.777f, 6.688f, 15.438f, 6.902f, 15.156f, 7.188f)
                lineTo(13.719f, 5.781f)
                curveTo(14.246f, 5.25f, 14.871f, 4.859f, 15.531f, 4.563f)
                close()
                moveTo(21.969f, 5.5f)
                curveTo(22.598f, 6.055f, 23.117f, 6.727f, 23.469f, 7.5f)
                lineTo(21.531f, 8.188f)
                curveTo(21.367f, 7.871f, 21.176f, 7.574f, 20.938f, 7.313f)
                close()
                moveTo(23.969f, 9.438f)
                curveTo(23.984f, 9.621f, 24.0f, 9.813f, 24.0f, 10.0f)
                curveTo(24.0f, 10.695f, 23.875f, 11.367f, 23.656f, 12.0f)
                lineTo(21.469f, 12.0f)
                curveTo(21.789f, 11.445f, 21.977f, 10.809f, 22.0f, 10.156f)
                close()
                moveTo(19.656f, 14.0f)
                lineTo(22.469f, 14.0f)
                curveTo(22.395f, 14.082f, 22.328f, 14.172f, 22.25f, 14.25f)
                lineTo(20.5f, 16.0f)
                lineTo(17.656f, 16.0f)
                close()
                moveTo(15.625f, 18.0f)
                lineTo(18.469f, 18.0f)
                lineTo(16.469f, 20.0f)
                lineTo(13.625f, 20.0f)
                close()
                moveTo(11.625f, 22.0f)
                lineTo(14.438f, 22.0f)
                lineTo(12.438f, 24.0f)
                lineTo(9.594f, 24.0f)
                close()
                moveTo(8.094f, 26.0f)
                lineTo(10.406f, 26.0f)
                lineTo(9.25f, 27.156f)
                close()
            }
        }
        .build()
        return _candyCaneSolid!!
    }

private var _candyCaneSolid: ImageVector? = null
