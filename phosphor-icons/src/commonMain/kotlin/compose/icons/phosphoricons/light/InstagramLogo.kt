package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) {
            return _instagramLogo!!
        }
        _instagramLogo = Builder(name = "InstagramLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 82.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 46.0f, 46.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 128.0f, 82.0f)
                close()
                moveTo(128.0f, 162.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 128.0f, 162.0f)
                close()
                moveTo(172.0f, 30.0f)
                lineTo(84.0f, 30.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 30.0f, 84.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 54.0f, 54.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 54.0f, -54.0f)
                lineTo(226.0f, 84.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 172.0f, 30.0f)
                close()
                moveTo(214.0f, 172.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, 42.0f)
                lineTo(84.0f, 214.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, -42.0f)
                lineTo(42.0f, 84.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 84.0f, 42.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, 42.0f)
                close()
                moveTo(190.0f, 76.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 190.0f, 76.0f)
                close()
            }
        }
        .build()
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null
