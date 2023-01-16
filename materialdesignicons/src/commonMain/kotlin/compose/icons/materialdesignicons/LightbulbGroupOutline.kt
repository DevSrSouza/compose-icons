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

public val MaterialDesignIcons.LightbulbGroupOutline: ImageVector
    get() {
        if (_lightbulbGroupOutline != null) {
            return _lightbulbGroupOutline!!
        }
        _lightbulbGroupOutline = Builder(name = "LightbulbGroupOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 19.0f)
                arcTo(2.93f, 2.93f, 0.0f, false, false, 7.17f, 20.0f)
                horizontalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                moveTo(10.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 20.0f)
                horizontalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                moveTo(4.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.88f)
                arcTo(6.92f, 6.92f, 0.0f, false, true, 5.0f, 10.0f)
                arcTo(6.79f, 6.79f, 0.0f, false, true, 5.68f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.0f, 14.45f)
                moveTo(17.0f, 19.0f)
                arcTo(2.93f, 2.93f, 0.0f, false, true, 16.83f, 20.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                moveTo(17.0f, 10.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 15.0f, 14.0f)
                verticalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 17.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 16.0f)
                verticalLineTo(14.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, true, 17.0f, 10.0f)
                moveTo(15.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 11.0f, 12.82f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.82f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 10.0f)
                moveTo(18.32f, 7.0f)
                arcTo(6.79f, 6.79f, 0.0f, false, true, 19.0f, 10.0f)
                arcTo(6.92f, 6.92f, 0.0f, false, true, 17.0f, 14.88f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 16.0f)
                verticalLineTo(14.45f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 18.32f, 7.0f)
                close()
            }
        }
        .build()
        return _lightbulbGroupOutline!!
    }

private var _lightbulbGroupOutline: ImageVector? = null
