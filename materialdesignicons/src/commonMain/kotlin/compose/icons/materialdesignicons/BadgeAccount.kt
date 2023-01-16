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

public val MaterialDesignIcons.BadgeAccount: ImageVector
    get() {
        if (_badgeAccount != null) {
            return _badgeAccount!!
        }
        _badgeAccount = Builder(name = "BadgeAccount", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 5.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 23.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 21.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 3.0f)
                moveTo(12.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 8.0f)
                moveTo(16.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                curveTo(8.0f, 13.67f, 10.67f, 13.0f, 12.0f, 13.0f)
                curveTo(13.33f, 13.0f, 16.0f, 13.67f, 16.0f, 15.0f)
                verticalLineTo(16.0f)
                moveTo(13.0f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                moveTo(16.0f, 19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                moveTo(12.0f, 21.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _badgeAccount!!
    }

private var _badgeAccount: ImageVector? = null
