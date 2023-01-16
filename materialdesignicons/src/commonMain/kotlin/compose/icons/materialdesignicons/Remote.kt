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

public val MaterialDesignIcons.Remote: ImageVector
    get() {
        if (_remote != null) {
            return _remote!!
        }
        _remote = Builder(name = "Remote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(8.96f, 0.0f, 6.21f, 1.23f, 4.22f, 3.22f)
                lineTo(5.63f, 4.63f)
                curveTo(7.26f, 3.0f, 9.5f, 2.0f, 12.0f, 2.0f)
                curveTo(14.5f, 2.0f, 16.74f, 3.0f, 18.36f, 4.64f)
                lineTo(19.77f, 3.23f)
                curveTo(17.79f, 1.23f, 15.04f, 0.0f, 12.0f, 0.0f)
                moveTo(7.05f, 6.05f)
                lineTo(8.46f, 7.46f)
                curveTo(9.37f, 6.56f, 10.62f, 6.0f, 12.0f, 6.0f)
                curveTo(13.38f, 6.0f, 14.63f, 6.56f, 15.54f, 7.46f)
                lineTo(16.95f, 6.05f)
                curveTo(15.68f, 4.78f, 13.93f, 4.0f, 12.0f, 4.0f)
                curveTo(10.07f, 4.0f, 8.32f, 4.78f, 7.05f, 6.05f)
                moveTo(12.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 15.0f)
                moveTo(15.0f, 9.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 10.0f)
                verticalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 23.0f)
                horizontalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 22.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 9.0f)
                close()
            }
        }
        .build()
        return _remote!!
    }

private var _remote: ImageVector? = null
