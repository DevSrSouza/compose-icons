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

public val IonIcons.ColorWandSharp: ImageVector
    get() {
        if (_colorWandSharp != null) {
            return _colorWandSharp!!
        }
        _colorWandSharp = Builder(name = "ColorWandSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(133.441f, 200.647f)
                lineToRelative(67.196f, -67.196f)
                lineToRelative(78.142f, 78.142f)
                lineToRelative(-67.196f, 67.196f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(301.41f, 234.21f)
                lineToRelative(-67.19f, 67.2f)
                lineToRelative(177.78f, 178.59f)
                lineToRelative(68.0f, -68.0f)
                lineToRelative(-178.59f, -177.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 176.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(67.624f, 90.249f)
                lineToRelative(22.627f, -22.627f)
                lineToRelative(56.569f, 56.569f)
                lineToRelative(-22.627f, 22.627f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(-32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.32f, 124.195f)
                lineToRelative(56.569f, -56.569f)
                lineToRelative(22.627f, 22.627f)
                lineToRelative(-56.569f, 56.569f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(67.62f, 293.887f)
                lineToRelative(56.569f, -56.569f)
                lineToRelative(22.627f, 22.627f)
                lineToRelative(-56.569f, 56.569f)
                close()
            }
        }
        .build()
        return _colorWandSharp!!
    }

private var _colorWandSharp: ImageVector? = null
