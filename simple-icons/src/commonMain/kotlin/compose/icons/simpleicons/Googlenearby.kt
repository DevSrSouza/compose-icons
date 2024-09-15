package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Googlenearby: ImageVector
    get() {
        if (_googlenearby != null) {
            return _googlenearby!!
        }
        _googlenearby = Builder(name = "Googlenearby", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.546f, 12.0f)
                lineTo(12.001f, 6.545f)
                lineToRelative(5.454f, 5.455f)
                lineToRelative(-5.454f, 5.454f)
                close()
                moveTo(23.522f, 10.846f)
                lineTo(13.158f, 0.48f)
                arcToRelative(1.635f, 1.635f, 0.0f, false, false, -2.314f, 0.0f)
                lineTo(0.478f, 10.846f)
                arcToRelative(1.629f, 1.629f, 0.0f, false, false, 0.0f, 2.305f)
                lineTo(10.848f, 23.523f)
                arcToRelative(1.629f, 1.629f, 0.0f, false, false, 2.304f, 0.0f)
                lineToRelative(10.37f, -10.371f)
                arcToRelative(1.629f, 1.629f, 0.0f, false, false, 0.0f, -2.305f)
                close()
                moveTo(12.0f, 20.726f)
                lineToRelative(-8.727f, -8.728f)
                lineTo(12.0f, 3.27f)
                lineToRelative(8.727f, 8.728f)
                close()
            }
        }
        .build()
        return _googlenearby!!
    }

private var _googlenearby: ImageVector? = null
