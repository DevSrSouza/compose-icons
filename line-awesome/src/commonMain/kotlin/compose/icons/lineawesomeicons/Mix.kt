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

public val LineAwesomeIcons.Mix: ImageVector
    get() {
        if (_mix != null) {
            return _mix!!
        }
        _mix = Builder(name = "Mix", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 25.0f)
                curveTo(5.0f, 26.654f, 6.346f, 28.0f, 8.0f, 28.0f)
                curveTo(9.654f, 28.0f, 11.0f, 26.654f, 11.0f, 25.0f)
                lineTo(11.0f, 13.0f)
                curveTo(11.0f, 12.448f, 11.448f, 12.0f, 12.0f, 12.0f)
                curveTo(12.552f, 12.0f, 13.0f, 12.448f, 13.0f, 13.0f)
                lineTo(13.0f, 21.0f)
                curveTo(13.0f, 22.654f, 14.346f, 24.0f, 16.0f, 24.0f)
                curveTo(17.654f, 24.0f, 19.0f, 22.654f, 19.0f, 21.0f)
                lineTo(19.0f, 15.0f)
                curveTo(19.0f, 14.448f, 19.448f, 14.0f, 20.0f, 14.0f)
                curveTo(20.552f, 14.0f, 21.0f, 14.448f, 21.0f, 15.0f)
                lineTo(21.0f, 17.0f)
                curveTo(21.0f, 18.654f, 22.346f, 20.0f, 24.0f, 20.0f)
                curveTo(25.654f, 20.0f, 27.0f, 18.654f, 27.0f, 17.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 17.0f)
                curveTo(25.0f, 17.552f, 24.552f, 18.0f, 24.0f, 18.0f)
                curveTo(23.448f, 18.0f, 23.0f, 17.552f, 23.0f, 17.0f)
                lineTo(23.0f, 15.0f)
                curveTo(23.0f, 13.346f, 21.654f, 12.0f, 20.0f, 12.0f)
                curveTo(18.346f, 12.0f, 17.0f, 13.346f, 17.0f, 15.0f)
                lineTo(17.0f, 21.0f)
                curveTo(17.0f, 21.552f, 16.552f, 22.0f, 16.0f, 22.0f)
                curveTo(15.448f, 22.0f, 15.0f, 21.552f, 15.0f, 21.0f)
                lineTo(15.0f, 13.0f)
                curveTo(15.0f, 11.346f, 13.654f, 10.0f, 12.0f, 10.0f)
                curveTo(10.346f, 10.0f, 9.0f, 11.346f, 9.0f, 13.0f)
                lineTo(9.0f, 25.0f)
                curveTo(9.0f, 25.552f, 8.552f, 26.0f, 8.0f, 26.0f)
                curveTo(7.448f, 26.0f, 7.0f, 25.552f, 7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _mix!!
    }

private var _mix: ImageVector? = null
