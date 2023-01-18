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

public val RemixIcons.Medal2Line: ImageVector
    get() {
        if (_medal2Line != null) {
            return _medal2Line!!
        }
        _medal2Line = Builder(name = "Medal2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.5f)
                lineToRelative(2.116f, 5.088f)
                lineToRelative(5.492f, 0.44f)
                lineToRelative(-4.184f, 3.584f)
                lineToRelative(1.278f, 5.36f)
                lineTo(12.0f, 20.1f)
                lineToRelative(-4.702f, 2.872f)
                lineToRelative(1.278f, -5.36f)
                lineToRelative(-4.184f, -3.584f)
                lineToRelative(5.492f, -0.44f)
                lineTo(12.0f, 8.5f)
                close()
                moveTo(12.0f, 13.707f)
                lineToRelative(-0.739f, 1.777f)
                lineToRelative(-1.916f, 0.153f)
                lineToRelative(1.46f, 1.251f)
                lineToRelative(-0.447f, 1.871f)
                lineTo(12.0f, 17.756f)
                lineToRelative(1.641f, 1.003f)
                lineToRelative(-0.446f, -1.87f)
                lineToRelative(1.459f, -1.252f)
                lineToRelative(-1.915f, -0.153f)
                lineTo(12.0f, 13.707f)
                close()
                moveTo(8.0f, 2.0f)
                verticalLineToRelative(9.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _medal2Line!!
    }

private var _medal2Line: ImageVector? = null
