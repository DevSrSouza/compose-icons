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

public val MaterialDesignIcons.ArchiveOff: ImageVector
    get() {
        if (_archiveOff != null) {
            return _archiveOff!!
        }
        _archiveOff = Builder(name = "ArchiveOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.2f, 7.0f)
                lineTo(6.2f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.2f)
                moveTo(20.0f, 8.0f)
                horizontalLineTo(11.2f)
                lineTo(20.0f, 16.8f)
                verticalLineTo(8.0f)
                moveTo(20.0f, 19.35f)
                verticalLineTo(19.34f)
                lineTo(8.66f, 8.0f)
                horizontalLineTo(8.66f)
                lineTo(7.66f, 7.0f)
                horizontalLineTo(7.66f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.0f, 4.89f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.11f)
                lineTo(6.11f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.0f, 19.35f)
                close()
            }
        }
        .build()
        return _archiveOff!!
    }

private var _archiveOff: ImageVector? = null
