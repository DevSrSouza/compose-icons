package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoDeviantart: ImageVector
    get() {
        if (_logoDeviantart != null) {
            return _logoDeviantart!!
        }
        _logoDeviantart = Builder(name = "LogoDeviantart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.0f, 103.28f)
                lineToRelative(0.0f, -87.28f)
                lineToRelative(-0.03f, 0.0f)
                lineToRelative(-89.28f, 0.0f)
                lineToRelative(-8.9f, 8.78f)
                lineToRelative(-42.15f, 78.48f)
                lineToRelative(-13.25f, 8.74f)
                lineToRelative(-150.39f, 0.0f)
                lineToRelative(0.0f, 119.85f)
                lineToRelative(82.68f, 0.0f)
                lineToRelative(7.36f, 8.71f)
                lineToRelative(-90.04f, 168.16f)
                lineToRelative(0.0f, 87.28f)
                lineToRelative(0.02f, 0.0f)
                lineToRelative(89.28f, 0.0f)
                lineToRelative(8.91f, -8.79f)
                lineToRelative(42.14f, -78.48f)
                lineToRelative(13.26f, -8.73f)
                lineToRelative(150.39f, 0.0f)
                lineToRelative(0.0f, -119.87f)
                lineToRelative(-82.68f, 0.0f)
                lineToRelative(-7.36f, -8.75f)
                lineToRelative(90.04f, -168.1f)
                close()
            }
        }
        .build()
        return _logoDeviantart!!
    }

private var _logoDeviantart: ImageVector? = null
