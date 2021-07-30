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

public val SimpleIcons.Adobe: ImageVector
    get() {
        if (_adobe != null) {
            return _adobe!!
        }
        _adobe = Builder(name = "Adobe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.966f, 22.624f)
                lineToRelative(-1.69f, -4.281f)
                lineTo(8.122f, 18.343f)
                lineToRelative(3.892f, -9.144f)
                lineToRelative(5.662f, 13.425f)
                close()
                moveTo(8.884f, 1.376f)
                lineTo(0.0f, 1.376f)
                verticalLineToRelative(21.248f)
                close()
                moveTo(24.0f, 1.376f)
                horizontalLineToRelative(-8.884f)
                lineTo(24.0f, 22.624f)
                close()
            }
        }
        .build()
        return _adobe!!
    }

private var _adobe: ImageVector? = null
