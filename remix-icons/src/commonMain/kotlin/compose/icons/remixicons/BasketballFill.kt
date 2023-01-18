package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.BasketballFill: ImageVector
    get() {
        if (_basketballFill != null) {
            return _basketballFill!!
        }
        _basketballFill = Builder(name = "BasketballFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.366f, 13.366f)
                lineToRelative(1.775f, 1.025f)
                arcToRelative(9.98f, 9.98f, 0.0f, false, false, -0.311f, 7.44f)
                arcTo(9.911f, 9.911f, 0.0f, false, true, 12.0f, 22.0f)
                arcToRelative(9.964f, 9.964f, 0.0f, false, true, -4.11f, -0.88f)
                lineToRelative(4.476f, -7.754f)
                close()
                moveTo(15.883f, 15.398f)
                lineToRelative(4.234f, 2.444f)
                arcToRelative(10.033f, 10.033f, 0.0f, false, true, -4.363f, 3.43f)
                arcToRelative(7.988f, 7.988f, 0.0f, false, true, 0.008f, -5.57f)
                lineToRelative(0.121f, -0.304f)
                close()
                moveTo(8.86f, 11.342f)
                lineToRelative(1.775f, 1.024f)
                lineToRelative(-4.476f, 7.75f)
                arcToRelative(10.026f, 10.026f, 0.0f, false, true, -3.59f, -4.785f)
                arcToRelative(9.978f, 9.978f, 0.0f, false, false, 6.085f, -3.713f)
                lineToRelative(0.206f, -0.276f)
                close()
                moveTo(21.906f, 10.616f)
                curveToRelative(0.063f, 0.453f, 0.095f, 0.915f, 0.095f, 1.384f)
                arcToRelative(9.964f, 9.964f, 0.0f, false, true, -0.88f, 4.11f)
                lineToRelative(-4.236f, -2.445f)
                arcToRelative(7.985f, 7.985f, 0.0f, false, true, 4.866f, -3.021f)
                lineToRelative(0.155f, -0.028f)
                close()
                moveTo(2.881f, 7.891f)
                lineToRelative(4.235f, 2.445f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, true, -5.021f, 3.05f)
                arcTo(10.14f, 10.14f, 0.0f, false, true, 2.0f, 12.0f)
                curveToRelative(0.0f, -1.465f, 0.315f, -2.856f, 0.88f, -4.11f)
                close()
                moveTo(17.842f, 3.883f)
                arcToRelative(10.026f, 10.026f, 0.0f, false, true, 3.59f, 4.785f)
                arcToRelative(9.985f, 9.985f, 0.0f, false, false, -6.086f, 3.715f)
                lineToRelative(-0.205f, 0.276f)
                lineToRelative(-1.775f, -1.025f)
                lineToRelative(4.476f, -7.75f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(1.465f, 0.0f, 2.856f, 0.315f, 4.11f, 0.88f)
                lineToRelative(-4.476f, 7.754f)
                lineTo(9.859f, 9.61f)
                arcToRelative(9.98f, 9.98f, 0.0f, false, false, 0.311f, -7.442f)
                arcTo(9.922f, 9.922f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(8.247f, 2.73f)
                arcToRelative(7.992f, 7.992f, 0.0f, false, true, -0.01f, 5.57f)
                lineToRelative(-0.12f, 0.303f)
                lineToRelative(-4.234f, -2.445f)
                arcToRelative(10.036f, 10.036f, 0.0f, false, true, 4.164f, -3.346f)
                lineToRelative(0.2f, -0.083f)
                close()
            }
        }
        .build()
        return _basketballFill!!
    }

private var _basketballFill: ImageVector? = null
