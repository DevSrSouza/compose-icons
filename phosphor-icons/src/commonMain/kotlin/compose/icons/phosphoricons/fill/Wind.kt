package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = Builder(name = "Wind", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -15.0f, -21.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.0f, -5.5f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 120.0f, 104.0f)
                close()
                moveTo(152.0f, 152.0f)
                lineTo(40.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(152.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -15.0f, 21.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.0f, 5.5f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 152.0f, 152.0f)
                close()
                moveTo(208.0f, 72.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, -30.0f, 20.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 15.0f, 5.5f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 208.0f, 120.0f)
                lineTo(32.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(208.0f, 136.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _wind!!
    }

private var _wind: ImageVector? = null
