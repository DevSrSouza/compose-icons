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

public val LineAwesomeIcons.SubwaySolid: ImageVector
    get() {
        if (_subwaySolid != null) {
            return _subwaySolid!!
        }
        _subwaySolid = Builder(name = "SubwaySolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                curveTo(7.25f, 4.0f, 5.0f, 6.25f, 5.0f, 9.0f)
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
                lineTo(27.0f, 9.0f)
                curveTo(27.0f, 6.25f, 24.75f, 4.0f, 22.0f, 4.0f)
                close()
                moveTo(10.0f, 6.0f)
                lineTo(22.0f, 6.0f)
                curveTo(23.32f, 6.0f, 24.438f, 6.828f, 24.844f, 8.0f)
                lineTo(7.156f, 8.0f)
                curveTo(7.563f, 6.828f, 8.68f, 6.0f, 10.0f, 6.0f)
                close()
                moveTo(7.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                close()
                moveTo(17.0f, 10.0f)
                lineTo(25.0f, 10.0f)
                lineTo(25.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                close()
                moveTo(7.0f, 18.0f)
                lineTo(25.0f, 18.0f)
                lineTo(25.0f, 21.0f)
                curveTo(25.0f, 23.219f, 23.219f, 25.0f, 21.0f, 25.0f)
                lineTo(11.0f, 25.0f)
                curveTo(8.781f, 25.0f, 7.0f, 23.219f, 7.0f, 21.0f)
                close()
                moveTo(10.5f, 20.0f)
                curveTo(9.672f, 20.0f, 9.0f, 20.672f, 9.0f, 21.5f)
                curveTo(9.0f, 22.328f, 9.672f, 23.0f, 10.5f, 23.0f)
                curveTo(11.328f, 23.0f, 12.0f, 22.328f, 12.0f, 21.5f)
                curveTo(12.0f, 20.672f, 11.328f, 20.0f, 10.5f, 20.0f)
                close()
                moveTo(21.5f, 20.0f)
                curveTo(20.672f, 20.0f, 20.0f, 20.672f, 20.0f, 21.5f)
                curveTo(20.0f, 22.328f, 20.672f, 23.0f, 21.5f, 23.0f)
                curveTo(22.328f, 23.0f, 23.0f, 22.328f, 23.0f, 21.5f)
                curveTo(23.0f, 20.672f, 22.328f, 20.0f, 21.5f, 20.0f)
                close()
            }
        }
        .build()
        return _subwaySolid!!
    }

private var _subwaySolid: ImageVector? = null
