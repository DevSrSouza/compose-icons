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

public val MaterialDesignIcons.Tank: ImageVector
    get() {
        if (_tank != null) {
            return _tank!!
        }
        _tank = Builder(name = "Tank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                lineTo(7.0f, 6.0f)
                horizontalLineTo(12.0f)
                lineTo(13.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                moveTo(13.22f, 7.0f)
                lineTo(13.62f, 9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.22f)
                moveTo(22.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 19.0f)
                horizontalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 2.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 13.0f)
                horizontalLineTo(19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 16.0f)
                moveTo(6.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 16.0f)
                moveTo(13.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 16.0f)
                moveTo(20.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 16.0f)
                close()
            }
        }
        .build()
        return _tank!!
    }

private var _tank: ImageVector? = null
