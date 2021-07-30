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

public val SimpleIcons.Apollographql: ImageVector
    get() {
        if (_apollographql != null) {
            return _apollographql!!
        }
        _apollographql = Builder(name = "Apollographql", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveTo(0.0f, 18.628f, 5.372f, 24.0f, 12.0f, 24.0f)
                curveTo(18.627f, 24.0f, 24.0f, 18.628f, 24.0f, 12.0f)
                arcTo(12.014f, 12.014f, 0.0f, false, false, 23.527f, 8.657f)
                arcTo(0.6f, 0.6f, 0.0f, false, false, 22.4f, 9.066f)
                horizontalLineTo(22.398f)
                curveTo(22.663f, 10.009f, 22.8f, 10.994f, 22.8f, 12.0f)
                arcTo(10.73f, 10.73f, 0.0f, false, true, 19.637f, 19.637f)
                arcTo(10.729f, 10.729f, 0.0f, false, true, 12.0f, 22.8f)
                arcTo(10.73f, 10.73f, 0.0f, false, true, 4.363f, 19.637f)
                arcTo(10.728f, 10.728f, 0.0f, false, true, 1.2f, 12.0f)
                arcTo(10.73f, 10.73f, 0.0f, false, true, 4.363f, 4.363f)
                arcTo(10.728f, 10.728f, 0.0f, false, true, 12.0f, 1.2f)
                curveTo(14.576f, 1.2f, 17.013f, 2.096f, 18.958f, 3.74f)
                arcTo(1.466f, 1.466f, 0.0f, true, false, 19.82f, 2.9f)
                arcTo(11.953f, 11.953f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(10.56f, 5.88f)
                lineTo(6.36f, 16.782f)
                horizontalLineTo(8.99f)
                lineTo(9.677f, 14.934f)
                horizontalLineTo(13.646f)
                lineTo(12.927f, 12.892f)
                horizontalLineTo(10.314f)
                lineTo(12.014f, 8.201f)
                lineTo(15.038f, 16.781f)
                horizontalLineTo(17.669f)
                lineTo(13.47f, 5.88f)
                close()
            }
        }
        .build()
        return _apollographql!!
    }

private var _apollographql: ImageVector? = null
