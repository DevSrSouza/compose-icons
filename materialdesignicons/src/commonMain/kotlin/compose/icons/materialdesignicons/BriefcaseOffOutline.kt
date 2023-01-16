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

public val MaterialDesignIcons.BriefcaseOffOutline: ImageVector
    get() {
        if (_briefcaseOffOutline != null) {
            return _briefcaseOffOutline!!
        }
        _briefcaseOffOutline = Builder(name = "BriefcaseOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                verticalLineTo(16.8f)
                lineTo(22.0f, 18.8f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 7.45f, 21.8f, 7.0f, 21.42f, 6.59f)
                curveTo(21.05f, 6.2f, 20.58f, 6.0f, 20.0f, 6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                curveTo(16.0f, 3.42f, 15.8f, 2.95f, 15.42f, 2.58f)
                curveTo(15.05f, 2.2f, 14.58f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(9.42f, 2.0f, 8.95f, 2.2f, 8.58f, 2.58f)
                curveTo(8.2f, 2.95f, 8.0f, 3.42f, 8.0f, 4.0f)
                verticalLineTo(4.8f)
                lineTo(11.2f, 8.0f)
                horizontalLineTo(20.0f)
                moveTo(10.0f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.11f, 6.0f)
                horizontalLineTo(4.0f)
                curveTo(3.42f, 6.0f, 2.95f, 6.2f, 2.58f, 6.59f)
                curveTo(2.2f, 7.0f, 2.0f, 7.45f, 2.0f, 8.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 19.55f, 2.2f, 20.0f, 2.58f, 20.41f)
                curveTo(2.95f, 20.8f, 3.42f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(19.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(4.0f, 19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.11f)
                lineTo(17.11f, 19.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _briefcaseOffOutline!!
    }

private var _briefcaseOffOutline: ImageVector? = null
