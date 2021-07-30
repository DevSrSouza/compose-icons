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

public val SimpleIcons.Firebase: ImageVector
    get() {
        if (_firebase != null) {
            return _firebase!!
        }
        _firebase = Builder(name = "Firebase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.89f, 15.672f)
                lineTo(6.255f, 0.461f)
                arcTo(0.542f, 0.542f, 0.0f, false, true, 7.27f, 0.288f)
                lineToRelative(2.543f, 4.771f)
                close()
                moveTo(20.684f, 19.364f)
                lineToRelative(-2.25f, -14.0f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.919f, -0.295f)
                lineTo(3.316f, 19.365f)
                lineToRelative(7.856f, 4.427f)
                arcToRelative(1.621f, 1.621f, 0.0f, false, false, 1.588f, 0.0f)
                close()
                moveTo(14.3f, 7.147f)
                lineToRelative(-1.82f, -3.482f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, false, -0.96f, 0.0f)
                lineTo(3.53f, 17.984f)
                close()
            }
        }
        .build()
        return _firebase!!
    }

private var _firebase: ImageVector? = null
