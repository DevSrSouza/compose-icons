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

public val MaterialDesignIcons.GlassMug: ImageVector
    get() {
        if (_glassMug != null) {
            return _glassMug!!
        }
        _glassMug = Builder(name = "GlassMug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                moveTo(8.0f, 2.0f)
                horizontalLineTo(20.0f)
                lineTo(21.0f, 2.0f)
                verticalLineTo(3.0f)
                lineTo(20.0f, 4.0f)
                verticalLineTo(20.0f)
                lineTo(21.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                lineTo(8.0f, 22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                lineTo(8.0f, 20.0f)
                verticalLineTo(18.6f)
                lineTo(4.2f, 16.83f)
                curveTo(3.5f, 16.5f, 3.0f, 15.82f, 3.0f, 15.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                lineTo(7.0f, 3.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                moveTo(5.0f, 15.0f)
                lineTo(8.0f, 16.39f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _glassMug!!
    }

private var _glassMug: ImageVector? = null
