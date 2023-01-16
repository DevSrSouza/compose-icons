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

public val MaterialDesignIcons.MagnifyScan: ImageVector
    get() {
        if (_magnifyScan != null) {
            return _magnifyScan!!
        }
        _magnifyScan = Builder(name = "MagnifyScan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.5f)
                curveTo(22.0f, 20.89f, 21.84f, 21.24f, 21.54f, 21.54f)
                curveTo(21.24f, 21.84f, 20.89f, 22.0f, 20.5f, 22.0f)
                horizontalLineTo(17.0f)
                moveTo(7.0f, 22.0f)
                horizontalLineTo(3.5f)
                curveTo(3.11f, 22.0f, 2.76f, 21.84f, 2.46f, 21.54f)
                curveTo(2.16f, 21.24f, 2.0f, 20.89f, 2.0f, 20.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                moveTo(17.0f, 2.0f)
                horizontalLineTo(20.5f)
                curveTo(20.89f, 2.0f, 21.24f, 2.16f, 21.54f, 2.46f)
                curveTo(21.84f, 2.76f, 22.0f, 3.11f, 22.0f, 3.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                moveTo(7.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.5f)
                curveTo(2.0f, 3.11f, 2.16f, 2.76f, 2.46f, 2.46f)
                curveTo(2.76f, 2.16f, 3.11f, 2.0f, 3.5f, 2.0f)
                horizontalLineTo(7.0f)
                moveTo(10.5f, 6.0f)
                curveTo(13.0f, 6.0f, 15.0f, 8.0f, 15.0f, 10.5f)
                curveTo(15.0f, 11.38f, 14.75f, 12.2f, 14.31f, 12.9f)
                lineTo(17.57f, 16.16f)
                lineTo(16.16f, 17.57f)
                lineTo(12.9f, 14.31f)
                curveTo(12.2f, 14.75f, 11.38f, 15.0f, 10.5f, 15.0f)
                curveTo(8.0f, 15.0f, 6.0f, 13.0f, 6.0f, 10.5f)
                curveTo(6.0f, 8.0f, 8.0f, 6.0f, 10.5f, 6.0f)
                moveTo(10.5f, 8.0f)
                curveTo(9.12f, 8.0f, 8.0f, 9.12f, 8.0f, 10.5f)
                curveTo(8.0f, 11.88f, 9.12f, 13.0f, 10.5f, 13.0f)
                curveTo(11.88f, 13.0f, 13.0f, 11.88f, 13.0f, 10.5f)
                curveTo(13.0f, 9.12f, 11.88f, 8.0f, 10.5f, 8.0f)
                close()
            }
        }
        .build()
        return _magnifyScan!!
    }

private var _magnifyScan: ImageVector? = null
