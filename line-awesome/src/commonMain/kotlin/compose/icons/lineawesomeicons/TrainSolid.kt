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

public val LineAwesomeIcons.TrainSolid: ImageVector
    get() {
        if (_trainSolid != null) {
            return _trainSolid!!
        }
        _trainSolid = Builder(name = "TrainSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                curveTo(12.742f, 3.0f, 11.848f, 3.891f, 11.406f, 5.0f)
                lineTo(10.0f, 5.0f)
                curveTo(7.25f, 5.0f, 5.0f, 7.25f, 5.0f, 10.0f)
                lineTo(5.0f, 21.0f)
                curveTo(5.0f, 23.426f, 6.449f, 25.523f, 8.531f, 26.469f)
                lineTo(6.0f, 29.0f)
                lineTo(8.344f, 29.0f)
                lineTo(10.375f, 26.969f)
                curveTo(10.574f, 26.988f, 10.793f, 27.0f, 11.0f, 27.0f)
                lineTo(21.0f, 27.0f)
                curveTo(21.207f, 27.0f, 21.426f, 26.988f, 21.625f, 26.969f)
                lineTo(23.656f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(23.469f, 26.469f)
                curveTo(25.551f, 25.523f, 27.0f, 23.426f, 27.0f, 21.0f)
                lineTo(27.0f, 10.0f)
                curveTo(27.0f, 7.25f, 24.75f, 5.0f, 22.0f, 5.0f)
                lineTo(20.594f, 5.0f)
                curveTo(20.152f, 3.891f, 19.258f, 3.0f, 18.0f, 3.0f)
                close()
                moveTo(14.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                curveTo(18.566f, 5.0f, 19.0f, 5.434f, 19.0f, 6.0f)
                lineTo(19.0f, 7.0f)
                lineTo(22.0f, 7.0f)
                curveTo(23.32f, 7.0f, 24.438f, 7.828f, 24.844f, 9.0f)
                lineTo(7.156f, 9.0f)
                curveTo(7.563f, 7.828f, 8.68f, 7.0f, 10.0f, 7.0f)
                lineTo(13.0f, 7.0f)
                lineTo(13.0f, 6.0f)
                curveTo(13.0f, 5.434f, 13.434f, 5.0f, 14.0f, 5.0f)
                close()
                moveTo(7.0f, 11.0f)
                lineTo(25.0f, 11.0f)
                lineTo(25.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                close()
                moveTo(7.0f, 18.0f)
                lineTo(25.0f, 18.0f)
                lineTo(25.0f, 21.0f)
                curveTo(25.0f, 23.219f, 23.219f, 25.0f, 21.0f, 25.0f)
                lineTo(11.0f, 25.0f)
                curveTo(8.781f, 25.0f, 7.0f, 23.219f, 7.0f, 21.0f)
                close()
                moveTo(16.0f, 19.0f)
                curveTo(14.895f, 19.0f, 14.0f, 19.895f, 14.0f, 21.0f)
                curveTo(14.0f, 22.105f, 14.895f, 23.0f, 16.0f, 23.0f)
                curveTo(17.105f, 23.0f, 18.0f, 22.105f, 18.0f, 21.0f)
                curveTo(18.0f, 19.895f, 17.105f, 19.0f, 16.0f, 19.0f)
                close()
            }
        }
        .build()
        return _trainSolid!!
    }

private var _trainSolid: ImageVector? = null
