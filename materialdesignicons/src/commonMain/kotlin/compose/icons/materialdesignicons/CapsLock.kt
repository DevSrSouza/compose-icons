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

public val MaterialDesignIcons.CapsLock: ImageVector
    get() {
        if (_capsLock != null) {
            return _capsLock!!
        }
        _capsLock = Builder(name = "CapsLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.96f, 13.71f)
                lineTo(12.0f, 8.29f)
                lineTo(14.03f, 13.72f)
                moveTo(11.14f, 6.0f)
                lineTo(6.43f, 18.0f)
                horizontalLineTo(8.36f)
                lineTo(9.32f, 15.43f)
                horizontalLineTo(14.68f)
                lineTo(15.64f, 18.0f)
                horizontalLineTo(17.57f)
                lineTo(12.86f, 6.0f)
                horizontalLineTo(11.14f)
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 2.0f, 2.0f, 2.89f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 22.0f, 22.0f, 21.11f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.89f, 21.1f, 2.0f, 20.0f, 2.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _capsLock!!
    }

private var _capsLock: ImageVector? = null
