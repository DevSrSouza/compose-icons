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
                curveTo(14.3555f, 3.0f, 13.0f, 4.3555f, 13.0f, 6.0f)
                lineTo(13.0f, 13.3438f)
                lineTo(4.5938f, 17.0938f)
                lineTo(4.0f, 17.3438f)
                lineTo(4.0f, 22.125f)
                lineTo(13.0f, 21.125f)
                lineTo(13.0f, 22.9688f)
                lineTo(10.4375f, 24.6875f)
                lineTo(10.0f, 24.9688f)
                lineTo(10.0f, 29.2188f)
                lineTo(11.1875f, 28.9688f)
                lineTo(16.0f, 28.0f)
                lineTo(20.8125f, 28.9688f)
                lineTo(22.0f, 29.2188f)
                lineTo(22.0f, 24.9688f)
                lineTo(21.5625f, 24.6875f)
                lineTo(19.0f, 22.9688f)
                lineTo(19.0f, 21.125f)
                lineTo(28.0f, 22.125f)
                lineTo(28.0f, 17.3438f)
                lineTo(27.4063f, 17.0938f)
                lineTo(19.0f, 13.3438f)
                lineTo(19.0f, 6.0f)
                curveTo(19.0f, 4.3555f, 17.6445f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(16.5664f, 5.0f, 17.0f, 5.4336f, 17.0f, 6.0f)
                lineTo(17.0f, 14.6563f)
                lineTo(17.5938f, 14.9063f)
                lineTo(26.0f, 18.6563f)
                lineTo(26.0f, 19.875f)
                lineTo(17.0f, 18.875f)
                lineTo(17.0f, 24.0625f)
                lineTo(17.4375f, 24.3438f)
                lineTo(20.0f, 26.0625f)
                lineTo(20.0f, 26.7813f)
                lineTo(16.1875f, 26.0313f)
                lineTo(16.0f, 25.9688f)
                lineTo(15.8125f, 26.0313f)
                lineTo(12.0f, 26.7813f)
                lineTo(12.0f, 26.0625f)
                lineTo(14.5625f, 24.3438f)
                lineTo(15.0f, 24.0625f)
                lineTo(15.0f, 18.875f)
                lineTo(6.0f, 19.875f)
                lineTo(6.0f, 18.6563f)
                lineTo(14.4063f, 14.9063f)
                lineTo(15.0f, 14.6563f)
                lineTo(15.0f, 6.0f)
                curveTo(15.0f, 5.4336f, 15.4336f, 5.0f, 16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _planeSolid!!
    }

private var _planeSolid: ImageVector? = null
