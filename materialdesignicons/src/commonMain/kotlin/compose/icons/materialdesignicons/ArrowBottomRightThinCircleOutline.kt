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

public val MaterialDesignIcons.ArrowBottomRightThinCircleOutline: ImageVector
    get() {
        if (_arrowBottomRightThinCircleOutline != null) {
            return _arrowBottomRightThinCircleOutline!!
        }
        _arrowBottomRightThinCircleOutline = Builder(name = "ArrowBottomRightThinCircleOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.03f)
                curveTo(7.59f, 20.03f, 3.97f, 16.41f, 3.97f, 12.0f)
                curveTo(3.97f, 7.59f, 7.59f, 3.97f, 12.0f, 3.97f)
                curveTo(16.41f, 3.97f, 20.03f, 7.59f, 20.03f, 12.0f)
                curveTo(20.03f, 16.41f, 16.41f, 20.03f, 12.0f, 20.03f)
                moveTo(12.0f, 22.0f)
                curveTo(17.54f, 22.0f, 22.0f, 17.54f, 22.0f, 12.0f)
                curveTo(22.0f, 6.46f, 17.54f, 2.0f, 12.0f, 2.0f)
                curveTo(6.46f, 2.0f, 2.0f, 6.46f, 2.0f, 12.0f)
                curveTo(2.0f, 17.54f, 6.46f, 22.0f, 12.0f, 22.0f)
                moveTo(13.88f, 12.47f)
                lineTo(16.0f, 10.36f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.36f)
                lineTo(12.47f, 13.88f)
                lineTo(7.5f, 8.9f)
                lineTo(8.9f, 7.5f)
            }
        }
        .build()
        return _arrowBottomRightThinCircleOutline!!
    }

private var _arrowBottomRightThinCircleOutline: ImageVector? = null
