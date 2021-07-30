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

public val LineAwesomeIcons.DollySolid: ImageVector
    get() {
        if (_dollySolid != null) {
            return _dollySolid!!
        }
        _dollySolid = Builder(name = "DollySolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5938f, 1.6563f)
                lineTo(17.6563f, 2.0f)
                lineTo(12.125f, 4.0313f)
                lineTo(11.1875f, 4.375f)
                lineTo(11.5313f, 5.3125f)
                lineTo(13.2188f, 9.875f)
                lineTo(13.5625f, 10.8125f)
                lineTo(14.5f, 10.4688f)
                lineTo(20.0313f, 8.4375f)
                lineTo(20.9688f, 8.0938f)
                lineTo(20.625f, 7.1563f)
                lineTo(18.9375f, 2.5938f)
                close()
                moveTo(8.5938f, 3.0f)
                lineTo(7.6563f, 3.3438f)
                lineTo(5.0f, 4.3125f)
                lineTo(5.6563f, 6.1875f)
                lineTo(7.4063f, 5.5625f)
                lineTo(14.0625f, 23.3438f)
                lineTo(14.4063f, 24.2813f)
                lineTo(15.3438f, 23.9375f)
                lineTo(25.9688f, 19.9375f)
                lineTo(25.2813f, 18.0625f)
                lineTo(15.5938f, 21.7188f)
                lineTo(8.9375f, 3.9375f)
                close()
                moveTo(17.4063f, 4.2188f)
                lineTo(18.4063f, 6.9063f)
                lineTo(14.75f, 8.25f)
                lineTo(13.75f, 5.5625f)
                close()
                moveTo(21.7813f, 9.9063f)
                lineTo(20.8438f, 10.25f)
                lineTo(15.3125f, 12.2813f)
                lineTo(14.375f, 12.625f)
                lineTo(14.7188f, 13.5625f)
                lineTo(16.4063f, 18.125f)
                lineTo(16.75f, 19.0625f)
                lineTo(17.6875f, 18.7188f)
                lineTo(23.2188f, 16.6875f)
                lineTo(24.1563f, 16.3438f)
                lineTo(23.8125f, 15.375f)
                lineTo(22.125f, 10.8438f)
                close()
                moveTo(20.5938f, 12.4688f)
                lineTo(21.5938f, 15.1563f)
                lineTo(17.9375f, 16.5f)
                lineTo(16.9375f, 13.8125f)
                close()
                moveTo(11.0f, 21.0f)
                curveTo(9.3555f, 21.0f, 8.0f, 22.3555f, 8.0f, 24.0f)
                curveTo(8.0f, 25.6445f, 9.3555f, 27.0f, 11.0f, 27.0f)
                curveTo(12.6445f, 27.0f, 14.0f, 25.6445f, 14.0f, 24.0f)
                curveTo(14.0f, 22.3555f, 12.6445f, 21.0f, 11.0f, 21.0f)
                close()
                moveTo(11.0f, 27.0f)
                lineTo(5.0f, 27.0f)
                lineTo(5.0f, 29.0f)
                lineTo(27.0f, 29.0f)
                lineTo(27.0f, 27.0f)
                close()
                moveTo(11.0f, 23.0f)
                curveTo(11.5625f, 23.0f, 12.0f, 23.4375f, 12.0f, 24.0f)
                curveTo(12.0f, 24.5625f, 11.5625f, 25.0f, 11.0f, 25.0f)
                curveTo(10.4375f, 25.0f, 10.0f, 24.5625f, 10.0f, 24.0f)
                curveTo(10.0f, 23.4375f, 10.4375f, 23.0f, 11.0f, 23.0f)
                close()
            }
        }
        .build()
        return _dollySolid!!
    }

private var _dollySolid: ImageVector? = null
