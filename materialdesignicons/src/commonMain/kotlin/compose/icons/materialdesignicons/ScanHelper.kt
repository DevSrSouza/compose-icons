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

public val MaterialDesignIcons.ScanHelper: ImageVector
    get() {
        if (_scanHelper != null) {
            return _scanHelper!!
        }
        _scanHelper = Builder(name = "ScanHelper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(2.0f)
                moveTo(24.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 24.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(22.0f)
                moveTo(2.0f, 24.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(2.0f)
                moveTo(22.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 24.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _scanHelper!!
    }

private var _scanHelper: ImageVector? = null
