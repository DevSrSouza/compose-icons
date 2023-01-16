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

public val MaterialDesignIcons.Hours24: ImageVector
    get() {
        if (_hours24 != null) {
            return _hours24!!
        }
        _hours24 = Builder(name = "Hours24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.05f)
                verticalLineTo(4.07f)
                curveTo(16.95f, 4.56f, 20.0f, 7.92f, 20.0f, 12.0f)
                curveTo(20.0f, 15.21f, 18.08f, 18.0f, 15.28f, 19.28f)
                lineTo(13.0f, 17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                lineTo(16.78f, 20.78f)
                curveTo(19.91f, 19.07f, 22.0f, 15.76f, 22.0f, 12.0f)
                curveTo(22.0f, 6.82f, 18.05f, 2.55f, 13.0f, 2.05f)
                moveTo(11.0f, 2.0f)
                curveTo(9.05f, 2.2f, 7.2f, 2.96f, 5.68f, 4.21f)
                lineTo(7.1f, 5.63f)
                curveTo(8.23f, 4.75f, 9.58f, 4.2f, 11.0f, 4.0f)
                verticalLineTo(2.0f)
                moveTo(4.2f, 5.68f)
                curveTo(2.96f, 7.2f, 2.2f, 9.05f, 2.0f, 11.0f)
                horizontalLineTo(4.0f)
                curveTo(4.19f, 9.58f, 4.75f, 8.23f, 5.63f, 7.1f)
                lineTo(4.2f, 5.68f)
                moveTo(6.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 11.0f, 6.0f, 11.9f, 6.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                curveTo(10.11f, 13.0f, 11.0f, 12.11f, 11.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(11.0f, 8.9f, 10.11f, 8.0f, 9.0f, 8.0f)
                horizontalLineTo(6.0f)
                moveTo(12.0f, 8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                moveTo(2.0f, 13.0f)
                curveTo(2.2f, 14.95f, 2.97f, 16.8f, 4.22f, 18.32f)
                lineTo(5.64f, 16.9f)
                curveTo(4.76f, 15.77f, 4.2f, 14.42f, 4.0f, 13.0f)
                horizontalLineTo(2.0f)
                moveTo(7.11f, 18.37f)
                lineTo(5.68f, 19.79f)
                curveTo(7.2f, 21.03f, 9.05f, 21.8f, 11.0f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(9.58f, 19.81f, 8.24f, 19.25f, 7.11f, 18.37f)
                close()
            }
        }
        .build()
        return _hours24!!
    }

private var _hours24: ImageVector? = null
