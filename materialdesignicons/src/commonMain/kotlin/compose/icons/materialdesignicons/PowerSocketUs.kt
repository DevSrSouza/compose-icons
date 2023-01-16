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

public val MaterialDesignIcons.PowerSocketUs: ImageVector
    get() {
        if (_powerSocketUs != null) {
            return _powerSocketUs!!
        }
        _powerSocketUs = Builder(name = "PowerSocketUs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                moveTo(4.22f, 2.0f)
                horizontalLineTo(19.78f)
                curveTo(21.0f, 2.0f, 22.0f, 3.0f, 22.0f, 4.22f)
                verticalLineTo(19.78f)
                arcTo(2.22f, 2.22f, 0.0f, false, true, 19.78f, 22.0f)
                horizontalLineTo(4.22f)
                curveTo(3.0f, 22.0f, 2.0f, 21.0f, 2.0f, 19.78f)
                verticalLineTo(4.22f)
                arcTo(2.22f, 2.22f, 0.0f, false, true, 4.22f, 2.0f)
                moveTo(12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 4.0f)
                moveTo(14.0f, 7.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.5f)
                moveTo(10.5f, 16.25f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 14.75f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 16.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(16.25f)
                close()
            }
        }
        .build()
        return _powerSocketUs!!
    }

private var _powerSocketUs: ImageVector? = null
