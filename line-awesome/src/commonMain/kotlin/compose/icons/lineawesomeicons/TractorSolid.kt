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

public val LineAwesomeIcons.TractorSolid: ImageVector
    get() {
        if (_tractorSolid != null) {
            return _tractorSolid!!
        }
        _tractorSolid = Builder(name = "TractorSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                lineTo(7.0f, 12.25f)
                curveTo(5.652f, 12.555f, 4.418f, 13.133f, 3.375f, 13.969f)
                lineTo(4.625f, 15.531f)
                curveTo(5.824f, 14.57f, 7.34f, 14.0f, 9.0f, 14.0f)
                curveTo(12.879f, 14.0f, 16.0f, 17.121f, 16.0f, 21.0f)
                lineTo(20.563f, 21.0f)
                curveTo(20.215f, 21.594f, 20.0f, 22.266f, 20.0f, 23.0f)
                curveTo(20.0f, 25.199f, 21.801f, 27.0f, 24.0f, 27.0f)
                curveTo(26.199f, 27.0f, 28.0f, 25.199f, 28.0f, 23.0f)
                curveTo(28.0f, 21.973f, 27.582f, 21.055f, 26.938f, 20.344f)
                lineTo(28.938f, 15.375f)
                lineTo(29.0f, 15.188f)
                lineTo(29.0f, 13.0f)
                lineTo(24.0f, 13.0f)
                lineTo(24.0f, 10.0f)
                curveTo(24.0f, 9.434f, 24.434f, 9.0f, 25.0f, 9.0f)
                lineTo(25.0f, 7.0f)
                curveTo(23.355f, 7.0f, 22.0f, 8.355f, 22.0f, 10.0f)
                lineTo(22.0f, 13.0f)
                lineTo(18.688f, 13.0f)
                lineTo(15.938f, 5.656f)
                lineTo(15.688f, 5.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(14.313f, 7.0f)
                lineTo(17.063f, 14.344f)
                lineTo(17.313f, 15.0f)
                lineTo(26.906f, 15.0f)
                lineTo(25.313f, 19.0f)
                lineTo(17.75f, 19.0f)
                curveTo(16.832f, 15.004f, 13.27f, 12.0f, 9.0f, 12.0f)
                close()
                moveTo(9.0f, 15.0f)
                curveTo(5.699f, 15.0f, 3.0f, 17.699f, 3.0f, 21.0f)
                curveTo(3.0f, 24.301f, 5.699f, 27.0f, 9.0f, 27.0f)
                curveTo(12.301f, 27.0f, 15.0f, 24.301f, 15.0f, 21.0f)
                curveTo(15.0f, 17.699f, 12.301f, 15.0f, 9.0f, 15.0f)
                close()
                moveTo(9.0f, 17.0f)
                curveTo(11.223f, 17.0f, 13.0f, 18.777f, 13.0f, 21.0f)
                curveTo(13.0f, 23.223f, 11.223f, 25.0f, 9.0f, 25.0f)
                curveTo(6.777f, 25.0f, 5.0f, 23.223f, 5.0f, 21.0f)
                curveTo(5.0f, 18.777f, 6.777f, 17.0f, 9.0f, 17.0f)
                close()
                moveTo(9.0f, 19.0f)
                curveTo(7.895f, 19.0f, 7.0f, 19.895f, 7.0f, 21.0f)
                curveTo(7.0f, 22.105f, 7.895f, 23.0f, 9.0f, 23.0f)
                curveTo(10.105f, 23.0f, 11.0f, 22.105f, 11.0f, 21.0f)
                curveTo(11.0f, 19.895f, 10.105f, 19.0f, 9.0f, 19.0f)
                close()
                moveTo(24.0f, 21.0f)
                curveTo(25.117f, 21.0f, 26.0f, 21.883f, 26.0f, 23.0f)
                curveTo(26.0f, 24.117f, 25.117f, 25.0f, 24.0f, 25.0f)
                curveTo(22.883f, 25.0f, 22.0f, 24.117f, 22.0f, 23.0f)
                curveTo(22.0f, 21.883f, 22.883f, 21.0f, 24.0f, 21.0f)
                close()
            }
        }
        .build()
        return _tractorSolid!!
    }

private var _tractorSolid: ImageVector? = null
