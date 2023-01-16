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

public val MaterialDesignIcons.AlarmBell: ImageVector
    get() {
        if (_alarmBell != null) {
            return _alarmBell!!
        }
        _alarmBell = Builder(name = "AlarmBell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.66f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.66f)
                curveTo(8.09f, 20.45f, 11.91f, 20.45f, 15.0f, 18.66f)
                moveTo(22.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 2.0f)
                curveTo(19.69f, 2.0f, 19.39f, 2.07f, 19.12f, 2.21f)
                curveTo(18.82f, 2.36f, 18.56f, 2.58f, 18.36f, 2.85f)
                curveTo(17.72f, 3.75f, 17.94f, 5.0f, 18.85f, 5.64f)
                curveTo(19.18f, 5.87f, 19.59f, 6.0f, 20.0f, 6.0f)
                curveTo(20.08f, 6.0f, 20.16f, 6.0f, 20.24f, 6.0f)
                curveTo(21.97f, 10.43f, 20.66f, 15.46f, 17.0f, 18.5f)
                curveTo(16.68f, 18.75f, 16.35f, 19.0f, 16.0f, 19.22f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.74f)
                curveTo(20.14f, 17.5f, 22.0f, 13.86f, 22.0f, 10.0f)
                curveTo(22.0f, 8.5f, 21.72f, 7.0f, 21.17f, 5.62f)
                curveTo(21.69f, 5.24f, 22.0f, 4.64f, 22.0f, 4.0f)
                moveTo(18.0f, 10.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 10.0f, 18.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 2.0f, 10.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 10.0f, 2.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 18.0f, 10.0f)
                close()
            }
        }
        .build()
        return _alarmBell!!
    }

private var _alarmBell: ImageVector? = null
