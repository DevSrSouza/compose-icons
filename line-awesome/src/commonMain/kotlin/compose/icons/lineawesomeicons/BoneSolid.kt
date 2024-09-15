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

public val LineAwesomeIcons.BoneSolid: ImageVector
    get() {
        if (_boneSolid != null) {
            return _boneSolid!!
        }
        _boneSolid = Builder(name = "BoneSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                curveTo(17.801f, 4.0f, 16.0f, 5.801f, 16.0f, 8.0f)
                curveTo(16.0f, 9.0f, 16.453f, 9.832f, 17.063f, 10.531f)
                lineTo(10.531f, 17.063f)
                curveTo(9.832f, 16.453f, 9.0f, 16.0f, 8.0f, 16.0f)
                curveTo(5.801f, 16.0f, 4.0f, 17.801f, 4.0f, 20.0f)
                curveTo(4.0f, 22.199f, 5.801f, 24.0f, 8.0f, 24.0f)
                curveTo(8.0f, 26.199f, 9.801f, 28.0f, 12.0f, 28.0f)
                curveTo(14.199f, 28.0f, 16.0f, 26.199f, 16.0f, 24.0f)
                curveTo(16.0f, 23.0f, 15.547f, 22.168f, 14.938f, 21.469f)
                lineTo(21.469f, 14.938f)
                curveTo(22.168f, 15.547f, 23.0f, 16.0f, 24.0f, 16.0f)
                curveTo(26.199f, 16.0f, 28.0f, 14.199f, 28.0f, 12.0f)
                curveTo(28.0f, 9.801f, 26.199f, 8.0f, 24.0f, 8.0f)
                curveTo(24.0f, 5.801f, 22.199f, 4.0f, 20.0f, 4.0f)
                close()
                moveTo(20.0f, 6.0f)
                curveTo(21.117f, 6.0f, 22.0f, 6.883f, 22.0f, 8.0f)
                curveTo(22.0f, 8.172f, 21.973f, 8.348f, 21.906f, 8.563f)
                lineTo(21.719f, 9.156f)
                lineTo(22.156f, 9.563f)
                lineTo(22.438f, 9.844f)
                lineTo(22.844f, 10.281f)
                lineTo(23.438f, 10.094f)
                curveTo(23.652f, 10.027f, 23.828f, 10.0f, 24.0f, 10.0f)
                curveTo(25.117f, 10.0f, 26.0f, 10.883f, 26.0f, 12.0f)
                curveTo(26.0f, 13.117f, 25.117f, 14.0f, 24.0f, 14.0f)
                curveTo(23.27f, 14.0f, 22.668f, 13.613f, 22.313f, 13.031f)
                lineTo(21.625f, 11.938f)
                lineTo(20.75f, 12.844f)
                lineTo(12.844f, 20.75f)
                lineTo(11.938f, 21.625f)
                lineTo(13.031f, 22.313f)
                curveTo(13.613f, 22.668f, 14.0f, 23.27f, 14.0f, 24.0f)
                curveTo(14.0f, 25.117f, 13.117f, 26.0f, 12.0f, 26.0f)
                curveTo(10.883f, 26.0f, 10.0f, 25.117f, 10.0f, 24.0f)
                curveTo(10.0f, 23.828f, 10.027f, 23.652f, 10.094f, 23.438f)
                lineTo(10.281f, 22.844f)
                lineTo(9.844f, 22.438f)
                lineTo(9.563f, 22.156f)
                lineTo(9.156f, 21.719f)
                lineTo(8.563f, 21.906f)
                curveTo(8.348f, 21.973f, 8.172f, 22.0f, 8.0f, 22.0f)
                curveTo(6.883f, 22.0f, 6.0f, 21.117f, 6.0f, 20.0f)
                curveTo(6.0f, 18.883f, 6.883f, 18.0f, 8.0f, 18.0f)
                curveTo(8.73f, 18.0f, 9.332f, 18.387f, 9.688f, 18.969f)
                lineTo(10.375f, 20.063f)
                lineTo(11.25f, 19.156f)
                lineTo(19.156f, 11.25f)
                lineTo(20.063f, 10.375f)
                lineTo(18.969f, 9.688f)
                curveTo(18.387f, 9.332f, 18.0f, 8.73f, 18.0f, 8.0f)
                curveTo(18.0f, 6.883f, 18.883f, 6.0f, 20.0f, 6.0f)
                close()
            }
        }
        .build()
        return _boneSolid!!
    }

private var _boneSolid: ImageVector? = null
