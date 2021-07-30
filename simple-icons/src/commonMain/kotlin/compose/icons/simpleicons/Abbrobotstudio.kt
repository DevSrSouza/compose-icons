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

public val SimpleIcons.Abbrobotstudio: ImageVector
    get() {
        if (_abbrobotstudio != null) {
            return _abbrobotstudio!!
        }
        _abbrobotstudio = Builder(name = "Abbrobotstudio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.999f, 12.465f)
                arcToRelative(9.601f, 9.601f, 0.0f, false, true, -19.203f, 0.0f)
                horizontalLineToRelative(1.07f)
                arcToRelative(8.53f, 8.53f, 0.0f, true, false, 8.533f, -8.53f)
                verticalLineToRelative(-1.07f)
                arcTo(9.6f, 9.6f, 0.0f, false, true, 24.0f, 12.463f)
                close()
                moveTo(14.399f, 9.265f)
                arcToRelative(3.2f, 3.2f, 0.0f, true, false, 3.2f, 3.2f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -3.2f, -3.2f)
                close()
                moveTo(12.399f, 9.265f)
                lineToRelative(-0.6f, -6.672f)
                lineToRelative(-2.462f, 1.92f)
                lineToRelative(-1.46f, -1.44f)
                arcToRelative(4.67f, 4.67f, 0.0f, false, false, -5.62f, -0.37f)
                lineToRelative(-2.02f, 1.3f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.15f, 0.74f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.74f, 0.15f)
                lineToRelative(2.0f, -1.31f)
                arcToRelative(3.64f, 3.64f, 0.0f, false, true, 4.29f, 0.22f)
                lineToRelative(1.37f, 1.38f)
                lineToRelative(-2.29f, 1.821f)
                close()
            }
        }
        .build()
        return _abbrobotstudio!!
    }

private var _abbrobotstudio: ImageVector? = null
