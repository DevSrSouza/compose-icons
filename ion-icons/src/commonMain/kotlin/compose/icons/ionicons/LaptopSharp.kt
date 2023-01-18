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

public val IonIcons.LaptopSharp: ImageVector
    get() {
        if (_laptopSharp != null) {
            return _laptopSharp!!
        }
        _laptopSharp = Builder(name = "LaptopSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(477.29f, 400.0f)
                arcTo(27.75f, 27.75f, 0.0f, false, false, 480.0f, 388.0f)
                verticalLineTo(108.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, -28.0f)
                horizontalLineTo(60.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, 28.0f)
                verticalLineTo(388.0f)
                arcToRelative(27.75f, 27.75f, 0.0f, false, false, 2.71f, 12.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(512.0f)
                verticalLineTo(400.0f)
                close()
            }
        }
        .build()
        return _laptopSharp!!
    }

private var _laptopSharp: ImageVector? = null
