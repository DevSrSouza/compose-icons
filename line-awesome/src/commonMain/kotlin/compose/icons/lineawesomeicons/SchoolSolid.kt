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

public val LineAwesomeIcons.SchoolSolid: ImageVector
    get() {
        if (_schoolSolid != null) {
            return _schoolSolid!!
        }
        _schoolSolid = Builder(name = "SchoolSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 9.0f)
                lineTo(16.0f, 6.0f)
                lineTo(29.0f, 9.0f)
                lineTo(29.0f, 7.0f)
                close()
                moveTo(10.0f, 10.0f)
                curveTo(6.773f, 10.0f, 3.625f, 11.313f, 3.625f, 11.313f)
                lineTo(3.0f, 11.594f)
                lineTo(3.0f, 27.0f)
                lineTo(14.281f, 27.0f)
                curveTo(14.629f, 27.598f, 15.262f, 28.0f, 16.0f, 28.0f)
                curveTo(16.738f, 28.0f, 17.371f, 27.598f, 17.719f, 27.0f)
                lineTo(29.0f, 27.0f)
                lineTo(29.0f, 11.594f)
                lineTo(28.375f, 11.313f)
                curveTo(28.375f, 11.313f, 25.227f, 10.0f, 22.0f, 10.0f)
                curveTo(19.082f, 10.0f, 16.52f, 10.98f, 16.0f, 11.188f)
                curveTo(15.48f, 10.98f, 12.918f, 10.0f, 10.0f, 10.0f)
                close()
                moveTo(10.0f, 12.0f)
                curveTo(11.934f, 12.0f, 14.0f, 12.625f, 15.0f, 12.969f)
                lineTo(15.0f, 24.094f)
                curveTo(13.887f, 23.727f, 12.059f, 23.219f, 10.0f, 23.219f)
                curveTo(7.898f, 23.219f, 6.188f, 23.703f, 5.0f, 24.094f)
                lineTo(5.0f, 12.969f)
                curveTo(5.77f, 12.691f, 7.801f, 12.0f, 10.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(24.199f, 12.0f, 26.23f, 12.691f, 27.0f, 12.969f)
                lineTo(27.0f, 24.094f)
                curveTo(25.813f, 23.703f, 24.102f, 23.219f, 22.0f, 23.219f)
                curveTo(19.941f, 23.219f, 18.113f, 23.727f, 17.0f, 24.094f)
                lineTo(17.0f, 12.969f)
                curveTo(18.0f, 12.625f, 20.066f, 12.0f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _schoolSolid!!
    }

private var _schoolSolid: ImageVector? = null
