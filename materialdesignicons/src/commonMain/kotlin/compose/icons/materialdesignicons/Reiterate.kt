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

public val MaterialDesignIcons.Reiterate: ImageVector
    get() {
        if (_reiterate != null) {
            return _reiterate!!
        }
        _reiterate = Builder(name = "Reiterate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 4.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 4.0f, 10.0f)
                horizontalLineTo(1.0f)
                lineTo(5.0f, 14.0f)
                lineTo(9.0f, 10.0f)
                horizontalLineTo(6.03f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 10.5f, 6.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 15.0f, 10.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 10.5f, 15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 17.0f, 10.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 10.5f, 4.0f)
                moveTo(19.0f, 12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 14.24f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                lineTo(23.0f, 16.0f)
                close()
            }
        }
        .build()
        return _reiterate!!
    }

private var _reiterate: ImageVector? = null
