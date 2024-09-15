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

public val LineAwesomeIcons.UtensilsSolid: ImageVector
    get() {
        if (_utensilsSolid != null) {
            return _utensilsSolid!!
        }
        _utensilsSolid = Builder(name = "UtensilsSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                curveTo(9.363f, 5.0f, 8.137f, 6.211f, 7.313f, 7.563f)
                curveTo(6.488f, 8.914f, 6.0f, 10.516f, 6.0f, 12.0f)
                curveTo(6.0f, 14.582f, 7.781f, 16.465f, 10.0f, 16.906f)
                lineTo(10.0f, 28.0f)
                lineTo(12.0f, 28.0f)
                lineTo(12.0f, 16.906f)
                curveTo(14.219f, 16.465f, 16.0f, 14.582f, 16.0f, 12.0f)
                curveTo(16.0f, 10.516f, 15.512f, 8.914f, 14.688f, 7.563f)
                curveTo(13.863f, 6.211f, 12.637f, 5.0f, 11.0f, 5.0f)
                close()
                moveTo(18.0f, 5.0f)
                lineTo(18.0f, 12.0f)
                curveTo(18.0f, 13.852f, 19.281f, 15.398f, 21.0f, 15.844f)
                lineTo(21.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 15.844f)
                curveTo(24.719f, 15.398f, 26.0f, 13.852f, 26.0f, 12.0f)
                lineTo(26.0f, 5.0f)
                lineTo(24.0f, 5.0f)
                lineTo(24.0f, 12.0f)
                curveTo(24.0f, 13.117f, 23.117f, 14.0f, 22.0f, 14.0f)
                curveTo(20.883f, 14.0f, 20.0f, 13.117f, 20.0f, 12.0f)
                lineTo(20.0f, 5.0f)
                close()
                moveTo(21.0f, 5.0f)
                lineTo(21.0f, 12.0f)
                curveTo(21.0f, 12.551f, 21.449f, 13.0f, 22.0f, 13.0f)
                curveTo(22.551f, 13.0f, 23.0f, 12.551f, 23.0f, 12.0f)
                lineTo(23.0f, 5.0f)
                close()
                moveTo(11.0f, 7.0f)
                curveTo(11.574f, 7.0f, 12.344f, 7.566f, 12.969f, 8.594f)
                curveTo(13.594f, 9.621f, 14.0f, 10.996f, 14.0f, 12.0f)
                curveTo(14.0f, 14.004f, 12.75f, 15.0f, 11.0f, 15.0f)
                curveTo(9.25f, 15.0f, 8.0f, 14.004f, 8.0f, 12.0f)
                curveTo(8.0f, 10.996f, 8.406f, 9.621f, 9.031f, 8.594f)
                curveTo(9.656f, 7.566f, 10.426f, 7.0f, 11.0f, 7.0f)
                close()
            }
        }
        .build()
        return _utensilsSolid!!
    }

private var _utensilsSolid: ImageVector? = null
