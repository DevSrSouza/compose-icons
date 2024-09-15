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

public val LineAwesomeIcons.CubesSolid: ImageVector
    get() {
        if (_cubesSolid != null) {
            return _cubesSolid!!
        }
        _cubesSolid = Builder(name = "CubesSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                lineTo(15.625f, 4.156f)
                lineTo(9.625f, 6.563f)
                lineTo(9.0f, 6.813f)
                lineTo(9.0f, 13.531f)
                lineTo(3.594f, 15.875f)
                lineTo(3.0f, 16.156f)
                lineTo(3.0f, 24.219f)
                lineTo(3.5f, 24.531f)
                lineTo(9.5f, 27.875f)
                lineTo(9.969f, 28.125f)
                lineTo(10.438f, 27.906f)
                lineTo(16.0f, 25.125f)
                lineTo(21.563f, 27.906f)
                lineTo(22.031f, 28.125f)
                lineTo(22.5f, 27.875f)
                lineTo(28.5f, 24.531f)
                lineTo(29.0f, 24.219f)
                lineTo(29.0f, 16.156f)
                lineTo(28.406f, 15.875f)
                lineTo(23.0f, 13.531f)
                lineTo(23.0f, 6.813f)
                lineTo(22.375f, 6.563f)
                lineTo(16.375f, 4.156f)
                close()
                moveTo(16.0f, 6.188f)
                lineTo(19.281f, 7.469f)
                lineTo(16.0f, 8.75f)
                lineTo(12.719f, 7.469f)
                close()
                moveTo(11.0f, 8.938f)
                lineTo(15.0f, 10.469f)
                lineTo(15.0f, 15.344f)
                lineTo(11.0f, 13.563f)
                close()
                moveTo(21.0f, 8.938f)
                lineTo(21.0f, 13.563f)
                lineTo(17.0f, 15.344f)
                lineTo(17.0f, 10.469f)
                close()
                moveTo(10.0f, 15.313f)
                lineTo(13.625f, 16.906f)
                lineTo(10.0f, 18.688f)
                lineTo(6.375f, 16.875f)
                close()
                moveTo(22.0f, 15.313f)
                lineTo(25.625f, 16.875f)
                lineTo(22.0f, 18.688f)
                lineTo(18.375f, 16.906f)
                lineTo(19.5f, 16.406f)
                close()
                moveTo(5.0f, 18.406f)
                lineTo(9.0f, 20.406f)
                lineTo(9.0f, 25.313f)
                lineTo(5.0f, 23.063f)
                close()
                moveTo(27.0f, 18.406f)
                lineTo(27.0f, 23.063f)
                lineTo(23.0f, 25.313f)
                lineTo(23.0f, 20.406f)
                close()
                moveTo(15.0f, 18.469f)
                lineTo(15.0f, 23.375f)
                lineTo(11.0f, 25.375f)
                lineTo(11.0f, 20.406f)
                close()
                moveTo(17.0f, 18.469f)
                lineTo(21.0f, 20.406f)
                lineTo(21.0f, 25.375f)
                lineTo(17.0f, 23.375f)
                close()
            }
        }
        .build()
        return _cubesSolid!!
    }

private var _cubesSolid: ImageVector? = null
