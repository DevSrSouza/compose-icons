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

public val MaterialDesignIcons.ShieldSword: ImageVector
    get() {
        if (_shieldSword != null) {
            return _shieldSword!!
        }
        _shieldSword = Builder(name = "ShieldSword", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(3.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 16.5f, 6.8f, 21.7f, 12.0f, 23.0f)
                curveTo(17.2f, 21.7f, 21.0f, 16.5f, 21.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                moveTo(15.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                lineTo(10.0f, 7.1f)
                lineTo(12.0f, 5.5f)
                lineTo(14.0f, 7.1f)
                lineTo(13.0f, 13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _shieldSword!!
    }

private var _shieldSword: ImageVector? = null
