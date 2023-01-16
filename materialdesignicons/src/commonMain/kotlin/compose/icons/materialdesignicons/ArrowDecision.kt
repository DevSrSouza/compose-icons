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

public val MaterialDesignIcons.ArrowDecision: ImageVector
    get() {
        if (_arrowDecision != null) {
            return _arrowDecision!!
        }
        _arrowDecision = Builder(name = "ArrowDecision", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 1.0f)
                lineTo(16.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.43f)
                curveTo(12.25f, 9.89f, 11.58f, 10.46f, 11.0f, 11.12f)
                verticalLineTo(5.0f)
                moveTo(22.0f, 11.0f)
                lineTo(18.0f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(14.39f, 9.85f, 11.31f, 12.57f, 11.0f, 16.17f)
                curveTo(9.44f, 16.72f, 8.62f, 18.44f, 9.17f, 20.0f)
                curveTo(9.72f, 21.56f, 11.44f, 22.38f, 13.0f, 21.83f)
                curveTo(14.56f, 21.27f, 15.38f, 19.56f, 14.83f, 18.0f)
                curveTo(14.53f, 17.14f, 13.85f, 16.47f, 13.0f, 16.17f)
                curveTo(13.47f, 12.17f, 17.47f, 11.97f, 17.95f, 11.97f)
                verticalLineTo(14.97f)
                lineTo(22.0f, 11.0f)
                moveTo(10.63f, 11.59f)
                curveTo(9.3f, 10.57f, 7.67f, 10.0f, 6.0f, 10.0f)
                verticalLineTo(7.0f)
                lineTo(2.0f, 11.0f)
                lineTo(6.0f, 15.0f)
                verticalLineTo(12.0f)
                curveTo(7.34f, 12.03f, 8.63f, 12.5f, 9.64f, 13.4f)
                curveTo(9.89f, 12.76f, 10.22f, 12.15f, 10.63f, 11.59f)
                close()
            }
        }
        .build()
        return _arrowDecision!!
    }

private var _arrowDecision: ImageVector? = null
