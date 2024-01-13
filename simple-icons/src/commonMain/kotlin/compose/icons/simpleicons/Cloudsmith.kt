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

public val SimpleIcons.Cloudsmith: ImageVector
    get() {
        if (_cloudsmith != null) {
            return _cloudsmith!!
        }
        _cloudsmith = Builder(name = "Cloudsmith", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.667f)
                verticalLineToRelative(2.667f)
                lineTo(13.333f, 24.0f)
                horizontalLineToRelative(-2.666f)
                lineTo(0.0f, 13.334f)
                verticalLineToRelative(-2.667f)
                lineTo(10.667f, 0.0f)
                horizontalLineToRelative(2.666f)
                lineTo(24.0f, 10.667f)
                close()
                moveTo(12.0f, 17.536f)
                arcToRelative(5.535f, 5.535f, 0.0f, true, false, 0.0f, -11.07f)
                arcToRelative(5.535f, 5.535f, 0.0f, false, false, 0.0f, 11.07f)
                close()
            }
        }
        .build()
        return _cloudsmith!!
    }

private var _cloudsmith: ImageVector? = null
