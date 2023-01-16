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

public val MaterialDesignIcons.BriefcaseAccount: ImageVector
    get() {
        if (_briefcaseAccount != null) {
            return _briefcaseAccount!!
        }
        _briefcaseAccount = Builder(name = "BriefcaseAccount", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(8.89f, 2.0f, 8.0f, 2.89f, 8.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 6.0f, 2.0f, 6.89f, 2.0f, 8.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 19.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 6.0f)
                moveTo(10.0f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                moveTo(12.0f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.5f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 9.0f)
                moveTo(17.0f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.75f)
                curveTo(7.0f, 16.37f, 9.24f, 15.25f, 12.0f, 15.25f)
                curveTo(14.76f, 15.25f, 17.0f, 16.37f, 17.0f, 17.75f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _briefcaseAccount!!
    }

private var _briefcaseAccount: ImageVector? = null
