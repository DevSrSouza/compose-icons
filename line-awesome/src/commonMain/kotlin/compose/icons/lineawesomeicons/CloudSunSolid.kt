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

public val LineAwesomeIcons.CloudSunSolid: ImageVector
    get() {
        if (_cloudSunSolid != null) {
            return _cloudSunSolid!!
        }
        _cloudSunSolid = Builder(name = "CloudSunSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                lineTo(9.0f, 9.094f)
                curveTo(8.367f, 9.223f, 7.773f, 9.496f, 7.25f, 9.844f)
                lineTo(5.063f, 7.625f)
                lineTo(3.625f, 9.063f)
                lineTo(5.844f, 11.25f)
                curveTo(5.496f, 11.773f, 5.223f, 12.367f, 5.094f, 13.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 15.0f)
                lineTo(5.125f, 15.0f)
                curveTo(5.254f, 15.629f, 5.508f, 16.199f, 5.844f, 16.719f)
                lineTo(3.625f, 18.938f)
                lineTo(4.25f, 19.563f)
                curveTo(4.113f, 20.02f, 4.0f, 20.5f, 4.0f, 21.0f)
                curveTo(4.0f, 23.758f, 6.242f, 26.0f, 9.0f, 26.0f)
                lineTo(25.0f, 26.0f)
                curveTo(27.758f, 26.0f, 30.0f, 23.758f, 30.0f, 21.0f)
                curveTo(30.0f, 18.98f, 28.789f, 17.18f, 26.969f, 16.406f)
                curveTo(26.688f, 13.988f, 24.656f, 12.098f, 22.188f, 12.0f)
                curveTo(21.125f, 10.152f, 19.164f, 9.0f, 17.0f, 9.0f)
                curveTo(16.773f, 9.0f, 16.563f, 9.008f, 16.344f, 9.031f)
                lineTo(14.938f, 7.625f)
                lineTo(12.75f, 9.844f)
                curveTo(12.227f, 9.508f, 11.629f, 9.254f, 11.0f, 9.125f)
                lineTo(11.0f, 6.0f)
                close()
                moveTo(10.0f, 11.0f)
                curveTo(10.766f, 11.0f, 11.445f, 11.285f, 11.969f, 11.75f)
                curveTo(11.707f, 12.152f, 11.473f, 12.598f, 11.313f, 13.063f)
                curveTo(9.73f, 13.332f, 8.461f, 14.543f, 8.094f, 16.094f)
                curveTo(8.039f, 16.102f, 7.988f, 16.113f, 7.938f, 16.125f)
                curveTo(7.379f, 15.582f, 7.0f, 14.848f, 7.0f, 14.0f)
                curveTo(7.0f, 12.332f, 8.332f, 11.0f, 10.0f, 11.0f)
                close()
                moveTo(17.0f, 11.0f)
                curveTo(18.605f, 11.0f, 20.055f, 11.961f, 20.688f, 13.438f)
                lineTo(20.969f, 14.125f)
                lineTo(21.875f, 14.031f)
                curveTo(21.918f, 14.023f, 21.953f, 14.0f, 22.0f, 14.0f)
                curveTo(23.652f, 14.0f, 24.996f, 15.352f, 25.0f, 16.938f)
                lineTo(24.969f, 17.906f)
                lineTo(25.75f, 18.094f)
                curveTo(27.082f, 18.434f, 28.0f, 19.637f, 28.0f, 21.0f)
                curveTo(28.0f, 22.652f, 26.652f, 24.0f, 25.0f, 24.0f)
                lineTo(9.0f, 24.0f)
                curveTo(7.348f, 24.0f, 6.0f, 22.652f, 6.0f, 21.0f)
                curveTo(6.0f, 19.348f, 7.348f, 18.0f, 9.0f, 18.0f)
                lineTo(10.0f, 18.0f)
                lineTo(10.0f, 17.0f)
                curveTo(10.0f, 15.898f, 10.895f, 15.004f, 11.906f, 15.0f)
                lineTo(12.906f, 15.063f)
                lineTo(13.094f, 14.219f)
                curveTo(13.469f, 12.359f, 15.102f, 11.0f, 17.0f, 11.0f)
                close()
            }
        }
        .build()
        return _cloudSunSolid!!
    }

private var _cloudSunSolid: ImageVector? = null
