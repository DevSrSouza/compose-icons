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

public val MaterialDesignIcons.Safe: ImageVector
    get() {
        if (_safe != null) {
            return _safe!!
        }
        _safe = Builder(name = "Safe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 4.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                moveTo(13.5f, 7.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 9.5f, 11.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 13.5f, 15.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 17.5f, 11.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 13.5f, 7.5f)
                moveTo(5.0f, 9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                moveTo(13.5f, 9.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.5f, 11.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.5f, 13.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.5f, 11.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.5f, 9.5f)
                close()
            }
        }
        .build()
        return _safe!!
    }

private var _safe: ImageVector? = null
