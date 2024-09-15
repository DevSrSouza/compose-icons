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

public val LineAwesomeIcons.PortraitSolid: ImageVector
    get() {
        if (_portraitSolid != null) {
            return _portraitSolid!!
        }
        _portraitSolid = Builder(name = "PortraitSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                lineTo(7.0f, 27.0f)
                lineTo(25.0f, 27.0f)
                lineTo(25.0f, 5.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(23.0f, 7.0f)
                lineTo(23.0f, 25.0f)
                lineTo(9.0f, 25.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(13.801f, 10.0f, 12.0f, 11.801f, 12.0f, 14.0f)
                curveTo(12.0f, 15.113f, 12.477f, 16.117f, 13.219f, 16.844f)
                curveTo(11.887f, 17.746f, 11.0f, 19.281f, 11.0f, 21.0f)
                lineTo(13.0f, 21.0f)
                curveTo(13.0f, 19.332f, 14.332f, 18.0f, 16.0f, 18.0f)
                curveTo(17.668f, 18.0f, 19.0f, 19.332f, 19.0f, 21.0f)
                lineTo(21.0f, 21.0f)
                curveTo(21.0f, 19.281f, 20.113f, 17.746f, 18.781f, 16.844f)
                curveTo(19.523f, 16.117f, 20.0f, 15.113f, 20.0f, 14.0f)
                curveTo(20.0f, 11.801f, 18.199f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(17.117f, 12.0f, 18.0f, 12.883f, 18.0f, 14.0f)
                curveTo(18.0f, 15.117f, 17.117f, 16.0f, 16.0f, 16.0f)
                curveTo(14.883f, 16.0f, 14.0f, 15.117f, 14.0f, 14.0f)
                curveTo(14.0f, 12.883f, 14.883f, 12.0f, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _portraitSolid!!
    }

private var _portraitSolid: ImageVector? = null
