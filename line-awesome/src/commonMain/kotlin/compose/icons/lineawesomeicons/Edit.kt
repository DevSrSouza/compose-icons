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

public val LineAwesomeIcons.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.0f, 4.031f)
                curveTo(24.234f, 4.031f, 23.484f, 4.328f, 22.906f, 4.906f)
                lineTo(13.0f, 14.781f)
                lineTo(12.781f, 15.0f)
                lineTo(12.719f, 15.313f)
                lineTo(12.031f, 18.813f)
                lineTo(11.719f, 20.281f)
                lineTo(13.188f, 19.969f)
                lineTo(16.688f, 19.281f)
                lineTo(17.0f, 19.219f)
                lineTo(17.219f, 19.0f)
                lineTo(27.094f, 9.094f)
                curveTo(28.246f, 7.941f, 28.246f, 6.059f, 27.094f, 4.906f)
                curveTo(26.516f, 4.328f, 25.766f, 4.031f, 25.0f, 4.031f)
                close()
                moveTo(25.0f, 5.969f)
                curveTo(25.234f, 5.969f, 25.465f, 6.09f, 25.688f, 6.313f)
                curveTo(26.133f, 6.758f, 26.133f, 7.242f, 25.688f, 7.688f)
                lineTo(16.0f, 17.375f)
                lineTo(14.281f, 17.719f)
                lineTo(14.625f, 16.0f)
                lineTo(24.313f, 6.313f)
                curveTo(24.535f, 6.09f, 24.766f, 5.969f, 25.0f, 5.969f)
                close()
                moveTo(4.0f, 8.0f)
                lineTo(4.0f, 28.0f)
                lineTo(24.0f, 28.0f)
                lineTo(24.0f, 14.813f)
                lineTo(22.0f, 16.813f)
                lineTo(22.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 10.0f)
                lineTo(15.188f, 10.0f)
                lineTo(17.188f, 8.0f)
                close()
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
