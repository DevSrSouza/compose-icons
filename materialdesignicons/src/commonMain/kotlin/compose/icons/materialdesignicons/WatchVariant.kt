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

public val MaterialDesignIcons.WatchVariant: ImageVector
    get() {
        if (_watchVariant != null) {
            return _watchVariant!!
        }
        _watchVariant = Builder(name = "WatchVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                lineTo(7.17f, 5.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(5.0f, 18.11f, 5.9f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(7.17f)
                lineTo(8.0f, 24.0f)
                horizontalLineTo(16.0f)
                lineTo(16.83f, 19.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(19.0f, 5.89f, 18.1f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(16.83f)
                lineTo(16.0f, 0.0f)
                horizontalLineTo(8.0f)
                moveTo(7.0f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _watchVariant!!
    }

private var _watchVariant: ImageVector? = null
