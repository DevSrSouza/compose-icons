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

public val SimpleIcons.Karlsruherverkehrsverbund: ImageVector
    get() {
        if (_karlsruherverkehrsverbund != null) {
            return _karlsruherverkehrsverbund!!
        }
        _karlsruherverkehrsverbund = Builder(name = "Karlsruherverkehrsverbund", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.91f, 6.089f)
                curveToRelative(-2.491f, 2.4f, -6.153f, 4.238f, -11.265f, 4.3f)
                lineToRelative(-0.397f, 1.745f)
                horizontalLineToRelative(22.316f)
                lineTo(24.0f, 10.388f)
                lineTo(9.309f, 10.388f)
                curveToRelative(2.984f, -1.01f, 4.688f, -2.676f, 6.56f, -4.3f)
                close()
                moveTo(23.36f, 12.81f)
                curveToRelative(-5.723f, 0.013f, -8.441f, 2.712f, -10.095f, 5.101f)
                horizontalLineToRelative(2.49f)
                curveToRelative(2.6f, -3.296f, 5.827f, -3.428f, 7.196f, -3.442f)
                close()
                moveTo(1.053f, 13.285f)
                lineTo(0.0f, 17.887f)
                horizontalLineToRelative(1.236f)
                lineToRelative(0.488f, -2.173f)
                lineToRelative(1.097f, 2.173f)
                lineTo(4.27f, 17.887f)
                lineToRelative(-1.34f, -2.368f)
                lineToRelative(2.23f, -2.234f)
                lineTo(3.575f, 13.285f)
                lineToRelative(-1.723f, 1.869f)
                lineToRelative(0.436f, -1.87f)
                close()
                moveTo(5.29f, 13.285f)
                lineToRelative(0.509f, 4.602f)
                horizontalLineToRelative(1.517f)
                lineToRelative(2.63f, -4.602f)
                horizontalLineToRelative(-1.32f)
                lineToRelative(-1.852f, 3.463f)
                lineToRelative(-0.265f, -3.463f)
                close()
                moveTo(10.18f, 13.285f)
                lineToRelative(0.503f, 4.602f)
                horizontalLineToRelative(1.54f)
                lineToRelative(2.62f, -4.602f)
                horizontalLineToRelative(-1.32f)
                lineToRelative(-1.852f, 3.463f)
                lineToRelative(-0.268f, -3.463f)
                close()
            }
        }
        .build()
        return _karlsruherverkehrsverbund!!
    }

private var _karlsruherverkehrsverbund: ImageVector? = null
