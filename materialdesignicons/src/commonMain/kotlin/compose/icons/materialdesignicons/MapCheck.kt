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

public val MaterialDesignIcons.MapCheck: ImageVector
    get() {
        if (_mapCheck != null) {
            return _mapCheck!!
        }
        _mapCheck = Builder(name = "MapCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 22.0f)
                lineTo(15.5f, 19.0f)
                lineTo(16.66f, 17.82f)
                lineTo(18.25f, 19.41f)
                lineTo(21.84f, 15.82f)
                lineTo(23.0f, 17.23f)
                moveTo(20.5f, 3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 21.0f, 3.5f)
                verticalLineTo(13.36f)
                curveTo(20.36f, 13.13f, 19.69f, 13.0f, 19.0f, 13.0f)
                curveTo(17.46f, 13.0f, 16.06f, 13.6f, 15.0f, 14.56f)
                verticalLineTo(7.1f)
                lineTo(9.0f, 5.0f)
                verticalLineTo(16.9f)
                lineTo(13.04f, 18.3f)
                curveTo(13.0f, 18.54f, 13.0f, 18.77f, 13.0f, 19.0f)
                curveTo(13.0f, 19.46f, 13.06f, 19.92f, 13.16f, 20.36f)
                lineTo(9.0f, 18.9f)
                lineTo(3.66f, 20.97f)
                curveTo(3.59f, 21.0f, 3.55f, 21.0f, 3.5f, 21.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 20.5f)
                verticalLineTo(5.38f)
                curveTo(3.0f, 5.15f, 3.16f, 4.97f, 3.35f, 4.9f)
                lineTo(9.0f, 3.0f)
                lineTo(15.0f, 5.1f)
                lineTo(20.33f, 3.0f)
            }
        }
        .build()
        return _mapCheck!!
    }

private var _mapCheck: ImageVector? = null
