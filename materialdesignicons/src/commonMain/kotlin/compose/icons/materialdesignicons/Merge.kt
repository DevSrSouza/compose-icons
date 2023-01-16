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

public val MaterialDesignIcons.Merge: ImageVector
    get() {
        if (_merge != null) {
            return _merge!!
        }
        _merge = Builder(name = "Merge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 17.0f)
                lineTo(12.0f, 13.0f)
                horizontalLineTo(15.2f)
                curveTo(15.6f, 14.2f, 16.7f, 15.0f, 18.0f, 15.0f)
                curveTo(19.7f, 15.0f, 21.0f, 13.7f, 21.0f, 12.0f)
                reflectiveCurveTo(19.7f, 9.0f, 18.0f, 9.0f)
                curveTo(16.7f, 9.0f, 15.6f, 9.8f, 15.2f, 11.0f)
                horizontalLineTo(12.0f)
                lineTo(8.0f, 7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                lineTo(10.2f, 12.0f)
                lineTo(6.0f, 16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _merge!!
    }

private var _merge: ImageVector? = null
