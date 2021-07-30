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

public val LineAwesomeIcons.Discourse: ImageVector
    get() {
        if (_discourse != null) {
            return _discourse!!
        }
        _discourse = Builder(name = "Discourse", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1094f, 3.0f)
                curveTo(8.9944f, 3.0f, 3.0f, 8.7164f, 3.0f, 15.7734f)
                curveTo(3.0f, 15.9994f, 3.0059f, 29.0f, 3.0059f, 29.0f)
                lineTo(16.1094f, 28.9883f)
                curveTo(23.2304f, 28.9883f, 29.0f, 23.0511f, 29.0f, 15.9941f)
                curveTo(29.0f, 8.9371f, 23.2304f, 3.0f, 16.1094f, 3.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(20.418f, 8.0f, 24.0f, 11.582f, 24.0f, 16.0f)
                curveTo(24.0f, 20.418f, 20.418f, 24.0f, 16.0f, 24.0f)
                curveTo(14.58f, 24.0f, 13.2478f, 23.6256f, 12.0918f, 22.9766f)
                lineTo(8.0f, 24.0f)
                lineTo(9.1211f, 20.0703f)
                curveTo(8.4131f, 18.8773f, 8.0f, 17.489f, 8.0f, 16.0f)
                curveTo(8.0f, 11.582f, 11.582f, 8.0f, 16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _discourse!!
    }

private var _discourse: ImageVector? = null
