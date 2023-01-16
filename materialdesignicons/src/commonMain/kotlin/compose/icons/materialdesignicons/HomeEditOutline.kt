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

public val MaterialDesignIcons.HomeEditOutline: ImageVector
    get() {
        if (_homeEditOutline != null) {
            return _homeEditOutline!!
        }
        _homeEditOutline = Builder(name = "HomeEditOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0413f, 11.14f)
                curveTo(21.1827f, 11.14f, 21.3173f, 11.1973f, 21.4213f, 11.3027f)
                lineTo(22.6973f, 12.5787f)
                curveTo(22.912f, 12.792f, 22.912f, 13.14f, 22.6973f, 13.3493f)
                lineTo(21.6973f, 14.3493f)
                lineTo(19.6507f, 12.3027f)
                lineTo(20.6507f, 11.3027f)
                curveTo(20.76f, 11.1973f, 20.9013f, 11.14f, 21.0413f, 11.14f)
                close()
                moveTo(19.0627f, 12.88f)
                lineTo(21.1093f, 14.932f)
                lineTo(15.0627f, 21.0f)
                lineTo(13.0f, 21.0f)
                lineTo(13.0f, 18.9373f)
                lineTo(19.0627f, 12.88f)
                close()
                moveTo(12.0f, 5.688f)
                lineTo(7.0f, 10.188f)
                lineTo(7.0f, 18.0f)
                lineTo(11.0f, 18.0f)
                lineTo(11.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                lineTo(5.0f, 12.0f)
                lineTo(2.0f, 12.0f)
                lineTo(12.0f, 3.0f)
                lineTo(19.4587f, 9.7128f)
                lineTo(17.0f, 12.1716f)
                lineTo(17.0f, 10.188f)
                lineTo(12.0f, 5.688f)
                close()
            }
        }
        .build()
        return _homeEditOutline!!
    }

private var _homeEditOutline: ImageVector? = null
