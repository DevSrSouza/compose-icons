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

public val LineAwesomeIcons.Angular: ImageVector
    get() {
        if (_angular != null) {
            return _angular!!
        }
        _angular = Builder(name = "Angular", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.936f)
                lineTo(4.361f, 8.168f)
                lineTo(6.449f, 23.84f)
                lineTo(16.0f, 29.145f)
                lineTo(25.551f, 23.838f)
                lineTo(27.639f, 8.168f)
                lineTo(16.0f, 3.936f)
                close()
                moveTo(16.0f, 6.064f)
                lineTo(25.443f, 9.498f)
                lineTo(23.699f, 22.578f)
                lineTo(16.0f, 26.855f)
                lineTo(8.301f, 22.578f)
                lineTo(6.557f, 9.498f)
                lineTo(16.0f, 6.064f)
                close()
                moveTo(16.0f, 8.0f)
                lineTo(10.0f, 22.0f)
                lineTo(12.0f, 22.0f)
                lineTo(13.289f, 19.0f)
                lineTo(18.711f, 19.0f)
                lineTo(20.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(16.0f, 8.0f)
                close()
                moveTo(16.0f, 12.551f)
                lineTo(16.02f, 12.609f)
                lineTo(16.721f, 14.359f)
                lineTo(17.85f, 17.0f)
                lineTo(14.15f, 17.0f)
                lineTo(15.279f, 14.359f)
                lineTo(15.98f, 12.609f)
                lineTo(16.0f, 12.551f)
                close()
            }
        }
        .build()
        return _angular!!
    }

private var _angular: ImageVector? = null
