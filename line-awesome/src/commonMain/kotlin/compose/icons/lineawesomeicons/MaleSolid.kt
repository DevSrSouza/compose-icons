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

public val LineAwesomeIcons.MaleSolid: ImageVector
    get() {
        if (_maleSolid != null) {
            return _maleSolid!!
        }
        _maleSolid = Builder(name = "MaleSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(13.801f, 2.0f, 12.0f, 3.801f, 12.0f, 6.0f)
                curveTo(12.0f, 7.066f, 12.434f, 8.031f, 13.125f, 8.75f)
                curveTo(11.273f, 9.773f, 10.0f, 11.746f, 10.0f, 14.0f)
                lineTo(10.0f, 19.406f)
                lineTo(10.281f, 19.719f)
                lineTo(12.0f, 21.438f)
                lineTo(12.0f, 30.0f)
                lineTo(14.0f, 30.0f)
                lineTo(14.0f, 20.594f)
                lineTo(13.719f, 20.281f)
                lineTo(12.0f, 18.563f)
                lineTo(12.0f, 14.0f)
                curveTo(12.0f, 11.781f, 13.781f, 10.0f, 16.0f, 10.0f)
                curveTo(18.219f, 10.0f, 20.0f, 11.781f, 20.0f, 14.0f)
                lineTo(20.0f, 18.563f)
                lineTo(18.281f, 20.281f)
                lineTo(18.0f, 20.594f)
                lineTo(18.0f, 30.0f)
                lineTo(20.0f, 30.0f)
                lineTo(20.0f, 21.438f)
                lineTo(21.719f, 19.719f)
                lineTo(22.0f, 19.406f)
                lineTo(22.0f, 14.0f)
                curveTo(22.0f, 11.746f, 20.727f, 9.773f, 18.875f, 8.75f)
                curveTo(19.566f, 8.031f, 20.0f, 7.066f, 20.0f, 6.0f)
                curveTo(20.0f, 3.801f, 18.199f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(17.117f, 4.0f, 18.0f, 4.883f, 18.0f, 6.0f)
                curveTo(18.0f, 7.117f, 17.117f, 8.0f, 16.0f, 8.0f)
                curveTo(14.883f, 8.0f, 14.0f, 7.117f, 14.0f, 6.0f)
                curveTo(14.0f, 4.883f, 14.883f, 4.0f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _maleSolid!!
    }

private var _maleSolid: ImageVector? = null
