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

public val MaterialDesignIcons.Ladder: ImageVector
    get() {
        if (_ladder != null) {
            return _ladder!!
        }
        _ladder = Builder(name = "Ladder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(14.0f)
                moveTo(14.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                moveTo(14.0f, 10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                moveTo(10.0f, 18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _ladder!!
    }

private var _ladder: ImageVector? = null
