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

public val MaterialDesignIcons.NavigationOutline: ImageVector
    get() {
        if (_navigationOutline != null) {
            return _navigationOutline!!
        }
        _navigationOutline = Builder(name = "NavigationOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.3f)
                lineTo(16.3f, 17.7f)
                lineTo(12.8f, 16.2f)
                lineTo(12.0f, 15.8f)
                lineTo(11.2f, 16.2f)
                lineTo(7.7f, 17.7f)
                lineTo(12.0f, 7.3f)
                moveTo(12.0f, 2.0f)
                lineTo(4.5f, 20.3f)
                lineTo(5.2f, 21.0f)
                lineTo(12.0f, 18.0f)
                lineTo(18.8f, 21.0f)
                lineTo(19.5f, 20.3f)
                lineTo(12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _navigationOutline!!
    }

private var _navigationOutline: ImageVector? = null
