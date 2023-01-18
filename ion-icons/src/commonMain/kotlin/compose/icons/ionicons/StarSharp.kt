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

public val IonIcons.StarSharp: ImageVector
    get() {
        if (_starSharp != null) {
            return _starSharp!!
        }
        _starSharp = Builder(name = "StarSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
            }
        }
        .build()
        return _starSharp!!
    }

private var _starSharp: ImageVector? = null
