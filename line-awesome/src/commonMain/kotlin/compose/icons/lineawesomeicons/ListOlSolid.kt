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

public val LineAwesomeIcons.ListOlSolid: ImageVector
    get() {
        if (_listOlSolid != null) {
            return _listOlSolid!!
        }
        _listOlSolid = Builder(name = "ListOlSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.969f, 3.0f)
                lineTo(5.656f, 3.344f)
                curveTo(5.656f, 3.344f, 4.898f, 4.0f, 4.406f, 4.0f)
                lineTo(4.406f, 6.0f)
                curveTo(5.086f, 6.0f, 5.555f, 5.723f, 6.0f, 5.469f)
                lineTo(6.0f, 10.0f)
                lineTo(8.0f, 10.0f)
                lineTo(8.0f, 3.0f)
                close()
                moveTo(11.0f, 6.0f)
                lineTo(11.0f, 8.0f)
                lineTo(28.0f, 8.0f)
                lineTo(28.0f, 6.0f)
                close()
                moveTo(6.5f, 12.0f)
                curveTo(5.117f, 12.0f, 4.0f, 13.117f, 4.0f, 14.5f)
                lineTo(4.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                lineTo(6.0f, 14.5f)
                curveTo(6.0f, 14.285f, 6.285f, 14.0f, 6.5f, 14.0f)
                curveTo(6.715f, 14.0f, 7.0f, 14.285f, 7.0f, 14.5f)
                lineTo(6.906f, 14.594f)
                lineTo(4.313f, 17.094f)
                lineTo(4.0f, 17.375f)
                lineTo(4.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                lineTo(9.0f, 17.0f)
                lineTo(7.281f, 17.0f)
                lineTo(8.156f, 16.125f)
                lineTo(8.281f, 16.031f)
                lineTo(8.25f, 16.0f)
                curveTo(8.75f, 15.59f, 9.0f, 14.98f, 9.0f, 14.5f)
                curveTo(9.0f, 13.117f, 7.883f, 12.0f, 6.5f, 12.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(11.0f, 17.0f)
                lineTo(28.0f, 17.0f)
                lineTo(28.0f, 15.0f)
                close()
                moveTo(4.0f, 21.0f)
                lineTo(4.0f, 23.0f)
                lineTo(5.375f, 23.0f)
                lineTo(5.125f, 23.406f)
                lineTo(5.0f, 23.625f)
                lineTo(5.0f, 25.0f)
                lineTo(6.5f, 25.0f)
                curveTo(6.715f, 25.0f, 7.0f, 25.285f, 7.0f, 25.5f)
                curveTo(7.0f, 25.715f, 6.715f, 26.0f, 6.5f, 26.0f)
                lineTo(4.0f, 26.0f)
                lineTo(4.0f, 28.0f)
                lineTo(6.5f, 28.0f)
                curveTo(7.883f, 28.0f, 9.0f, 26.883f, 9.0f, 25.5f)
                curveTo(9.0f, 24.496f, 8.32f, 23.805f, 7.469f, 23.406f)
                lineTo(7.875f, 22.719f)
                lineTo(8.0f, 22.469f)
                lineTo(8.0f, 21.0f)
                close()
                moveTo(11.0f, 24.0f)
                lineTo(11.0f, 26.0f)
                lineTo(28.0f, 26.0f)
                lineTo(28.0f, 24.0f)
                close()
            }
        }
        .build()
        return _listOlSolid!!
    }

private var _listOlSolid: ImageVector? = null
