package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.StarOfLife: ImageVector
    get() {
        if (_starOfLife != null) {
            return _starOfLife!!
        }
        _starOfLife = Builder(name = "StarOfLife", defaultWidth = 480.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 480.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(471.99f, 334.43f)
                lineTo(336.06f, 256.0f)
                lineToRelative(135.93f, -78.43f)
                curveToRelative(7.66f, -4.42f, 10.28f, -14.2f, 5.86f, -21.86f)
                lineToRelative(-32.02f, -55.43f)
                curveToRelative(-4.42f, -7.65f, -14.21f, -10.28f, -21.87f, -5.86f)
                lineToRelative(-135.93f, 78.43f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, -8.84f, -7.17f, -16.0f, -16.01f, -16.0f)
                horizontalLineToRelative(-64.04f)
                curveToRelative(-8.84f, 0.0f, -16.01f, 7.16f, -16.01f, 16.0f)
                verticalLineToRelative(156.86f)
                lineTo(56.04f, 94.43f)
                curveToRelative(-7.66f, -4.42f, -17.45f, -1.79f, -21.87f, 5.86f)
                lineTo(2.15f, 155.71f)
                curveToRelative(-4.42f, 7.65f, -1.8f, 17.44f, 5.86f, 21.86f)
                lineTo(143.94f, 256.0f)
                lineTo(8.01f, 334.43f)
                curveToRelative(-7.66f, 4.42f, -10.28f, 14.21f, -5.86f, 21.86f)
                lineToRelative(32.02f, 55.43f)
                curveToRelative(4.42f, 7.65f, 14.21f, 10.27f, 21.87f, 5.86f)
                lineToRelative(135.93f, -78.43f)
                verticalLineTo(496.0f)
                curveToRelative(0.0f, 8.84f, 7.17f, 16.0f, 16.01f, 16.0f)
                horizontalLineToRelative(64.04f)
                curveToRelative(8.84f, 0.0f, 16.01f, -7.16f, 16.01f, -16.0f)
                verticalLineTo(339.14f)
                lineToRelative(135.93f, 78.43f)
                curveToRelative(7.66f, 4.42f, 17.45f, 1.8f, 21.87f, -5.86f)
                lineToRelative(32.02f, -55.43f)
                curveToRelative(4.42f, -7.65f, 1.8f, -17.43f, -5.86f, -21.85f)
                close()
            }
        }
        .build()
        return _starOfLife!!
    }

private var _starOfLife: ImageVector? = null
