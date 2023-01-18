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

public val IonIcons.SunnySharp: ImageVector
    get() {
        if (_sunnySharp != null) {
            return _sunnySharp!!
        }
        _sunnySharp = Builder(name = "SunnySharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 26.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(92.0f)
                horizontalLineToRelative(-44.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 394.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(92.0f)
                horizontalLineToRelative(-44.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(338.025f, 142.857f)
                lineToRelative(65.054f, -65.054f)
                lineToRelative(31.113f, 31.113f)
                lineToRelative(-65.054f, 65.054f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(77.815f, 403.074f)
                lineToRelative(65.054f, -65.054f)
                lineToRelative(31.113f, 31.113f)
                lineToRelative(-65.054f, 65.054f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(394.0f, 234.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(44.0f)
                horizontalLineToRelative(-92.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0f, 234.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(44.0f)
                horizontalLineToRelative(-92.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(338.029f, 369.139f)
                lineToRelative(31.113f, -31.113f)
                lineToRelative(65.054f, 65.054f)
                lineToRelative(-31.113f, 31.113f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(77.802f, 108.919f)
                lineToRelative(31.113f, -31.113f)
                lineToRelative(65.054f, 65.054f)
                lineToRelative(-31.113f, 31.113f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 358.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, true, 358.0f, 256.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, true, 256.0f, 358.0f)
                close()
            }
        }
        .build()
        return _sunnySharp!!
    }

private var _sunnySharp: ImageVector? = null
