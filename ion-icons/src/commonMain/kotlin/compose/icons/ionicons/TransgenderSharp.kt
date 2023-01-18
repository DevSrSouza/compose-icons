package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.TransgenderSharp: ImageVector
    get() {
        if (_transgenderSharp != null) {
            return _transgenderSharp!!
        }
        _transgenderSharp = Builder(name = "TransgenderSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 448.94f)
                lineToRelative(-48.94f, -49.08f)
                lineTo(464.0f, 366.92f)
                lineToRelative(-31.1f, -31.11f)
                lineTo(400.0f, 368.71f)
                lineTo(376.45f, 345.1f)
                arcToRelative(149.64f, 149.64f, 0.0f, false, false, -0.1f, -178.45f)
                lineToRelative(59.55f, -59.56f)
                lineTo(435.9f, 144.0f)
                horizontalLineToRelative(44.0f)
                lineTo(479.9f, 32.0f)
                horizontalLineToRelative(-112.0f)
                lineTo(367.9f, 76.0f)
                horizontalLineToRelative(36.87f)
                lineToRelative(-59.55f, 59.55f)
                arcToRelative(149.65f, 149.65f, 0.0f, false, false, -178.59f, 0.0f)
                lineTo(159.08f, 128.0f)
                lineToRelative(33.0f, -33.0f)
                lineTo(161.0f, 63.88f)
                lineToRelative(-33.0f, 33.0f)
                lineTo(107.09f, 76.0f)
                lineTo(144.0f, 76.0f)
                lineTo(144.0f, 32.0f)
                lineTo(32.0f, 32.0f)
                lineTo(32.0f, 144.0f)
                lineTo(76.0f, 144.0f)
                lineTo(76.0f, 107.09f)
                lineTo(96.87f, 128.0f)
                lineToRelative(-33.0f, 33.0f)
                lineTo(95.0f, 192.05f)
                lineToRelative(33.0f, -33.0f)
                lineToRelative(7.56f, 7.57f)
                arcTo(149.18f, 149.18f, 0.0f, false, false, 106.0f, 255.94f)
                curveToRelative(0.0f, 82.69f, 67.27f, 150.0f, 150.0f, 150.0f)
                arcToRelative(149.12f, 149.12f, 0.0f, false, false, 89.44f, -29.67f)
                lineToRelative(23.51f, 23.58f)
                lineTo(335.81f, 432.9f)
                lineTo(366.92f, 464.0f)
                lineToRelative(33.0f, -33.0f)
                lineToRelative(48.9f, 49.0f)
                close()
                moveTo(150.0f, 255.94f)
                arcToRelative(106.0f, 106.0f, 0.0f, true, true, 106.0f, 106.0f)
                arcTo(106.09f, 106.09f, 0.0f, false, true, 150.0f, 255.94f)
                close()
            }
        }
        .build()
        return _transgenderSharp!!
    }

private var _transgenderSharp: ImageVector? = null
