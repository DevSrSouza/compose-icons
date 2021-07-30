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

public val LineAwesomeIcons.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                lineTo(2.0f, 21.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 26.0938f)
                lineTo(7.625f, 24.7813f)
                lineTo(12.3438f, 21.0f)
                lineTo(22.0f, 21.0f)
                lineTo(22.0f, 5.0f)
                close()
                moveTo(4.0f, 7.0f)
                lineTo(20.0f, 7.0f)
                lineTo(20.0f, 19.0f)
                lineTo(11.6563f, 19.0f)
                lineTo(11.375f, 19.2188f)
                lineTo(8.0f, 21.9063f)
                lineTo(8.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                close()
                moveTo(24.0f, 9.0f)
                lineTo(24.0f, 11.0f)
                lineTo(28.0f, 11.0f)
                lineTo(28.0f, 23.0f)
                lineTo(24.0f, 23.0f)
                lineTo(24.0f, 25.9063f)
                lineTo(20.3438f, 23.0f)
                lineTo(12.8438f, 23.0f)
                lineTo(10.3438f, 25.0f)
                lineTo(19.6563f, 25.0f)
                lineTo(26.0f, 30.0938f)
                lineTo(26.0f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 9.0f)
                close()
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
