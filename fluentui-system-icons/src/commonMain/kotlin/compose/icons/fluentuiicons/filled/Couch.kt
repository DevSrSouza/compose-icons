package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Couch: ImageVector
    get() {
        if (_couch != null) {
            return _couch!!
        }
        _couch = Builder(name = "Couch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.25f, 10.75f)
                curveTo(20.7125f, 10.75f, 21.9084f, 11.8917f, 21.995f, 13.3325f)
                lineTo(22.0f, 13.5f)
                verticalLineTo(16.25f)
                curveTo(22.0f, 17.1682f, 21.2929f, 17.9212f, 20.3935f, 17.9942f)
                lineTo(20.25f, 18.0f)
                horizontalLineTo(3.75f)
                curveTo(2.8318f, 18.0f, 2.0788f, 17.2929f, 2.0058f, 16.3935f)
                lineTo(2.0f, 16.25f)
                verticalLineTo(13.5f)
                curveTo(2.0f, 11.9812f, 3.2312f, 10.75f, 4.75f, 10.75f)
                curveTo(6.0394f, 10.75f, 7.1216f, 11.6374f, 7.419f, 12.8348f)
                lineTo(7.4547f, 13.0f)
                horizontalLineTo(16.5453f)
                lineTo(16.581f, 12.8348f)
                curveTo(16.8784f, 11.6374f, 17.9606f, 10.75f, 19.25f, 10.75f)
                close()
                moveTo(5.75f, 6.0f)
                horizontalLineTo(18.25f)
                curveTo(19.1682f, 6.0f, 19.9212f, 6.7071f, 19.9942f, 7.6065f)
                lineTo(20.0f, 7.75f)
                lineTo(20.0005f, 9.8251f)
                curveTo(19.758f, 9.7759f, 19.507f, 9.75f, 19.25f, 9.75f)
                curveTo(17.7321f, 9.75f, 16.3969f, 10.659f, 15.812f, 12.0f)
                horizontalLineTo(8.1881f)
                curveTo(7.6051f, 10.6636f, 6.2727f, 9.75f, 4.75f, 9.75f)
                curveTo(4.4927f, 9.75f, 4.2414f, 9.7759f, 3.9986f, 9.8253f)
                lineTo(4.0f, 7.75f)
                curveTo(4.0f, 6.8318f, 4.7071f, 6.0788f, 5.6065f, 6.0058f)
                lineTo(5.75f, 6.0f)
                close()
            }
        }
        .build()
        return _couch!!
    }

private var _couch: ImageVector? = null
