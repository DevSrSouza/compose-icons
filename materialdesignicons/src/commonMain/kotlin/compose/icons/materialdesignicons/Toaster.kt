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

public val MaterialDesignIcons.Toaster: ImageVector
    get() {
        if (_toaster != null) {
            return _toaster!!
        }
        _toaster = Builder(name = "Toaster", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 9.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                moveTo(17.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 19.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 15.0f)
                moveTo(18.0f, 8.0f)
                horizontalLineTo(6.0f)
                curveTo(6.33f, 5.75f, 8.88f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(17.63f, 5.75f, 18.0f, 8.0f)
                close()
            }
        }
        .build()
        return _toaster!!
    }

private var _toaster: ImageVector? = null
