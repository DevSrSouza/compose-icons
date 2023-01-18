package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BuildOutline: ImageVector
    get() {
        if (_buildOutline != null) {
            return _buildOutline!!
        }
        _buildOutline = Builder(name = "BuildOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(393.87f, 190.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -45.25f, 0.0f)
                lineToRelative(-26.57f, -26.57f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, true, 0.0f, -45.26f)
                lineTo(382.19f, 58.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.3f, -1.64f)
                curveToRelative(-38.82f, -16.64f, -89.15f, -8.16f, -121.11f, 23.57f)
                curveToRelative(-30.58f, 30.35f, -32.32f, 76.0f, -21.12f, 115.84f)
                arcToRelative(31.93f, 31.93f, 0.0f, false, true, -9.06f, 32.08f)
                lineTo(64.0f, 380.0f)
                arcToRelative(48.17f, 48.17f, 0.0f, true, false, 68.0f, 68.0f)
                lineTo(285.86f, 281.0f)
                arcToRelative(31.93f, 31.93f, 0.0f, false, true, 31.6f, -9.13f)
                curveTo(357.0f, 282.46f, 402.0f, 280.47f, 432.18f, 250.68f)
                curveToRelative(32.49f, -32.0f, 39.5f, -88.56f, 23.75f, -120.93f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.6f, -0.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 416.0f)
                moveToRelative(-16.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -32.0f, 0.0f)
            }
        }
        .build()
        return _buildOutline!!
    }

private var _buildOutline: ImageVector? = null
