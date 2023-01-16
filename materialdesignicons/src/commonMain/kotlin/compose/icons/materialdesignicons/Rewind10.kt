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

public val MaterialDesignIcons.Rewind10: ImageVector
    get() {
        if (_rewind10 != null) {
            return _rewind10!!
        }
        _rewind10 = Builder(name = "Rewind10", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 3.0f)
                curveTo(17.15f, 3.0f, 21.08f, 6.03f, 22.47f, 10.22f)
                lineTo(20.1f, 11.0f)
                curveTo(19.05f, 7.81f, 16.04f, 5.5f, 12.5f, 5.5f)
                curveTo(10.54f, 5.5f, 8.77f, 6.22f, 7.38f, 7.38f)
                lineTo(10.0f, 10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                lineTo(5.6f, 5.6f)
                curveTo(7.45f, 4.0f, 9.85f, 3.0f, 12.5f, 3.0f)
                moveTo(10.0f, 12.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                moveTo(18.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 21.11f, 17.11f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 20.0f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 12.0f)
                horizontalLineTo(16.0f)
                curveTo(17.11f, 12.0f, 18.0f, 12.9f, 18.0f, 14.0f)
                moveTo(14.0f, 14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _rewind10!!
    }

private var _rewind10: ImageVector? = null
