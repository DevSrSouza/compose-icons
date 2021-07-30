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

public val SimpleIcons.Zalando: ImageVector
    get() {
        if (_zalando != null) {
            return _zalando!!
        }
        _zalando = Builder(name = "Zalando", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.27f, 24.0f)
                curveToRelative(-0.88f, 0.0f, -1.36f, -0.2f, -1.62f, -0.36f)
                curveToRelative(-0.36f, -0.21f, -1.02f, -0.75f, -1.62f, -2.33f)
                arcTo(27.06f, 27.06f, 0.0f, false, true, 0.49f, 12.0f)
                curveToRelative(0.02f, -3.66f, 0.59f, -6.76f, 1.54f, -9.3f)
                curveTo(2.63f, 1.1f, 3.29f, 0.56f, 3.65f, 0.35f)
                curveTo(3.91f, 0.21f, 4.39f, 0.0f, 5.27f, 0.0f)
                curveToRelative(0.33f, 0.0f, 0.72f, 0.03f, 1.18f, 0.1f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, 8.7f, 3.3f)
                horizontalLineToRelative(0.01f)
                arcToRelative(26.4f, 26.4f, 0.0f, false, true, 7.16f, 6.01f)
                curveToRelative(1.06f, 1.32f, 1.19f, 2.17f, 1.19f, 2.59f)
                curveToRelative(0.0f, 0.42f, -0.13f, 1.27f, -1.19f, 2.59f)
                arcToRelative(26.4f, 26.4f, 0.0f, false, true, -7.16f, 6.0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(26.03f, 26.03f, 0.0f, false, true, -8.7f, 3.3f)
                curveToRelative(-0.46f, 0.08f, -0.85f, 0.11f, -1.18f, 0.11f)
                close()
            }
        }
        .build()
        return _zalando!!
    }

private var _zalando: ImageVector? = null
