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

public val MaterialDesignIcons.FileCertificate: ImageVector
    get() {
        if (_fileCertificate != null) {
            return _fileCertificate!!
        }
        _fileCertificate = Builder(name = "FileCertificate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 4.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(23.0f)
                lineTo(12.0f, 22.0f)
                lineTo(14.0f, 23.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 18.0f)
                verticalLineTo(7.0f)
                moveTo(14.0f, 15.0f)
                verticalLineTo(17.0f)
                lineTo(12.0f, 16.0f)
                lineTo(10.0f, 17.0f)
                verticalLineTo(15.0f)
                lineTo(8.0f, 14.0f)
                lineTo(10.0f, 13.0f)
                verticalLineTo(11.0f)
                lineTo(12.0f, 12.0f)
                lineTo(14.0f, 11.0f)
                verticalLineTo(13.0f)
                lineTo(16.0f, 14.0f)
                moveTo(13.0f, 8.0f)
                verticalLineTo(3.5f)
                lineTo(17.5f, 8.0f)
                close()
            }
        }
        .build()
        return _fileCertificate!!
    }

private var _fileCertificate: ImageVector? = null
