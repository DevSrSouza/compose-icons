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

public val MaterialDesignIcons.BagSuitcaseOutline: ImageVector
    get() {
        if (_bagSuitcaseOutline != null) {
            return _bagSuitcaseOutline!!
        }
        _bagSuitcaseOutline = Builder(name = "BagSuitcaseOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                moveTo(12.75f, 18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(18.0f)
                moveTo(16.0f, 18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(18.0f)
                moveTo(17.03f, 6.0f)
                curveTo(18.11f, 6.0f, 19.0f, 6.88f, 19.0f, 8.0f)
                verticalLineTo(19.0f)
                curveTo(19.0f, 20.13f, 18.11f, 21.0f, 17.03f, 21.0f)
                curveTo(17.03f, 21.58f, 16.56f, 22.0f, 16.0f, 22.0f)
                curveTo(15.5f, 22.0f, 15.0f, 21.58f, 15.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 21.58f, 8.5f, 22.0f, 8.0f, 22.0f)
                curveTo(7.44f, 22.0f, 6.97f, 21.58f, 6.97f, 21.0f)
                curveTo(5.89f, 21.0f, 5.0f, 20.13f, 5.0f, 19.0f)
                verticalLineTo(8.0f)
                curveTo(5.0f, 6.88f, 5.89f, 6.0f, 6.97f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                curveTo(9.0f, 2.42f, 9.46f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.54f, 2.0f, 15.0f, 2.42f, 15.0f, 3.0f)
                verticalLineTo(6.0f)
                moveTo(10.5f, 3.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(3.5f)
                moveTo(17.03f, 19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.97f)
                verticalLineTo(19.0f)
            }
        }
        .build()
        return _bagSuitcaseOutline!!
    }

private var _bagSuitcaseOutline: ImageVector? = null
