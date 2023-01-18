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

public val FilledGroup.DocumentBriefcase: ImageVector
    get() {
        if (_documentBriefcase != null) {
            return _documentBriefcase!!
        }
        _documentBriefcase = Builder(name = "DocumentBriefcase", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                verticalLineTo(16.5001f)
                curveTo(13.0f, 15.2906f, 12.1411f, 14.2817f, 11.0f, 14.0501f)
                verticalLineTo(13.75f)
                curveTo(11.0f, 12.2312f, 9.7688f, 11.0f, 8.25f, 11.0f)
                horizontalLineTo(4.75f)
                curveTo(4.49f, 11.0f, 4.2384f, 11.0361f, 4.0f, 11.1035f)
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
                moveTo(3.0f, 15.0001f)
                horizontalLineTo(2.5f)
                curveTo(1.6716f, 15.0001f, 1.0f, 15.6716f, 1.0f, 16.5001f)
                verticalLineTo(21.5f)
                curveTo(1.0f, 22.3284f, 1.6716f, 23.0f, 2.5f, 23.0f)
                horizontalLineTo(10.5f)
                curveTo(11.3284f, 23.0f, 12.0f, 22.3284f, 12.0f, 21.5f)
                verticalLineTo(16.5001f)
                curveTo(12.0f, 15.6716f, 11.3284f, 15.0001f, 10.5f, 15.0001f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.75f)
                curveTo(10.0f, 12.7835f, 9.2165f, 12.0f, 8.25f, 12.0f)
                horizontalLineTo(4.75f)
                curveTo(3.7835f, 12.0f, 3.0f, 12.7835f, 3.0f, 13.75f)
                verticalLineTo(15.0001f)
                close()
                moveTo(4.5f, 13.75f)
                curveTo(4.5f, 13.6119f, 4.6119f, 13.5f, 4.75f, 13.5f)
                horizontalLineTo(8.25f)
                curveTo(8.3881f, 13.5f, 8.5f, 13.6119f, 8.5f, 13.75f)
                verticalLineTo(15.0001f)
                horizontalLineTo(4.5f)
                verticalLineTo(13.75f)
                close()
            }
        }
        .build()
        return _documentBriefcase!!
    }

private var _documentBriefcase: ImageVector? = null
