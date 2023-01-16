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

public val MaterialDesignIcons.MapPlus: ImageVector
    get() {
        if (_mapPlus != null) {
            return _mapPlus!!
        }
        _mapPlus = Builder(name = "MapPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                lineTo(3.36f, 4.9f)
                curveTo(3.16f, 4.97f, 3.0f, 5.15f, 3.0f, 5.38f)
                verticalLineTo(20.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.5f, 21.0f)
                curveTo(3.55f, 21.0f, 3.6f, 21.0f, 3.66f, 20.97f)
                lineTo(9.0f, 18.9f)
                lineTo(13.16f, 20.36f)
                curveTo(13.06f, 19.92f, 13.0f, 19.46f, 13.0f, 19.0f)
                curveTo(13.0f, 18.77f, 13.0f, 18.54f, 13.04f, 18.3f)
                lineTo(9.0f, 16.9f)
                verticalLineTo(5.0f)
                lineTo(15.0f, 7.1f)
                verticalLineTo(14.56f)
                curveTo(16.07f, 13.6f, 17.47f, 13.0f, 19.0f, 13.0f)
                curveTo(19.7f, 13.0f, 20.37f, 13.13f, 21.0f, 13.36f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 20.5f, 3.0f)
                horizontalLineTo(20.34f)
                lineTo(15.0f, 5.1f)
                lineTo(9.0f, 3.0f)
                moveTo(18.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _mapPlus!!
    }

private var _mapPlus: ImageVector? = null
