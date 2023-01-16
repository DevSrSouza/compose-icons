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

public val MaterialDesignIcons.BriefcaseArrowUpDownOutline: ImageVector
    get() {
        if (_briefcaseArrowUpDownOutline != null) {
            return _briefcaseArrowUpDownOutline!!
        }
        _briefcaseArrowUpDownOutline = Builder(name = "BriefcaseArrowUpDownOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
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
                curveTo(21.42f, 13.0f, 20.75f, 12.6f, 20.0f, 12.34f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.08f)
                curveTo(12.2f, 19.72f, 12.45f, 20.39f, 12.8f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 21.0f, 2.0f, 20.11f, 2.0f, 19.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 6.9f, 2.9f, 6.0f, 4.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                curveTo(8.0f, 2.9f, 8.9f, 2.0f, 10.0f, 2.0f)
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
        return _briefcaseArrowUpDownOutline!!
    }

private var _briefcaseArrowUpDownOutline: ImageVector? = null
