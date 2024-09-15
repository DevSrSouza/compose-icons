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

public val LineAwesomeIcons.QuranSolid: ImageVector
    get() {
        if (_quranSolid != null) {
            return _quranSolid!!
        }
        _quranSolid = Builder(name = "QuranSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                curveTo(6.355f, 3.0f, 5.0f, 4.355f, 5.0f, 6.0f)
                lineTo(5.0f, 26.0f)
                curveTo(5.0f, 27.645f, 6.355f, 29.0f, 8.0f, 29.0f)
                lineTo(27.0f, 29.0f)
                lineTo(27.0f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(25.0f, 5.0f)
                lineTo(25.0f, 23.0f)
                lineTo(8.0f, 23.0f)
                curveTo(7.648f, 23.0f, 7.316f, 23.074f, 7.0f, 23.188f)
                lineTo(7.0f, 6.0f)
                curveTo(7.0f, 5.434f, 7.434f, 5.0f, 8.0f, 5.0f)
                close()
                moveTo(8.0f, 6.0f)
                lineTo(8.0f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 6.0f)
                close()
                moveTo(10.0f, 8.0f)
                lineTo(22.0f, 8.0f)
                lineTo(22.0f, 20.0f)
                lineTo(10.0f, 20.0f)
                close()
                moveTo(16.0f, 9.0f)
                curveTo(15.449f, 9.0f, 15.0f, 9.449f, 15.0f, 10.0f)
                curveTo(15.0f, 10.551f, 15.449f, 11.0f, 16.0f, 11.0f)
                curveTo(16.551f, 11.0f, 17.0f, 10.551f, 17.0f, 10.0f)
                curveTo(17.0f, 9.449f, 16.551f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(16.0f, 11.0f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 17.0f)
                lineTo(19.0f, 17.0f)
                lineTo(19.0f, 11.0f)
                close()
                moveTo(19.0f, 14.0f)
                curveTo(19.0f, 14.551f, 19.449f, 15.0f, 20.0f, 15.0f)
                curveTo(20.551f, 15.0f, 21.0f, 14.551f, 21.0f, 14.0f)
                curveTo(21.0f, 13.449f, 20.551f, 13.0f, 20.0f, 13.0f)
                curveTo(19.449f, 13.0f, 19.0f, 13.449f, 19.0f, 14.0f)
                close()
                moveTo(16.0f, 17.0f)
                curveTo(15.449f, 17.0f, 15.0f, 17.449f, 15.0f, 18.0f)
                curveTo(15.0f, 18.551f, 15.449f, 19.0f, 16.0f, 19.0f)
                curveTo(16.551f, 19.0f, 17.0f, 18.551f, 17.0f, 18.0f)
                curveTo(17.0f, 17.449f, 16.551f, 17.0f, 16.0f, 17.0f)
                close()
                moveTo(13.0f, 14.0f)
                curveTo(13.0f, 13.449f, 12.551f, 13.0f, 12.0f, 13.0f)
                curveTo(11.449f, 13.0f, 11.0f, 13.449f, 11.0f, 14.0f)
                curveTo(11.0f, 14.551f, 11.449f, 15.0f, 12.0f, 15.0f)
                curveTo(12.551f, 15.0f, 13.0f, 14.551f, 13.0f, 14.0f)
                close()
                moveTo(15.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                lineTo(17.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                close()
                moveTo(8.0f, 25.0f)
                lineTo(25.0f, 25.0f)
                lineTo(25.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(7.434f, 27.0f, 7.0f, 26.566f, 7.0f, 26.0f)
                curveTo(7.0f, 25.434f, 7.434f, 25.0f, 8.0f, 25.0f)
                close()
            }
        }
        .build()
        return _quranSolid!!
    }

private var _quranSolid: ImageVector? = null
