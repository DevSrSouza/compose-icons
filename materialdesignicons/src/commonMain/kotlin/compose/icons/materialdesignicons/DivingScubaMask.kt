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

public val MaterialDesignIcons.DivingScubaMask: ImageVector
    get() {
        if (_divingScubaMask != null) {
            return _divingScubaMask!!
        }
        _divingScubaMask = Builder(name = "DivingScubaMask", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(13.31f, 15.0f, 14.42f, 15.83f, 14.83f, 17.0f)
                horizontalLineTo(18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 22.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 19.0f)
                horizontalLineTo(14.83f)
                curveTo(14.42f, 20.17f, 13.31f, 21.0f, 12.0f, 21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                moveTo(12.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 17.0f)
                moveTo(18.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 5.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 12.0f)
                horizontalLineTo(14.85f)
                curveTo(14.43f, 12.0f, 14.05f, 12.24f, 13.9f, 12.63f)
                curveTo(13.7f, 13.23f, 13.23f, 13.71f, 12.62f, 13.91f)
                curveTo(11.58f, 14.25f, 10.44f, 13.68f, 10.1f, 12.63f)
                curveTo(9.95f, 12.24f, 9.57f, 12.0f, 9.15f, 12.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 10.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 3.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.65f)
                curveTo(10.9f, 9.46f, 11.41f, 9.09f, 12.0f, 9.0f)
                curveTo(12.59f, 9.09f, 13.1f, 9.46f, 13.35f, 10.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _divingScubaMask!!
    }

private var _divingScubaMask: ImageVector? = null
