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

public val LineAwesomeIcons.PlaneSolid: ImageVector
    get() {
        if (_planeSolid != null) {
            return _planeSolid!!
        }
        _planeSolid = Builder(name = "PlaneSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(14.355f, 3.0f, 13.0f, 4.355f, 13.0f, 6.0f)
                lineTo(13.0f, 13.344f)
                lineTo(4.594f, 17.094f)
                lineTo(4.0f, 17.344f)
                lineTo(4.0f, 22.125f)
                lineTo(13.0f, 21.125f)
                lineTo(13.0f, 22.969f)
                lineTo(10.438f, 24.688f)
                lineTo(10.0f, 24.969f)
                lineTo(10.0f, 29.219f)
                lineTo(11.188f, 28.969f)
                lineTo(16.0f, 28.0f)
                lineTo(20.813f, 28.969f)
                lineTo(22.0f, 29.219f)
                lineTo(22.0f, 24.969f)
                lineTo(21.563f, 24.688f)
                lineTo(19.0f, 22.969f)
                lineTo(19.0f, 21.125f)
                lineTo(28.0f, 22.125f)
                lineTo(28.0f, 17.344f)
                lineTo(27.406f, 17.094f)
                lineTo(19.0f, 13.344f)
                lineTo(19.0f, 6.0f)
                curveTo(19.0f, 4.355f, 17.645f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(16.566f, 5.0f, 17.0f, 5.434f, 17.0f, 6.0f)
                lineTo(17.0f, 14.656f)
                lineTo(17.594f, 14.906f)
                lineTo(26.0f, 18.656f)
                lineTo(26.0f, 19.875f)
                lineTo(17.0f, 18.875f)
                lineTo(17.0f, 24.063f)
                lineTo(17.438f, 24.344f)
                lineTo(20.0f, 26.063f)
                lineTo(20.0f, 26.781f)
                lineTo(16.188f, 26.031f)
                lineTo(16.0f, 25.969f)
                lineTo(15.813f, 26.031f)
                lineTo(12.0f, 26.781f)
                lineTo(12.0f, 26.063f)
                lineTo(14.563f, 24.344f)
                lineTo(15.0f, 24.063f)
                lineTo(15.0f, 18.875f)
                lineTo(6.0f, 19.875f)
                lineTo(6.0f, 18.656f)
                lineTo(14.406f, 14.906f)
                lineTo(15.0f, 14.656f)
                lineTo(15.0f, 6.0f)
                curveTo(15.0f, 5.434f, 15.434f, 5.0f, 16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _planeSolid!!
    }

private var _planeSolid: ImageVector? = null
