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

public val MaterialDesignIcons.Soundbar: ImageVector
    get() {
        if (_soundbar != null) {
            return _soundbar!!
        }
        _soundbar = Builder(name = "Soundbar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                curveTo(2.9f, 8.0f, 2.0f, 8.9f, 2.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 15.11f, 2.9f, 16.0f, 4.0f, 16.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 16.0f, 22.0f, 15.11f, 22.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(22.0f, 8.9f, 21.11f, 8.0f, 20.0f, 8.0f)
                moveTo(9.0f, 10.0f)
                curveTo(10.11f, 10.0f, 11.0f, 10.9f, 11.0f, 12.0f)
                curveTo(11.0f, 13.11f, 10.11f, 14.0f, 9.0f, 14.0f)
                curveTo(7.9f, 14.0f, 7.0f, 13.11f, 7.0f, 12.0f)
                curveTo(7.0f, 10.9f, 7.9f, 10.0f, 9.0f, 10.0f)
                moveTo(15.0f, 10.0f)
                curveTo(16.11f, 10.0f, 17.0f, 10.9f, 17.0f, 12.0f)
                curveTo(17.0f, 13.11f, 16.11f, 14.0f, 15.0f, 14.0f)
                curveTo(13.9f, 14.0f, 13.0f, 13.11f, 13.0f, 12.0f)
                curveTo(13.0f, 10.9f, 13.9f, 10.0f, 15.0f, 10.0f)
                moveTo(5.0f, 11.0f)
                curveTo(5.55f, 11.0f, 6.0f, 11.45f, 6.0f, 12.0f)
                curveTo(6.0f, 12.55f, 5.55f, 13.0f, 5.0f, 13.0f)
                curveTo(4.45f, 13.0f, 4.0f, 12.55f, 4.0f, 12.0f)
                curveTo(4.0f, 11.45f, 4.45f, 11.0f, 5.0f, 11.0f)
                moveTo(9.0f, 11.0f)
                curveTo(8.45f, 11.0f, 8.0f, 11.45f, 8.0f, 12.0f)
                curveTo(8.0f, 12.55f, 8.45f, 13.0f, 9.0f, 13.0f)
                curveTo(9.55f, 13.0f, 10.0f, 12.55f, 10.0f, 12.0f)
                curveTo(10.0f, 11.45f, 9.55f, 11.0f, 9.0f, 11.0f)
                moveTo(15.0f, 11.0f)
                curveTo(14.45f, 11.0f, 14.0f, 11.45f, 14.0f, 12.0f)
                curveTo(14.0f, 12.55f, 14.45f, 13.0f, 15.0f, 13.0f)
                curveTo(15.55f, 13.0f, 16.0f, 12.55f, 16.0f, 12.0f)
                curveTo(16.0f, 11.45f, 15.55f, 11.0f, 15.0f, 11.0f)
                moveTo(19.0f, 11.0f)
                curveTo(19.55f, 11.0f, 20.0f, 11.45f, 20.0f, 12.0f)
                curveTo(20.0f, 12.55f, 19.55f, 13.0f, 19.0f, 13.0f)
                curveTo(18.45f, 13.0f, 18.0f, 12.55f, 18.0f, 12.0f)
                curveTo(18.0f, 11.45f, 18.45f, 11.0f, 19.0f, 11.0f)
                close()
            }
        }
        .build()
        return _soundbar!!
    }

private var _soundbar: ImageVector? = null
