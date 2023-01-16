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

public val MaterialDesignIcons.LightbulbGroup: ImageVector
    get() {
        if (_lightbulbGroup != null) {
            return _lightbulbGroup!!
        }
        _lightbulbGroup = Builder(name = "LightbulbGroup", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                verticalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 17.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 16.0f)
                verticalLineTo(14.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, true, 15.0f, 14.0f)
                moveTo(14.0f, 18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 20.0f)
                horizontalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 19.0f)
                moveTo(7.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 20.0f)
                horizontalLineTo(7.17f)
                arcTo(2.93f, 2.93f, 0.0f, false, true, 7.0f, 19.0f)
                moveTo(5.0f, 10.0f)
                arcTo(6.79f, 6.79f, 0.0f, false, true, 5.68f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.0f, 14.45f)
                verticalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.88f)
                arcTo(6.92f, 6.92f, 0.0f, false, true, 5.0f, 10.0f)
                moveTo(17.0f, 18.0f)
                verticalLineTo(19.0f)
                arcTo(2.93f, 2.93f, 0.0f, false, true, 16.83f, 20.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 19.0f)
                verticalLineTo(18.0f)
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
        return _lightbulbGroup!!
    }

private var _lightbulbGroup: ImageVector? = null
