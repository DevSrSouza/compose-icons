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

public val SimpleIcons.Ludwig: ImageVector
    get() {
        if (_ludwig != null) {
            return _ludwig!!
        }
        _ludwig = Builder(name = "Ludwig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(13.714f, 10.286f)
                lineTo(13.714f, 3.429f)
                horizontalLineToRelative(-3.428f)
                verticalLineToRelative(10.285f)
                lineTo(20.57f, 13.714f)
                lineTo(20.57f, 3.43f)
                horizontalLineToRelative(-3.428f)
                verticalLineToRelative(6.857f)
                horizontalLineToRelative(-3.429f)
                close()
                moveTo(6.857f, 17.143f)
                lineTo(6.857f, 3.429f)
                lineTo(3.43f, 3.429f)
                lineTo(3.43f, 20.57f)
                horizontalLineToRelative(17.14f)
                verticalLineToRelative(-3.428f)
                lineTo(6.857f, 17.142f)
                close()
            }
        }
        .build()
        return _ludwig!!
    }

private var _ludwig: ImageVector? = null
