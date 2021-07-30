package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Yandex: ImageVector
    get() {
        if (_yandex != null) {
            return _yandex!!
        }
        _yandex = Builder(name = "Yandex", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.663f, 4.0f)
                horizontalLineTo(16.17f)
                curveTo(12.738f, 4.0f, 10.0f, 6.72f, 10.0f, 12.0f)
                curveToRelative(0.0f, 3.168f, 1.237f, 5.504f, 3.749f, 6.656f)
                lineToRelative(-4.688f, 8.832f)
                curveTo(8.908f, 27.777f, 9.061f, 28.0f, 9.306f, 28.0f)
                horizontalLineToRelative(2.175f)
                curveToRelative(0.184f, 0.0f, 0.307f, -0.064f, 0.368f, -0.223f)
                lineTo(16.25f, 19.0f)
                horizontalLineToRelative(1.25f)
                lineToRelative(-0.008f, 8.777f)
                curveToRelative(0.0f, 0.096f, 0.092f, 0.223f, 0.214f, 0.223f)
                horizontalLineToRelative(2.049f)
                curveTo(19.939f, 28.0f, 20.0f, 27.904f, 20.0f, 27.745f)
                verticalLineTo(4.32f)
                curveTo(20.0f, 4.096f, 19.877f, 4.0f, 19.663f, 4.0f)
                close()
                moveTo(17.5f, 17.0f)
                horizontalLineTo(16.0f)
                curveToRelative(-1.5f, 0.0f, -3.5f, -1.16f, -3.5f, -5.0f)
                curveToRelative(0.0f, -4.001f, 1.631f, -6.0f, 3.5f, -6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _yandex!!
    }

private var _yandex: ImageVector? = null
