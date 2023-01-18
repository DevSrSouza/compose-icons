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

public val RemixIcons.Settings4Fill: ImageVector
    get() {
        if (_settings4Fill != null) {
            return _settings4Fill!!
        }
        _settings4Fill = Builder(name = "Settings4Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.334f, 4.545f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, 3.542f, -2.048f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 12.0f, 3.999f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 3.124f, -1.502f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, 3.542f, 2.048f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 0.262f, 3.454f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 2.863f, 1.955f)
                arcToRelative(10.043f, 10.043f, 0.0f, false, true, 0.0f, 4.09f)
                curveToRelative(-1.16f, 0.178f, -2.23f, 0.86f, -2.863f, 1.955f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, -0.262f, 3.455f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, -3.542f, 2.047f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, -3.124f, 1.502f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, -3.542f, -2.047f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, -0.262f, -3.455f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, -2.863f, -1.954f)
                arcToRelative(10.043f, 10.043f, 0.0f, false, true, 0.0f, -4.091f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 2.863f, -1.955f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 0.262f, -3.454f)
                close()
                moveTo(13.5f, 14.597f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -3.0f, -5.196f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 5.196f)
                close()
            }
        }
        .build()
        return _settings4Fill!!
    }

private var _settings4Fill: ImageVector? = null
