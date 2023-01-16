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

public val MaterialDesignIcons.BellPlus: ImageVector
    get() {
        if (_bellPlus != null) {
            return _bellPlus!!
        }
        _bellPlus = Builder(name = "BellPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                moveTo(12.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 4.29f)
                curveTo(7.12f, 5.14f, 5.0f, 7.82f, 5.0f, 11.0f)
                verticalLineTo(17.0f)
                lineTo(3.0f, 19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.35f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 19.0f, 12.09f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 7.82f, 16.88f, 5.14f, 14.0f, 4.29f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(10.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 23.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.65f, 22.13f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.81f, 21.0f)
                close()
            }
        }
        .build()
        return _bellPlus!!
    }

private var _bellPlus: ImageVector? = null
