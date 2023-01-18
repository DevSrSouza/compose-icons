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

public val FilledGroup.WebAsset: ImageVector
    get() {
        if (_webAsset != null) {
            return _webAsset!!
        }
        _webAsset = Builder(name = "WebAsset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.75f, 6.75f)
                curveTo(6.3358f, 6.75f, 6.0f, 7.0858f, 6.0f, 7.5f)
                curveTo(6.0f, 7.9142f, 6.3358f, 8.25f, 6.75f, 8.25f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 8.25f, 18.0f, 7.9142f, 18.0f, 7.5f)
                curveTo(18.0f, 7.0858f, 17.6642f, 6.75f, 17.25f, 6.75f)
                horizontalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _webAsset!!
    }

private var _webAsset: ImageVector? = null
