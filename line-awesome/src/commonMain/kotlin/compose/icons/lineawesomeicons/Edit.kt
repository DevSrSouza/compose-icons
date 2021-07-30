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
                moveTo(25.0f, 4.0313f)
                curveTo(24.2344f, 4.0313f, 23.4844f, 4.3281f, 22.9063f, 4.9063f)
                lineTo(13.0f, 14.7813f)
                lineTo(12.7813f, 15.0f)
                lineTo(12.7188f, 15.3125f)
                lineTo(12.0313f, 18.8125f)
                lineTo(11.7188f, 20.2813f)
                lineTo(13.1875f, 19.9688f)
                lineTo(16.6875f, 19.2813f)
                lineTo(17.0f, 19.2188f)
                lineTo(17.2188f, 19.0f)
                lineTo(27.0938f, 9.0938f)
                curveTo(28.2461f, 7.9414f, 28.2461f, 6.0586f, 27.0938f, 4.9063f)
                curveTo(26.5156f, 4.3281f, 25.7656f, 4.0313f, 25.0f, 4.0313f)
                close()
                moveTo(25.0f, 5.9688f)
                curveTo(25.2344f, 5.9688f, 25.4648f, 6.0898f, 25.6875f, 6.3125f)
                curveTo(26.1328f, 6.7578f, 26.1328f, 7.2422f, 25.6875f, 7.6875f)
                lineTo(16.0f, 17.375f)
                lineTo(14.2813f, 17.7188f)
                lineTo(14.625f, 16.0f)
                lineTo(24.3125f, 6.3125f)
                curveTo(24.5352f, 6.0898f, 24.7656f, 5.9688f, 25.0f, 5.9688f)
                close()
                moveTo(4.0f, 8.0f)
                lineTo(4.0f, 28.0f)
                lineTo(24.0f, 28.0f)
                lineTo(24.0f, 14.8125f)
                lineTo(22.0f, 16.8125f)
                lineTo(22.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 10.0f)
                lineTo(15.1875f, 10.0f)
                lineTo(17.1875f, 8.0f)
                close()
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
