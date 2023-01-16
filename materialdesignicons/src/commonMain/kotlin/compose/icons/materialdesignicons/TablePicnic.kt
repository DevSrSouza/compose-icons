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

public val MaterialDesignIcons.TablePicnic: ImageVector
    get() {
        if (_tablePicnic != null) {
            return _tablePicnic!!
        }
        _tablePicnic = Builder(name = "TablePicnic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                lineTo(18.22f, 11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.44f)
                lineTo(19.0f, 18.0f)
                horizontalLineTo(16.5f)
                lineTo(15.94f, 13.0f)
                horizontalLineTo(8.06f)
                lineTo(7.5f, 18.0f)
                horizontalLineTo(5.0f)
                lineTo(5.56f, 13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.78f)
                lineTo(6.0f, 9.0f)
                horizontalLineTo(4.0f)
                moveTo(15.5f, 9.0f)
                horizontalLineTo(8.5f)
                lineTo(8.29f, 11.0f)
                horizontalLineTo(15.71f)
                close()
            }
        }
        .build()
        return _tablePicnic!!
    }

private var _tablePicnic: ImageVector? = null
