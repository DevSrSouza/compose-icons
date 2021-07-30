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

public val LineAwesomeIcons.AtlasSolid: ImageVector
    get() {
        if (_atlasSolid != null) {
            return _atlasSolid!!
        }
        _atlasSolid = Builder(name = "AtlasSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveTo(7.355f, 4.0f, 6.0f, 5.355f, 6.0f, 7.0f)
                lineTo(6.0f, 25.0f)
                curveTo(6.0f, 26.645f, 7.355f, 28.0f, 9.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                lineTo(26.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(9.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineTo(24.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                curveTo(8.648f, 22.0f, 8.316f, 22.0735f, 8.0f, 22.1875f)
                lineTo(8.0f, 7.0f)
                curveTo(8.0f, 6.434f, 8.434f, 6.0f, 9.0f, 6.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(12.699f, 8.0f, 10.0f, 10.699f, 10.0f, 14.0f)
                curveTo(10.0f, 17.301f, 12.699f, 20.0f, 16.0f, 20.0f)
                curveTo(19.301f, 20.0f, 22.0f, 17.301f, 22.0f, 14.0f)
                curveTo(22.0f, 10.699f, 19.301f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(16.6875f, 10.0938f)
                curveTo(17.1715f, 10.1757f, 17.6252f, 10.3235f, 18.0313f, 10.5625f)
                lineTo(18.0957f, 11.2813f)
                lineTo(17.627f, 11.0938f)
                lineTo(17.252f, 11.4063f)
                lineTo(17.3145f, 12.3125f)
                lineTo(18.2832f, 12.0313f)
                lineTo(19.4707f, 12.4063f)
                lineTo(19.1582f, 12.9375f)
                lineTo(18.4375f, 12.5f)
                lineTo(17.6563f, 12.625f)
                lineTo(16.9063f, 13.1875f)
                lineTo(16.4688f, 14.5f)
                lineTo(17.3125f, 15.1875f)
                curveTo(17.3125f, 15.1875f, 18.205f, 15.0313f, 18.252f, 15.0313f)
                curveTo(18.299f, 15.0313f, 18.627f, 15.8457f, 18.627f, 15.8457f)
                lineTo(18.127f, 17.377f)
                curveTo(17.513f, 17.759f, 16.785f, 18.0f, 16.0f, 18.0f)
                curveTo(15.766f, 18.0f, 15.5355f, 17.9452f, 15.3125f, 17.9063f)
                lineTo(15.123f, 17.5938f)
                lineTo(15.5938f, 15.8438f)
                lineTo(13.8125f, 14.5f)
                lineTo(12.1563f, 14.5f)
                lineTo(12.0313f, 14.25f)
                curveTo(12.0262f, 14.164f, 12.0f, 14.086f, 12.0f, 14.0f)
                curveTo(12.0f, 13.785f, 12.0305f, 13.578f, 12.0625f, 13.375f)
                lineTo(12.9063f, 12.7188f)
                lineTo(14.6875f, 11.875f)
                lineTo(14.4063f, 10.7188f)
                lineTo(15.1875f, 10.5625f)
                lineTo(15.5313f, 11.0625f)
                lineTo(16.877f, 10.8125f)
                lineTo(16.6875f, 10.0938f)
                close()
                moveTo(13.0625f, 16.7188f)
                lineTo(13.377f, 16.7188f)
                lineTo(13.9707f, 17.4375f)
                curveTo(13.6297f, 17.2375f, 13.3275f, 17.0037f, 13.0625f, 16.7188f)
                close()
                moveTo(9.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 26.0f)
                lineTo(9.0f, 26.0f)
                curveTo(8.434f, 26.0f, 8.0f, 25.566f, 8.0f, 25.0f)
                curveTo(8.0f, 24.434f, 8.434f, 24.0f, 9.0f, 24.0f)
                close()
            }
        }
        .build()
        return _atlasSolid!!
    }

private var _atlasSolid: ImageVector? = null
