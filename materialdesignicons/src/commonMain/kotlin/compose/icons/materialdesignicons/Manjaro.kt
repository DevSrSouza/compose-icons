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

public val MaterialDesignIcons.Manjaro: ImageVector
    get() {
        if (_manjaro != null) {
            return _manjaro!!
        }
        _manjaro = Builder(name = "Manjaro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.6f)
                verticalLineTo(7.6f)
                horizontalLineTo(14.8f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                moveTo(9.2f, 9.2f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.8f)
                verticalLineTo(9.2f)
                horizontalLineTo(9.2f)
                moveTo(16.4f, 2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(16.4f)
                close()
            }
        }
        .build()
        return _manjaro!!
    }

private var _manjaro: ImageVector? = null
