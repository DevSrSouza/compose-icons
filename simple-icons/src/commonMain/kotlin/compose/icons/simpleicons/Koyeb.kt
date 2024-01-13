package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Koyeb: ImageVector
    get() {
        if (_koyeb != null) {
            return _koyeb!!
        }
        _koyeb = Builder(name = "Koyeb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.822f)
                lineTo(0.0f, 7.044f)
                lineTo(11.985f, 0.115f)
                lineTo(24.0f, 7.037f)
                verticalLineToRelative(5.77f)
                lineTo(11.992f, 5.892f)
                close()
                moveTo(11.985f, 13.936f)
                lineTo(1.92f, 19.759f)
                lineTo(0.0f, 18.645f)
                verticalLineToRelative(-3.557f)
                lineToRelative(11.985f, -6.93f)
                lineTo(24.0f, 15.089f)
                verticalLineToRelative(3.542f)
                lineToRelative(-1.92f, 1.13f)
                close()
                moveTo(8.957f, 23.885f)
                lineTo(3.95f, 21.004f)
                lineToRelative(8.036f, -4.656f)
                lineToRelative(8.066f, 4.656f)
                lineToRelative(-5.009f, 2.88f)
                lineToRelative(-3.05f, -1.759f)
                close()
            }
        }
        .build()
        return _koyeb!!
    }

private var _koyeb: ImageVector? = null
