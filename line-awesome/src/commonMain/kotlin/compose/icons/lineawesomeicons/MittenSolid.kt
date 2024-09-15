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

public val LineAwesomeIcons.MittenSolid: ImageVector
    get() {
        if (_mittenSolid != null) {
            return _mittenSolid!!
        }
        _mittenSolid = Builder(name = "MittenSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                curveTo(14.605f, 3.0f, 11.0f, 6.605f, 11.0f, 11.0f)
                lineTo(11.0f, 13.625f)
                curveTo(9.277f, 12.617f, 7.039f, 12.957f, 5.813f, 14.594f)
                curveTo(4.492f, 16.352f, 4.836f, 18.871f, 6.594f, 20.188f)
                lineTo(6.594f, 20.219f)
                lineTo(6.625f, 20.219f)
                lineTo(12.0f, 24.156f)
                lineTo(12.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 23.719f)
                curveTo(26.02f, 23.68f, 26.039f, 23.645f, 26.063f, 23.594f)
                curveTo(26.176f, 23.367f, 26.297f, 23.047f, 26.438f, 22.625f)
                curveTo(26.719f, 21.785f, 27.0f, 20.57f, 27.0f, 19.0f)
                lineTo(27.0f, 11.0f)
                curveTo(27.0f, 6.605f, 23.395f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(19.0f, 5.0f)
                curveTo(22.305f, 5.0f, 25.0f, 7.695f, 25.0f, 11.0f)
                lineTo(25.0f, 19.0f)
                curveTo(25.0f, 20.344f, 24.781f, 21.344f, 24.563f, 22.0f)
                curveTo(24.453f, 22.328f, 24.324f, 22.566f, 24.25f, 22.719f)
                curveTo(24.211f, 22.793f, 24.207f, 22.844f, 24.188f, 22.875f)
                curveTo(24.18f, 22.891f, 24.16f, 22.902f, 24.156f, 22.906f)
                lineTo(24.313f, 23.0f)
                lineTo(13.844f, 23.0f)
                lineTo(13.594f, 22.813f)
                lineTo(7.813f, 18.594f)
                curveTo(6.918f, 17.926f, 6.738f, 16.703f, 7.406f, 15.813f)
                curveTo(8.078f, 14.918f, 9.297f, 14.738f, 10.188f, 15.406f)
                lineTo(10.219f, 15.406f)
                lineTo(11.438f, 16.25f)
                lineTo(13.0f, 17.344f)
                lineTo(13.0f, 11.0f)
                curveTo(13.0f, 7.695f, 15.695f, 5.0f, 19.0f, 5.0f)
                close()
                moveTo(14.0f, 25.0f)
                lineTo(24.0f, 25.0f)
                lineTo(24.0f, 27.0f)
                lineTo(14.0f, 27.0f)
                close()
            }
        }
        .build()
        return _mittenSolid!!
    }

private var _mittenSolid: ImageVector? = null
