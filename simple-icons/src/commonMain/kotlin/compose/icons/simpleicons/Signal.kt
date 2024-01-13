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

public val SimpleIcons.Signal: ImageVector
    get() {
        if (_signal != null) {
            return _signal!!
        }
        _signal = Builder(name = "Signal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.12f, 0.35f)
                lineToRelative(0.27f, 1.09f)
                arcToRelative(10.845f, 10.845f, 0.0f, false, false, -3.015f, 1.248f)
                lineToRelative(-0.578f, -0.964f)
                arcTo(11.955f, 11.955f, 0.0f, false, true, 9.12f, 0.35f)
                close()
                moveTo(14.88f, 0.35f)
                lineTo(14.61f, 1.44f)
                arcToRelative(10.845f, 10.845f, 0.0f, false, true, 3.015f, 1.248f)
                lineToRelative(0.581f, -0.964f)
                arcTo(11.955f, 11.955f, 0.0f, false, false, 14.88f, 0.35f)
                close()
                moveTo(1.725f, 5.797f)
                arcTo(11.955f, 11.955f, 0.0f, false, false, 0.351f, 9.119f)
                lineToRelative(1.09f, 0.27f)
                arcTo(10.845f, 10.845f, 0.0f, false, true, 2.69f, 6.374f)
                close()
                moveTo(1.125f, 11.999f)
                arcToRelative(10.856f, 10.856f, 0.0f, false, true, 0.122f, -1.63f)
                lineToRelative(-1.112f, -0.168f)
                arcToRelative(12.043f, 12.043f, 0.0f, false, false, 0.0f, 3.596f)
                lineToRelative(1.112f, -0.169f)
                arcTo(10.856f, 10.856f, 0.0f, false, true, 1.125f, 12.0f)
                close()
                moveTo(18.203f, 22.274f)
                lineTo(17.625f, 21.31f)
                arcToRelative(10.845f, 10.845f, 0.0f, false, true, -3.011f, 1.247f)
                lineToRelative(0.27f, 1.091f)
                arcToRelative(11.955f, 11.955f, 0.0f, false, false, 3.319f, -1.374f)
                close()
                moveTo(22.875f, 12.0f)
                arcToRelative(10.856f, 10.856f, 0.0f, false, true, -0.122f, 1.63f)
                lineToRelative(1.112f, 0.168f)
                arcToRelative(12.043f, 12.043f, 0.0f, false, false, 0.0f, -3.596f)
                lineToRelative(-1.112f, 0.169f)
                arcToRelative(10.856f, 10.856f, 0.0f, false, true, 0.122f, 1.63f)
                close()
                moveTo(23.649f, 14.88f)
                lineTo(22.559f, 14.61f)
                arcToRelative(10.845f, 10.845f, 0.0f, false, true, -1.248f, 3.015f)
                lineToRelative(0.964f, 0.581f)
                arcToRelative(11.955f, 11.955f, 0.0f, false, false, 1.374f, -3.326f)
                close()
                moveTo(13.629f, 22.755f)
                arcToRelative(10.952f, 10.952f, 0.0f, false, true, -3.258f, 0.0f)
                lineToRelative(-0.17f, 1.112f)
                arcToRelative(12.043f, 12.043f, 0.0f, false, false, 3.597f, 0.0f)
                close()
                moveTo(20.754f, 18.452f)
                arcToRelative(10.914f, 10.914f, 0.0f, false, true, -2.304f, 2.302f)
                lineToRelative(0.668f, 0.906f)
                arcToRelative(12.019f, 12.019f, 0.0f, false, false, 2.542f, -2.535f)
                close()
                moveTo(18.45f, 3.245f)
                arcToRelative(10.914f, 10.914f, 0.0f, false, true, 2.304f, 2.304f)
                lineToRelative(0.906f, -0.675f)
                arcToRelative(12.019f, 12.019f, 0.0f, false, false, -2.535f, -2.535f)
                close()
                moveTo(3.246f, 5.549f)
                arcTo(10.914f, 10.914f, 0.0f, false, true, 5.55f, 3.245f)
                lineToRelative(-0.675f, -0.906f)
                arcTo(12.019f, 12.019f, 0.0f, false, false, 2.34f, 4.874f)
                close()
                moveTo(22.275f, 5.797f)
                lineTo(21.311f, 6.374f)
                arcToRelative(10.845f, 10.845f, 0.0f, false, true, 1.247f, 3.011f)
                lineToRelative(1.091f, -0.27f)
                arcToRelative(11.955f, 11.955f, 0.0f, false, false, -1.374f, -3.318f)
                close()
                moveTo(10.371f, 1.246f)
                arcToRelative(10.952f, 10.952f, 0.0f, false, true, 3.258f, 0.0f)
                lineTo(13.8f, 0.134f)
                arcToRelative(12.043f, 12.043f, 0.0f, false, false, -3.597f, 0.0f)
                close()
                moveTo(3.823f, 21.957f)
                lineTo(1.5f, 22.5f)
                lineToRelative(0.542f, -2.323f)
                lineToRelative(-1.095f, -0.257f)
                lineToRelative(-0.542f, 2.323f)
                arcToRelative(1.125f, 1.125f, 0.0f, false, false, 1.352f, 1.352f)
                lineToRelative(2.321f, -0.532f)
                close()
                moveTo(1.181f, 18.916f)
                lineTo(2.276f, 19.171f)
                lineTo(2.651f, 17.561f)
                arcToRelative(10.828f, 10.828f, 0.0f, false, true, -1.21f, -2.952f)
                lineToRelative(-1.09f, 0.27f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, false, 1.106f, 2.852f)
                close()
                moveTo(6.431f, 21.353f)
                lineTo(4.821f, 21.728f)
                lineTo(5.076f, 22.823f)
                lineTo(6.261f, 22.548f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, false, 2.851f, 1.106f)
                lineToRelative(0.27f, -1.091f)
                arcToRelative(10.828f, 10.828f, 0.0f, false, true, -2.943f, -1.217f)
                close()
                moveTo(12.0f, 2.25f)
                arcToRelative(9.75f, 9.75f, 0.0f, false, false, -8.25f, 14.938f)
                lineToRelative(-0.938f, 4.0f)
                lineToRelative(4.0f, -0.938f)
                arcTo(9.75f, 9.75f, 0.0f, true, false, 12.0f, 2.25f)
                close()
            }
        }
        .build()
        return _signal!!
    }

private var _signal: ImageVector? = null
