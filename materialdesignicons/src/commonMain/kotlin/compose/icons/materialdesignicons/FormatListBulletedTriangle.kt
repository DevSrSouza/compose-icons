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

public val MaterialDesignIcons.FormatListBulletedTriangle: ImageVector
    get() {
        if (_formatListBulletedTriangle != null) {
            return _formatListBulletedTriangle!!
        }
        _formatListBulletedTriangle = Builder(name = "FormatListBulletedTriangle", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 15.5f)
                lineTo(7.5f, 20.0f)
                horizontalLineTo(2.5f)
                lineTo(5.0f, 15.5f)
                moveTo(9.0f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                moveTo(5.0f, 9.5f)
                lineTo(7.5f, 14.0f)
                horizontalLineTo(2.5f)
                lineTo(5.0f, 9.5f)
                moveTo(9.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                moveTo(5.0f, 3.5f)
                lineTo(7.5f, 8.0f)
                horizontalLineTo(2.5f)
                lineTo(5.0f, 3.5f)
                moveTo(9.0f, 7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _formatListBulletedTriangle!!
    }

private var _formatListBulletedTriangle: ImageVector? = null
