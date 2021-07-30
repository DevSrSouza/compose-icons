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

public val SimpleIcons.Icloud: ImageVector
    get() {
        if (_icloud != null) {
            return _icloud!!
        }
        _icloud = Builder(name = "Icloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.762f, 4.29f)
                arcToRelative(6.51f, 6.51f, 0.0f, false, false, -5.669f, 3.332f)
                arcToRelative(3.571f, 3.571f, 0.0f, false, false, -1.558f, -0.36f)
                arcToRelative(3.571f, 3.571f, 0.0f, false, false, -3.516f, 3.0f)
                arcTo(4.918f, 4.918f, 0.0f, false, false, 0.0f, 14.796f)
                arcToRelative(4.918f, 4.918f, 0.0f, false, false, 4.92f, 4.914f)
                arcToRelative(4.93f, 4.93f, 0.0f, false, false, 0.617f, -0.045f)
                horizontalLineToRelative(14.42f)
                curveToRelative(2.305f, -0.272f, 4.041f, -2.258f, 4.043f, -4.589f)
                verticalLineToRelative(-0.009f)
                arcToRelative(4.594f, 4.594f, 0.0f, false, false, -3.727f, -4.508f)
                arcToRelative(6.51f, 6.51f, 0.0f, false, false, -6.511f, -6.27f)
                close()
            }
        }
        .build()
        return _icloud!!
    }

private var _icloud: ImageVector? = null
