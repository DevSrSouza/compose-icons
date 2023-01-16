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

public val MaterialDesignIcons.Cash100: ImageVector
    get() {
        if (_cash100 != null) {
            return _cash100!!
        }
        _cash100 = Builder(name = "Cash100", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                moveTo(20.0f, 18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                moveTo(17.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 10.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 17.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 15.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 8.0f)
                horizontalLineTo(17.0f)
                moveTo(17.0f, 13.0f)
                verticalLineTo(12.0f)
                curveTo(17.0f, 10.9f, 16.33f, 10.0f, 15.5f, 10.0f)
                curveTo(14.67f, 10.0f, 14.0f, 10.9f, 14.0f, 12.0f)
                verticalLineTo(13.0f)
                curveTo(14.0f, 14.1f, 14.67f, 15.0f, 15.5f, 15.0f)
                curveTo(16.33f, 15.0f, 17.0f, 14.1f, 17.0f, 13.0f)
                moveTo(15.5f, 11.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 16.0f, 11.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.5f, 14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 13.5f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.5f, 11.0f)
                moveTo(13.0f, 13.0f)
                verticalLineTo(12.0f)
                curveTo(13.0f, 10.9f, 12.33f, 10.0f, 11.5f, 10.0f)
                curveTo(10.67f, 10.0f, 10.0f, 10.9f, 10.0f, 12.0f)
                verticalLineTo(13.0f)
                curveTo(10.0f, 14.1f, 10.67f, 15.0f, 11.5f, 15.0f)
                curveTo(12.33f, 15.0f, 13.0f, 14.1f, 13.0f, 13.0f)
                moveTo(11.5f, 11.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 11.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 13.5f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 11.0f)
                moveTo(8.0f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                lineTo(7.0f, 10.5f)
                verticalLineTo(11.5f)
                lineTo(8.0f, 11.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _cash100!!
    }

private var _cash100: ImageVector? = null
