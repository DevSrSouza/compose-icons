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

public val MaterialDesignIcons.Bridge: ImageVector
    get() {
        if (_bridge != null) {
            return _bridge!!
        }
        _bridge = Builder(name = "Bridge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 14.0f)
                verticalLineTo(10.91f)
                curveTo(6.28f, 10.58f, 5.61f, 10.18f, 5.0f, 9.71f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                moveTo(5.0f, 18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.43f)
                curveTo(6.8f, 10.0f, 9.27f, 11.0f, 12.0f, 11.0f)
                curveTo(14.73f, 11.0f, 17.2f, 10.0f, 19.0f, 8.43f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                moveTo(17.0f, 10.91f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.71f)
                curveTo(18.39f, 10.18f, 17.72f, 10.58f, 17.0f, 10.91f)
                moveTo(16.0f, 14.0f)
                verticalLineTo(11.32f)
                curveTo(15.36f, 11.55f, 14.69f, 11.72f, 14.0f, 11.84f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                moveTo(13.0f, 14.0f)
                verticalLineTo(11.96f)
                lineTo(12.0f, 12.0f)
                lineTo(11.0f, 11.96f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                moveTo(10.0f, 14.0f)
                verticalLineTo(11.84f)
                curveTo(9.31f, 11.72f, 8.64f, 11.55f, 8.0f, 11.32f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _bridge!!
    }

private var _bridge: ImageVector? = null
