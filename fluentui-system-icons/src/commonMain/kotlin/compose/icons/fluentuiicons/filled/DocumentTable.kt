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

public val FilledGroup.DocumentTable: ImageVector
    get() {
        if (_documentTable != null) {
            return _documentTable!!
        }
        _documentTable = Builder(name = "DocumentTable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 13.25f)
                curveTo(8.5f, 13.1119f, 8.6119f, 13.0f, 8.75f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(13.25f)
                close()
                moveTo(8.5f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(8.75f)
                curveTo(8.6119f, 17.5f, 8.5f, 17.3881f, 8.5f, 17.25f)
                verticalLineTo(16.0f)
                close()
                moveTo(15.5f, 17.25f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(15.25f)
                curveTo(15.3881f, 17.5f, 15.5f, 17.3881f, 15.5f, 17.25f)
                close()
                moveTo(11.5f, 13.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(13.25f)
                curveTo(15.5f, 13.1119f, 15.3881f, 13.0f, 15.25f, 13.0f)
                horizontalLineTo(11.5f)
                close()
                moveTo(12.0f, 8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.8954f, 2.0f, 4.0f, 2.8954f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1046f, 4.8954f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1046f, 22.0f, 20.0f, 21.1046f, 20.0f, 20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                curveTo(12.8954f, 10.0f, 12.0f, 9.1046f, 12.0f, 8.0f)
                close()
                moveTo(8.75f, 11.5f)
                horizontalLineTo(15.25f)
                curveTo(16.2165f, 11.5f, 17.0f, 12.2835f, 17.0f, 13.25f)
                verticalLineTo(17.25f)
                curveTo(17.0f, 18.2165f, 16.2165f, 19.0f, 15.25f, 19.0f)
                horizontalLineTo(8.75f)
                curveTo(7.7835f, 19.0f, 7.0f, 18.2165f, 7.0f, 17.25f)
                verticalLineTo(13.25f)
                curveTo(7.0f, 12.2835f, 7.7835f, 11.5f, 8.75f, 11.5f)
                close()
                moveTo(13.5f, 8.0f)
                verticalLineTo(2.5f)
                lineTo(19.5f, 8.5f)
                horizontalLineTo(14.0f)
                curveTo(13.7239f, 8.5f, 13.5f, 8.2761f, 13.5f, 8.0f)
                close()
            }
        }
        .build()
        return _documentTable!!
    }

private var _documentTable: ImageVector? = null
