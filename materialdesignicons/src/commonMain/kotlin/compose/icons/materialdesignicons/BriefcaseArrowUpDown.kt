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

public val MaterialDesignIcons.BriefcaseArrowUpDown: ImageVector
    get() {
        if (_briefcaseArrowUpDown != null) {
            return _briefcaseArrowUpDown!!
        }
        _briefcaseArrowUpDown = Builder(name = "BriefcaseArrowUpDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(15.11f, 2.0f, 16.0f, 2.9f, 16.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 6.0f, 22.0f, 6.9f, 22.0f, 8.0f)
                verticalLineTo(13.53f)
                curveTo(20.94f, 12.58f, 19.54f, 12.0f, 18.0f, 12.0f)
                curveTo(14.69f, 12.0f, 12.0f, 14.69f, 12.0f, 18.0f)
                curveTo(12.0f, 19.09f, 12.29f, 20.12f, 12.8f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 21.0f, 2.0f, 20.1f, 2.0f, 19.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 6.89f, 2.89f, 6.0f, 4.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                curveTo(8.0f, 2.89f, 8.89f, 2.0f, 10.0f, 2.0f)
                moveTo(14.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                moveTo(17.5f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.5f)
                lineTo(20.0f, 22.0f)
                lineTo(17.5f, 19.0f)
                moveTo(17.0f, 17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.5f)
                lineTo(16.0f, 14.0f)
                lineTo(18.5f, 17.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _briefcaseArrowUpDown!!
    }

private var _briefcaseArrowUpDown: ImageVector? = null
