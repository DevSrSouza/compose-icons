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

public val RemixIcons.MedalLine: ImageVector
    get() {
        if (_medalLine != null) {
            return _medalLine!!
        }
        _medalLine = Builder(name = "MedalLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(12.0f, 10.5f)
                lineToRelative(1.323f, 2.68f)
                lineToRelative(2.957f, 0.43f)
                lineToRelative(-2.14f, 2.085f)
                lineToRelative(0.505f, 2.946f)
                lineTo(12.0f, 17.25f)
                lineToRelative(-2.645f, 1.39f)
                lineToRelative(0.505f, -2.945f)
                lineToRelative(-2.14f, -2.086f)
                lineToRelative(2.957f, -0.43f)
                lineTo(12.0f, 10.5f)
                close()
                moveTo(18.0f, 2.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(-1.363f, 1.138f)
                arcTo(9.935f, 9.935f, 0.0f, false, false, 13.0f, 5.049f)
                lineTo(13.0f, 2.0f)
                lineTo(18.0f, 2.0f)
                close()
                moveTo(11.0f, 1.999f)
                verticalLineToRelative(3.05f)
                arcToRelative(9.935f, 9.935f, 0.0f, false, false, -3.636f, 1.088f)
                lineTo(6.0f, 5.0f)
                lineTo(6.0f, 2.0f)
                lineToRelative(5.0f, -0.001f)
                close()
            }
        }
        .build()
        return _medalLine!!
    }

private var _medalLine: ImageVector? = null
