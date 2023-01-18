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

public val RemixIcons.HeartAddLine: ImageVector
    get() {
        if (_heartAddLine != null) {
            return _heartAddLine!!
        }
        _heartAddLine = Builder(name = "HeartAddLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 14.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.001f)
                lineTo(19.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.001f, -3.0f)
                lineTo(14.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(20.243f, 4.757f)
                curveToRelative(2.262f, 2.268f, 2.34f, 5.88f, 0.236f, 8.235f)
                lineToRelative(-1.42f, -1.418f)
                curveToRelative(1.331f, -1.524f, 1.261f, -3.914f, -0.232f, -5.404f)
                curveToRelative(-1.503f, -1.499f, -3.92f, -1.563f, -5.49f, -0.153f)
                lineToRelative(-1.335f, 1.198f)
                lineToRelative(-1.336f, -1.197f)
                curveToRelative(-1.575f, -1.412f, -3.991f, -1.35f, -5.494f, 0.154f)
                curveToRelative(-1.49f, 1.49f, -1.565f, 3.875f, -0.192f, 5.451f)
                lineToRelative(8.432f, 8.446f)
                lineTo(12.0f, 21.485f)
                lineTo(3.52f, 12.993f)
                curveToRelative(-2.104f, -2.356f, -2.025f, -5.974f, 0.236f, -8.236f)
                curveToRelative(2.265f, -2.264f, 5.888f, -2.34f, 8.244f, -0.228f)
                curveToRelative(2.349f, -2.109f, 5.979f, -2.039f, 8.242f, 0.228f)
                close()
            }
        }
        .build()
        return _heartAddLine!!
    }

private var _heartAddLine: ImageVector? = null
