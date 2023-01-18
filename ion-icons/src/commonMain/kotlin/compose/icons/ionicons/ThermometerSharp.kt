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

public val IonIcons.ThermometerSharp: ImageVector
    get() {
        if (_thermometerSharp != null) {
            return _thermometerSharp!!
        }
        _thermometerSharp = Builder(name = "ThermometerSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 291.24f)
                verticalLineTo(80.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -128.0f, 0.0f)
                verticalLineTo(291.24f)
                arcTo(113.39f, 113.39f, 0.0f, false, false, 144.0f, 384.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, false, false, 224.0f, 0.0f)
                arcTo(113.39f, 113.39f, 0.0f, false, false, 320.0f, 291.24f)
                close()
                moveTo(256.0f, 432.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -16.0f, -93.26f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(338.74f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 256.0f, 432.0f)
                close()
            }
        }
        .build()
        return _thermometerSharp!!
    }

private var _thermometerSharp: ImageVector? = null
