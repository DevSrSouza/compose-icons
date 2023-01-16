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

public val MaterialDesignIcons.StarCrescent: ImageVector
    get() {
        if (_starCrescent != null) {
            return _starCrescent!!
        }
        _starCrescent = Builder(name = "StarCrescent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.3f, 2.0f)
                curveTo(12.2f, 2.0f, 12.1f, 2.0f, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                curveTo(15.0f, 22.0f, 16.7f, 21.0f, 18.5f, 19.5f)
                curveTo(13.0f, 21.0f, 8.0f, 17.0f, 8.0f, 12.0f)
                curveTo(8.0f, 7.0f, 13.0f, 3.0f, 18.5f, 4.5f)
                curveTo(16.86f, 2.86f, 14.62f, 1.96f, 12.3f, 2.0f)
                moveTo(16.8f, 6.2f)
                lineTo(15.3f, 9.7f)
                lineTo(11.6f, 10.0f)
                lineTo(14.5f, 12.5f)
                lineTo(13.6f, 16.0f)
                lineTo(16.8f, 14.0f)
                lineTo(20.0f, 16.0f)
                lineTo(19.0f, 12.5f)
                lineTo(22.0f, 10.0f)
                lineTo(18.3f, 9.7f)
                lineTo(16.8f, 6.2f)
                close()
            }
        }
        .build()
        return _starCrescent!!
    }

private var _starCrescent: ImageVector? = null
