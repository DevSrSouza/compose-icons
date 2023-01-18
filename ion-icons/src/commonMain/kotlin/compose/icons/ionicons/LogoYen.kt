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

public val IonIcons.LogoYen: ImageVector
    get() {
        if (_logoYen != null) {
            return _logoYen!!
        }
        _logoYen = Builder(name = "LogoYen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 32.0f)
                horizontalLineTo(368.0f)
                lineTo(256.0f, 253.13f)
                lineTo(144.0f, 32.0f)
                horizontalLineTo(64.0f)
                lineTo(176.37f, 240.0f)
                horizontalLineTo(128.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(73.56f)
                lineTo(216.0f, 319.0f)
                verticalLineToRelative(17.0f)
                horizontalLineTo(128.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(80.0f)
                verticalLineTo(384.0f)
                horizontalLineToRelative(88.0f)
                verticalLineTo(336.0f)
                horizontalLineTo(296.0f)
                verticalLineTo(319.0f)
                lineToRelative(14.89f, -31.0f)
                horizontalLineTo(384.0f)
                verticalLineTo(240.0f)
                horizontalLineTo(335.71f)
                close()
            }
        }
        .build()
        return _logoYen!!
    }

private var _logoYen: ImageVector? = null
