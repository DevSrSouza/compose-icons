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
                moveTo(8.4375f, 6.0f)
                lineTo(8.1563f, 6.4688f)
                curveTo(8.1563f, 6.4688f, 5.0f, 11.6523f, 5.0f, 20.0f)
                lineTo(5.0f, 21.0f)
                lineTo(11.0938f, 21.0f)
                curveTo(11.0273f, 21.3242f, 11.0f, 21.6563f, 11.0f, 22.0f)
                curveTo(11.0f, 24.75f, 13.25f, 27.0f, 16.0f, 27.0f)
                curveTo(18.75f, 27.0f, 21.0f, 24.75f, 21.0f, 22.0f)
                curveTo(21.0f, 21.6563f, 20.9727f, 21.3242f, 20.9063f, 21.0f)
                lineTo(27.0f, 21.0f)
                lineTo(27.0f, 20.0f)
                curveTo(27.0f, 15.3906f, 26.2227f, 12.0117f, 25.4375f, 9.7813f)
                curveTo(24.6523f, 7.5508f, 23.8125f, 6.4063f, 23.8125f, 6.4063f)
                lineTo(23.5f, 6.0f)
                close()
                moveTo(9.6563f, 8.0f)
                lineTo(22.375f, 8.0f)
                curveTo(22.5195f, 8.207f, 22.9492f, 8.7305f, 23.5625f, 10.4688f)
                curveTo(24.2109f, 12.3086f, 24.793f, 15.1992f, 24.9063f, 19.0f)
                lineTo(20.0f, 19.0f)
                curveTo(19.0859f, 17.7891f, 17.625f, 17.0f, 16.0f, 17.0f)
                curveTo(14.375f, 17.0f, 12.9141f, 17.7891f, 12.0f, 19.0f)
                lineTo(7.0938f, 19.0f)
                curveTo(7.3203f, 12.3516f, 9.3242f, 8.5703f, 9.6563f, 8.0f)
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
                curveTo(15.4492f, 21.0f, 15.0f, 21.4492f, 15.0f, 22.0f)
                curveTo(15.0f, 22.5508f, 15.4492f, 23.0f, 16.0f, 23.0f)
                curveTo(16.5508f, 23.0f, 17.0f, 22.5508f, 17.0f, 22.0f)
                curveTo(17.0f, 21.4492f, 16.5508f, 21.0f, 16.0f, 21.0f)
                close()
            }
        }
        .build()
        return _userMdSolid!!
    }

private var _userMdSolid: ImageVector? = null
