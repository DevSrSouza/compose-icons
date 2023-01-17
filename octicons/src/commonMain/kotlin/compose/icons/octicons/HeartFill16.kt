package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.HeartFill16: ImageVector
    get() {
        if (_heartFill16 != null) {
            return _heartFill16!!
        }
        _heartFill16 = Builder(name = "HeartFill16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.655f, 14.916f)
                verticalLineToRelative(-0.001f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.006f, -0.003f)
                lineToRelative(-0.018f, -0.01f)
                arcToRelative(22.066f, 22.066f, 0.0f, false, true, -3.744f, -2.584f)
                curveTo(2.045f, 10.731f, 0.0f, 8.35f, 0.0f, 5.5f)
                curveTo(0.0f, 2.836f, 2.086f, 1.0f, 4.25f, 1.0f)
                curveTo(5.797f, 1.0f, 7.153f, 1.802f, 8.0f, 3.02f)
                curveTo(8.847f, 1.802f, 10.203f, 1.0f, 11.75f, 1.0f)
                curveTo(13.914f, 1.0f, 16.0f, 2.836f, 16.0f, 5.5f)
                curveToRelative(0.0f, 2.85f, -2.044f, 5.231f, -3.886f, 6.818f)
                arcToRelative(22.094f, 22.094f, 0.0f, false, true, -3.433f, 2.414f)
                arcToRelative(7.152f, 7.152f, 0.0f, false, true, -0.31f, 0.17f)
                lineToRelative(-0.018f, 0.01f)
                lineToRelative(-0.008f, 0.004f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.69f, 0.0f)
                close()
            }
        }
        .build()
        return _heartFill16!!
    }

private var _heartFill16: ImageVector? = null
