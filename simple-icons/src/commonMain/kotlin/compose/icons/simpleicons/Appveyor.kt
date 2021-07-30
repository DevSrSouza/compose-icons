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

public val SimpleIcons.Appveyor: ImageVector
    get() {
        if (_appveyor != null) {
            return _appveyor!!
        }
        _appveyor = Builder(name = "Appveyor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(18.6f, 0.0f, 24.0f, 5.4f, 24.0f, 12.0f)
                curveTo(24.0f, 18.6f, 18.6f, 24.0f, 12.0f, 24.0f)
                curveTo(5.4f, 24.0f, 0.0f, 18.6f, 0.0f, 12.0f)
                curveTo(0.0f, 5.4f, 5.4f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(14.94f, 14.34f)
                curveTo(16.26f, 12.66f, 16.08f, 10.26f, 14.4f, 9.0f)
                curveTo(12.78f, 7.74f, 10.38f, 8.04f, 9.0f, 9.72f)
                curveTo(7.68f, 11.4f, 7.86f, 13.8f, 9.54f, 15.06f)
                curveToRelative(1.68f, 1.26f, 4.08f, 0.96f, 5.4f, -0.72f)
                close()
                moveTo(8.52f, 22.14f)
                curveToRelative(0.72f, 0.3f, 2.28f, 0.6f, 3.06f, 0.6f)
                lineToRelative(5.22f, -7.56f)
                curveToRelative(1.68f, -2.52f, 1.26f, -5.94f, -1.08f, -7.8f)
                curveToRelative(-2.1f, -1.68f, -5.04f, -1.62f, -7.14f, 0.0f)
                lineToRelative(-7.26f, 5.58f)
                curveToRelative(0.18f, 1.92f, 0.72f, 2.88f, 0.72f, 2.94f)
                lineToRelative(4.14f, -4.5f)
                curveToRelative(-0.3f, 1.98f, 0.42f, 4.02f, 2.1f, 5.28f)
                curveToRelative(1.44f, 1.14f, 3.18f, 1.44f, 4.86f, 1.08f)
                close()
            }
        }
        .build()
        return _appveyor!!
    }

private var _appveyor: ImageVector? = null
