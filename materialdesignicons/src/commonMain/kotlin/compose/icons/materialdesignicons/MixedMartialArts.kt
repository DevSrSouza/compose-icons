package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.MixedMartialArts: ImageVector
    get() {
        if (_mixedMartialArts != null) {
            return _mixedMartialArts!!
        }
        _mixedMartialArts = Builder(name = "MixedMartialArts", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
                moveTo(18.0f, 7.0f)
                curveTo(18.28f, 7.0f, 18.5f, 7.09f, 18.7f, 7.29f)
                curveTo(18.89f, 7.5f, 19.0f, 7.73f, 19.0f, 8.0f)
                verticalLineTo(10.78f)
                curveTo(19.0f, 10.97f, 18.97f, 11.11f, 18.94f, 11.2f)
                lineTo(18.14f, 15.19f)
                curveTo(18.0f, 15.72f, 17.7f, 16.0f, 17.2f, 16.0f)
                horizontalLineTo(6.8f)
                curveTo(6.27f, 16.0f, 5.95f, 15.72f, 5.86f, 15.19f)
                lineTo(5.06f, 11.2f)
                curveTo(5.03f, 11.11f, 5.0f, 10.97f, 5.0f, 10.78f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 4.5f, 5.21f, 4.0f, 5.6f, 3.61f)
                curveTo(6.0f, 3.2f, 6.45f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(15.0f)
                curveTo(15.53f, 3.0f, 16.0f, 3.2f, 16.41f, 3.61f)
                curveTo(16.81f, 4.0f, 17.0f, 4.5f, 17.0f, 5.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 7.73f, 17.11f, 7.5f, 17.3f, 7.29f)
                curveTo(17.5f, 7.09f, 17.72f, 7.0f, 18.0f, 7.0f)
                moveTo(7.0f, 20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                curveTo(17.0f, 20.3f, 16.91f, 20.53f, 16.71f, 20.72f)
                curveTo(16.5f, 20.91f, 16.27f, 21.0f, 16.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(7.73f, 21.0f, 7.5f, 20.91f, 7.29f, 20.72f)
                curveTo(7.09f, 20.53f, 7.0f, 20.3f, 7.0f, 20.0f)
                close()
            }
        }
        .build()
        return _mixedMartialArts!!
    }

private var _mixedMartialArts: ImageVector? = null
