package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoWebComponent: ImageVector
    get() {
        if (_logoWebComponent != null) {
            return _logoWebComponent!!
        }
        _logoWebComponent = Builder(name = "LogoWebComponent", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 256.0f)
                lineToRelative(-120.0f, -208.0f)
                lineToRelative(-136.26f, 0.0f)
                lineToRelative(-43.84f, 76.0f)
                lineToRelative(136.21f, 0.0f)
                lineToRelative(76.15f, 132.0f)
                lineToRelative(-76.15f, 132.0f)
                lineToRelative(-136.21f, 0.0f)
                lineToRelative(43.84f, 76.0f)
                lineToRelative(136.26f, 0.0f)
                lineToRelative(120.0f, -208.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.9f, 388.0f)
                lineToRelative(-76.16f, -132.0f)
                lineToRelative(76.16f, -132.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(43.84f, -76.0f)
                lineToRelative(-87.74f, 0.0f)
                lineToRelative(-120.0f, 208.0f)
                lineToRelative(120.0f, 208.0f)
                lineToRelative(87.74f, 0.0f)
                lineToRelative(-43.84f, -76.0f)
                lineToRelative(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _logoWebComponent!!
    }

private var _logoWebComponent: ImageVector? = null
