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

public val LineAwesomeIcons.DivideSolid: ImageVector
    get() {
        if (_divideSolid != null) {
            return _divideSolid!!
        }
        _divideSolid = Builder(name = "DivideSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                curveTo(14.355f, 6.0f, 13.0f, 7.355f, 13.0f, 9.0f)
                curveTo(13.0f, 10.645f, 14.355f, 12.0f, 16.0f, 12.0f)
                curveTo(17.645f, 12.0f, 19.0f, 10.645f, 19.0f, 9.0f)
                curveTo(19.0f, 7.355f, 17.645f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(16.563f, 8.0f, 17.0f, 8.438f, 17.0f, 9.0f)
                curveTo(17.0f, 9.563f, 16.563f, 10.0f, 16.0f, 10.0f)
                curveTo(15.438f, 10.0f, 15.0f, 9.563f, 15.0f, 9.0f)
                curveTo(15.0f, 8.438f, 15.438f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(5.0f, 15.0f)
                lineTo(5.0f, 17.0f)
                lineTo(27.0f, 17.0f)
                lineTo(27.0f, 15.0f)
                close()
                moveTo(16.0f, 20.0f)
                curveTo(14.355f, 20.0f, 13.0f, 21.355f, 13.0f, 23.0f)
                curveTo(13.0f, 24.645f, 14.355f, 26.0f, 16.0f, 26.0f)
                curveTo(17.645f, 26.0f, 19.0f, 24.645f, 19.0f, 23.0f)
                curveTo(19.0f, 21.355f, 17.645f, 20.0f, 16.0f, 20.0f)
                close()
                moveTo(16.0f, 22.0f)
                curveTo(16.563f, 22.0f, 17.0f, 22.438f, 17.0f, 23.0f)
                curveTo(17.0f, 23.563f, 16.563f, 24.0f, 16.0f, 24.0f)
                curveTo(15.438f, 24.0f, 15.0f, 23.563f, 15.0f, 23.0f)
                curveTo(15.0f, 22.438f, 15.438f, 22.0f, 16.0f, 22.0f)
                close()
            }
        }
        .build()
        return _divideSolid!!
    }

private var _divideSolid: ImageVector? = null
