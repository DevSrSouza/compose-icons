package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.MoreVertical: ImageVector
    get() {
        if (_moreVertical != null) {
            return _moreVertical!!
        }
        _moreVertical = Builder(name = "MoreVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 5.0f)
                curveTo(12.552f, 5.0f, 13.0f, 4.552f, 13.0f, 4.0f)
                curveTo(13.0f, 3.448f, 12.552f, 3.0f, 12.0f, 3.0f)
                curveTo(11.448f, 3.0f, 11.0f, 3.448f, 11.0f, 4.0f)
                curveTo(11.0f, 4.552f, 11.448f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(12.552f, 13.0f, 13.0f, 12.552f, 13.0f, 12.0f)
                curveTo(13.0f, 11.448f, 12.552f, 11.0f, 12.0f, 11.0f)
                curveTo(11.448f, 11.0f, 11.0f, 11.448f, 11.0f, 12.0f)
                curveTo(11.0f, 12.552f, 11.448f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveTo(12.552f, 21.0f, 13.0f, 20.552f, 13.0f, 20.0f)
                curveTo(13.0f, 19.448f, 12.552f, 19.0f, 12.0f, 19.0f)
                curveTo(11.448f, 19.0f, 11.0f, 19.448f, 11.0f, 20.0f)
                curveTo(11.0f, 20.552f, 11.448f, 21.0f, 12.0f, 21.0f)
                close()
                moveTo(15.0f, 4.0f)
                curveTo(15.0f, 5.657f, 13.657f, 7.0f, 12.0f, 7.0f)
                curveTo(10.343f, 7.0f, 9.0f, 5.657f, 9.0f, 4.0f)
                curveTo(9.0f, 2.343f, 10.343f, 1.0f, 12.0f, 1.0f)
                curveTo(13.657f, 1.0f, 15.0f, 2.343f, 15.0f, 4.0f)
                close()
                moveTo(15.0f, 12.0f)
                curveTo(15.0f, 13.657f, 13.657f, 15.0f, 12.0f, 15.0f)
                curveTo(10.343f, 15.0f, 9.0f, 13.657f, 9.0f, 12.0f)
                curveTo(9.0f, 10.343f, 10.343f, 9.0f, 12.0f, 9.0f)
                curveTo(13.657f, 9.0f, 15.0f, 10.343f, 15.0f, 12.0f)
                close()
                moveTo(12.0f, 23.0f)
                curveTo(13.657f, 23.0f, 15.0f, 21.657f, 15.0f, 20.0f)
                curveTo(15.0f, 18.343f, 13.657f, 17.0f, 12.0f, 17.0f)
                curveTo(10.343f, 17.0f, 9.0f, 18.343f, 9.0f, 20.0f)
                curveTo(9.0f, 21.657f, 10.343f, 23.0f, 12.0f, 23.0f)
                close()
            }
        }
        .build()
        return _moreVertical!!
    }

private var _moreVertical: ImageVector? = null
