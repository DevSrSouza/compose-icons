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

public val LineAwesomeIcons.VialsSolid: ImageVector
    get() {
        if (_vialsSolid != null) {
            return _vialsSolid!!
        }
        _vialsSolid = Builder(name = "VialsSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                lineTo(6.0f, 19.5f)
                curveTo(6.0f, 21.4f, 7.6f, 23.0f, 9.5f, 23.0f)
                curveTo(11.4f, 23.0f, 13.0f, 21.4f, 13.0f, 19.5f)
                lineTo(13.0f, 7.0f)
                lineTo(14.0f, 7.0f)
                lineTo(14.0f, 5.0f)
                lineTo(13.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(18.0f, 5.0f)
                lineTo(18.0f, 7.0f)
                lineTo(19.0f, 7.0f)
                lineTo(19.0f, 19.5f)
                curveTo(19.0f, 21.4f, 20.6f, 23.0f, 22.5f, 23.0f)
                curveTo(24.4f, 23.0f, 26.0f, 21.4f, 26.0f, 19.5f)
                lineTo(26.0f, 7.0f)
                lineTo(27.0f, 7.0f)
                lineTo(27.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                close()
                moveTo(8.0f, 7.0f)
                lineTo(11.0f, 7.0f)
                lineTo(11.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                lineTo(8.0f, 7.0f)
                close()
                moveTo(21.0f, 7.0f)
                lineTo(24.0f, 7.0f)
                lineTo(24.0f, 13.0f)
                lineTo(21.0f, 13.0f)
                lineTo(21.0f, 7.0f)
                close()
                moveTo(8.0f, 15.0f)
                lineTo(11.0f, 15.0f)
                lineTo(11.0f, 19.5f)
                curveTo(11.0f, 20.3f, 10.3f, 21.0f, 9.5f, 21.0f)
                curveTo(8.7f, 21.0f, 8.0f, 20.3f, 8.0f, 19.5f)
                lineTo(8.0f, 15.0f)
                close()
                moveTo(21.0f, 15.0f)
                lineTo(24.0f, 15.0f)
                lineTo(24.0f, 19.5f)
                curveTo(24.0f, 20.3f, 23.3f, 21.0f, 22.5f, 21.0f)
                curveTo(21.7f, 21.0f, 21.0f, 20.3f, 21.0f, 19.5f)
                lineTo(21.0f, 15.0f)
                close()
                moveTo(2.0f, 25.0f)
                lineTo(2.0f, 27.0f)
                lineTo(30.0f, 27.0f)
                lineTo(30.0f, 25.0f)
                lineTo(2.0f, 25.0f)
                close()
            }
        }
        .build()
        return _vialsSolid!!
    }

private var _vialsSolid: ImageVector? = null
