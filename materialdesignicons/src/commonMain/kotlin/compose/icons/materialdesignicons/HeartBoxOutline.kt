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

public val MaterialDesignIcons.HeartBoxOutline: ImageVector
    get() {
        if (_heartBoxOutline != null) {
            return _heartBoxOutline!!
        }
        _heartBoxOutline = Builder(name = "HeartBoxOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                lineTo(11.28f, 16.34f)
                curveTo(8.7f, 14.0f, 7.0f, 12.46f, 7.0f, 10.57f)
                curveTo(7.0f, 9.03f, 8.21f, 7.82f, 9.75f, 7.82f)
                curveTo(10.62f, 7.82f, 11.45f, 8.23f, 12.0f, 8.87f)
                curveTo(12.55f, 8.23f, 13.38f, 7.82f, 14.25f, 7.82f)
                curveTo(15.79f, 7.82f, 17.0f, 9.03f, 17.0f, 10.57f)
                curveTo(17.0f, 12.46f, 15.3f, 14.0f, 12.72f, 16.34f)
                lineTo(12.0f, 17.0f)
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                moveTo(5.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _heartBoxOutline!!
    }

private var _heartBoxOutline: ImageVector? = null
