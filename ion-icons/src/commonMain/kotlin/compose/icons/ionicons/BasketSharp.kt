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

public val IonIcons.BasketSharp: ImageVector
    get() {
        if (_basketSharp != null) {
            return _basketSharp!!
        }
        _basketSharp = Builder(name = "BasketSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(339.2f, 217.6f)
                lineTo(256.0f, 106.67f)
                lineTo(172.8f, 217.6f)
                lineToRelative(-25.6f, -19.2f)
                lineToRelative(96.0f, -128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 25.6f, 0.0f)
                lineToRelative(96.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(441.59f, 192.0f)
                horizontalLineTo(70.41f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.68f, 14.77f)
                lineTo(112.59f, 434.0f)
                horizontalLineTo(399.41f)
                lineToRelative(53.86f, -227.23f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 441.59f, 192.0f)
                close()
                moveTo(256.0f, 351.66f)
                arcTo(37.71f, 37.71f, 0.0f, true, true, 293.89f, 314.0f)
                arcTo(37.88f, 37.88f, 0.0f, false, true, 256.0f, 351.66f)
                close()
            }
        }
        .build()
        return _basketSharp!!
    }

private var _basketSharp: ImageVector? = null
