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

public val LineAwesomeIcons.PlaneArrivalSolid: ImageVector
    get() {
        if (_planeArrivalSolid != null) {
            return _planeArrivalSolid!!
        }
        _planeArrivalSolid = Builder(name = "PlaneArrivalSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.406f, 3.969f)
                lineTo(3.344f, 5.25f)
                lineTo(3.0f, 14.031f)
                lineTo(2.969f, 14.813f)
                lineTo(3.719f, 15.031f)
                lineTo(10.125f, 16.969f)
                lineTo(4.688f, 20.75f)
                lineTo(3.156f, 21.813f)
                lineTo(4.875f, 22.5f)
                lineTo(7.719f, 23.625f)
                lineTo(8.094f, 23.781f)
                lineTo(8.469f, 23.625f)
                lineTo(18.469f, 19.469f)
                lineTo(24.875f, 21.406f)
                curveTo(26.563f, 21.914f, 28.367f, 20.934f, 28.875f, 19.25f)
                curveTo(29.383f, 17.563f, 28.402f, 15.758f, 26.719f, 15.25f)
                lineTo(21.031f, 13.5f)
                lineTo(17.25f, 7.25f)
                lineTo(17.031f, 6.906f)
                lineTo(16.656f, 6.781f)
                lineTo(14.0f, 6.063f)
                lineTo(12.531f, 5.688f)
                lineTo(12.75f, 7.188f)
                lineTo(13.281f, 11.094f)
                lineTo(9.031f, 9.781f)
                lineTo(7.406f, 5.594f)
                lineTo(7.219f, 5.125f)
                lineTo(6.75f, 4.969f)
                lineTo(4.625f, 4.344f)
                close()
                moveTo(5.281f, 6.625f)
                lineTo(5.719f, 6.75f)
                lineTo(7.313f, 10.938f)
                lineTo(7.469f, 11.406f)
                lineTo(7.938f, 11.531f)
                lineTo(26.125f, 17.156f)
                curveTo(26.777f, 17.352f, 27.133f, 18.008f, 26.938f, 18.656f)
                curveTo(26.742f, 19.309f, 26.086f, 19.664f, 25.438f, 19.469f)
                lineTo(18.688f, 17.438f)
                lineTo(18.344f, 17.344f)
                lineTo(18.031f, 17.469f)
                lineTo(8.094f, 21.625f)
                lineTo(7.344f, 21.313f)
                lineTo(12.969f, 17.438f)
                lineTo(14.688f, 16.25f)
                lineTo(12.688f, 15.656f)
                lineTo(5.031f, 13.344f)
                close()
                moveTo(14.906f, 8.406f)
                lineTo(15.719f, 8.625f)
                lineTo(18.156f, 12.594f)
                lineTo(15.344f, 11.75f)
                close()
                moveTo(20.5f, 21.0f)
                curveTo(19.672f, 21.0f, 19.0f, 21.672f, 19.0f, 22.5f)
                curveTo(19.0f, 23.328f, 19.672f, 24.0f, 20.5f, 24.0f)
                curveTo(21.328f, 24.0f, 22.0f, 23.328f, 22.0f, 22.5f)
                curveTo(22.0f, 21.672f, 21.328f, 21.0f, 20.5f, 21.0f)
                close()
                moveTo(3.0f, 26.0f)
                lineTo(3.0f, 28.0f)
                lineTo(29.0f, 28.0f)
                lineTo(29.0f, 26.0f)
                close()
            }
        }
        .build()
        return _planeArrivalSolid!!
    }

private var _planeArrivalSolid: ImageVector? = null
