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

public val MaterialDesignIcons.BagSuitcaseOffOutline: ImageVector
    get() {
        if (_bagSuitcaseOffOutline != null) {
            return _bagSuitcaseOffOutline!!
        }
        _bagSuitcaseOffOutline = Builder(name = "BagSuitcaseOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.77f)
                lineTo(3.28f, 3.5f)
                lineTo(21.0f, 21.22f)
                lineTo(19.73f, 22.5f)
                lineTo(18.0f, 20.76f)
                curveTo(17.71f, 20.93f, 17.38f, 21.0f, 17.03f, 21.0f)
                curveTo(17.03f, 21.58f, 16.56f, 22.0f, 16.0f, 22.0f)
                curveTo(15.5f, 22.0f, 15.0f, 21.58f, 15.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 21.58f, 8.5f, 22.0f, 8.0f, 22.0f)
                curveTo(7.44f, 22.0f, 6.97f, 21.58f, 6.97f, 21.0f)
                curveTo(5.89f, 21.0f, 5.0f, 20.13f, 5.0f, 19.0f)
                lineTo(5.0f, 7.78f)
                lineTo(2.0f, 4.77f)
                moveTo(9.5f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.78f)
                lineTo(6.97f, 9.74f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.23f)
                lineTo(15.25f, 18.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(17.26f)
                lineTo(12.75f, 15.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(14.0f)
                lineTo(9.5f, 12.28f)
                verticalLineTo(18.0f)
                moveTo(12.75f, 9.0f)
                verticalLineTo(10.43f)
                lineTo(11.32f, 9.0f)
                horizontalLineTo(12.75f)
                moveTo(14.5f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.67f)
                lineTo(14.5f, 12.17f)
                verticalLineTo(9.0f)
                moveTo(17.03f, 6.0f)
                curveTo(18.11f, 6.0f, 19.0f, 6.88f, 19.0f, 8.0f)
                verticalLineTo(16.68f)
                lineTo(17.03f, 14.7f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.33f)
                lineTo(8.31f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                curveTo(9.0f, 2.42f, 9.46f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.54f, 2.0f, 15.0f, 2.42f, 15.0f, 3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.03f)
                moveTo(10.5f, 3.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _bagSuitcaseOffOutline!!
    }

private var _bagSuitcaseOffOutline: ImageVector? = null
