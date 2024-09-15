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

public val LineAwesomeIcons.SlidersHSolid: ImageVector
    get() {
        if (_slidersHSolid != null) {
            return _slidersHSolid!!
        }
        _slidersHSolid = Builder(name = "SlidersHSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                curveTo(13.707f, 5.0f, 12.605f, 5.844f, 12.188f, 7.0f)
                lineTo(4.0f, 7.0f)
                lineTo(4.0f, 9.0f)
                lineTo(12.188f, 9.0f)
                curveTo(12.605f, 10.156f, 13.707f, 11.0f, 15.0f, 11.0f)
                curveTo(16.293f, 11.0f, 17.395f, 10.156f, 17.813f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 7.0f)
                lineTo(17.813f, 7.0f)
                curveTo(17.395f, 5.844f, 16.293f, 5.0f, 15.0f, 5.0f)
                close()
                moveTo(15.0f, 7.0f)
                curveTo(15.563f, 7.0f, 16.0f, 7.438f, 16.0f, 8.0f)
                curveTo(16.0f, 8.563f, 15.563f, 9.0f, 15.0f, 9.0f)
                curveTo(14.438f, 9.0f, 14.0f, 8.563f, 14.0f, 8.0f)
                curveTo(14.0f, 7.438f, 14.438f, 7.0f, 15.0f, 7.0f)
                close()
                moveTo(22.0f, 13.0f)
                curveTo(20.707f, 13.0f, 19.605f, 13.844f, 19.188f, 15.0f)
                lineTo(4.0f, 15.0f)
                lineTo(4.0f, 17.0f)
                lineTo(19.188f, 17.0f)
                curveTo(19.605f, 18.156f, 20.707f, 19.0f, 22.0f, 19.0f)
                curveTo(23.293f, 19.0f, 24.395f, 18.156f, 24.813f, 17.0f)
                lineTo(28.0f, 17.0f)
                lineTo(28.0f, 15.0f)
                lineTo(24.813f, 15.0f)
                curveTo(24.395f, 13.844f, 23.293f, 13.0f, 22.0f, 13.0f)
                close()
                moveTo(22.0f, 15.0f)
                curveTo(22.563f, 15.0f, 23.0f, 15.438f, 23.0f, 16.0f)
                curveTo(23.0f, 16.563f, 22.563f, 17.0f, 22.0f, 17.0f)
                curveTo(21.438f, 17.0f, 21.0f, 16.563f, 21.0f, 16.0f)
                curveTo(21.0f, 15.438f, 21.438f, 15.0f, 22.0f, 15.0f)
                close()
                moveTo(11.0f, 21.0f)
                curveTo(9.707f, 21.0f, 8.605f, 21.844f, 8.188f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 25.0f)
                lineTo(8.188f, 25.0f)
                curveTo(8.605f, 26.156f, 9.707f, 27.0f, 11.0f, 27.0f)
                curveTo(12.293f, 27.0f, 13.395f, 26.156f, 13.813f, 25.0f)
                lineTo(28.0f, 25.0f)
                lineTo(28.0f, 23.0f)
                lineTo(13.813f, 23.0f)
                curveTo(13.395f, 21.844f, 12.293f, 21.0f, 11.0f, 21.0f)
                close()
                moveTo(11.0f, 23.0f)
                curveTo(11.563f, 23.0f, 12.0f, 23.438f, 12.0f, 24.0f)
                curveTo(12.0f, 24.563f, 11.563f, 25.0f, 11.0f, 25.0f)
                curveTo(10.438f, 25.0f, 10.0f, 24.563f, 10.0f, 24.0f)
                curveTo(10.0f, 23.438f, 10.438f, 23.0f, 11.0f, 23.0f)
                close()
            }
        }
        .build()
        return _slidersHSolid!!
    }

private var _slidersHSolid: ImageVector? = null
