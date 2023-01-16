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

public val MaterialDesignIcons.Airballoon: ImageVector
    get() {
        if (_airballoon != null) {
            return _airballoon!!
        }
        _airballoon = Builder(name = "Airballoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 23.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 23.0f)
                horizontalLineTo(11.0f)
                moveTo(12.0f, 1.0f)
                curveTo(12.71f, 1.0f, 13.39f, 1.09f, 14.05f, 1.26f)
                curveTo(15.22f, 2.83f, 16.0f, 5.71f, 16.0f, 9.0f)
                curveTo(16.0f, 11.28f, 15.62f, 13.37f, 15.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 18.0f)
                horizontalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 16.0f)
                curveTo(8.38f, 13.37f, 8.0f, 11.28f, 8.0f, 9.0f)
                curveTo(8.0f, 5.71f, 8.78f, 2.83f, 9.95f, 1.26f)
                curveTo(10.61f, 1.09f, 11.29f, 1.0f, 12.0f, 1.0f)
                moveTo(20.0f, 8.0f)
                curveTo(20.0f, 11.18f, 18.15f, 15.92f, 15.46f, 17.21f)
                curveTo(16.41f, 15.39f, 17.0f, 11.83f, 17.0f, 9.0f)
                curveTo(17.0f, 6.17f, 16.41f, 3.61f, 15.46f, 1.79f)
                curveTo(18.15f, 3.08f, 20.0f, 4.82f, 20.0f, 8.0f)
                moveTo(4.0f, 8.0f)
                curveTo(4.0f, 4.82f, 5.85f, 3.08f, 8.54f, 1.79f)
                curveTo(7.59f, 3.61f, 7.0f, 6.17f, 7.0f, 9.0f)
                curveTo(7.0f, 11.83f, 7.59f, 15.39f, 8.54f, 17.21f)
                curveTo(5.85f, 15.92f, 4.0f, 11.18f, 4.0f, 8.0f)
                close()
            }
        }
        .build()
        return _airballoon!!
    }

private var _airballoon: ImageVector? = null
