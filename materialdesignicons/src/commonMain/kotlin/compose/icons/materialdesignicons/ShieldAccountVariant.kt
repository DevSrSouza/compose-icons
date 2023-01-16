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

public val MaterialDesignIcons.ShieldAccountVariant: ImageVector
    get() {
        if (_shieldAccountVariant != null) {
            return _shieldAccountVariant!!
        }
        _shieldAccountVariant = Builder(name = "ShieldAccountVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 11.0f)
                curveTo(17.3f, 11.0f, 17.7f, 11.0f, 18.0f, 11.1f)
                verticalLineTo(6.3f)
                lineTo(10.5f, 3.0f)
                lineTo(3.0f, 6.3f)
                verticalLineTo(11.2f)
                curveTo(3.0f, 15.7f, 6.2f, 20.0f, 10.5f, 21.0f)
                curveTo(11.1f, 20.9f, 11.6f, 20.7f, 12.1f, 20.5f)
                curveTo(11.4f, 19.5f, 11.0f, 18.3f, 11.0f, 17.0f)
                curveTo(11.0f, 13.7f, 13.7f, 11.0f, 17.0f, 11.0f)
                moveTo(17.0f, 13.0f)
                curveTo(14.8f, 13.0f, 13.0f, 14.8f, 13.0f, 17.0f)
                reflectiveCurveTo(14.8f, 21.0f, 17.0f, 21.0f)
                reflectiveCurveTo(21.0f, 19.2f, 21.0f, 17.0f)
                reflectiveCurveTo(19.2f, 13.0f, 17.0f, 13.0f)
                moveTo(17.0f, 14.4f)
                curveTo(17.6f, 14.4f, 18.1f, 14.9f, 18.1f, 15.5f)
                curveTo(18.1f, 16.1f, 17.6f, 16.6f, 17.0f, 16.6f)
                reflectiveCurveTo(15.9f, 16.1f, 15.9f, 15.5f)
                reflectiveCurveTo(16.4f, 14.4f, 17.0f, 14.4f)
                moveTo(17.0f, 19.8f)
                curveTo(16.1f, 19.8f, 15.3f, 19.3f, 14.8f, 18.6f)
                curveTo(14.9f, 17.9f, 16.3f, 17.5f, 17.0f, 17.5f)
                reflectiveCurveTo(19.2f, 17.9f, 19.2f, 18.6f)
                curveTo(18.7f, 19.3f, 17.9f, 19.8f, 17.0f, 19.8f)
                close()
            }
        }
        .build()
        return _shieldAccountVariant!!
    }

private var _shieldAccountVariant: ImageVector? = null
