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

public val LineAwesomeIcons.PercentageSolid: ImageVector
    get() {
        if (_percentageSolid != null) {
            return _percentageSolid!!
        }
        _percentageSolid = Builder(name = "PercentageSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(10.355f, 9.0f, 9.0f, 10.355f, 9.0f, 12.0f)
                lineTo(9.0f, 13.0f)
                curveTo(9.0f, 14.645f, 10.355f, 16.0f, 12.0f, 16.0f)
                curveTo(13.645f, 16.0f, 15.0f, 14.645f, 15.0f, 13.0f)
                lineTo(15.0f, 12.0f)
                curveTo(15.0f, 10.355f, 13.645f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(19.594f, 9.0f)
                lineTo(10.0f, 23.0f)
                lineTo(12.406f, 23.0f)
                lineTo(22.0f, 9.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(12.566f, 11.0f, 13.0f, 11.434f, 13.0f, 12.0f)
                lineTo(13.0f, 13.0f)
                curveTo(13.0f, 13.566f, 12.566f, 14.0f, 12.0f, 14.0f)
                curveTo(11.434f, 14.0f, 11.0f, 13.566f, 11.0f, 13.0f)
                lineTo(11.0f, 12.0f)
                curveTo(11.0f, 11.434f, 11.434f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(20.0f, 16.0f)
                curveTo(18.355f, 16.0f, 17.0f, 17.355f, 17.0f, 19.0f)
                lineTo(17.0f, 20.0f)
                curveTo(17.0f, 21.645f, 18.355f, 23.0f, 20.0f, 23.0f)
                curveTo(21.645f, 23.0f, 23.0f, 21.645f, 23.0f, 20.0f)
                lineTo(23.0f, 19.0f)
                curveTo(23.0f, 17.355f, 21.645f, 16.0f, 20.0f, 16.0f)
                close()
                moveTo(20.0f, 18.0f)
                curveTo(20.566f, 18.0f, 21.0f, 18.434f, 21.0f, 19.0f)
                lineTo(21.0f, 20.0f)
                curveTo(21.0f, 20.566f, 20.566f, 21.0f, 20.0f, 21.0f)
                curveTo(19.434f, 21.0f, 19.0f, 20.566f, 19.0f, 20.0f)
                lineTo(19.0f, 19.0f)
                curveTo(19.0f, 18.434f, 19.434f, 18.0f, 20.0f, 18.0f)
                close()
            }
        }
        .build()
        return _percentageSolid!!
    }

private var _percentageSolid: ImageVector? = null
