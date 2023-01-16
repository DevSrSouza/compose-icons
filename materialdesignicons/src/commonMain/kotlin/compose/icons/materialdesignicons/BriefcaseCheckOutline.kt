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

public val MaterialDesignIcons.BriefcaseCheckOutline: ImageVector
    get() {
        if (_briefcaseCheckOutline != null) {
            return _briefcaseCheckOutline!!
        }
        _briefcaseCheckOutline = Builder(name = "BriefcaseCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                curveTo(20.58f, 6.0f, 21.05f, 6.2f, 21.42f, 6.59f)
                curveTo(21.8f, 7.0f, 22.0f, 7.45f, 22.0f, 8.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 19.55f, 21.8f, 20.0f, 21.42f, 20.41f)
                curveTo(21.05f, 20.8f, 20.58f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.42f, 21.0f, 2.95f, 20.8f, 2.58f, 20.41f)
                curveTo(2.2f, 20.0f, 2.0f, 19.55f, 2.0f, 19.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 7.45f, 2.2f, 7.0f, 2.58f, 6.59f)
                curveTo(2.95f, 6.2f, 3.42f, 6.0f, 4.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                curveTo(8.0f, 3.42f, 8.2f, 2.95f, 8.58f, 2.58f)
                curveTo(8.95f, 2.2f, 9.42f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.58f, 2.0f, 15.05f, 2.2f, 15.42f, 2.58f)
                curveTo(15.8f, 2.95f, 16.0f, 3.42f, 16.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                moveTo(4.0f, 8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                moveTo(14.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                moveTo(10.46f, 17.5f)
                lineTo(17.05f, 10.91f)
                lineTo(15.64f, 9.5f)
                lineTo(10.46f, 14.67f)
                lineTo(8.37f, 12.59f)
                lineTo(6.96f, 14.0f)
                lineTo(10.46f, 17.5f)
                close()
            }
        }
        .build()
        return _briefcaseCheckOutline!!
    }

private var _briefcaseCheckOutline: ImageVector? = null
