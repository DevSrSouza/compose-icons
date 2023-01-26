package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Dangerous: ImageVector
    get() {
        if (_dangerous != null) {
            return _dangerous!!
        }
        _dangerous = Builder(name = "Dangerous", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.73f, 3.0f)
                horizontalLineTo(8.27f)
                lineTo(3.0f, 8.27f)
                verticalLineToRelative(7.46f)
                lineTo(8.27f, 21.0f)
                horizontalLineToRelative(7.46f)
                lineTo(21.0f, 15.73f)
                verticalLineTo(8.27f)
                lineTo(15.73f, 3.0f)
                close()
                moveTo(17.0f, 15.74f)
                lineTo(15.74f, 17.0f)
                lineTo(12.0f, 13.26f)
                lineTo(8.26f, 17.0f)
                lineTo(7.0f, 15.74f)
                lineTo(10.74f, 12.0f)
                lineTo(7.0f, 8.26f)
                lineTo(8.26f, 7.0f)
                lineTo(12.0f, 10.74f)
                lineTo(15.74f, 7.0f)
                lineTo(17.0f, 8.26f)
                lineTo(13.26f, 12.0f)
                lineTo(17.0f, 15.74f)
                close()
            }
        }
        .build()
        return _dangerous!!
    }

private var _dangerous: ImageVector? = null
