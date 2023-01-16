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

public val MaterialDesignIcons.HomeRoof: ImageVector
    get() {
        if (_homeRoof != null) {
            return _homeRoof!!
        }
        _homeRoof = Builder(name = "HomeRoof", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                horizontalLineTo(22.0f)
                lineTo(12.0f, 7.0f)
                lineTo(2.0f, 16.0f)
                horizontalLineTo(5.0f)
                lineTo(12.0f, 9.69f)
                lineTo(19.0f, 16.0f)
                moveTo(7.0f, 8.81f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.5f)
                lineTo(7.0f, 8.81f)
                close()
            }
        }
        .build()
        return _homeRoof!!
    }

private var _homeRoof: ImageVector? = null
