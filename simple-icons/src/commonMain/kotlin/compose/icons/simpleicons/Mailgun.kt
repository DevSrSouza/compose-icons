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

public val SimpleIcons.Mailgun: ImageVector
    get() {
        if (_mailgun != null) {
            return _mailgun!!
        }
        _mailgun = Builder(name = "Mailgun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.837f, 0.0f)
                curveToRelative(6.602f, 0.0f, 11.984f, 5.381f, 11.984f, 11.994f)
                curveToRelative(-0.017f, 2.99f, -3.264f, 4.84f, -5.844f, 3.331f)
                arcToRelative(3.805f, 3.805f, 0.0f, false, true, -0.06f, -0.035f)
                lineToRelative(-0.055f, -0.033f)
                lineToRelative(-0.022f, 0.055f)
                curveToRelative(-2.554f, 4.63f, -9.162f, 4.758f, -11.894f, 0.232f)
                curveToRelative(-2.732f, -4.527f, 0.46f, -10.313f, 5.746f, -10.416f)
                arcToRelative(6.868f, 6.868f, 0.0f, false, true, 7.002f, 6.866f)
                arcToRelative(1.265f, 1.265f, 0.0f, false, false, 2.52f, 0.0f)
                curveToRelative(0.0f, -5.18f, -4.197f, -9.38f, -9.377f, -9.387f)
                curveTo(4.611f, 2.594f, 0.081f, 10.41f, 3.683f, 16.673f)
                curveToRelative(3.238f, 5.632f, 11.08f, 6.351f, 15.289f, 1.402f)
                lineToRelative(1.997f, 1.686f)
                arcTo(11.95f, 11.95f, 0.0f, false, true, 11.837f, 24.0f)
                curveTo(2.6f, 23.72f, -2.87f, 13.543f, 1.992f, 5.684f)
                arcTo(12.006f, 12.006f, 0.0f, false, true, 11.837f, 0.0f)
                close()
                moveTo(11.837f, 7.745f)
                curveToRelative(-3.276f, -0.163f, -5.5f, 3.281f, -4.003f, 6.2f)
                arcToRelative(4.26f, 4.26f, 0.0f, false, false, 4.014f, 2.31f)
                curveToRelative(3.276f, -0.171f, 5.137f, -3.824f, 3.35f, -6.575f)
                arcToRelative(4.26f, 4.26f, 0.0f, false, false, -3.36f, -1.935f)
                close()
                moveTo(11.837f, 10.275f)
                curveToRelative(1.324f, 0.0f, 2.152f, 1.433f, 1.49f, 2.58f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, true, -1.49f, 0.86f)
                arcToRelative(1.72f, 1.72f, 0.0f, true, true, 0.0f, -3.44f)
                close()
            }
        }
        .build()
        return _mailgun!!
    }

private var _mailgun: ImageVector? = null
