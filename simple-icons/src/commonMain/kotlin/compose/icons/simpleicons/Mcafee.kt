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

public val SimpleIcons.Mcafee: ImageVector
    get() {
        if (_mcafee != null) {
            return _mcafee!!
        }
        _mcafee = Builder(name = "Mcafee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.8233f)
                lineTo(1.5793f, 0.0f)
                verticalLineToRelative(19.1767f)
                lineTo(12.0f, 24.0f)
                lineToRelative(10.4207f, -4.8233f)
                lineTo(22.4207f, 0.0f)
                close()
                moveTo(18.172f, 16.4493f)
                lineToRelative(-6.143f, 2.8428f)
                lineToRelative(-6.1438f, -2.8429f)
                lineTo(5.8852f, 6.6894f)
                lineToRelative(6.1439f, 2.8418f)
                lineToRelative(6.1429f, -2.8418f)
                close()
            }
        }
        .build()
        return _mcafee!!
    }

private var _mcafee: ImageVector? = null
