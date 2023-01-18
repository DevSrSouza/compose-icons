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

public val IonIcons.OptionsSharp: ImageVector
    get() {
        if (_optionsSharp != null) {
            return _optionsSharp!!
        }
        _optionsSharp = Builder(name = "OptionsSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(381.25f, 112.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -90.5f, 0.0f)
                horizontalLineTo(48.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(290.75f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 90.5f, 0.0f)
                horizontalLineTo(464.0f)
                verticalLineTo(112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 208.0f)
                arcToRelative(48.09f, 48.09f, 0.0f, false, false, -45.25f, 32.0f)
                horizontalLineTo(48.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(82.75f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 90.5f, 0.0f)
                horizontalLineTo(464.0f)
                verticalLineTo(240.0f)
                horizontalLineTo(221.25f)
                arcTo(48.09f, 48.09f, 0.0f, false, false, 176.0f, 208.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 336.0f)
                arcToRelative(48.09f, 48.09f, 0.0f, false, false, -45.25f, 32.0f)
                horizontalLineTo(48.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(290.75f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 90.5f, 0.0f)
                horizontalLineTo(464.0f)
                verticalLineTo(368.0f)
                horizontalLineTo(381.25f)
                arcTo(48.09f, 48.09f, 0.0f, false, false, 336.0f, 336.0f)
                close()
            }
        }
        .build()
        return _optionsSharp!!
    }

private var _optionsSharp: ImageVector? = null
