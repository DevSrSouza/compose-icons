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

public val SimpleIcons.Keras: ImageVector
    get() {
        if (_keras != null) {
            return _keras!!
        }
        _keras = Builder(name = "Keras", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(0.0f)
                close()
                moveTo(8.45f, 5.16f)
                lineToRelative(0.2f, 0.17f)
                verticalLineToRelative(6.24f)
                lineToRelative(6.46f, -6.45f)
                horizontalLineToRelative(1.96f)
                lineToRelative(0.2f, 0.4f)
                lineToRelative(-5.14f, 5.1f)
                lineToRelative(5.47f, 7.94f)
                lineToRelative(-0.2f, 0.3f)
                horizontalLineToRelative(-1.94f)
                lineToRelative(-4.65f, -6.88f)
                lineToRelative(-2.16f, 2.08f)
                verticalLineToRelative(4.6f)
                lineToRelative(-0.19f, 0.2f)
                horizontalLineTo(7.0f)
                lineToRelative(-0.2f, -0.2f)
                verticalLineTo(5.33f)
                lineToRelative(0.17f, -0.17f)
                horizontalLineToRelative(1.48f)
                close()
            }
        }
        .build()
        return _keras!!
    }

private var _keras: ImageVector? = null
