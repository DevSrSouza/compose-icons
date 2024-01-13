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

public val SimpleIcons.Deutschepost: ImageVector
    get() {
        if (_deutschepost != null) {
            return _deutschepost!!
        }
        _deutschepost = Builder(name = "Deutschepost", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.057f, 18.221f)
                lineTo(7.839f, 21.47f)
                lineTo(4.652f, 21.47f)
                lineToRelative(3.219f, -3.249f)
                close()
                moveTo(6.758f, 18.221f)
                lineTo(3.541f, 21.47f)
                lineTo(0.354f, 21.47f)
                lineToRelative(3.219f, -3.249f)
                close()
                moveTo(14.985f, 18.221f)
                lineTo(18.204f, 21.47f)
                horizontalLineToRelative(-3.187f)
                lineToRelative(-3.22f, -3.249f)
                close()
                moveTo(19.285f, 18.221f)
                lineTo(22.502f, 21.47f)
                horizontalLineToRelative(-3.187f)
                lineToRelative(-3.218f, -3.249f)
                close()
                moveTo(10.465f, 2.53f)
                curveToRelative(3.765f, -0.003f, 6.88f, 2.74f, 6.865f, 6.676f)
                curveToRelative(0.553f, -1.502f, 0.937f, -3.789f, 1.016f, -5.39f)
                lineTo(24.0f, 5.22f)
                curveToRelative(-0.452f, 6.621f, -5.43f, 12.42f, -12.815f, 12.416f)
                curveTo(2.832f, 17.635f, -0.397f, 10.389f, 0.039f, 4.899f)
                lineToRelative(2.453f, -0.779f)
                curveToRelative(-0.399f, 3.125f, 0.57f, 5.378f, 1.238f, 6.41f)
                curveToRelative(-0.795f, -4.42f, 2.549f, -7.998f, 6.735f, -8.0f)
                moveToRelative(0.011f, 2.301f)
                arcToRelative(4.519f, 4.519f, 0.0f, false, false, -4.524f, 4.514f)
                arcToRelative(4.519f, 4.519f, 0.0f, false, false, 4.524f, 4.514f)
                arcToRelative(4.518f, 4.518f, 0.0f, false, false, 4.525f, -4.514f)
                arcToRelative(4.518f, 4.518f, 0.0f, false, false, -4.525f, -4.514f)
            }
        }
        .build()
        return _deutschepost!!
    }

private var _deutschepost: ImageVector? = null
