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

public val MaterialDesignIcons.ShieldEditOutline: ImageVector
    get() {
        if (_shieldEditOutline != null) {
            return _shieldEditOutline!!
        }
        _shieldEditOutline = Builder(name = "ShieldEditOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7f, 13.6f)
                lineTo(20.4f, 12.3f)
                curveTo(20.3f, 12.2f, 20.2f, 12.1f, 20.0f, 12.1f)
                curveTo(19.9f, 12.1f, 19.7f, 12.2f, 19.6f, 12.3f)
                lineTo(18.6f, 13.3f)
                lineTo(20.6f, 15.3f)
                lineTo(21.6f, 14.3f)
                curveTo(21.9f, 14.1f, 21.9f, 13.8f, 21.7f, 13.6f)
                moveTo(12.0f, 19.9f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.1f)
                lineTo(20.2f, 15.9f)
                lineTo(18.2f, 13.8f)
                lineTo(12.0f, 19.9f)
                moveTo(10.0f, 22.3f)
                curveTo(5.9f, 20.3f, 3.0f, 15.8f, 3.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                lineTo(21.0f, 5.0f)
                verticalLineTo(8.1f)
                lineTo(19.0f, 10.1f)
                verticalLineTo(6.3f)
                lineTo(12.0f, 3.2f)
                lineTo(5.0f, 6.3f)
                verticalLineTo(11.2f)
                curveTo(5.0f, 14.7f, 7.2f, 18.3f, 10.0f, 20.1f)
                verticalLineTo(22.3f)
                close()
            }
        }
        .build()
        return _shieldEditOutline!!
    }

private var _shieldEditOutline: ImageVector? = null
