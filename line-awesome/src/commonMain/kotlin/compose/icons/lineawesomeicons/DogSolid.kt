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

public val LineAwesomeIcons.DogSolid: ImageVector
    get() {
        if (_dogSolid != null) {
            return _dogSolid!!
        }
        _dogSolid = Builder(name = "DogSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.313f, 3.0f)
                lineTo(20.063f, 3.656f)
                lineTo(17.313f, 11.0f)
                lineTo(9.625f, 11.0f)
                curveTo(8.711f, 11.0f, 7.844f, 11.258f, 7.125f, 11.719f)
                lineTo(4.719f, 9.281f)
                lineTo(3.281f, 10.719f)
                lineTo(5.719f, 13.125f)
                curveTo(5.258f, 13.844f, 5.0f, 14.711f, 5.0f, 15.625f)
                curveTo(5.0f, 16.129f, 5.086f, 16.645f, 5.25f, 17.125f)
                lineTo(5.969f, 19.219f)
                lineTo(5.031f, 22.75f)
                lineTo(5.0f, 22.875f)
                lineTo(5.0f, 28.0f)
                lineTo(7.0f, 28.0f)
                lineTo(7.0f, 23.125f)
                lineTo(7.969f, 19.469f)
                lineTo(8.031f, 19.156f)
                lineTo(7.938f, 18.875f)
                lineTo(7.125f, 16.469f)
                curveTo(7.035f, 16.199f, 7.0f, 15.91f, 7.0f, 15.625f)
                curveTo(7.0f, 14.156f, 8.156f, 13.0f, 9.625f, 13.0f)
                lineTo(17.656f, 13.0f)
                lineTo(21.0f, 16.281f)
                lineTo(21.0f, 13.469f)
                lineTo(19.188f, 11.688f)
                lineTo(21.25f, 6.156f)
                lineTo(21.5f, 6.531f)
                lineTo(21.781f, 7.0f)
                lineTo(23.656f, 7.0f)
                lineTo(26.719f, 9.313f)
                lineTo(25.875f, 11.0f)
                lineTo(22.0f, 11.0f)
                lineTo(22.0f, 16.875f)
                lineTo(21.063f, 19.688f)
                lineTo(21.0f, 19.844f)
                lineTo(21.0f, 23.125f)
                lineTo(22.0f, 27.125f)
                lineTo(22.0f, 28.0f)
                lineTo(24.0f, 28.0f)
                lineTo(24.0f, 26.875f)
                lineTo(23.0f, 22.875f)
                lineTo(23.0f, 20.125f)
                lineTo(23.938f, 17.313f)
                lineTo(24.0f, 17.156f)
                lineTo(24.0f, 13.0f)
                lineTo(27.125f, 13.0f)
                lineTo(29.281f, 8.688f)
                lineTo(28.594f, 8.188f)
                lineTo(24.344f, 5.0f)
                lineTo(22.906f, 5.0f)
                lineTo(21.938f, 3.469f)
                lineTo(21.656f, 3.0f)
                close()
                moveTo(10.219f, 18.0f)
                lineTo(9.0f, 22.875f)
                lineTo(9.0f, 28.0f)
                lineTo(11.0f, 28.0f)
                lineTo(11.0f, 23.125f)
                lineTo(11.781f, 20.0f)
                lineTo(12.719f, 20.0f)
                curveTo(13.07f, 20.234f, 14.313f, 21.0f, 16.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                lineTo(17.0f, 23.125f)
                lineTo(18.0f, 27.125f)
                lineTo(18.0f, 28.0f)
                lineTo(20.0f, 28.0f)
                lineTo(20.0f, 26.875f)
                lineTo(19.0f, 22.875f)
                lineTo(19.0f, 19.0f)
                lineTo(16.0f, 19.0f)
                curveTo(14.938f, 19.0f, 13.563f, 18.156f, 13.563f, 18.156f)
                lineTo(13.313f, 18.0f)
                close()
            }
        }
        .build()
        return _dogSolid!!
    }

private var _dogSolid: ImageVector? = null
