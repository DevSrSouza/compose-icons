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

public val LineAwesomeIcons.MicroscopeSolid: ImageVector
    get() {
        if (_microscopeSolid != null) {
            return _microscopeSolid!!
        }
        _microscopeSolid = Builder(name = "MicroscopeSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                lineTo(17.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                lineTo(21.0f, 4.0f)
                close()
                moveTo(16.0f, 7.0f)
                lineTo(16.0f, 9.0f)
                lineTo(14.0f, 9.0f)
                curveTo(11.254f, 9.0f, 9.0f, 11.254f, 9.0f, 14.0f)
                lineTo(9.0f, 18.188f)
                curveTo(7.844f, 18.605f, 7.0f, 19.707f, 7.0f, 21.0f)
                curveTo(7.0f, 22.293f, 7.844f, 23.395f, 9.0f, 23.813f)
                lineTo(9.0f, 26.0f)
                lineTo(7.0f, 26.0f)
                lineTo(7.0f, 28.0f)
                lineTo(24.0f, 28.0f)
                lineTo(24.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                lineTo(11.0f, 23.813f)
                curveTo(11.844f, 23.508f, 12.508f, 22.844f, 12.813f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 20.0f)
                lineTo(12.813f, 20.0f)
                curveTo(12.508f, 19.16f, 11.84f, 18.492f, 11.0f, 18.188f)
                lineTo(11.0f, 14.0f)
                curveTo(11.0f, 12.344f, 12.344f, 11.0f, 14.0f, 11.0f)
                lineTo(16.0f, 11.0f)
                lineTo(16.0f, 17.0f)
                lineTo(22.0f, 17.0f)
                lineTo(22.0f, 7.0f)
                close()
                moveTo(18.0f, 9.0f)
                lineTo(20.0f, 9.0f)
                lineTo(20.0f, 15.0f)
                lineTo(18.0f, 15.0f)
                close()
                moveTo(10.0f, 20.0f)
                curveTo(10.563f, 20.0f, 11.0f, 20.438f, 11.0f, 21.0f)
                curveTo(11.0f, 21.563f, 10.563f, 22.0f, 10.0f, 22.0f)
                curveTo(9.438f, 22.0f, 9.0f, 21.563f, 9.0f, 21.0f)
                curveTo(9.0f, 20.438f, 9.438f, 20.0f, 10.0f, 20.0f)
                close()
            }
        }
        .build()
        return _microscopeSolid!!
    }

private var _microscopeSolid: ImageVector? = null
