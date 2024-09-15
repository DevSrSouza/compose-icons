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

public val LineAwesomeIcons.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                lineTo(15.0f, 8.0f)
                lineTo(17.0f, 8.0f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(7.5f, 6.094f)
                lineTo(6.094f, 7.5f)
                lineTo(9.625f, 11.063f)
                lineTo(11.063f, 9.625f)
                close()
                moveTo(24.5f, 6.094f)
                lineTo(20.938f, 9.625f)
                lineTo(22.375f, 11.063f)
                lineTo(25.906f, 7.5f)
                close()
                moveTo(16.0f, 9.0f)
                curveTo(12.145f, 9.0f, 9.0f, 12.145f, 9.0f, 16.0f)
                curveTo(9.0f, 19.855f, 12.145f, 23.0f, 16.0f, 23.0f)
                curveTo(19.855f, 23.0f, 23.0f, 19.855f, 23.0f, 16.0f)
                curveTo(23.0f, 12.145f, 19.855f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(18.773f, 11.0f, 21.0f, 13.227f, 21.0f, 16.0f)
                curveTo(21.0f, 18.773f, 18.773f, 21.0f, 16.0f, 21.0f)
                curveTo(13.227f, 21.0f, 11.0f, 18.773f, 11.0f, 16.0f)
                curveTo(11.0f, 13.227f, 13.227f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(3.0f, 15.0f)
                lineTo(3.0f, 17.0f)
                lineTo(8.0f, 17.0f)
                lineTo(8.0f, 15.0f)
                close()
                moveTo(24.0f, 15.0f)
                lineTo(24.0f, 17.0f)
                lineTo(29.0f, 17.0f)
                lineTo(29.0f, 15.0f)
                close()
                moveTo(9.625f, 20.938f)
                lineTo(6.094f, 24.5f)
                lineTo(7.5f, 25.906f)
                lineTo(11.063f, 22.375f)
                close()
                moveTo(22.375f, 20.938f)
                lineTo(20.938f, 22.375f)
                lineTo(24.5f, 25.906f)
                lineTo(25.906f, 24.5f)
                close()
                moveTo(15.0f, 24.0f)
                lineTo(15.0f, 29.0f)
                lineTo(17.0f, 29.0f)
                lineTo(17.0f, 24.0f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
