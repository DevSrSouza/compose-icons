package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) {
            return _cookingPot!!
        }
        _cookingPot = Builder(name = "CookingPot", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.0f, 48.0f)
                lineTo(90.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(102.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(128.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(134.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 54.0f)
                close()
                moveTo(160.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(166.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(154.0f, 48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 54.0f)
                close()
                moveTo(251.6f, 100.8f)
                lineTo(222.0f, 123.0f)
                verticalLineToRelative(61.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, true, -30.0f, 30.0f)
                lineTo(64.0f, 214.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, true, -30.0f, -30.0f)
                lineTo(34.0f, 123.0f)
                lineTo(4.4f, 100.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.2f, -9.6f)
                lineTo(34.0f, 108.0f)
                lineTo(34.0f, 88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 48.0f, 74.0f)
                lineTo(208.0f, 74.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineToRelative(20.0f)
                lineToRelative(22.4f, -16.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.2f, 9.6f)
                close()
                moveTo(210.0f, 88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(48.0f, 86.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, 18.0f, 18.0f)
                lineTo(192.0f, 202.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, 18.0f, -18.0f)
                close()
            }
        }
        .build()
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
