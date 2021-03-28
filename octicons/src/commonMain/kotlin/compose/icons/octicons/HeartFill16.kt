package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                    pathFillType = EvenOdd) {
                moveTo(7.655f, 14.916f)
                lineTo(8.0f, 14.25f)
                lineToRelative(0.345f, 0.666f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, -0.69f, 0.0f)
                close()
                moveTo(7.655f, 14.916f)
                lineTo(8.0f, 14.25f)
                lineToRelative(0.345f, 0.666f)
                lineToRelative(0.002f, -0.001f)
                lineToRelative(0.006f, -0.003f)
                lineToRelative(0.018f, -0.01f)
                arcToRelative(7.643f, 7.643f, 0.0f, false, false, 0.31f, -0.17f)
                arcToRelative(22.08f, 22.08f, 0.0f, false, false, 3.433f, -2.414f)
                curveTo(13.956f, 10.731f, 16.0f, 8.35f, 16.0f, 5.5f)
                curveTo(16.0f, 2.836f, 13.914f, 1.0f, 11.75f, 1.0f)
                curveTo(10.203f, 1.0f, 8.847f, 1.802f, 8.0f, 3.02f)
                curveTo(7.153f, 1.802f, 5.797f, 1.0f, 4.25f, 1.0f)
                curveTo(2.086f, 1.0f, 0.0f, 2.836f, 0.0f, 5.5f)
                curveToRelative(0.0f, 2.85f, 2.045f, 5.231f, 3.885f, 6.818f)
                arcToRelative(22.075f, 22.075f, 0.0f, false, false, 3.744f, 2.584f)
                lineToRelative(0.018f, 0.01f)
                lineToRelative(0.006f, 0.003f)
                horizontalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _heartFill16!!
    }

private var _heartFill16: ImageVector? = null
