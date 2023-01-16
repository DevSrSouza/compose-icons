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

public val MaterialDesignIcons.ArrowDecisionAuto: ImageVector
    get() {
        if (_arrowDecisionAuto != null) {
            return _arrowDecisionAuto!!
        }
        _arrowDecisionAuto = Builder(name = "ArrowDecisionAuto", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                horizontalLineTo(9.0f)
                lineTo(13.0f, 1.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.43f)
                curveTo(13.25f, 9.89f, 12.58f, 10.46f, 12.0f, 11.12f)
                verticalLineTo(5.0f)
                moveTo(10.4f, 15.0f)
                horizontalLineTo(8.5f)
                lineTo(7.8f, 13.0f)
                horizontalLineTo(4.6f)
                lineTo(3.9f, 15.0f)
                horizontalLineTo(2.0f)
                lineTo(5.2f, 6.0f)
                horizontalLineTo(7.2f)
                lineTo(10.4f, 15.0f)
                moveTo(7.35f, 11.65f)
                lineTo(6.2f, 8.0f)
                lineTo(5.05f, 11.65f)
                horizontalLineTo(7.35f)
                moveTo(23.0f, 11.0f)
                lineTo(19.0f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(15.39f, 9.85f, 12.31f, 12.57f, 12.0f, 16.17f)
                curveTo(10.44f, 16.72f, 9.62f, 18.44f, 10.17f, 20.0f)
                curveTo(10.72f, 21.56f, 12.44f, 22.38f, 14.0f, 21.83f)
                curveTo(15.56f, 21.27f, 16.38f, 19.56f, 15.83f, 18.0f)
                curveTo(15.53f, 17.14f, 14.85f, 16.47f, 14.0f, 16.17f)
                curveTo(14.47f, 12.17f, 18.47f, 11.97f, 18.95f, 11.97f)
                verticalLineTo(14.97f)
                lineTo(23.0f, 11.0f)
                close()
            }
        }
        .build()
        return _arrowDecisionAuto!!
    }

private var _arrowDecisionAuto: ImageVector? = null
