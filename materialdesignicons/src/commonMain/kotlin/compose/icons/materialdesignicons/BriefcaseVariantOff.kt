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

public val MaterialDesignIcons.BriefcaseVariantOff: ImageVector
    get() {
        if (_briefcaseVariantOff != null) {
            return _briefcaseVariantOff!!
        }
        _briefcaseVariantOff = Builder(name = "BriefcaseVariantOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.8f)
                lineTo(8.1f, 4.9f)
                lineTo(10.0f, 3.0f)
                horizontalLineTo(14.0f)
                lineTo(16.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 7.0f, 22.0f, 7.9f, 22.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 13.1f, 21.1f, 14.0f, 20.0f, 14.0f)
                horizontalLineTo(17.2f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.8f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(5.11f, 7.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 13.11f, 2.89f, 14.0f, 4.0f, 14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.11f)
                lineTo(14.0f, 15.89f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.89f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(19.03f, 21.0f, 19.07f, 21.0f, 19.1f, 21.0f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(21.0f, 17.8f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.2f)
                lineTo(21.0f, 17.8f)
                close()
            }
        }
        .build()
        return _briefcaseVariantOff!!
    }

private var _briefcaseVariantOff: ImageVector? = null
