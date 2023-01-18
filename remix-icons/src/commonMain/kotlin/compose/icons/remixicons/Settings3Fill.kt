package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Settings3Fill: ImageVector
    get() {
        if (_settings3Fill != null) {
            return _settings3Fill!!
        }
        _settings3Fill = Builder(name = "Settings3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.954f, 2.21f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, 4.091f, -0.002f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 16.0f, 5.07f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 3.457f, 0.261f)
                arcTo(9.99f, 9.99f, 0.0f, false, true, 21.5f, 8.876f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 20.0f, 12.0f)
                curveToRelative(0.0f, 1.264f, 0.586f, 2.391f, 1.502f, 3.124f)
                arcToRelative(10.043f, 10.043f, 0.0f, false, true, -2.046f, 3.543f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, -3.456f, 0.261f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, -1.954f, 2.86f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, -4.091f, 0.004f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 8.0f, 18.927f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, -3.457f, -0.26f)
                arcTo(9.99f, 9.99f, 0.0f, false, true, 2.5f, 15.121f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 4.0f, 11.999f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, -1.502f, -3.124f)
                arcToRelative(10.043f, 10.043f, 0.0f, false, true, 2.046f, -3.543f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 8.0f, 5.071f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 1.954f, -2.86f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _settings3Fill!!
    }

private var _settings3Fill: ImageVector? = null
