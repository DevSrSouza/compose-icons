package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.TelescopeSharp: ImageVector
    get() {
        if (_telescopeSharp != null) {
            return _telescopeSharp!!
        }
        _telescopeSharp = Builder(name = "TelescopeSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.41f, 292.9f)
                lineToRelative(44.82f, 76.97f)
                lineToRelative(98.14f, -56.38f)
                lineToRelative(-44.73f, -77.37f)
                lineToRelative(-98.23f, 56.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(287.87f, 252.34f)
                lineToRelative(23.67f, -13.81f)
                lineToRelative(-63.42f, -110.0f)
                lineToRelative(-132.92f, 77.0f)
                curveTo(133.75f, 237.51f, 176.0f, 310.0f, 176.0f, 310.0f)
                lineToRelative(15.53f, -8.32f)
                curveToRelative(0.24f, -0.13f, 0.55f, 0.0f, 0.83f, 0.0f)
                lineTo(102.65f, 496.0f)
                horizontalLineToRelative(35.16f)
                lineToRelative(99.05f, -214.25f)
                lineToRelative(23.24f, -13.4f)
                lineTo(358.0f, 464.0f)
                horizontalLineToRelative(36.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(262.08f, 96.0f)
                curveToRelative(24.81f, 42.23f, 60.25f, 104.25f, 86.4f, 148.76f)
                lineTo(510.79f, 151.0f)
                lineTo(424.07f, 1.41f)
                close()
            }
        }
        .build()
        return _telescopeSharp!!
    }

private var _telescopeSharp: ImageVector? = null
