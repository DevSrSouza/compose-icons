package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.NotebookSubsection: ImageVector
    get() {
        if (_notebookSubsection != null) {
            return _notebookSubsection!!
        }
        _notebookSubsection = Builder(name = "NotebookSubsection", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                curveTo(6.5147f, 2.0f, 4.5f, 4.0147f, 4.5f, 6.5f)
                verticalLineTo(15.9f)
                curveTo(4.5f, 16.8797f, 5.1261f, 17.7131f, 6.0f, 18.022f)
                verticalLineTo(6.5f)
                curveTo(6.0f, 4.8432f, 7.3432f, 3.5f, 9.0f, 3.5f)
                horizontalLineTo(14.002f)
                curveTo(13.6931f, 2.6261f, 12.8597f, 2.0f, 11.88f, 2.0f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.75f)
                curveTo(7.0f, 5.5074f, 8.0074f, 4.5f, 9.25f, 4.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.75f)
                curveTo(15.0f, 2.3358f, 15.3358f, 2.0f, 15.75f, 2.0f)
                curveTo(16.1642f, 2.0f, 16.5f, 2.3358f, 16.5f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(16.5f, 21.6642f, 16.1642f, 22.0f, 15.75f, 22.0f)
                curveTo(15.3358f, 22.0f, 15.0f, 21.6642f, 15.0f, 21.25f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.25f)
                curveTo(8.0074f, 20.0f, 7.0f, 18.9926f, 7.0f, 17.75f)
                verticalLineTo(6.75f)
                close()
                moveTo(15.0f, 18.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.25f)
                curveTo(8.8358f, 6.0f, 8.5f, 6.3358f, 8.5f, 6.75f)
                verticalLineTo(17.75f)
                curveTo(8.5f, 18.1642f, 8.8358f, 18.5f, 9.25f, 18.5f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _notebookSubsection!!
    }

private var _notebookSubsection: ImageVector? = null
