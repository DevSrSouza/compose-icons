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

public val CssGgIcons.Trees: ImageVector
    get() {
        if (_trees != null) {
            return _trees!!
        }
        _trees = Builder(name = "Trees", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.7401f, 16.3185f)
                curveTo(12.035f, 17.1126f, 11.0808f, 17.6806f, 10.0f, 17.9f)
                verticalLineTo(21.0f)
                curveTo(10.0f, 21.5523f, 9.5523f, 22.0f, 9.0f, 22.0f)
                curveTo(8.4477f, 22.0f, 8.0f, 21.5523f, 8.0f, 21.0f)
                verticalLineTo(17.9f)
                curveTo(5.7178f, 17.4367f, 4.0f, 15.419f, 4.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 4.2386f, 6.2386f, 2.0f, 9.0f, 2.0f)
                curveTo(11.6087f, 2.0f, 13.7508f, 3.9978f, 13.9797f, 6.5469f)
                curveTo(14.5726f, 6.1993f, 15.2631f, 6.0f, 16.0f, 6.0f)
                curveTo(18.2091f, 6.0f, 20.0f, 7.7909f, 20.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(20.0f, 15.8638f, 18.7252f, 17.4299f, 17.0f, 17.874f)
                verticalLineTo(21.0f)
                curveTo(17.0f, 21.5523f, 16.5523f, 22.0f, 16.0f, 22.0f)
                curveTo(15.4477f, 22.0f, 15.0f, 21.5523f, 15.0f, 21.0f)
                verticalLineTo(17.874f)
                curveTo(14.0747f, 17.6358f, 13.279f, 17.075f, 12.7401f, 16.3185f)
                close()
                moveTo(12.0f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(12.0f, 14.3062f, 11.1652f, 15.4175f, 10.0f, 15.8293f)
                verticalLineTo(13.0f)
                curveTo(10.0f, 12.4477f, 9.5523f, 12.0f, 9.0f, 12.0f)
                curveTo(8.4477f, 12.0f, 8.0f, 12.4477f, 8.0f, 13.0f)
                verticalLineTo(15.8293f)
                curveTo(6.8348f, 15.4175f, 6.0f, 14.3062f, 6.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 5.3432f, 7.3432f, 4.0f, 9.0f, 4.0f)
                curveTo(10.6569f, 4.0f, 12.0f, 5.3432f, 12.0f, 7.0f)
                close()
                moveTo(17.0f, 15.7324f)
                verticalLineTo(13.0f)
                curveTo(17.0f, 12.4477f, 16.5523f, 12.0f, 16.0f, 12.0f)
                curveTo(15.4477f, 12.0f, 15.0f, 12.4477f, 15.0f, 13.0f)
                verticalLineTo(15.7324f)
                curveTo(14.4022f, 15.3866f, 14.0f, 14.7403f, 14.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(14.0f, 8.8954f, 14.8954f, 8.0f, 16.0f, 8.0f)
                curveTo(17.1046f, 8.0f, 18.0f, 8.8954f, 18.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(18.0f, 14.7403f, 17.5978f, 15.3866f, 17.0f, 15.7324f)
                close()
            }
        }
        .build()
        return _trees!!
    }

private var _trees: ImageVector? = null
