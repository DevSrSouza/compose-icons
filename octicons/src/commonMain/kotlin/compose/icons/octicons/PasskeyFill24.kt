package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.PasskeyFill24: ImageVector
    get() {
        if (_passkeyFill24 != null) {
            return _passkeyFill24!!
        }
        _passkeyFill24 = Builder(name = "PasskeyFill24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.496f, 2.0f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, false, -2.519f, 9.857f)
                arcTo(9.006f, 9.006f, 0.0f, false, false, 0.5f, 20.228f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, false, 0.728f, 0.772f)
                horizontalLineToRelative(5.257f)
                curveToRelative(3.338f, 0.001f, 6.677f, 0.002f, 10.015f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-4.669f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, false, -0.171f, -0.551f)
                arcToRelative(9.02f, 9.02f, 0.0f, false, false, -4.814f, -3.423f)
                arcTo(5.25f, 5.25f, 0.0f, false, false, 9.496f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.625f, 10.313f)
                curveToRelative(0.0f, 1.31f, -0.672f, 2.464f, -1.691f, 3.134f)
                arcToRelative(0.398f, 0.398f, 0.0f, false, false, -0.184f, 0.33f)
                verticalLineToRelative(0.886f)
                arcToRelative(0.372f, 0.372f, 0.0f, false, true, -0.11f, 0.265f)
                lineToRelative(-0.534f, 0.534f)
                arcToRelative(0.188f, 0.188f, 0.0f, false, false, 0.0f, 0.265f)
                lineToRelative(0.534f, 0.534f)
                curveToRelative(0.071f, 0.07f, 0.11f, 0.166f, 0.11f, 0.265f)
                verticalLineToRelative(0.347f)
                arcToRelative(0.374f, 0.374f, 0.0f, false, true, -0.11f, 0.265f)
                lineToRelative(-0.534f, 0.534f)
                arcToRelative(0.188f, 0.188f, 0.0f, false, false, 0.0f, 0.265f)
                lineToRelative(0.534f, 0.534f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.11f, 0.265f)
                verticalLineToRelative(0.431f)
                arcToRelative(0.379f, 0.379f, 0.0f, false, true, -0.097f, 0.253f)
                lineToRelative(-1.2f, 1.319f)
                arcToRelative(0.781f, 0.781f, 0.0f, false, true, -1.156f, 0.0f)
                lineToRelative(-1.2f, -1.319f)
                arcToRelative(0.379f, 0.379f, 0.0f, false, true, -0.097f, -0.253f)
                verticalLineToRelative(-5.39f)
                arcToRelative(0.398f, 0.398f, 0.0f, false, false, -0.184f, -0.33f)
                arcToRelative(3.75f, 3.75f, 0.0f, true, true, 5.809f, -3.134f)
                close()
                moveTo(21.0f, 9.75f)
                arcToRelative(1.125f, 1.125f, 0.0f, true, false, -2.25f, 0.0f)
                arcToRelative(1.125f, 1.125f, 0.0f, false, false, 2.25f, 0.0f)
                close()
            }
        }
        .build()
        return _passkeyFill24!!
    }

private var _passkeyFill24: ImageVector? = null
