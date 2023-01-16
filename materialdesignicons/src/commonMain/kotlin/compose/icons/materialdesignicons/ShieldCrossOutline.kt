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

public val MaterialDesignIcons.ShieldCrossOutline: ImageVector
    get() {
        if (_shieldCrossOutline != null) {
            return _shieldCrossOutline!!
        }
        _shieldCrossOutline = Builder(name = "ShieldCrossOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                curveTo(21.0f, 16.5f, 17.2f, 21.7f, 12.0f, 23.0f)
                curveTo(6.8f, 21.7f, 3.0f, 16.5f, 3.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                lineTo(21.0f, 5.0f)
                verticalLineTo(11.0f)
                moveTo(12.0f, 21.0f)
                curveTo(15.8f, 20.0f, 19.0f, 15.5f, 19.0f, 11.2f)
                verticalLineTo(6.3f)
                lineTo(12.0f, 3.2f)
                lineTo(5.0f, 6.3f)
                verticalLineTo(11.2f)
                curveTo(5.0f, 15.5f, 8.3f, 20.0f, 12.0f, 21.0f)
                moveTo(16.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _shieldCrossOutline!!
    }

private var _shieldCrossOutline: ImageVector? = null
