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

public val LineAwesomeIcons.BlindSolid: ImageVector
    get() {
        if (_blindSolid != null) {
            return _blindSolid!!
        }
        _blindSolid = Builder(name = "BlindSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 3.0f)
                curveTo(12.5781f, 3.0f, 11.0f, 4.5781f, 11.0f, 6.5f)
                curveTo(11.0f, 8.4219f, 12.5781f, 10.0f, 14.5f, 10.0f)
                curveTo(16.4219f, 10.0f, 18.0f, 8.4219f, 18.0f, 6.5f)
                curveTo(18.0f, 4.5781f, 16.4219f, 3.0f, 14.5f, 3.0f)
                close()
                moveTo(14.5f, 5.0f)
                curveTo(15.3398f, 5.0f, 16.0f, 5.6602f, 16.0f, 6.5f)
                curveTo(16.0f, 7.3398f, 15.3398f, 8.0f, 14.5f, 8.0f)
                curveTo(13.6602f, 8.0f, 13.0f, 7.3398f, 13.0f, 6.5f)
                curveTo(13.0f, 5.6602f, 13.6602f, 5.0f, 14.5f, 5.0f)
                close()
                moveTo(10.8125f, 10.25f)
                curveTo(10.2969f, 10.293f, 9.8164f, 10.5391f, 9.4688f, 10.9375f)
                lineTo(7.6563f, 13.0313f)
                curveTo(7.418f, 13.3047f, 7.25f, 13.6406f, 7.1875f, 14.0f)
                lineTo(6.5f, 17.875f)
                lineTo(8.4688f, 18.2188f)
                lineTo(9.1563f, 14.3438f)
                lineTo(10.9688f, 12.25f)
                lineTo(11.0f, 12.25f)
                lineTo(11.7813f, 12.4063f)
                lineTo(10.5938f, 17.7813f)
                curveTo(10.4727f, 18.3398f, 10.6016f, 18.9141f, 10.9375f, 19.375f)
                lineTo(16.4688f, 27.0f)
                lineTo(18.9375f, 27.0f)
                lineTo(12.5625f, 18.1875f)
                lineTo(13.75f, 12.7813f)
                lineTo(14.2188f, 12.875f)
                lineTo(14.9688f, 15.5f)
                curveTo(15.1445f, 16.1016f, 15.5977f, 16.5898f, 16.1875f, 16.8125f)
                lineTo(19.1563f, 17.9375f)
                lineTo(23.0313f, 26.6875f)
                lineTo(23.9688f, 26.3125f)
                lineTo(20.0f, 17.375f)
                lineTo(20.4063f, 16.2813f)
                lineTo(16.9063f, 14.9375f)
                lineTo(16.125f, 12.3125f)
                curveTo(15.918f, 11.5898f, 15.332f, 11.0469f, 14.5938f, 10.9063f)
                lineTo(11.3438f, 10.2813f)
                curveTo(11.1719f, 10.25f, 10.9844f, 10.2344f, 10.8125f, 10.25f)
                close()
                moveTo(10.4688f, 21.0313f)
                lineTo(9.9688f, 22.9688f)
                lineTo(7.0625f, 27.0f)
                lineTo(9.5313f, 27.0f)
                lineTo(11.8438f, 23.8438f)
                lineTo(11.9688f, 23.25f)
                close()
            }
        }
        .build()
        return _blindSolid!!
    }

private var _blindSolid: ImageVector? = null
