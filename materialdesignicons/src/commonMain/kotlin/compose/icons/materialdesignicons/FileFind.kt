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

public val MaterialDesignIcons.FileFind: ImageVector
    get() {
        if (_fileFind != null) {
            return _fileFind!!
        }
        _fileFind = Builder(name = "FileFind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 13.0f)
                moveTo(20.0f, 19.59f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(18.45f, 22.0f, 18.85f, 21.85f, 19.19f, 21.6f)
                lineTo(14.76f, 17.17f)
                curveTo(13.96f, 17.69f, 13.0f, 18.0f, 12.0f, 18.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 13.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 13.0f)
                curveTo(17.0f, 14.0f, 16.69f, 14.96f, 16.17f, 15.75f)
                lineTo(20.0f, 19.59f)
                close()
            }
        }
        .build()
        return _fileFind!!
    }

private var _fileFind: ImageVector? = null
