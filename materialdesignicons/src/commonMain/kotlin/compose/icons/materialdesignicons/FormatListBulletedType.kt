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

public val MaterialDesignIcons.FormatListBulletedType: ImageVector
    get() {
        if (_formatListBulletedType != null) {
            return _formatListBulletedType!!
        }
        _formatListBulletedType = Builder(name = "FormatListBulletedType", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 9.5f)
                lineTo(7.5f, 14.0f)
                horizontalLineTo(2.5f)
                lineTo(5.0f, 9.5f)
                moveTo(3.0f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                moveTo(5.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 20.0f)
                moveTo(9.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                moveTo(9.0f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                moveTo(9.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _formatListBulletedType!!
    }

private var _formatListBulletedType: ImageVector? = null
