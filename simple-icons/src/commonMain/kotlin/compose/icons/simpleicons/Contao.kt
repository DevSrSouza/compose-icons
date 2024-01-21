package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Contao: ImageVector
    get() {
        if (_contao != null) {
            return _contao!!
        }
        _contao = Builder(name = "Contao", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.133f, 14.233f)
                curveToRelative(0.672f, 3.125f, 1.23f, 6.1f, 3.189f, 8.242f)
                horizontalLineTo(1.588f)
                arcTo(1.602f, 1.602f, 0.0f, false, true, 0.0f, 20.897f)
                verticalLineTo(3.109f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.588f, -1.584f)
                horizontalLineToRelative(2.698f)
                arcToRelative(10.317f, 10.317f, 0.0f, false, false, -1.718f, 2.028f)
                curveToRelative(-2.135f, 3.271f, -1.257f, 6.838f, -0.435f, 10.68f)
                close()
                moveTo(22.411f, 1.525f)
                horizontalLineToRelative(-4.234f)
                curveToRelative(1.002f, 1.002f, 1.847f, 2.3f, 2.486f, 3.913f)
                lineToRelative(-6.437f, 1.358f)
                curveToRelative(-0.706f, -1.351f, -1.779f, -2.476f, -3.877f, -2.034f)
                curveToRelative(-1.156f, 0.245f, -1.923f, 0.894f, -2.264f, 1.604f)
                curveToRelative(-0.418f, 0.876f, -0.624f, 1.858f, 0.377f, 6.525f)
                curveToRelative(0.999f, 4.667f, 1.588f, 5.481f, 2.327f, 6.112f)
                curveToRelative(0.601f, 0.511f, 1.57f, 0.794f, 2.727f, 0.55f)
                curveToRelative(2.1f, -0.442f, 2.617f, -1.902f, 2.708f, -3.422f)
                lineToRelative(6.437f, -1.359f)
                curveToRelative(0.153f, 3.329f, -0.879f, 5.911f, -2.699f, 7.696f)
                horizontalLineToRelative(2.449f)
                arcTo(1.602f, 1.602f, 0.0f, false, false, 24.0f, 20.891f)
                verticalLineTo(3.109f)
                arcToRelative(1.602f, 1.602f, 0.0f, false, false, -1.589f, -1.584f)
                close()
            }
        }
        .build()
        return _contao!!
    }

private var _contao: ImageVector? = null
