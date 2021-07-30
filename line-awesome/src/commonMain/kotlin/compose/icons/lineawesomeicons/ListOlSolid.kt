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
                moveTo(5.9688f, 3.0f)
                lineTo(5.6563f, 3.3438f)
                curveTo(5.6563f, 3.3438f, 4.8984f, 4.0f, 4.4063f, 4.0f)
                lineTo(4.4063f, 6.0f)
                curveTo(5.0859f, 6.0f, 5.5547f, 5.7227f, 6.0f, 5.4688f)
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
                curveTo(5.1172f, 12.0f, 4.0f, 13.1172f, 4.0f, 14.5f)
                lineTo(4.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                lineTo(6.0f, 14.5f)
                curveTo(6.0f, 14.2852f, 6.2852f, 14.0f, 6.5f, 14.0f)
                curveTo(6.7148f, 14.0f, 7.0f, 14.2852f, 7.0f, 14.5f)
                lineTo(6.9063f, 14.5938f)
                lineTo(4.3125f, 17.0938f)
                lineTo(4.0f, 17.375f)
                lineTo(4.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                lineTo(9.0f, 17.0f)
                lineTo(7.2813f, 17.0f)
                lineTo(8.1563f, 16.125f)
                lineTo(8.2813f, 16.0313f)
                lineTo(8.25f, 16.0f)
                curveTo(8.75f, 15.5898f, 9.0f, 14.9805f, 9.0f, 14.5f)
                curveTo(9.0f, 13.1172f, 7.8828f, 12.0f, 6.5f, 12.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(11.0f, 17.0f)
                lineTo(28.0f, 17.0f)
                lineTo(28.0f, 15.0f)
                close()
                moveTo(4.0f, 21.0f)
                lineTo(4.0f, 23.0f)
                lineTo(5.375f, 23.0f)
                lineTo(5.125f, 23.4063f)
                lineTo(5.0f, 23.625f)
                lineTo(5.0f, 25.0f)
                lineTo(6.5f, 25.0f)
                curveTo(6.7148f, 25.0f, 7.0f, 25.2852f, 7.0f, 25.5f)
                curveTo(7.0f, 25.7148f, 6.7148f, 26.0f, 6.5f, 26.0f)
                lineTo(4.0f, 26.0f)
                lineTo(4.0f, 28.0f)
                lineTo(6.5f, 28.0f)
                curveTo(7.8828f, 28.0f, 9.0f, 26.8828f, 9.0f, 25.5f)
                curveTo(9.0f, 24.4961f, 8.3203f, 23.8047f, 7.4688f, 23.4063f)
                lineTo(7.875f, 22.7188f)
                lineTo(8.0f, 22.4688f)
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
