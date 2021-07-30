package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.MapMarked: ImageVector
    get() {
        if (_mapMarked != null) {
            return _mapMarked!!
        }
        _mapMarked = Builder(name = "MapMarked", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 0.0f)
                curveToRelative(-69.59f, 0.0f, -126.0f, 56.41f, -126.0f, 126.0f)
                curveToRelative(0.0f, 56.26f, 82.35f, 158.8f, 113.9f, 196.02f)
                curveToRelative(6.39f, 7.54f, 17.82f, 7.54f, 24.2f, 0.0f)
                curveTo(331.65f, 284.8f, 414.0f, 182.26f, 414.0f, 126.0f)
                curveTo(414.0f, 56.41f, 357.59f, 0.0f, 288.0f, 0.0f)
                close()
                moveTo(20.12f, 215.95f)
                arcTo(32.006f, 32.006f, 0.0f, false, false, 0.0f, 245.66f)
                verticalLineToRelative(250.32f)
                curveToRelative(0.0f, 11.32f, 11.43f, 19.06f, 21.94f, 14.86f)
                lineTo(160.0f, 448.0f)
                lineTo(160.0f, 214.92f)
                curveToRelative(-8.84f, -15.98f, -16.07f, -31.54f, -21.25f, -46.42f)
                lineTo(20.12f, 215.95f)
                close()
                moveTo(288.0f, 359.67f)
                curveToRelative(-14.07f, 0.0f, -27.38f, -6.18f, -36.51f, -16.96f)
                curveToRelative(-19.66f, -23.2f, -40.57f, -49.62f, -59.49f, -76.72f)
                verticalLineToRelative(182.0f)
                lineToRelative(192.0f, 64.0f)
                lineTo(384.0f, 266.0f)
                curveToRelative(-18.92f, 27.09f, -39.82f, 53.52f, -59.49f, 76.72f)
                curveToRelative(-9.13f, 10.77f, -22.44f, 16.95f, -36.51f, 16.95f)
                close()
                moveTo(554.06f, 161.16f)
                lineTo(416.0f, 224.0f)
                verticalLineToRelative(288.0f)
                lineToRelative(139.88f, -55.95f)
                arcTo(31.996f, 31.996f, 0.0f, false, false, 576.0f, 426.34f)
                lineTo(576.0f, 176.02f)
                curveToRelative(0.0f, -11.32f, -11.43f, -19.06f, -21.94f, -14.86f)
                close()
            }
        }
        .build()
        return _mapMarked!!
    }

private var _mapMarked: ImageVector? = null
