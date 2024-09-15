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

public val LineAwesomeIcons.UserMdSolid: ImageVector
    get() {
        if (_userMdSolid != null) {
            return _userMdSolid!!
        }
        _userMdSolid = Builder(name = "UserMdSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.438f, 6.0f)
                lineTo(8.156f, 6.469f)
                curveTo(8.156f, 6.469f, 5.0f, 11.652f, 5.0f, 20.0f)
                lineTo(5.0f, 21.0f)
                lineTo(11.094f, 21.0f)
                curveTo(11.027f, 21.324f, 11.0f, 21.656f, 11.0f, 22.0f)
                curveTo(11.0f, 24.75f, 13.25f, 27.0f, 16.0f, 27.0f)
                curveTo(18.75f, 27.0f, 21.0f, 24.75f, 21.0f, 22.0f)
                curveTo(21.0f, 21.656f, 20.973f, 21.324f, 20.906f, 21.0f)
                lineTo(27.0f, 21.0f)
                lineTo(27.0f, 20.0f)
                curveTo(27.0f, 15.391f, 26.223f, 12.012f, 25.438f, 9.781f)
                curveTo(24.652f, 7.551f, 23.813f, 6.406f, 23.813f, 6.406f)
                lineTo(23.5f, 6.0f)
                close()
                moveTo(9.656f, 8.0f)
                lineTo(22.375f, 8.0f)
                curveTo(22.52f, 8.207f, 22.949f, 8.73f, 23.563f, 10.469f)
                curveTo(24.211f, 12.309f, 24.793f, 15.199f, 24.906f, 19.0f)
                lineTo(20.0f, 19.0f)
                curveTo(19.086f, 17.789f, 17.625f, 17.0f, 16.0f, 17.0f)
                curveTo(14.375f, 17.0f, 12.914f, 17.789f, 12.0f, 19.0f)
                lineTo(7.094f, 19.0f)
                curveTo(7.32f, 12.352f, 9.324f, 8.57f, 9.656f, 8.0f)
                close()
                moveTo(15.0f, 10.0f)
                lineTo(15.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                lineTo(13.0f, 14.0f)
                lineTo(15.0f, 14.0f)
                lineTo(15.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                lineTo(17.0f, 14.0f)
                lineTo(19.0f, 14.0f)
                lineTo(19.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                lineTo(17.0f, 10.0f)
                close()
                moveTo(16.0f, 19.0f)
                curveTo(17.668f, 19.0f, 19.0f, 20.332f, 19.0f, 22.0f)
                curveTo(19.0f, 23.668f, 17.668f, 25.0f, 16.0f, 25.0f)
                curveTo(14.332f, 25.0f, 13.0f, 23.668f, 13.0f, 22.0f)
                curveTo(13.0f, 20.332f, 14.332f, 19.0f, 16.0f, 19.0f)
                close()
                moveTo(16.0f, 21.0f)
                curveTo(15.449f, 21.0f, 15.0f, 21.449f, 15.0f, 22.0f)
                curveTo(15.0f, 22.551f, 15.449f, 23.0f, 16.0f, 23.0f)
                curveTo(16.551f, 23.0f, 17.0f, 22.551f, 17.0f, 22.0f)
                curveTo(17.0f, 21.449f, 16.551f, 21.0f, 16.0f, 21.0f)
                close()
            }
        }
        .build()
        return _userMdSolid!!
    }

private var _userMdSolid: ImageVector? = null
