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

public val IonIcons.LogoTwitch: ImageVector
    get() {
        if (_logoTwitch != null) {
            return _logoTwitch!!
        }
        _logoTwitch = Builder(name = "LogoTwitch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 32.0f)
                lineTo(48.0f, 112.0f)
                verticalLineTo(416.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(64.0f)
                lineToRelative(64.0f, -64.0f)
                horizontalLineToRelative(80.0f)
                lineTo(464.0f, 304.0f)
                verticalLineTo(32.0f)
                close()
                moveTo(416.0f, 288.0f)
                lineToRelative(-64.0f, 64.0f)
                horizontalLineTo(256.0f)
                lineToRelative(-64.0f, 64.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(80.0f)
                horizontalLineTo(416.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 143.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(129.0f)
                horizontalLineToRelative(-48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 143.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(129.0f)
                horizontalLineToRelative(-48.0f)
                close()
            }
        }
        .build()
        return _logoTwitch!!
    }

private var _logoTwitch: ImageVector? = null
