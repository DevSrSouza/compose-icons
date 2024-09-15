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

public val LineAwesomeIcons.FonticonsFi: ImageVector
    get() {
        if (_fonticonsFi != null) {
            return _fonticonsFi!!
        }
        _fonticonsFi = Builder(name = "FonticonsFi", defaultWidth = 32.0.dp, defaultHeight =
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
                moveTo(19.719f, 8.906f)
                lineTo(19.031f, 10.188f)
                lineTo(17.781f, 10.188f)
                lineTo(17.625f, 10.625f)
                lineTo(18.625f, 11.688f)
                lineTo(18.219f, 13.188f)
                curveTo(18.219f, 13.188f, 18.508f, 13.539f, 18.531f, 13.531f)
                curveTo(18.555f, 13.523f, 19.938f, 12.75f, 19.938f, 12.75f)
                lineTo(21.313f, 13.531f)
                lineTo(21.688f, 13.188f)
                lineTo(21.25f, 11.688f)
                lineTo(22.25f, 10.594f)
                lineTo(22.031f, 10.188f)
                lineTo(20.813f, 10.188f)
                lineTo(20.125f, 8.906f)
                close()
                moveTo(14.375f, 10.719f)
                curveTo(10.871f, 10.719f, 10.969f, 13.375f, 10.969f, 13.375f)
                lineTo(10.969f, 14.75f)
                lineTo(9.688f, 14.75f)
                lineTo(9.688f, 16.438f)
                lineTo(10.938f, 16.438f)
                lineTo(10.938f, 21.813f)
                lineTo(9.688f, 21.969f)
                lineTo(9.688f, 23.125f)
                lineTo(15.563f, 23.125f)
                curveTo(15.547f, 23.145f, 15.563f, 22.0f, 15.563f, 22.0f)
                lineTo(13.469f, 21.781f)
                lineTo(13.469f, 16.438f)
                lineTo(15.969f, 16.438f)
                lineTo(16.469f, 14.75f)
                lineTo(13.469f, 14.75f)
                lineTo(13.469f, 13.0f)
                curveTo(13.469f, 13.0f, 13.637f, 12.25f, 14.281f, 12.25f)
                curveTo(14.926f, 12.25f, 15.031f, 12.844f, 15.031f, 12.844f)
                lineTo(15.031f, 13.344f)
                lineTo(17.281f, 13.031f)
                curveTo(17.281f, 13.031f, 17.703f, 10.719f, 14.375f, 10.719f)
                close()
                moveTo(17.813f, 14.781f)
                lineTo(17.438f, 16.063f)
                lineTo(18.625f, 16.406f)
                curveTo(18.77f, 16.445f, 18.875f, 16.57f, 18.875f, 16.719f)
                lineTo(18.875f, 21.5f)
                curveTo(18.875f, 21.656f, 18.75f, 21.781f, 18.594f, 21.813f)
                lineTo(17.656f, 22.0f)
                lineTo(17.656f, 23.125f)
                lineTo(22.219f, 23.125f)
                lineTo(22.219f, 22.031f)
                lineTo(21.688f, 21.938f)
                curveTo(21.531f, 21.91f, 21.406f, 21.754f, 21.406f, 21.594f)
                lineTo(21.406f, 14.781f)
                close()
            }
        }
        .build()
        return _fonticonsFi!!
    }

private var _fonticonsFi: ImageVector? = null
