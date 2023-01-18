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

public val IonIcons.LogoInstagram: ImageVector
    get() {
        if (_logoInstagram != null) {
            return _logoInstagram!!
        }
        _logoInstagram = Builder(name = "LogoInstagram", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(349.33f, 69.33f)
                arcToRelative(93.62f, 93.62f, 0.0f, false, true, 93.34f, 93.34f)
                verticalLineTo(349.33f)
                arcToRelative(93.62f, 93.62f, 0.0f, false, true, -93.34f, 93.34f)
                horizontalLineTo(162.67f)
                arcToRelative(93.62f, 93.62f, 0.0f, false, true, -93.34f, -93.34f)
                verticalLineTo(162.67f)
                arcToRelative(93.62f, 93.62f, 0.0f, false, true, 93.34f, -93.34f)
                horizontalLineTo(349.33f)
                moveToRelative(0.0f, -37.33f)
                horizontalLineTo(162.67f)
                curveTo(90.8f, 32.0f, 32.0f, 90.8f, 32.0f, 162.67f)
                verticalLineTo(349.33f)
                curveTo(32.0f, 421.2f, 90.8f, 480.0f, 162.67f, 480.0f)
                horizontalLineTo(349.33f)
                curveTo(421.2f, 480.0f, 480.0f, 421.2f, 480.0f, 349.33f)
                verticalLineTo(162.67f)
                curveTo(480.0f, 90.8f, 421.2f, 32.0f, 349.33f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(377.33f, 162.67f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(27.94f, 27.94f, 0.0f, false, true, 377.33f, 162.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 181.33f)
                arcTo(74.67f, 74.67f, 0.0f, true, true, 181.33f, 256.0f)
                arcTo(74.75f, 74.75f, 0.0f, false, true, 256.0f, 181.33f)
                moveTo(256.0f, 144.0f)
                arcTo(112.0f, 112.0f, 0.0f, true, false, 368.0f, 256.0f)
                arcTo(112.0f, 112.0f, 0.0f, false, false, 256.0f, 144.0f)
                close()
            }
        }
        .build()
        return _logoInstagram!!
    }

private var _logoInstagram: ImageVector? = null
