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

public val MaterialDesignIcons.ShieldPlus: ImageVector
    get() {
        if (_shieldPlus != null) {
            return _shieldPlus!!
        }
        _shieldPlus = Builder(name = "ShieldPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 20.0f)
                verticalLineTo(22.97f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                moveTo(12.0f, 1.0f)
                lineTo(21.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 11.9f, 20.9f, 12.78f, 20.71f, 13.65f)
                curveTo(19.9f, 13.23f, 19.0f, 13.0f, 18.0f, 13.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 19.0f)
                curveTo(12.0f, 20.36f, 12.45f, 21.62f, 13.22f, 22.62f)
                lineTo(12.0f, 23.0f)
                curveTo(6.84f, 21.74f, 3.0f, 16.55f, 3.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _shieldPlus!!
    }

private var _shieldPlus: ImageVector? = null
