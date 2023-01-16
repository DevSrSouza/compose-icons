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

public val MaterialDesignIcons.HospitalBoxOutline: ImageVector
    get() {
        if (_hospitalBoxOutline != null) {
            return _hospitalBoxOutline!!
        }
        _hospitalBoxOutline = Builder(name = "HospitalBoxOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.1f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 22.0f, 22.0f, 21.1f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _hospitalBoxOutline!!
    }

private var _hospitalBoxOutline: ImageVector? = null
