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

public val FilledGroup.DocumentSave: ImageVector
    get() {
        if (_documentSave != null) {
            return _documentSave!!
        }
        _documentSave = Builder(name = "DocumentSave", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 9.1046f, 12.8954f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 21.1046f, 19.1046f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(12.95f)
                curveTo(12.9828f, 21.8384f, 13.0f, 21.6712f, 13.0f, 21.5f)
                verticalLineTo(14.6213f)
                curveTo(13.0f, 13.9583f, 12.7366f, 13.3224f, 12.2678f, 12.8536f)
                lineTo(11.1464f, 11.7322f)
                curveTo(10.6776f, 11.2634f, 10.0417f, 11.0f, 9.3787f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.8954f, 4.8954f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(13.5f, 2.5f)
                verticalLineTo(8.0f)
                curveTo(13.5f, 8.2761f, 13.7239f, 8.5f, 14.0f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
                close()
                moveTo(5.0f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(2.5f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.5f)
                curveTo(4.0f, 14.7761f, 4.2239f, 15.0f, 4.5f, 15.0f)
                horizontalLineTo(8.5f)
                curveTo(8.7761f, 15.0f, 9.0f, 14.7761f, 9.0f, 14.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.3787f)
                curveTo(9.7765f, 12.0f, 10.158f, 12.158f, 10.4393f, 12.4393f)
                lineTo(11.5607f, 13.5607f)
                curveTo(11.842f, 13.842f, 12.0f, 14.2235f, 12.0f, 14.6213f)
                verticalLineTo(21.5f)
                curveTo(12.0f, 22.3284f, 11.3284f, 23.0f, 10.5f, 23.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.5f)
                curveTo(10.0f, 17.2239f, 9.7761f, 17.0f, 9.5f, 17.0f)
                horizontalLineTo(3.5f)
                curveTo(3.2239f, 17.0f, 3.0f, 17.2239f, 3.0f, 17.5f)
                verticalLineTo(23.0f)
                horizontalLineTo(2.5f)
                curveTo(1.6716f, 23.0f, 1.0f, 22.3284f, 1.0f, 21.5f)
                verticalLineTo(13.5f)
                curveTo(1.0f, 12.6716f, 1.6716f, 12.0f, 2.5f, 12.0f)
                close()
                moveTo(9.0f, 18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _documentSave!!
    }

private var _documentSave: ImageVector? = null
