package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.FileTrayStackedSharp: ImageVector
    get() {
        if (_fileTrayStackedSharp != null) {
            return _fileTrayStackedSharp!!
        }
        _fileTrayStackedSharp = Builder(name = "FileTrayStackedSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 16.0f)
                horizontalLineTo(64.0f)
                lineTo(32.0f, 176.0f)
                verticalLineTo(320.0f)
                horizontalLineTo(480.0f)
                verticalLineTo(176.0f)
                close()
                moveTo(436.0f, 176.0f)
                horizontalLineTo(320.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -128.0f, 0.0f)
                horizontalLineTo(76.0f)
                lineTo(98.0f, 58.0f)
                horizontalLineTo(414.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 352.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -128.0f, 0.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(496.0f)
                horizontalLineTo(480.0f)
                verticalLineTo(352.0f)
                close()
            }
        }
        .build()
        return _fileTrayStackedSharp!!
    }

private var _fileTrayStackedSharp: ImageVector? = null
