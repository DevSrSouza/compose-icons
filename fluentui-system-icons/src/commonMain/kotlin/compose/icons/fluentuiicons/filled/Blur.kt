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

public val FilledGroup.Blur: ImageVector
    get() {
        if (_blur != null) {
            return _blur!!
        }
        _blur = Builder(name = "Blur", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(13.8401f, 3.0f, 15.5512f, 3.5522f, 16.9767f, 4.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.5f)
                horizontalLineTo(18.225f)
                curveTo(18.6969f, 5.9521f, 19.1196f, 6.455f, 19.4845f, 7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0645f)
                curveTo(20.3018f, 8.4775f, 20.4979f, 8.979f, 20.6482f, 9.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(20.8756f)
                curveTo(20.9574f, 10.9878f, 21.0f, 11.4889f, 21.0f, 12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.9451f)
                curveTo(20.8882f, 13.5143f, 20.788f, 14.0155f, 20.6482f, 14.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(20.2941f)
                curveTo(20.0712f, 16.0276f, 19.7994f, 16.5295f, 19.4845f, 17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.7083f)
                curveTo(17.0604f, 19.8412f, 14.6655f, 21.0f, 12.0f, 21.0f)
                curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _blur!!
    }

private var _blur: ImageVector? = null
