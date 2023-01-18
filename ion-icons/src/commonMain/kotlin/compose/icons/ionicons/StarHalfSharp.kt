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

public val IonIcons.StarHalfSharp: ImageVector
    get() {
        if (_starHalfSharp != null) {
            return _starHalfSharp!!
        }
        _starHalfSharp = Builder(name = "StarHalfSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 203.3f)
                horizontalLineTo(312.36f)
                lineTo(256.0f, 32.0f)
                lineTo(199.64f, 203.3f)
                horizontalLineTo(16.0f)
                lineTo(166.21f, 308.7f)
                lineTo(107.71f, 480.0f)
                lineTo(256.0f, 373.84f)
                lineTo(404.29f, 480.0f)
                lineTo(345.68f, 308.7f)
                close()
                moveTo(274.63f, 347.82f)
                lineTo(256.0f, 334.49f)
                verticalLineTo(134.39f)
                lineToRelative(26.0f, 78.91f)
                lineToRelative(7.24f, 22.0f)
                horizontalLineTo(394.63f)
                lineToRelative(-67.32f, 47.2f)
                lineToRelative(-19.69f, 13.81f)
                lineToRelative(7.78f, 22.75f)
                lineToRelative(26.26f, 76.75f)
                close()
            }
        }
        .build()
        return _starHalfSharp!!
    }

private var _starHalfSharp: ImageVector? = null
