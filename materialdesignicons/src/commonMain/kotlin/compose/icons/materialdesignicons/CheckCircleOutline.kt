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

public val MaterialDesignIcons.CheckCircleOutline: ImageVector
    get() {
        if (_checkCircleOutline != null) {
            return _checkCircleOutline!!
        }
        _checkCircleOutline = Builder(name = "CheckCircleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 20.0f)
                curveTo(7.59f, 20.0f, 4.0f, 16.41f, 4.0f, 12.0f)
                reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(20.0f, 7.59f, 20.0f, 12.0f)
                reflectiveCurveTo(16.41f, 20.0f, 12.0f, 20.0f)
                moveTo(16.59f, 7.58f)
                lineTo(10.0f, 14.17f)
                lineTo(7.41f, 11.59f)
                lineTo(6.0f, 13.0f)
                lineTo(10.0f, 17.0f)
                lineTo(18.0f, 9.0f)
                lineTo(16.59f, 7.58f)
                close()
            }
        }
        .build()
        return _checkCircleOutline!!
    }

private var _checkCircleOutline: ImageVector? = null
