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

public val MaterialDesignIcons.FilePercent: ImageVector
    get() {
        if (_filePercent != null) {
            return _filePercent!!
        }
        _filePercent = Builder(name = "FilePercent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 2.0f)
                horizontalLineTo(14.0f)
                moveTo(7.37f, 20.0f)
                lineTo(15.0f, 12.35f)
                lineTo(13.65f, 11.0f)
                lineTo(6.0f, 18.65f)
                lineTo(7.37f, 20.0f)
                moveTo(13.0f, 9.0f)
                horizontalLineTo(18.5f)
                lineTo(13.0f, 3.5f)
                verticalLineTo(9.0f)
                moveTo(7.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 11.0f)
                moveTo(13.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 17.0f)
                close()
            }
        }
        .build()
        return _filePercent!!
    }

private var _filePercent: ImageVector? = null
