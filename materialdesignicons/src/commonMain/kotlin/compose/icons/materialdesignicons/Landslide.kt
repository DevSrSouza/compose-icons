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

public val MaterialDesignIcons.Landslide: ImageVector
    get() {
        if (_landslide != null) {
            return _landslide!!
        }
        _landslide = Builder(name = "Landslide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.47f, 13.79f)
                lineTo(12.89f, 12.76f)
                lineTo(6.0f, 15.05f)
                lineTo(2.0f, 13.5f)
                verticalLineTo(15.61f)
                lineTo(6.0f, 16.95f)
                lineTo(15.47f, 13.79f)
                moveTo(10.57f, 11.42f)
                lineTo(8.0f, 8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.61f)
                lineTo(6.0f, 12.95f)
                lineTo(10.57f, 11.42f)
                moveTo(6.0f, 19.05f)
                lineTo(2.0f, 17.72f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                lineTo(17.03f, 15.38f)
                lineTo(6.0f, 19.05f)
                moveTo(17.0f, 6.0f)
                verticalLineTo(1.0f)
                lineTo(12.0f, 0.0f)
                lineTo(9.0f, 2.0f)
                verticalLineTo(6.0f)
                lineTo(12.0f, 8.0f)
                lineTo(17.0f, 6.0f)
                moveTo(18.5f, 7.0f)
                lineTo(16.0f, 9.0f)
                verticalLineTo(12.0f)
                lineTo(18.5f, 14.0f)
                lineTo(23.0f, 12.0f)
                verticalLineTo(8.0f)
                lineTo(18.5f, 7.0f)
                close()
            }
        }
        .build()
        return _landslide!!
    }

private var _landslide: ImageVector? = null
