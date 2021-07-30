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

public val LineAwesomeIcons.WalkingSolid: ImageVector
    get() {
        if (_walkingSolid != null) {
            return _walkingSolid!!
        }
        _walkingSolid = Builder(name = "WalkingSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 4.0f)
                curveTo(14.5781f, 4.0f, 13.0f, 5.5781f, 13.0f, 7.5f)
                curveTo(13.0f, 9.4219f, 14.5781f, 11.0f, 16.5f, 11.0f)
                curveTo(18.4219f, 11.0f, 20.0f, 9.4219f, 20.0f, 7.5f)
                curveTo(20.0f, 5.5781f, 18.4219f, 4.0f, 16.5f, 4.0f)
                close()
                moveTo(16.5f, 6.0f)
                curveTo(17.3398f, 6.0f, 18.0f, 6.6602f, 18.0f, 7.5f)
                curveTo(18.0f, 8.3398f, 17.3398f, 9.0f, 16.5f, 9.0f)
                curveTo(15.6602f, 9.0f, 15.0f, 8.3398f, 15.0f, 7.5f)
                curveTo(15.0f, 6.6602f, 15.6602f, 6.0f, 16.5f, 6.0f)
                close()
                moveTo(12.8125f, 11.25f)
                curveTo(12.2969f, 11.293f, 11.8164f, 11.5391f, 11.4688f, 11.9375f)
                lineTo(9.6563f, 14.0313f)
                curveTo(9.418f, 14.3047f, 9.25f, 14.6406f, 9.1875f, 15.0f)
                lineTo(8.5f, 18.875f)
                lineTo(10.4688f, 19.2188f)
                lineTo(11.1563f, 15.3438f)
                lineTo(12.9688f, 13.25f)
                lineTo(13.0f, 13.25f)
                lineTo(13.7813f, 13.4063f)
                lineTo(12.5938f, 18.7813f)
                curveTo(12.4727f, 19.3398f, 12.6016f, 19.9141f, 12.9375f, 20.375f)
                lineTo(18.4688f, 28.0f)
                lineTo(20.9375f, 28.0f)
                lineTo(14.5625f, 19.1875f)
                lineTo(15.75f, 13.7813f)
                lineTo(16.2188f, 13.875f)
                lineTo(16.9688f, 16.5f)
                curveTo(17.1445f, 17.1016f, 17.5977f, 17.5898f, 18.1875f, 17.8125f)
                lineTo(21.7188f, 19.1563f)
                lineTo(22.4063f, 17.2813f)
                lineTo(18.9063f, 15.9375f)
                lineTo(18.125f, 13.3125f)
                curveTo(17.918f, 12.5898f, 17.332f, 12.0469f, 16.5938f, 11.9063f)
                lineTo(13.3438f, 11.2813f)
                curveTo(13.1719f, 11.25f, 12.9844f, 11.2344f, 12.8125f, 11.25f)
                close()
                moveTo(12.4688f, 22.0313f)
                lineTo(11.9688f, 23.9688f)
                lineTo(9.0625f, 28.0f)
                lineTo(11.5313f, 28.0f)
                lineTo(13.8438f, 24.8438f)
                lineTo(13.9688f, 24.25f)
                close()
            }
        }
        .build()
        return _walkingSolid!!
    }

private var _walkingSolid: ImageVector? = null
