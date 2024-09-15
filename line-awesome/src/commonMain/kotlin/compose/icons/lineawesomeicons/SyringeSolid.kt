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

public val LineAwesomeIcons.SyringeSolid: ImageVector
    get() {
        if (_syringeSolid != null) {
            return _syringeSolid!!
        }
        _syringeSolid = Builder(name = "SyringeSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.219f, 3.781f)
                lineTo(21.781f, 5.219f)
                lineTo(22.156f, 5.594f)
                lineTo(19.875f, 7.875f)
                lineTo(21.281f, 9.313f)
                lineTo(23.563f, 7.0f)
                lineTo(25.0f, 8.438f)
                lineTo(22.688f, 10.719f)
                lineTo(24.125f, 12.125f)
                lineTo(26.406f, 9.844f)
                lineTo(26.781f, 10.219f)
                lineTo(28.219f, 8.781f)
                close()
                moveTo(17.719f, 7.281f)
                lineTo(16.281f, 8.719f)
                lineTo(16.938f, 9.375f)
                lineTo(7.0f, 19.344f)
                lineTo(6.656f, 19.688f)
                lineTo(6.719f, 20.156f)
                lineTo(7.063f, 23.344f)
                lineTo(7.094f, 23.688f)
                lineTo(7.188f, 23.75f)
                lineTo(3.938f, 27.0f)
                lineTo(6.781f, 27.0f)
                lineTo(8.813f, 24.969f)
                lineTo(11.844f, 25.281f)
                lineTo(12.313f, 25.344f)
                lineTo(12.656f, 25.0f)
                lineTo(22.625f, 15.063f)
                lineTo(23.281f, 15.719f)
                lineTo(24.719f, 14.281f)
                close()
                moveTo(18.375f, 10.813f)
                lineTo(21.188f, 13.625f)
                lineTo(11.594f, 23.25f)
                lineTo(9.219f, 22.969f)
                lineTo(9.031f, 22.781f)
                lineTo(8.75f, 20.406f)
                close()
            }
        }
        .build()
        return _syringeSolid!!
    }

private var _syringeSolid: ImageVector? = null
