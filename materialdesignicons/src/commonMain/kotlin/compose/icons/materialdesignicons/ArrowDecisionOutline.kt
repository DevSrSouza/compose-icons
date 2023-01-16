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

public val MaterialDesignIcons.ArrowDecisionOutline: ImageVector
    get() {
        if (_arrowDecisionOutline != null) {
            return _arrowDecisionOutline!!
        }
        _arrowDecisionOutline = Builder(name = "ArrowDecisionOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.64f, 13.4f)
                curveTo(8.63f, 12.5f, 7.34f, 12.03f, 6.0f, 12.0f)
                verticalLineTo(15.0f)
                lineTo(2.0f, 11.0f)
                lineTo(6.0f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(7.67f, 10.0f, 9.3f, 10.57f, 10.63f, 11.59f)
                curveTo(10.22f, 12.15f, 9.89f, 12.76f, 9.64f, 13.4f)
                moveTo(18.0f, 15.0f)
                verticalLineTo(12.0f)
                curveTo(17.5f, 12.0f, 13.5f, 12.16f, 13.05f, 16.2f)
                curveTo(14.61f, 16.75f, 15.43f, 18.47f, 14.88f, 20.03f)
                curveTo(14.33f, 21.59f, 12.61f, 22.41f, 11.05f, 21.86f)
                curveTo(9.5f, 21.3f, 8.67f, 19.59f, 9.22f, 18.03f)
                curveTo(9.5f, 17.17f, 10.2f, 16.5f, 11.05f, 16.2f)
                curveTo(11.34f, 12.61f, 14.4f, 9.88f, 18.0f, 10.0f)
                verticalLineTo(7.0f)
                lineTo(22.0f, 11.0f)
                lineTo(18.0f, 15.0f)
                moveTo(13.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 19.0f)
                moveTo(11.0f, 11.12f)
                curveTo(11.58f, 10.46f, 12.25f, 9.89f, 13.0f, 9.43f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 1.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.12f)
                close()
            }
        }
        .build()
        return _arrowDecisionOutline!!
    }

private var _arrowDecisionOutline: ImageVector? = null
