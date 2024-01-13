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

public val SimpleIcons.Toggltrack: ImageVector
    get() {
        if (_toggltrack != null) {
            return _toggltrack!!
        }
        _toggltrack = Builder(name = "Toggltrack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(11.117f, 4.322f)
                horizontalLineToRelative(1.766f)
                verticalLineToRelative(8.757f)
                horizontalLineToRelative(-1.766f)
                close()
                moveTo(10.377f, 6.375f)
                verticalLineToRelative(1.789f)
                arcToRelative(4.448f, 4.448f, 0.0f, true, false, 3.247f, 0.0f)
                lineTo(13.624f, 6.375f)
                arcToRelative(6.146f, 6.146f, 0.0f, true, true, -5.669f, 10.552f)
                arcToRelative(6.145f, 6.145f, 0.0f, false, true, 2.421f, -10.552f)
                close()
            }
        }
        .build()
        return _toggltrack!!
    }

private var _toggltrack: ImageVector? = null
