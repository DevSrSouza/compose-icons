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

public val MaterialDesignIcons.AnimationPlay: ImageVector
    get() {
        if (_animationPlay != null) {
            return _animationPlay!!
        }
        _animationPlay = Builder(name = "AnimationPlay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.89f, 2.89f, 2.0f, 4.0f, 2.0f)
                moveTo(8.0f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                curveTo(6.0f, 6.89f, 6.89f, 6.0f, 8.0f, 6.0f)
                moveTo(12.0f, 10.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 10.0f, 22.0f, 10.89f, 22.0f, 12.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 21.11f, 21.11f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(12.0f)
                curveTo(10.89f, 22.0f, 10.0f, 21.11f, 10.0f, 20.0f)
                verticalLineTo(12.0f)
                curveTo(10.0f, 10.89f, 10.89f, 10.0f, 12.0f, 10.0f)
                moveTo(14.0f, 12.0f)
                verticalLineTo(20.0f)
                lineTo(20.0f, 16.0f)
                lineTo(14.0f, 12.0f)
                close()
            }
        }
        .build()
        return _animationPlay!!
    }

private var _animationPlay: ImageVector? = null
