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

public val MaterialDesignIcons.BriefcaseSearch: ImageVector
    get() {
        if (_briefcaseSearch != null) {
            return _briefcaseSearch!!
        }
        _briefcaseSearch = Builder(name = "BriefcaseSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 12.0f)
                curveTo(19.0f, 12.0f, 21.0f, 14.0f, 21.0f, 16.5f)
                curveTo(21.0f, 17.38f, 20.75f, 18.21f, 20.31f, 18.9f)
                lineTo(23.39f, 22.0f)
                lineTo(22.0f, 23.39f)
                lineTo(18.88f, 20.32f)
                curveTo(18.19f, 20.75f, 17.37f, 21.0f, 16.5f, 21.0f)
                curveTo(14.0f, 21.0f, 12.0f, 19.0f, 12.0f, 16.5f)
                curveTo(12.0f, 14.0f, 14.0f, 12.0f, 16.5f, 12.0f)
                moveTo(16.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 14.0f)
                moveTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 8.0f)
                verticalLineTo(13.03f)
                curveTo(20.85f, 11.21f, 18.82f, 10.0f, 16.5f, 10.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 10.0f, 16.5f)
                curveTo(10.0f, 18.25f, 10.69f, 19.83f, 11.81f, 21.0f)
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
                close()
            }
        }
        .build()
        return _briefcaseSearch!!
    }

private var _briefcaseSearch: ImageVector? = null