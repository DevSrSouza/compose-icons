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

public val MaterialDesignIcons.PercentBoxOutline: ImageVector
    get() {
        if (_percentBoxOutline != null) {
            return _percentBoxOutline!!
        }
        _percentBoxOutline = Builder(name = "PercentBoxOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.11f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                moveTo(17.0f, 15.22f)
                curveTo(17.0f, 16.2f, 16.2f, 17.0f, 15.22f, 17.0f)
                curveTo(14.24f, 17.0f, 13.45f, 16.2f, 13.45f, 15.22f)
                curveTo(13.45f, 14.24f, 14.24f, 13.45f, 15.22f, 13.45f)
                curveTo(16.2f, 13.45f, 17.0f, 14.24f, 17.0f, 15.22f)
                moveTo(8.5f, 17.03f)
                lineTo(7.0f, 15.53f)
                lineTo(15.53f, 7.0f)
                lineTo(17.03f, 8.5f)
                lineTo(8.5f, 17.03f)
                moveTo(7.05f, 8.83f)
                curveTo(7.05f, 7.84f, 7.84f, 7.05f, 8.83f, 7.05f)
                curveTo(9.81f, 7.05f, 10.6f, 7.84f, 10.6f, 8.83f)
                curveTo(10.6f, 9.81f, 9.81f, 10.6f, 8.83f, 10.6f)
                curveTo(7.84f, 10.6f, 7.05f, 9.81f, 7.05f, 8.83f)
                close()
            }
        }
        .build()
        return _percentBoxOutline!!
    }

private var _percentBoxOutline: ImageVector? = null
