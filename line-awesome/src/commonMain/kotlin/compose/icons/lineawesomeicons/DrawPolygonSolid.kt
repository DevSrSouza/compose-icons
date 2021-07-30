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

public val LineAwesomeIcons.DrawPolygonSolid: ImageVector
    get() {
        if (_drawPolygonSolid != null) {
            return _drawPolygonSolid!!
        }
        _drawPolygonSolid = Builder(name = "DrawPolygonSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                curveTo(12.8945f, 4.0f, 12.0f, 4.8945f, 12.0f, 6.0f)
                curveTo(12.0f, 6.0195f, 12.0f, 6.043f, 12.0f, 6.0625f)
                lineTo(6.9375f, 9.25f)
                curveTo(6.6563f, 9.1016f, 6.3398f, 9.0f, 6.0f, 9.0f)
                curveTo(4.8945f, 9.0f, 4.0f, 9.8945f, 4.0f, 11.0f)
                curveTo(4.0f, 11.7383f, 4.4023f, 12.3711f, 5.0f, 12.7188f)
                lineTo(5.0f, 24.2813f)
                curveTo(4.4023f, 24.6289f, 4.0f, 25.2617f, 4.0f, 26.0f)
                curveTo(4.0f, 27.1055f, 4.8945f, 28.0f, 6.0f, 28.0f)
                curveTo(6.7383f, 28.0f, 7.3711f, 27.5977f, 7.7188f, 27.0f)
                lineTo(20.2813f, 27.0f)
                curveTo(20.6289f, 27.5977f, 21.2617f, 28.0f, 22.0f, 28.0f)
                curveTo(23.1055f, 28.0f, 24.0f, 27.1055f, 24.0f, 26.0f)
                curveTo(24.0f, 25.6016f, 23.8906f, 25.2188f, 23.6875f, 24.9063f)
                lineTo(26.125f, 20.0f)
                curveTo(27.1719f, 19.9336f, 28.0f, 19.0625f, 28.0f, 18.0f)
                curveTo(28.0f, 17.0234f, 27.3008f, 16.207f, 26.375f, 16.0313f)
                lineTo(24.4688f, 10.3125f)
                curveTo(24.7852f, 9.957f, 25.0f, 9.5117f, 25.0f, 9.0f)
                curveTo(25.0f, 7.8945f, 24.1055f, 7.0f, 23.0f, 7.0f)
                curveTo(22.4883f, 7.0f, 22.043f, 7.2148f, 21.6875f, 7.5313f)
                lineTo(15.9688f, 5.5938f)
                curveTo(15.7813f, 4.6836f, 14.9648f, 4.0f, 14.0f, 4.0f)
                close()
                moveTo(15.3125f, 7.5f)
                lineTo(21.0313f, 9.375f)
                curveTo(21.1836f, 10.1797f, 21.8203f, 10.8164f, 22.625f, 10.9688f)
                lineTo(24.5313f, 16.6563f)
                curveTo(24.207f, 17.0117f, 24.0f, 17.4805f, 24.0f, 18.0f)
                curveTo(24.0f, 18.4141f, 24.1289f, 18.8047f, 24.3438f, 19.125f)
                lineTo(21.875f, 24.0f)
                curveTo(21.1875f, 24.043f, 20.6094f, 24.4375f, 20.2813f, 25.0f)
                lineTo(7.7188f, 25.0f)
                curveTo(7.543f, 24.6992f, 7.3008f, 24.457f, 7.0f, 24.2813f)
                lineTo(7.0f, 12.7188f)
                curveTo(7.5977f, 12.3711f, 8.0f, 11.7383f, 8.0f, 11.0f)
                curveTo(8.0f, 10.9805f, 8.0f, 10.957f, 8.0f, 10.9375f)
                lineTo(13.0625f, 7.75f)
                curveTo(13.3438f, 7.8984f, 13.6602f, 8.0f, 14.0f, 8.0f)
                curveTo(14.5039f, 8.0f, 14.9609f, 7.8086f, 15.3125f, 7.5f)
                close()
            }
        }
        .build()
        return _drawPolygonSolid!!
    }

private var _drawPolygonSolid: ImageVector? = null
