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

public val LineAwesomeIcons.ExpandArrowsAltSolid: ImageVector
    get() {
        if (_expandArrowsAltSolid != null) {
            return _expandArrowsAltSolid!!
        }
        _expandArrowsAltSolid = Builder(name = "ExpandArrowsAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                lineTo(4.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                lineTo(6.0f, 7.438f)
                lineTo(14.563f, 16.0f)
                lineTo(6.0f, 24.563f)
                lineTo(6.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                lineTo(4.0f, 28.0f)
                lineTo(13.0f, 28.0f)
                lineTo(13.0f, 26.0f)
                lineTo(7.438f, 26.0f)
                lineTo(16.0f, 17.438f)
                lineTo(24.563f, 26.0f)
                lineTo(19.0f, 26.0f)
                lineTo(19.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                lineTo(28.0f, 19.0f)
                lineTo(26.0f, 19.0f)
                lineTo(26.0f, 24.563f)
                lineTo(17.438f, 16.0f)
                lineTo(26.0f, 7.438f)
                lineTo(26.0f, 13.0f)
                lineTo(28.0f, 13.0f)
                lineTo(28.0f, 4.0f)
                lineTo(19.0f, 4.0f)
                lineTo(19.0f, 6.0f)
                lineTo(24.563f, 6.0f)
                lineTo(16.0f, 14.563f)
                lineTo(7.438f, 6.0f)
                lineTo(13.0f, 6.0f)
                lineTo(13.0f, 4.0f)
                close()
            }
        }
        .build()
        return _expandArrowsAltSolid!!
    }

private var _expandArrowsAltSolid: ImageVector? = null
