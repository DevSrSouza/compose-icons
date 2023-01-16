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

public val MaterialDesignIcons.ArrowDecisionAutoOutline: ImageVector
    get() {
        if (_arrowDecisionAutoOutline != null) {
            return _arrowDecisionAutoOutline!!
        }
        _arrowDecisionAutoOutline = Builder(name = "ArrowDecisionAutoOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                verticalLineTo(12.0f)
                curveTo(18.5f, 12.0f, 14.5f, 12.16f, 14.05f, 16.2f)
                curveTo(15.61f, 16.75f, 16.43f, 18.47f, 15.88f, 20.03f)
                curveTo(15.33f, 21.59f, 13.61f, 22.41f, 12.05f, 21.86f)
                curveTo(10.5f, 21.3f, 9.67f, 19.59f, 10.22f, 18.03f)
                curveTo(10.5f, 17.17f, 11.2f, 16.5f, 12.05f, 16.2f)
                curveTo(12.34f, 12.61f, 15.4f, 9.88f, 19.0f, 10.0f)
                verticalLineTo(7.0f)
                lineTo(23.0f, 11.0f)
                lineTo(19.0f, 15.0f)
                moveTo(14.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 19.0f)
                moveTo(12.0f, 11.12f)
                curveTo(12.58f, 10.46f, 13.25f, 9.89f, 14.0f, 9.43f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                lineTo(13.0f, 1.0f)
                lineTo(9.0f, 5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.12f)
                moveTo(7.2f, 6.0f)
                horizontalLineTo(5.2f)
                lineTo(2.0f, 15.0f)
                horizontalLineTo(3.9f)
                lineTo(4.6f, 13.0f)
                horizontalLineTo(7.8f)
                lineTo(8.5f, 15.0f)
                horizontalLineTo(10.4f)
                lineTo(7.2f, 6.0f)
                moveTo(5.05f, 11.65f)
                lineTo(6.2f, 8.0f)
                lineTo(7.35f, 11.65f)
                horizontalLineTo(5.05f)
                close()
            }
        }
        .build()
        return _arrowDecisionAutoOutline!!
    }

private var _arrowDecisionAutoOutline: ImageVector? = null
