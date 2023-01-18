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

public val FilledGroup.Autosum: ImageVector
    get() {
        if (_autosum != null) {
            return _autosum!!
        }
        _autosum = Builder(name = "Autosum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.8293f, 4.6098f)
                curveTo(4.986f, 4.2401f, 5.3485f, 4.0f, 5.75f, 4.0f)
                horizontalLineTo(18.25f)
                curveTo(18.8023f, 4.0f, 19.25f, 4.4477f, 19.25f, 5.0f)
                curveTo(19.25f, 5.5523f, 18.8023f, 6.0f, 18.25f, 6.0f)
                horizontalLineTo(8.1094f)
                lineTo(13.0595f, 11.1152f)
                curveTo(13.4185f, 11.4862f, 13.4362f, 12.0694f, 13.1002f, 12.4614f)
                lineTo(7.9243f, 18.5f)
                horizontalLineTo(18.25f)
                curveTo(18.8023f, 18.5f, 19.25f, 18.9477f, 19.25f, 19.5f)
                curveTo(19.25f, 20.0523f, 18.8023f, 20.5f, 18.25f, 20.5f)
                horizontalLineTo(5.75f)
                curveTo(5.3595f, 20.5f, 5.0047f, 20.2727f, 4.8415f, 19.9179f)
                curveTo(4.6783f, 19.5631f, 4.7366f, 19.1457f, 4.9908f, 18.8492f)
                lineTo(10.9889f, 11.8514f)
                lineTo(5.0314f, 5.6954f)
                curveTo(4.7522f, 5.4069f, 4.6726f, 4.9794f, 4.8293f, 4.6098f)
                close()
            }
        }
        .build()
        return _autosum!!
    }

private var _autosum: ImageVector? = null
