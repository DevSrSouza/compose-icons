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

public val MaterialDesignIcons.BadgeAccountAlert: ImageVector
    get() {
        if (_badgeAccountAlert != null) {
            return _badgeAccountAlert!!
        }
        _badgeAccountAlert = Builder(name = "BadgeAccountAlert", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 23.0f)
                horizontalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 21.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 3.0f)
                moveTo(10.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 8.0f)
                moveTo(14.0f, 16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 13.67f, 8.67f, 13.0f, 10.0f, 13.0f)
                curveTo(11.33f, 13.0f, 14.0f, 13.67f, 14.0f, 15.0f)
                verticalLineTo(16.0f)
                moveTo(11.0f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                moveTo(14.0f, 19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                moveTo(10.0f, 21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                moveTo(19.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _badgeAccountAlert!!
    }

private var _badgeAccountAlert: ImageVector? = null
