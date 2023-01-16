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

public val MaterialDesignIcons.SilverwareForkKnife: ImageVector
    get() {
        if (_silverwareForkKnife != null) {
            return _silverwareForkKnife!!
        }
        _silverwareForkKnife = Builder(name = "SilverwareForkKnife", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 11.12f, 4.66f, 12.84f, 6.75f, 12.97f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.25f)
                verticalLineTo(12.97f)
                curveTo(11.34f, 12.84f, 13.0f, 11.12f, 13.0f, 9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                moveTo(16.0f, 6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(2.0f)
                curveTo(18.24f, 2.0f, 16.0f, 4.24f, 16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _silverwareForkKnife!!
    }

private var _silverwareForkKnife: ImageVector? = null
