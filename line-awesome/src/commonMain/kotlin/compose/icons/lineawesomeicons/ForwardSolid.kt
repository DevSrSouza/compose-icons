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

public val LineAwesomeIcons.ForwardSolid: ImageVector
    get() {
        if (_forwardSolid != null) {
            return _forwardSolid!!
        }
        _forwardSolid = Builder(name = "ForwardSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                lineTo(15.0f, 12.375f)
                lineTo(6.594f, 6.188f)
                lineTo(5.0f, 5.031f)
                lineTo(5.0f, 26.969f)
                lineTo(6.594f, 25.813f)
                lineTo(15.0f, 19.625f)
                lineTo(15.0f, 27.0f)
                lineTo(16.594f, 25.813f)
                lineTo(28.594f, 16.813f)
                lineTo(29.656f, 16.0f)
                lineTo(28.594f, 15.188f)
                lineTo(16.594f, 6.188f)
                close()
                moveTo(7.0f, 8.969f)
                lineTo(15.406f, 15.156f)
                lineTo(16.531f, 16.0f)
                lineTo(15.406f, 16.844f)
                lineTo(7.0f, 23.031f)
                close()
                moveTo(17.0f, 9.0f)
                lineTo(26.313f, 16.0f)
                lineTo(17.0f, 23.0f)
                close()
            }
        }
        .build()
        return _forwardSolid!!
    }

private var _forwardSolid: ImageVector? = null
