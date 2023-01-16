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

public val MaterialDesignIcons.Lastpass: ImageVector
    get() {
        if (_lastpass != null) {
            return _lastpass!!
        }
        _lastpass = Builder(name = "Lastpass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 12.0f)
                moveTo(8.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 12.0f)
                moveTo(2.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 12.0f)
                moveTo(22.0f, 5.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _lastpass!!
    }

private var _lastpass: ImageVector? = null
