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

public val MaterialDesignIcons.KettlePourOver: ImageVector
    get() {
        if (_kettlePourOver != null) {
            return _kettlePourOver!!
        }
        _kettlePourOver = Builder(name = "KettlePourOver", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                curveTo(9.4f, 4.0f, 9.0f, 4.4f, 9.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                curveTo(14.0f, 4.4f, 13.6f, 4.0f, 13.0f, 4.0f)
                horizontalLineTo(10.0f)
                moveTo(3.0f, 7.0f)
                lineTo(4.1f, 14.1f)
                curveTo(4.2f, 14.8f, 4.5f, 15.5f, 5.1f, 16.1f)
                curveTo(5.5f, 16.6f, 6.2f, 16.9f, 7.0f, 17.0f)
                curveTo(7.0f, 17.6f, 7.4f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(16.0f)
                curveTo(16.6f, 18.0f, 17.0f, 17.6f, 17.0f, 17.0f)
                lineTo(15.0f, 11.0f)
                horizontalLineTo(17.0f)
                lineTo(20.3f, 16.0f)
                lineTo(22.0f, 15.0f)
                lineTo(18.7f, 10.0f)
                lineTo(20.0f, 9.2f)
                lineTo(19.0f, 7.5f)
                lineTo(16.4f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                lineTo(7.2f, 16.0f)
                curveTo(6.5f, 15.9f, 6.1f, 15.7f, 5.8f, 15.4f)
                curveTo(5.4f, 15.0f, 5.2f, 14.5f, 5.1f, 13.9f)
                lineTo(4.0f, 7.0f)
                horizontalLineTo(3.0f)
                moveTo(4.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _kettlePourOver!!
    }

private var _kettlePourOver: ImageVector? = null
