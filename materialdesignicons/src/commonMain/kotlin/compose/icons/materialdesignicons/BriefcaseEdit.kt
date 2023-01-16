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

public val MaterialDesignIcons.BriefcaseEdit: ImageVector
    get() {
        if (_briefcaseEdit != null) {
            return _briefcaseEdit!!
        }
        _briefcaseEdit = Builder(name = "BriefcaseEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 8.0f)
                lineTo(10.85f, 19.0f)
                curveTo(10.85f, 20.1f, 10.85f, 19.5f, 10.85f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 21.0f, 2.0f, 20.1f, 2.0f, 19.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 6.89f, 2.89f, 6.0f, 4.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                curveTo(8.0f, 2.89f, 8.89f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                moveTo(14.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                moveTo(21.04f, 12.13f)
                curveTo(20.9f, 12.13f, 20.76f, 12.19f, 20.65f, 12.3f)
                lineTo(19.65f, 13.3f)
                lineTo(21.7f, 15.35f)
                lineTo(22.7f, 14.35f)
                curveTo(22.92f, 14.14f, 22.92f, 13.79f, 22.7f, 13.58f)
                lineTo(21.42f, 12.3f)
                curveTo(21.31f, 12.19f, 21.18f, 12.13f, 21.04f, 12.13f)
                moveTo(19.07f, 13.88f)
                lineTo(13.0f, 19.94f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.06f)
                lineTo(21.12f, 15.93f)
                lineTo(19.07f, 13.88f)
                close()
            }
        }
        .build()
        return _briefcaseEdit!!
    }

private var _briefcaseEdit: ImageVector? = null
