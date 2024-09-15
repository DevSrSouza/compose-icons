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

public val LineAwesomeIcons.Hubspot: ImageVector
    get() {
        if (_hubspot != null) {
            return _hubspot!!
        }
        _hubspot = Builder(name = "Hubspot", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.832f, 8.611f)
                lineTo(16.318f, 14.252f)
                curveTo(15.495f, 15.279f, 15.0f, 16.581f, 15.0f, 18.0f)
                curveTo(15.0f, 19.552f, 15.594f, 20.96f, 16.561f, 22.025f)
                lineTo(13.516f, 25.07f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 25.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 29.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.93f, 26.484f)
                lineTo(18.139f, 23.275f)
                curveTo(18.139f, 23.276f, 18.14f, 23.275f, 18.141f, 23.275f)
                curveTo(18.991f, 23.737f, 19.964f, 24.0f, 21.0f, 24.0f)
                curveTo(24.314f, 24.0f, 27.0f, 21.314f, 27.0f, 18.0f)
                curveTo(27.0f, 15.028f, 24.837f, 12.567f, 22.0f, 12.09f)
                lineTo(22.0f, 8.73f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 8.73f)
                lineTo(20.0f, 12.09f)
                curveTo(19.221f, 12.221f, 18.496f, 12.502f, 17.85f, 12.902f)
                lineTo(9.957f, 6.955f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.5f, 4.0f)
                close()
                moveTo(21.0f, 15.0f)
                curveTo(22.654f, 15.0f, 24.0f, 16.346f, 24.0f, 18.0f)
                curveTo(24.0f, 19.654f, 22.654f, 21.0f, 21.0f, 21.0f)
                curveTo(19.346f, 21.0f, 18.0f, 19.654f, 18.0f, 18.0f)
                curveTo(18.0f, 16.346f, 19.346f, 15.0f, 21.0f, 15.0f)
                close()
            }
        }
        .build()
        return _hubspot!!
    }

private var _hubspot: ImageVector? = null
