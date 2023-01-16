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

public val MaterialDesignIcons.MapMinus: ImageVector
    get() {
        if (_mapMinus != null) {
            return _mapMinus!!
        }
        _mapMinus = Builder(name = "MapMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                moveTo(13.16f, 20.36f)
                lineTo(9.0f, 18.9f)
                lineTo(3.66f, 20.97f)
                curveTo(3.6f, 21.0f, 3.55f, 21.0f, 3.5f, 21.0f)
                curveTo(3.22f, 21.0f, 3.0f, 20.78f, 3.0f, 20.5f)
                verticalLineTo(5.38f)
                curveTo(3.0f, 5.15f, 3.16f, 4.97f, 3.36f, 4.9f)
                lineTo(9.0f, 3.0f)
                lineTo(15.0f, 5.1f)
                lineTo(20.34f, 3.0f)
                horizontalLineTo(20.5f)
                curveTo(20.78f, 3.0f, 21.0f, 3.22f, 21.0f, 3.5f)
                verticalLineTo(13.35f)
                curveTo(20.37f, 13.13f, 19.7f, 13.0f, 19.0f, 13.0f)
                curveTo(17.46f, 13.0f, 16.06f, 13.58f, 15.0f, 14.54f)
                verticalLineTo(7.1f)
                lineTo(9.0f, 5.0f)
                verticalLineTo(16.9f)
                lineTo(13.04f, 18.32f)
                curveTo(13.0f, 18.54f, 13.0f, 18.77f, 13.0f, 19.0f)
                curveTo(13.0f, 19.47f, 13.06f, 19.92f, 13.16f, 20.36f)
                close()
            }
        }
        .build()
        return _mapMinus!!
    }

private var _mapMinus: ImageVector? = null
