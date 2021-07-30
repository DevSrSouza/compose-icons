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

public val SimpleIcons.Smugmug: ImageVector
    get() {
        if (_smugmug != null) {
            return _smugmug!!
        }
        _smugmug = Builder(name = "Smugmug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.31f, 0.0f)
                lineToRelative(-0.35f, 0.01f)
                curveToRelative(-1.55f, 0.13f, -2.46f, 1.2f, -2.6f, 2.28f)
                curveToRelative(-0.15f, 1.2f, 0.65f, 2.4f, 2.58f, 2.28f)
                curveToRelative(2.15f, -0.12f, 3.09f, -1.2f, 3.1f, -2.28f)
                curveToRelative(0.02f, -1.15f, -1.0f, -2.28f, -2.73f, -2.29f)
                close()
                moveTo(7.21f, 0.34f)
                arcTo(2.66f, 2.66f, 0.0f, false, false, 4.56f, 2.6f)
                curveTo(4.41f, 3.73f, 5.12f, 4.87f, 7.0f, 4.85f)
                curveToRelative(2.23f, -0.04f, 3.31f, -1.37f, 3.16f, -2.57f)
                curveToRelative(-0.12f, -1.0f, -1.09f, -1.92f, -2.94f, -1.94f)
                close()
                moveTo(19.56f, 9.05f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.4f, 0.02f)
                curveToRelative(-5.28f, 0.54f, -5.54f, 0.6f, -15.26f, 0.82f)
                curveTo(-0.2f, 9.9f, 0.62f, 24.0f, 9.38f, 24.0f)
                curveToRelative(8.2f, 0.0f, 18.12f, -15.15f, 10.18f, -14.95f)
                close()
                moveTo(18.46f, 11.75f)
                curveToRelative(3.18f, -0.07f, -2.9f, 9.53f, -8.8f, 9.56f)
                curveToRelative(-7.46f, 0.0f, -6.44f, -8.8f, -5.18f, -8.85f)
                curveToRelative(8.67f, -0.35f, 10.88f, -0.64f, 13.98f, -0.71f)
                close()
            }
        }
        .build()
        return _smugmug!!
    }

private var _smugmug: ImageVector? = null
