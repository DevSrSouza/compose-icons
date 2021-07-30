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

public val SimpleIcons.Jamboard: ImageVector
    get() {
        if (_jamboard != null) {
            return _jamboard!!
        }
        _jamboard = Builder(name = "Jamboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.143f, 0.0f)
                verticalLineToRelative(7.877f)
                horizontalLineToRelative(7.783f)
                lineTo(19.926f, 0.0f)
                close()
                moveTo(12.143f, 8.155f)
                verticalLineToRelative(7.784f)
                horizontalLineToRelative(7.783f)
                lineTo(19.926f, 8.155f)
                close()
                moveTo(11.863f, 8.16f)
                arcToRelative(7.926f, 7.923f, 0.0f, false, false, -7.789f, 7.917f)
                arcTo(7.926f, 7.923f, 0.0f, false, false, 12.0f, 24.0f)
                arcToRelative(7.926f, 7.923f, 0.0f, false, false, 7.918f, -7.78f)
                horizontalLineToRelative(-8.056f)
                close()
            }
        }
        .build()
        return _jamboard!!
    }

private var _jamboard: ImageVector? = null
