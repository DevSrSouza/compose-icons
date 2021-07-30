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

public val LineAwesomeIcons.TagsSolid: ImageVector
    get() {
        if (_tagsSolid != null) {
            return _tagsSolid!!
        }
        _tagsSolid = Builder(name = "TagsSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5938f, 4.0f)
                lineTo(14.2813f, 4.2813f)
                lineTo(3.2813f, 15.2813f)
                lineTo(2.5938f, 16.0f)
                lineTo(3.2813f, 16.7188f)
                lineTo(12.2813f, 25.7188f)
                lineTo(13.0f, 26.4063f)
                lineTo(13.7188f, 25.7188f)
                lineTo(24.7188f, 14.7188f)
                lineTo(25.0f, 14.4063f)
                lineTo(25.0f, 4.0f)
                close()
                moveTo(15.4375f, 6.0f)
                lineTo(23.0f, 6.0f)
                lineTo(23.0f, 13.5625f)
                lineTo(13.0f, 23.5625f)
                lineTo(5.4375f, 16.0f)
                close()
                moveTo(26.0f, 7.0f)
                lineTo(26.0f, 9.0f)
                lineTo(27.0f, 9.0f)
                lineTo(27.0f, 17.1563f)
                lineTo(17.5f, 26.5938f)
                lineTo(16.25f, 25.3438f)
                lineTo(14.8438f, 26.75f)
                lineTo(16.7813f, 28.7188f)
                lineTo(17.5f, 29.4063f)
                lineTo(18.1875f, 28.7188f)
                lineTo(28.7188f, 18.3125f)
                lineTo(29.0f, 18.0f)
                lineTo(29.0f, 7.0f)
                close()
                moveTo(20.0f, 8.0f)
                curveTo(19.4492f, 8.0f, 19.0f, 8.4492f, 19.0f, 9.0f)
                curveTo(19.0f, 9.5508f, 19.4492f, 10.0f, 20.0f, 10.0f)
                curveTo(20.5508f, 10.0f, 21.0f, 9.5508f, 21.0f, 9.0f)
                curveTo(21.0f, 8.4492f, 20.5508f, 8.0f, 20.0f, 8.0f)
                close()
            }
        }
        .build()
        return _tagsSolid!!
    }

private var _tagsSolid: ImageVector? = null
