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

public val MaterialDesignIcons.RoadVariant: ImageVector
    get() {
        if (_roadVariant != null) {
            return _roadVariant!!
        }
        _roadVariant = Builder(name = "RoadVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.1f, 4.8f)
                curveTo(18.0f, 4.3f, 17.6f, 4.0f, 17.1f, 4.0f)
                horizontalLineTo(13.0f)
                lineTo(13.2f, 7.0f)
                horizontalLineTo(10.8f)
                lineTo(11.0f, 4.0f)
                horizontalLineTo(6.8f)
                curveTo(6.3f, 4.0f, 5.9f, 4.4f, 5.8f, 4.8f)
                lineTo(3.1f, 18.8f)
                curveTo(3.0f, 19.4f, 3.5f, 20.0f, 4.1f, 20.0f)
                horizontalLineTo(10.0f)
                lineTo(10.3f, 15.0f)
                horizontalLineTo(13.7f)
                lineTo(14.0f, 20.0f)
                horizontalLineTo(19.8f)
                curveTo(20.4f, 20.0f, 20.9f, 19.4f, 20.8f, 18.8f)
                lineTo(18.1f, 4.8f)
                moveTo(10.4f, 13.0f)
                lineTo(10.6f, 9.0f)
                horizontalLineTo(13.2f)
                lineTo(13.4f, 13.0f)
                horizontalLineTo(10.4f)
                close()
            }
        }
        .build()
        return _roadVariant!!
    }

private var _roadVariant: ImageVector? = null
