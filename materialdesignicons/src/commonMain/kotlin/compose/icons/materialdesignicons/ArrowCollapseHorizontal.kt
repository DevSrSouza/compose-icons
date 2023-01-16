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

public val MaterialDesignIcons.ArrowCollapseHorizontal: ImageVector
    get() {
        if (_arrowCollapseHorizontal != null) {
            return _arrowCollapseHorizontal!!
        }
        _arrowCollapseHorizontal = Builder(name = "ArrowCollapseHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.03f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                moveTo(10.0f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.03f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                moveTo(5.0f, 8.0f)
                lineTo(9.03f, 12.0f)
                lineTo(5.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                moveTo(20.0f, 16.0f)
                lineTo(16.0f, 12.0f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _arrowCollapseHorizontal!!
    }

private var _arrowCollapseHorizontal: ImageVector? = null
