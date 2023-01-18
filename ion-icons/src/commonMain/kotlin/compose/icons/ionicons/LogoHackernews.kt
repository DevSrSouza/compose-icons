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

public val IonIcons.LogoHackernews: ImageVector
    get() {
        if (_logoHackernews != null) {
            return _logoHackernews!!
        }
        _logoHackernews = Builder(name = "LogoHackernews", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                verticalLineTo(480.0f)
                horizontalLineTo(480.0f)
                verticalLineTo(32.0f)
                close()
                moveTo(281.67f, 282.83f)
                verticalLineToRelative(84.0f)
                horizontalLineTo(235.0f)
                verticalLineToRelative(-84.0f)
                lineToRelative(-77.0f, -140.0f)
                horizontalLineTo(213.0f)
                lineToRelative(46.32f, 97.54f)
                lineToRelative(44.33f, -97.54f)
                horizontalLineToRelative(52.73f)
                close()
            }
        }
        .build()
        return _logoHackernews!!
    }

private var _logoHackernews: ImageVector? = null
