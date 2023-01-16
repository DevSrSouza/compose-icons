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

public val MaterialDesignIcons.BedSingle: ImageVector
    get() {
        if (_bedSingle != null) {
            return _bedSingle!!
        }
        _bedSingle = Builder(name = "BedSingle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 5.9f, 16.11f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(9.0f)
                curveTo(7.9f, 5.0f, 7.0f, 5.9f, 7.0f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(5.9f, 10.0f, 4.89f, 10.9f, 5.0f, 12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.33f)
                lineTo(7.0f, 19.0f)
                horizontalLineTo(8.0f)
                lineTo(8.67f, 17.0f)
                horizontalLineTo(15.33f)
                lineTo(16.0f, 19.0f)
                horizontalLineTo(17.0f)
                lineTo(17.67f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                curveTo(19.0f, 10.9f, 18.11f, 10.0f, 17.0f, 10.0f)
                moveTo(15.0f, 10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _bedSingle!!
    }

private var _bedSingle: ImageVector? = null
