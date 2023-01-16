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

public val MaterialDesignIcons.CompassRose: ImageVector
    get() {
        if (_compassRose != null) {
            return _compassRose!!
        }
        _compassRose = Builder(name = "CompassRose", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                lineTo(12.0f, 0.0f)
                lineTo(9.0f, 9.0f)
                lineTo(0.0f, 12.0f)
                lineTo(9.0f, 15.0f)
                lineTo(12.0f, 24.0f)
                lineTo(15.0f, 15.0f)
                lineTo(24.0f, 12.0f)
                lineTo(15.0f, 9.0f)
                moveTo(4.0f, 12.0f)
                lineTo(10.0f, 10.0f)
                lineTo(11.0f, 12.0f)
                horizontalLineTo(4.0f)
                moveTo(12.0f, 20.0f)
                lineTo(10.0f, 14.0f)
                lineTo(12.0f, 13.0f)
                verticalLineTo(20.0f)
                moveTo(12.0f, 4.0f)
                lineTo(14.0f, 10.0f)
                lineTo(12.0f, 11.0f)
                verticalLineTo(4.0f)
                moveTo(14.0f, 14.0f)
                lineTo(13.0f, 12.0f)
                horizontalLineTo(20.0f)
                lineTo(14.0f, 14.0f)
                moveTo(8.7f, 17.3f)
                lineTo(5.0f, 19.0f)
                lineTo(6.7f, 15.3f)
                lineTo(8.3f, 15.8f)
                lineTo(8.7f, 17.3f)
                moveTo(17.3f, 15.3f)
                lineTo(19.0f, 19.0f)
                lineTo(15.3f, 17.3f)
                lineTo(15.8f, 15.7f)
                lineTo(17.3f, 15.3f)
                moveTo(6.7f, 8.7f)
                lineTo(5.0f, 5.0f)
                lineTo(8.7f, 6.7f)
                lineTo(8.2f, 8.2f)
                lineTo(6.7f, 8.7f)
                moveTo(15.3f, 6.7f)
                lineTo(19.0f, 5.0f)
                lineTo(17.3f, 8.7f)
                lineTo(15.7f, 8.2f)
                lineTo(15.3f, 6.7f)
                close()
            }
        }
        .build()
        return _compassRose!!
    }

private var _compassRose: ImageVector? = null
