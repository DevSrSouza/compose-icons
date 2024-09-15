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

public val LineAwesomeIcons.Readme: ImageVector
    get() {
        if (_readme != null) {
            return _readme!!
        }
        _readme = Builder(name = "Readme", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(3.346f, 6.0f, 2.0f, 7.346f, 2.0f, 9.0f)
                lineTo(2.0f, 21.0f)
                curveTo(2.0f, 22.654f, 3.346f, 24.0f, 5.0f, 24.0f)
                lineTo(11.184f, 23.98f)
                curveTo(12.174f, 23.98f, 13.133f, 24.291f, 13.957f, 24.84f)
                lineTo(16.0f, 26.201f)
                lineTo(18.043f, 24.84f)
                curveTo(18.867f, 24.291f, 19.826f, 24.0f, 20.816f, 24.0f)
                lineTo(27.0f, 24.0f)
                curveTo(28.654f, 24.0f, 30.0f, 22.654f, 30.0f, 21.0f)
                lineTo(30.0f, 9.0f)
                curveTo(30.0f, 7.346f, 28.654f, 6.0f, 27.0f, 6.0f)
                lineTo(20.816f, 6.0f)
                curveTo(19.43f, 6.0f, 18.087f, 6.408f, 16.934f, 7.176f)
                lineTo(16.0f, 7.799f)
                lineTo(15.066f, 7.176f)
                curveTo(13.912f, 6.407f, 12.571f, 6.0f, 11.184f, 6.0f)
                lineTo(5.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(11.184f, 8.0f)
                curveTo(12.174f, 8.0f, 13.133f, 8.291f, 13.957f, 8.84f)
                lineTo(16.0f, 10.201f)
                lineTo(18.043f, 8.84f)
                curveTo(18.867f, 8.291f, 19.826f, 8.0f, 20.816f, 8.0f)
                lineTo(27.0f, 8.0f)
                curveTo(27.552f, 8.0f, 28.0f, 8.449f, 28.0f, 9.0f)
                lineTo(28.0f, 21.0f)
                curveTo(28.0f, 21.551f, 27.552f, 22.0f, 27.0f, 22.0f)
                lineTo(20.816f, 22.0f)
                curveTo(19.43f, 22.0f, 18.087f, 22.408f, 16.934f, 23.176f)
                lineTo(16.0f, 23.799f)
                lineTo(15.066f, 23.176f)
                curveTo(13.912f, 22.407f, 12.571f, 22.0f, 11.184f, 22.0f)
                lineTo(5.0f, 22.0f)
                curveTo(4.448f, 22.0f, 4.0f, 21.551f, 4.0f, 21.0f)
                lineTo(4.0f, 9.0f)
                curveTo(4.0f, 8.449f, 4.448f, 8.0f, 5.0f, 8.0f)
                close()
                moveTo(6.0f, 12.0f)
                lineTo(6.0f, 14.0f)
                lineTo(14.0f, 14.0f)
                lineTo(14.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                close()
                moveTo(18.0f, 12.0f)
                lineTo(18.0f, 14.0f)
                lineTo(26.0f, 14.0f)
                lineTo(26.0f, 12.0f)
                lineTo(18.0f, 12.0f)
                close()
                moveTo(6.0f, 16.0f)
                lineTo(6.0f, 18.0f)
                lineTo(14.0f, 18.0f)
                lineTo(14.0f, 16.0f)
                lineTo(6.0f, 16.0f)
                close()
                moveTo(18.0f, 16.0f)
                lineTo(18.0f, 18.0f)
                lineTo(26.0f, 18.0f)
                lineTo(26.0f, 16.0f)
                lineTo(18.0f, 16.0f)
                close()
            }
        }
        .build()
        return _readme!!
    }

private var _readme: ImageVector? = null
