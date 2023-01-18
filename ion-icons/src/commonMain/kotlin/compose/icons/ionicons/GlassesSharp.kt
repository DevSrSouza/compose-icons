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

public val IonIcons.GlassesSharp: ImageVector
    get() {
        if (_glassesSharp != null) {
            return _glassesSharp!!
        }
        _glassesSharp = Builder(name = "GlassesSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 176.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(37.24f)
                lineTo(49.68f, 352.0f)
                horizontalLineTo(221.55f)
                lineTo(240.0f, 241.32f)
                verticalLineTo(240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(1.32f)
                lineTo(290.45f, 352.0f)
                horizontalLineTo(462.32f)
                lineToRelative(12.44f, -112.0f)
                horizontalLineTo(496.0f)
                close()
            }
        }
        .build()
        return _glassesSharp!!
    }

private var _glassesSharp: ImageVector? = null
