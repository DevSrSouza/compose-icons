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

public val LineAwesomeIcons.CrownSolid: ImageVector
    get() {
        if (_crownSolid != null) {
            return _crownSolid!!
        }
        _crownSolid = Builder(name = "CrownSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(14.355f, 3.0f, 13.0f, 4.355f, 13.0f, 6.0f)
                curveTo(13.0f, 7.125f, 13.633f, 8.113f, 14.563f, 8.625f)
                lineTo(11.625f, 14.5f)
                lineTo(7.031f, 11.219f)
                curveTo(7.633f, 10.668f, 8.0f, 9.871f, 8.0f, 9.0f)
                curveTo(8.0f, 7.355f, 6.645f, 6.0f, 5.0f, 6.0f)
                curveTo(3.355f, 6.0f, 2.0f, 7.355f, 2.0f, 9.0f)
                curveTo(2.0f, 10.348f, 2.926f, 11.469f, 4.156f, 11.844f)
                lineTo(6.0f, 22.0f)
                lineTo(6.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                lineTo(26.0f, 22.0f)
                lineTo(27.844f, 11.844f)
                curveTo(29.074f, 11.469f, 30.0f, 10.348f, 30.0f, 9.0f)
                curveTo(30.0f, 7.355f, 28.645f, 6.0f, 27.0f, 6.0f)
                curveTo(25.355f, 6.0f, 24.0f, 7.355f, 24.0f, 9.0f)
                curveTo(24.0f, 9.871f, 24.367f, 10.668f, 24.969f, 11.219f)
                lineTo(20.375f, 14.5f)
                lineTo(17.438f, 8.625f)
                curveTo(18.367f, 8.113f, 19.0f, 7.125f, 19.0f, 6.0f)
                curveTo(19.0f, 4.355f, 17.645f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(16.563f, 5.0f, 17.0f, 5.438f, 17.0f, 6.0f)
                curveTo(17.0f, 6.563f, 16.563f, 7.0f, 16.0f, 7.0f)
                curveTo(15.438f, 7.0f, 15.0f, 6.563f, 15.0f, 6.0f)
                curveTo(15.0f, 5.438f, 15.438f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(5.0f, 8.0f)
                curveTo(5.563f, 8.0f, 6.0f, 8.438f, 6.0f, 9.0f)
                curveTo(6.0f, 9.563f, 5.563f, 10.0f, 5.0f, 10.0f)
                curveTo(4.438f, 10.0f, 4.0f, 9.563f, 4.0f, 9.0f)
                curveTo(4.0f, 8.438f, 4.438f, 8.0f, 5.0f, 8.0f)
                close()
                moveTo(27.0f, 8.0f)
                curveTo(27.563f, 8.0f, 28.0f, 8.438f, 28.0f, 9.0f)
                curveTo(28.0f, 9.563f, 27.563f, 10.0f, 27.0f, 10.0f)
                curveTo(26.438f, 10.0f, 26.0f, 9.563f, 26.0f, 9.0f)
                curveTo(26.0f, 8.438f, 26.438f, 8.0f, 27.0f, 8.0f)
                close()
                moveTo(16.0f, 10.25f)
                lineTo(19.094f, 16.438f)
                lineTo(20.594f, 16.813f)
                lineTo(25.594f, 13.25f)
                lineTo(24.188f, 21.0f)
                lineTo(7.813f, 21.0f)
                lineTo(6.406f, 13.25f)
                lineTo(11.406f, 16.813f)
                lineTo(12.906f, 16.438f)
                close()
                moveTo(8.0f, 23.0f)
                lineTo(24.0f, 23.0f)
                lineTo(24.0f, 25.0f)
                lineTo(8.0f, 25.0f)
                close()
            }
        }
        .build()
        return _crownSolid!!
    }

private var _crownSolid: ImageVector? = null
