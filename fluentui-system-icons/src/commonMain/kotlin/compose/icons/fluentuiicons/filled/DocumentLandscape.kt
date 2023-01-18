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

public val FilledGroup.DocumentLandscape: ImageVector
    get() {
        if (_documentLandscape != null) {
            return _documentLandscape!!
        }
        _documentLandscape = Builder(name = "DocumentLandscape", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                lineTo(16.0f, 12.0f)
                curveTo(14.8954f, 12.0f, 14.0f, 11.1046f, 14.0f, 10.0f)
                verticalLineTo(4.0f)
                lineTo(4.0f, 4.0f)
                curveTo(2.8954f, 4.0f, 2.0f, 4.8954f, 2.0f, 6.0f)
                lineTo(2.0f, 18.0f)
                curveTo(2.0f, 19.1046f, 2.8954f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 20.0f, 22.0f, 19.1046f, 22.0f, 18.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(21.5f, 10.5f)
                lineTo(16.0f, 10.5f)
                curveTo(15.7239f, 10.5f, 15.5f, 10.2761f, 15.5f, 10.0f)
                verticalLineTo(4.5f)
                lineTo(21.5f, 10.5f)
                close()
            }
        }
        .build()
        return _documentLandscape!!
    }

private var _documentLandscape: ImageVector? = null
