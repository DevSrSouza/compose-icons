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

public val MaterialDesignIcons.TshirtV: ImageVector
    get() {
        if (_tshirtV != null) {
            return _tshirtV!!
        }
        _tshirtV = Builder(name = "TshirtV", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 21.0f)
                horizontalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 20.0f)
                verticalLineTo(12.07f)
                lineTo(5.7f, 13.07f)
                curveTo(5.31f, 13.46f, 4.68f, 13.46f, 4.29f, 13.07f)
                lineTo(1.46f, 10.29f)
                curveTo(1.07f, 9.9f, 1.07f, 9.27f, 1.46f, 8.88f)
                lineTo(7.34f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(9.29f, 4.8f, 10.4f, 6.37f, 12.0f, 7.25f)
                curveTo(13.6f, 6.37f, 14.71f, 4.8f, 15.0f, 3.0f)
                horizontalLineTo(16.66f)
                lineTo(22.54f, 8.88f)
                curveTo(22.93f, 9.27f, 22.93f, 9.9f, 22.54f, 10.29f)
                lineTo(19.71f, 13.12f)
                curveTo(19.32f, 13.5f, 18.69f, 13.5f, 18.3f, 13.12f)
                lineTo(17.0f, 12.12f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 21.0f)
            }
        }
        .build()
        return _tshirtV!!
    }

private var _tshirtV: ImageVector? = null
