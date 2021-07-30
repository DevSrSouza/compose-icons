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

public val LineAwesomeIcons.RulerCombinedSolid: ImageVector
    get() {
        if (_rulerCombinedSolid != null) {
            return _rulerCombinedSolid!!
        }
        _rulerCombinedSolid = Builder(name = "RulerCombinedSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                lineTo(4.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                lineTo(28.0f, 19.0f)
                lineTo(13.0f, 19.0f)
                lineTo(13.0f, 18.0f)
                lineTo(13.0f, 16.0f)
                lineTo(13.0f, 14.0f)
                lineTo(13.0f, 12.0f)
                lineTo(13.0f, 10.0f)
                lineTo(13.0f, 8.0f)
                lineTo(13.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(6.0f, 6.0f)
                lineTo(11.0f, 6.0f)
                lineTo(11.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 10.0f)
                lineTo(11.0f, 10.0f)
                lineTo(11.0f, 12.0f)
                lineTo(8.0f, 12.0f)
                lineTo(8.0f, 14.0f)
                lineTo(11.0f, 14.0f)
                lineTo(11.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 18.0f)
                lineTo(11.0f, 18.0f)
                lineTo(11.0f, 19.5859f)
                lineTo(6.0f, 24.5859f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(12.4141f, 21.0f)
                lineTo(14.0f, 21.0f)
                lineTo(14.0f, 24.0f)
                lineTo(16.0f, 24.0f)
                lineTo(16.0f, 21.0f)
                lineTo(18.0f, 21.0f)
                lineTo(18.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                lineTo(20.0f, 21.0f)
                lineTo(22.0f, 21.0f)
                lineTo(22.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 21.0f)
                lineTo(26.0f, 21.0f)
                lineTo(26.0f, 26.0f)
                lineTo(7.4141f, 26.0f)
                lineTo(12.4141f, 21.0f)
                close()
            }
        }
        .build()
        return _rulerCombinedSolid!!
    }

private var _rulerCombinedSolid: ImageVector? = null
