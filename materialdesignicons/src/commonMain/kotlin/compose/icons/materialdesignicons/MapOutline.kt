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

public val MaterialDesignIcons.MapOutline: ImageVector
    get() {
        if (_mapOutline != null) {
            return _mapOutline!!
        }
        _mapOutline = Builder(name = "MapOutline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 3.0f)
                lineTo(20.34f, 3.03f)
                lineTo(15.0f, 5.1f)
                lineTo(9.0f, 3.0f)
                lineTo(3.36f, 4.9f)
                curveTo(3.15f, 4.97f, 3.0f, 5.15f, 3.0f, 5.38f)
                verticalLineTo(20.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.5f, 21.0f)
                lineTo(3.66f, 20.97f)
                lineTo(9.0f, 18.9f)
                lineTo(15.0f, 21.0f)
                lineTo(20.64f, 19.1f)
                curveTo(20.85f, 19.03f, 21.0f, 18.85f, 21.0f, 18.62f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 20.5f, 3.0f)
                moveTo(10.0f, 5.47f)
                lineTo(14.0f, 6.87f)
                verticalLineTo(18.53f)
                lineTo(10.0f, 17.13f)
                verticalLineTo(5.47f)
                moveTo(5.0f, 6.46f)
                lineTo(8.0f, 5.45f)
                verticalLineTo(17.15f)
                lineTo(5.0f, 18.31f)
                verticalLineTo(6.46f)
                moveTo(19.0f, 17.54f)
                lineTo(16.0f, 18.55f)
                verticalLineTo(6.86f)
                lineTo(19.0f, 5.7f)
                verticalLineTo(17.54f)
                close()
            }
        }
        .build()
        return _mapOutline!!
    }

private var _mapOutline: ImageVector? = null
