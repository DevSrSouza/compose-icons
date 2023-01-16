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

public val MaterialDesignIcons.FileQuestion: ImageVector
    get() {
        if (_fileQuestion != null) {
            return _fileQuestion!!
        }
        _fileQuestion = Builder(name = "FileQuestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.89f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 20.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                moveTo(13.0f, 3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.5f)
                moveTo(12.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 14.0f)
                curveTo(15.0f, 15.88f, 12.75f, 16.06f, 12.75f, 17.75f)
                horizontalLineTo(11.25f)
                curveTo(11.25f, 15.31f, 13.5f, 15.5f, 13.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 14.0f)
                horizontalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 11.0f)
                moveTo(11.25f, 18.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _fileQuestion!!
    }

private var _fileQuestion: ImageVector? = null
